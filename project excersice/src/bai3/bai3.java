package bai3;
import java.util.*;


class filter_{
    int n;
    public filter_(int n) {
        this.n = n;
    }

    public void inc(){
        for (int i=0; i<=this.n; i +=1){
            System.out.print(i+" ");
        }
        return;
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int inp = input.nextInt();
            String str = "so nhap vao phai la so nguyen duong va trong khoang n < 1000!";
            if ((inp < 0) || (inp > 1000)){
                System.out.println(str);
                return;
            }
            else{
                filter_ append = new filter_(inp);
                append.inc();
            }

        }catch (Exception e){
            System.out.println("so nhap vao phai la so nguyen duong!");
        }
    }    
}
