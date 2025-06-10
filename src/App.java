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
    }
}