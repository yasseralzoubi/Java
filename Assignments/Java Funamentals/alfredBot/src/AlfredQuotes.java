import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        Date now =new Date();
        return String.format("It is currently"+" "+ now.toString());
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")){
            return "As you wish";
        }else {
            return "Right. And with that I shall retire";
        }
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
