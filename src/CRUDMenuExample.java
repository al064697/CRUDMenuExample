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
                    accounts.add(new Accounts(name));
                    break;
                case 2:
                    // Leer cuentas
                    for (Accounts account : accounts) {
                        System.out.println(account.getName());
                    }
                    break;
                case 3:
                    // Actualizar cuenta
                    System.out.print("Ingrese el nombre de la cuenta a actualizar: ");
                    String oldName = new Scanner(System.in).nextLine();
                    System.out.print("Ingrese el nuevo nombre de la cuenta: ");
                    String newName = new Scanner(System.in).nextLine();
                    for (Accounts account : accounts) {
                        if (account.getName().equals(oldName)) {
                            account.setName(newName);
                            break;
                        }
                    }
                    break;
                case 4:
                    // Eliminar cuenta
                    System.out.print("Ingrese el nombre de la cuenta a eliminar: ");
                    String nameToDelete = new Scanner(System.in).nextLine();
                    accounts.removeIf(account -> account.getName().equals(nameToDelete));
                    break;
                case 5:
                    // Salir
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CRUDMenuExample menu = new CRUDMenuExample();
        menu.run();
    }
}