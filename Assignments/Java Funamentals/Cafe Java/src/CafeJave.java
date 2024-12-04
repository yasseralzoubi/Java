
public class CafeJave {
    public static void main(String[] args) {
        // APP VARIABLES
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int dripCoffee =4;
        double latte =4.5;
        int cappuccino = 5;

        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4= "Adam";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //
        // sali
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        //Ahmad
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + cappuccino);
        }
        //sali
        System.out.println(generalGreeting + customer3+" "+ displayTotalMessage + 2*latte);
        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        }else {
            System.out.println(customer3 +pendingMessage);
        }
        //adam


        double priceDifferance = (dripCoffee-latte);
        System.out.println(customer4 +" "+ "your change" + priceDifferance);
    }
}
