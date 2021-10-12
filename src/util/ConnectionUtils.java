package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtils {
    // Desativando o construtor

    private ConnectionUtils() {
    }

    public static Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/NdocPxAAyg", "NdocPxAAyg", "SbEfPjeOfH");
        } catch (SQLException e) {
            throw new Error("Failed to create connection", e);
        }
        return conn;
    }

    public static void closeConnection(Connection conn, PreparedStatement ps) {
        closeConnection(conn, ps, null);
    }

    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new Error("Failed to close connection", e);
        }
    }

    private void useExample(String name) {
        String query = "select * from user where name like ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtils.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) {
                // Pega os dados;	
            }

        } catch (Exception e) {
            throw new Error("Failed to access database", e);
        } finally {
            ConnectionUtils.closeConnection(conn, ps, rs);
        }
    }
}
