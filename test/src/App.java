import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Pattern regrex = Pattern.compile("^\\d$");
        String[] array = {"12 asdfasdfgh", "121234545"};
        for (String i : array) {
            if (regrex.matcher(i).find()) {
                System.out.println(i);
            }
        }
    }
}
