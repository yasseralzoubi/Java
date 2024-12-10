import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        // Instantiate CafeUtil
        CafeUtil appTest = new CafeUtil();

        // 1. Test getStreakGoal
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s\n\n", appTest.getStreakGoal());

        // 2. Test getOrderTotal
        System.out.println("----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $%.2f\n\n", appTest.getOrderTotal(lineItems));

        // 3. Test displayMenu
        System.out.println("----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // 4. Test addCustomer
        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<>();
        for (int i = 0; i < 2; i++) { // Test twice for variety
            appTest.addCustomer(customers);
            System.out.println();
        }

    }
}
