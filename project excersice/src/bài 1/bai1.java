import java.util.*;
import javax.naming.spi.DirStateFactory.Result;


class bai1{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int input_ = input.nextInt();
            if (input_ < 0){
                System.out.println("so nhap vao phai la mot so nguyen duong!");
            }
            int root = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int inp;
            for (int i=0; i <= input_; i+=1){
                if (i%2==0){
                    root += i;
                }
            }
            System.out.println(root);
        }catch (Exception c){
            System.out.println("so nhap vao phai la mot so nguyen duong!");
            return;
        }
    }
}