import java.util.HashMap;
import java.util.Set;

public class Methods {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("shatha.bast@axsos.academy", "Shatha Bast");
        userMap.put("khalid.khader@axsos.academy", "Khalid Khader");
        userMap.put("Mohammad.Issa@axsos.academy", "Mohammad Issa");
        System.out.println(userMap);
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key + "   " + userMap.get(key));
        }
        System.out.println(userMap.get("shatha.bast@axsos.academy"));

    }
}
