import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    //constructor
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    //methods
    //add menu item
    public void addMenuItem(String name, double price){
        Item item = new Item();
        item.name=name;
        item.price=price;
        this.menu.add(item);

    }

    public  void  displayMenu(){
        for ( Item item : this.menu){
            System.out.println(item.name + " " + item.price);
        }
    }
    public  void  newOrder(){

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter customer name for new order:");
        String line=scan.nextLine();
        Order order = new Order();
        order.name=line;
        this.displayMenu();

        // Prompts the user to enter an item number
        Scanner scan2 =new Scanner(System.in);
        System.out.println("Please enter a menu item index or q to quit:");
        String line2=scan.nextLine();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {

            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details

    }

    }

}
