import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap< String,String> userMap = new HashMap<>();

        userMap.put("Sunrise","The dawn breaks");
        userMap.put("Ocean Waves","The tide comes");
        userMap.put("Starlight","under the night sky");
        userMap.put("Echoes","the sound of the past");

        System.out.println("Track: " +userMap.get("Starlight"));

        for ( String key : userMap.keySet()){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}