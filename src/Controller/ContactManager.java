package Controller;
import Model.Contact;
import Model.LinkedList;
import Model.Node;
import View.ConsoleView;

public class ContactManager {
    private LinkedList<Contact<String,String>> contacts;
    private ConsoleView cV = new ConsoleView();

    public ContactManager(LinkedList<Contact<String, String>> contacts) {
        this.contacts = new LinkedList<>();
    }
    
    public void addContact(Contact<String,String> contact){
        contacts.appenedToTail(contact);
    }

    public Contact<String,String> findContactByName(String name){
        Node<Contact<String, String>> current = contacts.getHead();

        while (current != null) {
        Contact<String, String> contact = current.getValue();
        if (contact.getName().equals(name)) {
            return contact;
        }
        current = current.getNext();
    }

        return null;
    }

    public void deleteContactByName(String name) {
        Node<Contact<String, String>> current = contacts.getHead();
        Node<Contact<String, String>> previous = null;

        while (current != null) {
            Contact<String, String> contact = current.getValue();
            if (contact.getName().equals(name)) {
                if (previous == null) {
                    contacts.setHead(current.getNext());
                } else {
                    previous.setNext(current.getNext());
                }
                contacts.setSize(contacts.getSize() - 1);
                cV.showMessage("Contacto eliminado: " + contact);
                return;
            }
            previous = current;
            current = current.getNext();
        }

        cV.showMessage("Contacto no encontrado.");
    }


}
