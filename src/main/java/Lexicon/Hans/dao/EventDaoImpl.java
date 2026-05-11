package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Event;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventDaoImpl implements EventDao {

    private final Connection connection;

    public EventDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Event event) {
        String sql = "INSERT INTO app_events (title) VALUES (?)";

        try (
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {
            ps.setString(1, event.getTitle());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    event.setId(keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saving event : " + e.getMessage());
            throw  new RuntimeException("Error saving event", e);
        }
    }

    @Override
    public List<Event> findAll() {

        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM app_events";

        try (
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            while(rs.next()) {
                events.add(new Event(
                        rs.getInt("id"),
                        rs.getString("title")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching events : " + e.getMessage());
            throw  new RuntimeException("Error fetching events", e);
        }

        return events;
    }

    @Override
    public void delete(String id) {
        int intId = Integer.parseInt(id);
        String sql = "DELETE FROM app_events WHERE id = ?";

        try (
                PreparedStatement ps = connection.prepareStatement(sql);
            ) {
            ps.setInt(1, intId);
            ps.executeUpdate();
        } catch (SQLException e) {
        System.err.println("Error deleting event: " + e.getMessage());
        throw new RuntimeException("Error deleting event", e);
        }
        System.out.println("Event deleted!");
    }

}