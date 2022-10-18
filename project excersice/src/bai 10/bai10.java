import java.util.*;


class filter
{
    int n;
    public filter(int n)
    {
        this.n = n;
    }

    public Integer tinh_tong(Integer[] arr)
    {
        int sum = 0;
        for (int i:arr)
        {
            sum += i;
        }
        return sum;
    }

    public void so_sanh(int sum, int n)
    {
        if (sum == n)
        {
            System.out.println("day la mot so hoan hao!");
        }
        else
        {
            System.out.println("day khong phai mot so hoan hao!");
        }
    }

    public void uoc()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<this.n; i++)
        {
            if (this.n%i==0)
            {
                arr.add(i);
            }
        }
        Integer[] arr_2 = new Integer[arr.size()];
        arr_2 = arr.toArray(arr_2);
        so_sanh(tinh_tong(arr_2), this.n);
    }
}

class bai10
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer inp = input.nextInt();
        filter n = new filter(inp);
        n.uoc();
    }
}