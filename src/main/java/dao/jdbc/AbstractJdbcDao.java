package dao.jdbc;

import util.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractJdbcDao {
    protected Connection connection;


    private ConnectionProvider connectionProvider;


    public void init() {
        connection = connectionProvider.getConnection();
    }

    protected PreparedStatement getPreparedStatement(String query) throws SQLException {
        return connection.prepareStatement(query);
    }

    protected Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}