import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;



class filter{
    int n;
    public filter(int n){
        this.n = n;
    }

    public ArrayList check(){
        ArrayList<Integer> list = new ArrayList<>();

        int a = 1;
        int b = 1;
        list.add(a);
        for(int i=1; i<this.n; i+=1){
            int c = a + b;
            list.add(c);
            b = a;
            a = c;
        }
        return list;
    }
}

class fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inp = input.nextInt();
        filter fil = new filter(inp);
        System.out.println(fil.check().get(inp-1));

    }
}
