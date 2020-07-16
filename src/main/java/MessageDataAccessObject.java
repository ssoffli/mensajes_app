import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDataAccessObject {

    //******* CRUD Mensajes *******
    public static void createMessageDB(Message1 message1) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        try (Connection dbcnx = dbConnection.getConnection()){
            PreparedStatement preparedStatement = null;
            try {
                String query = "INSERT INTO mensajes ( mensaje, autor_mensaje) VALUES (?,?)";
                preparedStatement = dbcnx.prepareStatement(query);
                preparedStatement.setString(1, message1.getMessage());
                preparedStatement.setString(2, message1.getMessageAuthor());
                preparedStatement.executeUpdate();
                System.out.println("mensaje creado");
            }catch(SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void readMessageDB() {
        DatabaseConnection dbConnection = new DatabaseConnection();

        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try (Connection dbcnx = dbConnection.getConnection()){
            String query = "SELECT * FROM mensajes";
            preparedStatement = dbcnx.prepareStatement(query);
            rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.println("ID: "+ rs.getInt("id_mensaje"));
                System.out.println("TXT: "+ rs.getString("mensaje"));
                System.out.println("Autor: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+ rs.getDate("fecha_mensaje"));
                System.out.println("----------------------");
            }

        }catch (SQLException e) {
            System.out.println("No se pudieron recuperar mensajes");
            System.out.println(e);
        }
    }
    public static void updateMessageDB(Message1 message1) {

    }
    public static void deleteMessageDB(int id) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        try (Connection dbcnx = dbConnection.getConnection()){
            PreparedStatement preparedStatement = null;
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                preparedStatement= dbcnx.prepareStatement(query);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
                System.out.println("El mensaje ha sido borrado");
            }catch (SQLException ex) {
                System.out.println(ex);
            }
        }catch (SQLException e) {
            System.out.println(e);

        }
        }
}
