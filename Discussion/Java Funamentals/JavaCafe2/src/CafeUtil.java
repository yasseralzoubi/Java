import java.util.ArrayList;
import java.util.Scanner;


public class CafeUtil {

    // 1. Get Streak Goal
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Get Order Total
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // 3. Display Menu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // 4. Add Customer
    public void addCustomer(ArrayList<String> customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please:");
        String username = scanner.nextLine(); // Replace System.console().readLine() with scanner.nextLine()
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

}
