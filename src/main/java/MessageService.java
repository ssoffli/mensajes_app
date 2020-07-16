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
        System.out.println("listado de tus msjs");

    }

    public static void delMessage(){
        System.out.println("borrar msj");
    }

    public static void edMessage(){
        System.out.println("edicion de msj");
    }

}
