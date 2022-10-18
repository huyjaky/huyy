import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Integer so = input.nextInt();
        
        songuyento check = new songuyento(so);
        Integer sum = 0;
        for (int i = 2; i < so; i++ ) {
            if (check.check() == false) {
                if (so % i == 0) {
                    sum += i;
                    so = so/i;
                } else {
                    continue;
                }
            } else {
                break;
            }
        }
        System.out.println(sum);

    }
}
