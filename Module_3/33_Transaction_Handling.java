import java.sql.*;

public class TransactionDemo {
    public static void transfer(int fromId, int toId, int amount) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                debit.setInt(1, amount); debit.setInt(2, fromId); debit.executeUpdate();
                credit.setInt(1, amount); credit.setInt(2, toId); credit.executeUpdate();
                conn.commit();
            } catch (Exception e) {
                conn.rollback();
                throw e;
            }
        }
    }
}
