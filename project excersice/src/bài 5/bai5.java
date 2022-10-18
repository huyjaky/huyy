import java.util.*;


class bai5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inp = input.nextFloat();
        ArrayList<Float> list = new ArrayList<>();
        for (int i=0; i<inp; i+=1){
            System.out.println("nhap so thu "+(i+1));
            float n = input.nextFloat();
            list.add(n);
        }
        int sum = 0;
        for (Float i : list){
            sum += i;
        }
        double a = sum/inp;
        System.out.println(a);
    {{{{{{{{{{}}}}}}}}}}
    }
}                               
