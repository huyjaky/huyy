
import java.math.*;
import java.util.*;


class filter
{
    int a, b, c;

    public filter(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double tinh_goc_a()
    {
        double goc_a = (Math.pow(this.b,2)-(Math.pow(this.a,2)+Math.pow(this.c, 2)))/((-2)*(this.a*this.c));
        return goc_a;
    }
    
    public double tinh_dien_tich(double goc_a)
    {
        double S_tam_giac = this.a*this.c*0.5*Math.sin(Math.acos(goc_a));
        return S_tam_giac;
    }


    public void check_tam_giac ()
    {
        if (a+b>c&&b+c>a&&a+c>b)
        {
            System.out.println("tam giac co dien tich la!");
            System.out.println(tinh_dien_tich(tinh_goc_a()));
        }
        else
        {
            System.out.println("day khong phai la mot tam giac!");
    }
}

class bai11
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>();
        int so_dem = 0;
        do
        {
            System.out.print("nhap canh "+(so_dem+1)+": ");
            int inp = input.nextInt();
            list.add(inp);
            so_dem += 1;
        }
        while (so_dem != 3);
        filter fil = new filter(list.get(0), list.get(1), list.get(2));
        fil.check_tam_giac();
    }
}
}