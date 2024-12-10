import java.util.ArrayList;

public class Order {
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    public Order(){
        this.name="Guest";
        this.items=new ArrayList<>();
    }
    public Order(String name){
        this.name=name;
        this.items=new ArrayList<>();
    }
    // GETTERS & SETTERS

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ORDER METHODS
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if (this.ready){
            return "Your order is ready";
        }else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for ( Item i : this.items ){
            total= total + i.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.println("customer Name : " + this.name);
        for ( Item i : this.items ){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $"+this.getOrderTotal());
    }


}

