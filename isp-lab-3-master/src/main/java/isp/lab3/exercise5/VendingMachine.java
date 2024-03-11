package isp.lab3.exercise5;
import java.util.HashMap;
import java.util.Scanner;
public class VendingMachine {

    private HashMap<Integer, String> product;
    private int credit;

    public VendingMachine() {

        product = new HashMap<Integer, String>();

        product.put(1, "Cola");
        product.put(2, "Sprite");
        product.put(3, "Still Water");
        product.put(4, "Mineral Water");
        product.put(5, "Tea");

        credit = 0;
    }

    public void DisplayProducts() {

        System.out.println("Products available: ");
        for (int id : product.keySet()) {
            System.out.println(id + ":" + product.get(id));
        }
    }

    public void InsertCoin(int value) {
        credit += value;
        if (value == 1) {
            System.out.println("You entered 1 credit");
        } else System.out.println("You entered " + value + " credits");
    }

    public void DisplayCredit() {
        System.out.println("Credit: " + credit);
    }

    public String SelectProduct(int id) {

        if (product.containsKey(id)) {
            int price = 2; //default price for all products
            if (credit >= price) {
                credit -= price;
                System.out.println( "You selected " + product.get(id));
            } else {
                System.out.println("Insufficient credit");
            }
        } else {
            System.out.println("The product doesn't exist");
        }
        return null;
    }

    public void UserMenu() {

        System.out.println("Select an option: ");
        System.out.println("");
        System.out.println("1.Display all products");
        System.out.println("2.Enter credit");
        System.out.println("3.Display credit");
        System.out.println("4.Select a product");
        System.out.println("5.Exit");
        System.out.println("");

        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    DisplayProducts();
                    break;

                case 2:
                    System.out.println("Insert credit: ");
                    int value = scanner.nextInt();
                    InsertCoin(value);
                    break;

                case 3:
                    DisplayCredit();
                    break;

                case 4:
                    System.out.println("Select a product: ");
                    int id = scanner.nextInt();
                    SelectProduct(id);
                    break;

                case 5:
                    System.out.println("Bye bye! Have a nice day :)");

                default:
                    System.out.println("This option doesn't exist or is invalid");

            }
        }while(choice != 0);


    }
}

