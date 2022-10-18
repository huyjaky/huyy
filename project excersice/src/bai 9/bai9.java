import java.util.*;

class filter
{
    String n;
    public filter(String n)
    {
        this.n = n;
    }

    public void check(String right, String left)
    {
        if (right.equals(left))
        {
            System.out.println("day la mot so doi xung!");
        }
        else
        {
            System.out.println("day khong phai mot so doi xung!");
        }
    }

    public void split()
    {
        String right = "";
        String left = "";
        int mid = this.n.length()/2;
        if (this.n.length()%2==0)
        {
            right += this.n.substring(0, mid);
            left += reverse(this.n.substring(mid));
        }
        else
        {
            right += this.n.substring(0, mid);
            left += reverse(this.n.substring(mid+1));
        }
        check(right, left);
    }

    public String reverse(String left)
    {  
        String temp = "";
        for (int i=left.length()-1; i>=0; i--)
        {
            temp += left.charAt(i);
        }
        return temp;
    }
}


class bai9
{
    public static void main(String[] args) {
        while (true)
            {
                try
                {
                    Scanner input = new Scanner(System.in);
                    int inp = input.nextInt();
                    String str = ""+inp;
                    filter n = new filter(str);
                    n.split();
                }
                catch(Exception exception)
                {
                    System.out.println("hay nhap vao mot so nguyen duong!");
                }
            }    
    }
}