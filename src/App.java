import Controller.ContactManager;
import Controller.MenuController;
import Model.Contact;
import View.ConsoleView;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) throws Exception {
        LinkedList<Contact<String, String>> list = new LinkedList<>();
        ConsoleView view = new ConsoleView();
        ContactManager manager = new ContactManager();
        MenuController menu = new MenuController(manager, view);
        menu.showMenu();

        /*Contact c1 = new Contact<String,String>("Juan", "123");
        Contact c4 = new Contact<String,String>("Juan");
        Contact c2 = new Contact<String,String>("Juan", null);
        Contact c3 = new Contact<String,String>("Juana", "456");
        Contact c5 = new Contact<String,String>("Juan", "123");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c5));
        */
    }
}