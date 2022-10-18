import java.util.*;


public class App {
    
    public void process (int[][] array) {
        for (int[] a : array) {
            int num = a[0];
            int count = 0;
            for (int i = 0; i < a[2]; i++) {
                num += (a[1] * Math.pow(2,count));
                System.out.print(num + " ");
                count += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int queue = input.nextInt();
        int[][] arrayAll = new int[queue][3];
        String space = input.nextLine();
        for (int i = 0; i < queue; i++) {
            String nums = input.nextLine();
            int[] array_ = new int[3];
            String[] array = nums.split(" ");
            int count = 0;
            for (String a : array) {
                int num = Integer.parseInt(a);
                array_[count] = num;
                count += 1;
            }
            arrayAll[i] = array_;
        }
        App app = new App();
        app.process(arrayAll);
    }       
}
