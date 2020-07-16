import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public static void readMessageDB(Message1 message1) {

    }
    public static void updateMessageDB(Message1 message1) {

    }
    public static void deleteMessageDB(int id) {

    }
}
