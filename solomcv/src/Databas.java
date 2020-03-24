import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Databas {
    public static void main(String[] args) {
        try {
            // Set up connection to database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://"+DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                            "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    DatabaseLoginData.user, DatabaseLoginData.password);

            // Setup statement
            Statement stmt = conn.createStatement();
            // Create query and execute
            int current = 1;
            boolean game = true;

            while (game) {
                String strSelect = "select body from story where id = " + current;
                String choices = "select target_id, description from links where story_id = " + current;

                int now = 0;
                Object[] choice = new Object[2];
                Object[] target = new Object[2];
                ResultSet cset = stmt.executeQuery(choices);
                while (cset.next()) {
                    String description = cset.getString("description");

                    int target_id = cset.getInt("target_id");

                }

                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    String body = rset.getString("body");
                    JOptionPane.showOptionDialog(null, body ,"Choose",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, choice, choice);
                }
            }


            // Close conn and stmt
            conn.close();
            stmt.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
