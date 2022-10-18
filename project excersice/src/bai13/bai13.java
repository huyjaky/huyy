package bai13;
import java.util.*;
public class bai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong!");
        Integer so_luong = input.nextInt(); // nhap so luong
        
        ArrayList <String> list = new ArrayList<>();
        Integer root = 0;
        do
        {
            System.out.println("nhap so thu "+(root+1));
            String inp = input.next();
            list.add(inp);
            root++;
        }while(root != so_luong);
        Integer so_dem = 0;
        
        System.out.println( "nhap gia tri can kiem tra: ");
        String inp_values = input.next();
        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i).equals(inp_values))
            {
                System.out.print((i+1) + " ");
                so_dem++;
            }
        }
        
        System.out.println();
        if (so_dem==0)
        {
            System.out.println("khong co gia tri nao trung!");
        }
        else
        {
            System.out.println("ket thuc chuong trinh!");
        }

        
    }
}
