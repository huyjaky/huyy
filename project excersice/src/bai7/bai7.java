import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Set;



class bai7{
    public static void main(String[] args) {
        String inp = "huy huy dep traaitrai";
        String[] list = inp.split("");
        Set <String> set = new HashSet<>();
        for (String i:list){
            set.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(set.toArray()[1]);
        for(int i=0; i<set.size(); i+=1){
            int root = 0;
            for(int a=0; a<list.length ; a+=1){
                if (set.toArray()[i].equals(list[a])){
                    root += 1;
                }
            }
            result.add(root);
            root = 0;
        }
        System.out.println(result); 
        System.out.println(set);
    }
}