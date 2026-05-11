package Lexicon.Hans;

import Lexicon.Hans.controller.EventAppController;
import Lexicon.Hans.dao.*;
import Lexicon.Hans.db.DatabaseConnection;
import Lexicon.Hans.view.EventAppView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class EventManagerApp {

    static void main() throws SQLException {

        DataSource dataSource = DatabaseConnection.getMysqlDataSource();
        Connection connection = dataSource.getConnection();
        System.out.println("Connected to EventApp Database.");

        EventDao eventDao = new EventDaoImpl(connection);
        ParticipantDao participantDao = new ParticipantDaoImpl(connection);
        InvitationDao invitationDao = new InvitationDaoImpl(connection);
        EventAppView view = new EventAppView();
        EventAppController controller = new EventAppController(eventDao, participantDao, invitationDao, view);

        controller.mainMenu();
    }
}