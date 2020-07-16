import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //DatabaseConnection conexion = new DatabaseConnection();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
// ************************* menu *************************
        do {
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. editar mensaje");
            System.out.println(" 4. eliminar mensaje");
            System.out.println(" 5. salir");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    MessageService.newMessage();
                    break;
                case 2:
                    MessageService.listMessages();
                    break;
                case 3:
                    MessageService.edMessage();
                    break;
                case 4:
                    MessageService.delMessage();
                    break;
                default:
                    break;
            }
        }while (option!=5);
// ************************* fin menu *************************
        /*try (Connection cnx = conexion.getConnection()){

        } catch (SQLException e) {
            System.out.println(e);
        }*/
    }
}
