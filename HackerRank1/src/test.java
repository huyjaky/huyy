import java.util.Scanner;

public class test {

    public void fill (String i) {
        
        try {
            Byte.parseByte(i);
            System.out.println(i + " can be fitted in:");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        } catch (Exception t) {
            // TODO: handle exception
            try {
                Short.parseShort(i);
                System.out.println(i + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } catch (Exception e) {
                // TODO: handle exception
                try {
                    Integer.parseInt(i);
                    System.out.println(i + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                } catch (Exception a) {
                    // TODO: handle exception
                    try {
                        Long.parseLong(i);
                        System.out.println(i + " can be fitted in:");
                        System.out.println("* long");
                    } catch (Exception n) {
                        // TODO: handle exception
                        System.out.println(i + " can't be fitted anywhere.");
                    }
                }
            }
        }
    
    }
    public static void main(String[] args) {
        System.out.println("062175003081".length());
    
    }
}
