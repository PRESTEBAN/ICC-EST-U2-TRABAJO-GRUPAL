import View.ConsoleView;

public class App {

    public static void main(String[] args) throws Exception {
        ConsoleView cV = new ConsoleView();
        boolean menu = true;
        String opcion;

        while (menu) {
            cV.displayMenu();

            do {
                cV.showMessage("Ingresa una opción (1-5): ");         
                opcion = cV.getInput();
                
                if (!"12345".contains(opcion) || opcion.length() != 1) {
                    cV.showMessage("Opción inválida. Debe ser entre 1 y 5.\n");
                }
            } while (!"12345".contains(opcion) || opcion.length() != 1);

 
            if (opcion.equals("5")) {
                menu = false; 
                cV.showMessage("Saliendo del programa...");
            } else {
                switch(opcion){
                    case "1":
                    break;
                }
            }
        }
    }
}