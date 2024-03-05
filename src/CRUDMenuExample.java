import java.util.ArrayList;
import java.util.Scanner;

public class CRUDMenuExample {
    private ArrayList<Accounts> accounts;

    public CRUDMenuExample() {
        this.accounts = new ArrayList<>();
    }

    public int showMenu() {
        System.out.println("1. Crear cuenta");
        System.out.println("2. Leer cuentas");
        System.out.println("3. Actualizar cuenta");
        System.out.println("4. Eliminar cuenta");
        System.out.println("5. Salir");
        System.out.print("Ingrese la opción deseada: ");
        int option = new Scanner(System.in).nextInt();
        return option;
    }

    public void run() {
        while (true) {
            int option = showMenu();
            switch (option) {
                case 1:
                    // Crear cuenta
                    System.out.print("Ingrese el nombre de la cuenta: ");
                    String name = new Scanner(System.in).nextLine();
            }
        }
    }
}