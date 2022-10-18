import java.util.ArrayList;

class app {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Integer[] array = {12, 65};
        for (Integer i : array) {
            list.add(i);
        }
        
        quicksort sort = new quicksort();
        System.out.println(sort._quicksort(list));
    }
}