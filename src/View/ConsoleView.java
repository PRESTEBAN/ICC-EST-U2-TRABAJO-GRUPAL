package View;

import java.util.Scanner;

public class ConsoleView{

   public Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("=== Contact Management Menu ===");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto ");
        System.out.println("4. Mostar Contactos");
        System.out.println("5. Salir");
    }

    public String getInput(){
         String prompt  = scanner.nextLine();
         return prompt;
    }

    public void showMessage(String message){
          System.out.println(message);
    }


}