import javax.print.FlavorException;

public class App {
    
    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        } else if (s.length()>1){
            for (int i = s.length()-1; i >= 0; i--) {
                if ("{[(".contains(s.charAt(i)+"")) {

                    try {
                        if ("{}".equals(s.substring(i, i+2)) || "[]".equals(s.substring(i, i+2)) || "()".equals(s.substring(i, i+2))) {
                            s = s.replace(s.substring(i, i+2), "");
                            return isValid(s);
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                        return false;
                    }
                    
                } 
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        
        System.out.println(app.isValid("{}"));
    }
}
