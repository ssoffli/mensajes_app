import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection myConnection;
    public static Connection getConnection(){
        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root", "" );
            if (myConnection!=null){
                System.out.println("conexion exitosa");
            }
        } catch (SQLException expt) {
            System.out.println(expt);
        }
        return myConnection;
    }
}
