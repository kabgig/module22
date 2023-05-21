
import java.sql.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=2701";

    private static String conok = "Соединение с бд установлено";
    private static String conerr = "Произошла ошибка подключения к бд";

    public static void main(String[] args) {
        String sql = "SELECT id FROM test";
        try (
                Connection con = DriverManager.getConnection(URL);
                Statement statement = con.createStatement()
        ) {
            System.out.println(String.format("%s", conok));
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("ID");
            System.out.println("||------------||");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ID"));
            }
            System.out.println("||------------||");

        } catch (
                SQLException e) {
            System.out.println(String.format("%s", conerr));
            e.printStackTrace();
        }
    }
}
