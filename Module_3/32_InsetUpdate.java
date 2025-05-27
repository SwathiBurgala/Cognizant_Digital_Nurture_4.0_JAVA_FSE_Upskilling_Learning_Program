import java.sql.*;

public class StudentDAO {
    public void insert(String name) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students(name) VALUES(?)")) {
            ps.setString(1, name);
            ps.executeUpdate();
        }
    }

    public void update(int id, String name) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
             PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }
}
