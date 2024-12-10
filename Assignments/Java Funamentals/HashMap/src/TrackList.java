import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {

        HashMap< String,String> trakList = new HashMap<>();

        trakList.put("yasser","22");
        trakList.put("I","1");
        trakList.put("V","2");
        trakList.put("x","3");
        Set<String> keys = trakList.keySet();

        for ( String K : keys){
            System.out.println(trakList.get(K));

        }




    }
}
