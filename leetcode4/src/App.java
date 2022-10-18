import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;



public class App {
    

    public String str (String [] x) {
        String result = "";
        for (String i : x) {
            result += i;
        }
        return result;
    }
    
    public boolean isAnagram(String s, String t) {
        String[] list_s = s.split("");
        String[] list_t = t.split("");
        Arrays.sort(list_s);
        Arrays.sort(list_t);
        String str_s =  str(list_s);
        String str_t = str(list_t);
        if (str_s.equals(str_t)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    
    
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        String s = "anagram";
        String t = "nagaram";
    }
}
