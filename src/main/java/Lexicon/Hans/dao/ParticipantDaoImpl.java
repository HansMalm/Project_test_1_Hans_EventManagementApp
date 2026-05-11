package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Participant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ParticipantDaoImpl implements ParticipantDao{
    private final Connection connection;

    public ParticipantDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Participant participant) {
        String sql = "INSERT INTO participants (participant_name) VALUES (?)";

        try (
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {
            ps.setString(1, participant.getName());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    participant.setId(keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saving participant : " + e.getMessage());
            throw  new RuntimeException("Error saving participant", e);
        }
    }

    @Override
    public void delete(String id) {
        int intId = Integer.parseInt(id);
        String sql = "DELETE FROM participants WHERE id = ?";
        try (
                PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setInt(1, intId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error deleting participant: " + e.getMessage());
            throw new RuntimeException("Error deleting participant", e);
        }
        System.out.println("Participant removed!");
    }

    @Override
    public List<Participant> findAll() {

        List<Participant> participants = new ArrayList<>();
        String sql = "SELECT * FROM participants";

        try (
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            while(rs.next()) {
                participants.add(new Participant(
                        rs.getInt("id"),
                        rs.getString("participant_name")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching events : " + e.getMessage());
            throw  new RuntimeException("Error fetching events", e);
        }

        return participants;
    }
}
