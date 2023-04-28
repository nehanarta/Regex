package Bridglabz.com;
import java.util.regex.*;

public class Regex {
    static Pattern pattern=Pattern.compile("^[0-9]{6,}");
    public static void main(String[] args) {
        System.out.println("welcome to regex program");
            String pinNo="400088";
            Matcher matcher = pattern.matcher(pinNo);
            if (matcher.matches()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
    }

}
}




