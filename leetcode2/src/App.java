
public class App {
    
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        Integer mid_num = s.length()/2;
        if (s.length()%2==0){
            String right = s.substring(0, mid_num);
            String left_temp = s.substring(mid_num, s.length());
            s = null;
            String left = "";
            for (int i = left_temp.length()-1; i >= 0; i--) {
                left += left_temp.charAt(i);
            }
            left_temp = null;
            if (right.equals(left)) {
                right = null;
                left = null;
                return true;
            } else {
                right = null;
                left = null;
                return false;
            }
        } else {
            String right = s.substring(0, mid_num);
            String left_temp = s.substring(mid_num+1, s.length());
            s = null;
            String left = "";
            for (int i = left_temp.length()-1; i >= 0; i--) {
                left += left_temp.charAt(i);
            }
            left_temp = null;
            if (right.equals(left)) {
                right = null;
                left = null;
                return true;
            } else {
                right = null;
                left = null;
                return false;
            }
        }
    }
    
    
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println(app.isPalindrome("A man, a plan, a canal: Panama"));

    }
}
