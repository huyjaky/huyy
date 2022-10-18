import java.util.Scanner;

class bai6{
    public static void main(String[] args) {
        String inp = "huy dep trai";
        
        String[] list = inp.split("");
        
        list[0] = list[0].toUpperCase();
        
        for (int i=0; i<list.length; i+=1){
            if (list[i].equals(" ")){
                list[i+1] = list[i+1].toUpperCase();
            }
        }
        
        String root = "";
        for (String i:list){
            root += i;
        }
        System.out.println(root);                                    
    }
}
class filter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    }
    
}