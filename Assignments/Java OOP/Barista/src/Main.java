//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("anas");
        Order order4 = new Order("yasser");
        Order order5 = new Order("jalal");

        Item item1 = new Item( "drip coffee" , 1.5 );
        Item item2 = new Item( "cappuccino" , 2.5 );
        Item item3 = new Item( "latte" , 1.9 );
        Item item4 = new Item( "Green tea" , 1.1 );

        order1.addItem(item1);
        order1.addItem(item3);

        order2.addItem(item2);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item4);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order1.getOrderTotal());

        order1.display();



    }
}