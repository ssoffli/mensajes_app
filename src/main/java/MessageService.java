import java.util.Scanner;

public class MessageService {

    public static void newMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su mensaje:");
        String messageText = sc.nextLine();
        System.out.println("Escriba su nombre:");
        String messageAuthor = sc.nextLine();

        Message1 record = new Message1();
        record.setMessage(messageText);
        record.setMessageAuthor(messageAuthor);

        MessageDataAccessObject.createMessageDB(record);
    }
// listar mensajes
    public static void listMessages(){
        MessageDataAccessObject.readMessageDB();
    }

    public static void delMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique ID a borrar:");
        int idToDel = sc.nextInt();
        MessageDataAccessObject.deleteMessageDB(idToDel);
    }

    public static void edMessage(){
        System.out.println("edicion de msj");
    }

}
