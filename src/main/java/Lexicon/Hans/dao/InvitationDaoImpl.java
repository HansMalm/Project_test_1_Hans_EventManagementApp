package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Invitation;

import java.sql.*;
import java.util.List;

public class InvitationDaoImpl implements InvitationDao {

    private final Connection connection;

    public InvitationDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Invitation invitation) {
        String sql = "INSERT INTO invitations (title) VALUES (?)";

        try (
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {
            ps.setString(1, invitation.getEvent().getTitle());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    invitation.setId(keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saving invitation : " + e.getMessage());
            throw  new RuntimeException("Error saving invitation", e);
        }
    }

    @Override
    public List<Invitation> findAll() {
        return List.of();
    }
}