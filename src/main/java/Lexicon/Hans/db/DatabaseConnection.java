package Lexicon.Hans.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/event_management";
    private static final String USER = "root";
    private static final String PASSWORD = "w2rcr2ft";

    private DatabaseConnection() {
    }

    private static DataSource mysqlDataSource;

    public static DataSource getMysqlDataSource() {
        if (mysqlDataSource == null) {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setURL(URL);
            ds.setUser(USER);
            ds.setPassword(PASSWORD);
            mysqlDataSource = ds;
        }
        return mysqlDataSource;
    }
}