import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String huy = "1234567123";
        System.out.println(huy.substring(0,2));
        System.out.println(huy.replace(huy.substring(0,4), ""));
        System.out.println(huy);
        Scanner input = new Scanner(System.in);
        System.out.println("vl chim em");
        Scanner input2 = new Scanner(System.in);
    }
}