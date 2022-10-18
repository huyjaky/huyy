import java.util.*;


class filter{
    int n;
    public filter(int n){
        this.n = n;
    }

    public int pow(){
        int root = this.n;
        for (int i=1; i<21; i+=1){
            root *=i;
        }
        return root;
    }
}


public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int inp = input.nextInt();
            filter fil = new filter(inp);
            System.out.println(fil.pow());
        }catch (Exception e){
            System.out.println("so nhap vao phai la so nguyen!");
        }
    }
}
