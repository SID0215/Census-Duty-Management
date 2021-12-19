import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB {
static Connection conn = null;
public static Connection getConnection() {
if (conn != null) return conn;
String database = "jdbc:postgresql://localhost:5432/batch";
String Username = "postgres";
String password = "01260215";
return getConnection(database, Username, password);
}
private static Connection getConnection(String databaseName, String UserName, String password) {
try {
Class.forName("org.postgresql.Driver");
conn = DriverManager.getConnection(databaseName,UserName,password);
} catch (Exception e) {
e.printStackTrace();
}
System.out.println("Opened database successfully");
return conn;
}
}