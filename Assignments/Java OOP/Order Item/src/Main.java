//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeeKiosk customer =new CoffeeKiosk();
        customer.addMenuItem("banana", 2);
        customer.addMenuItem("coffee" , 3);
        customer.addMenuItem("latte", 4.5);
        customer.addMenuItem("capuccino" , 3);
        customer.addMenuItem("muffin" , 4);



        customer.newOrder();








    }
}