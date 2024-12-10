//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car m = new Car( "mercedes" );

        Bus v = new Bus("volkswagen");

        System.out.println(m.displayType());
        System.out.println(v.displayType());
    }
}