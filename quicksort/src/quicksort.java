import java.util.ArrayList;

public class quicksort {
    

    public String _quicksort(ArrayList <Integer> list) {
        if (list.size() == 0) {
            return "";
        }
        Integer pivot = list.get(list.size()/2);
        list.remove(list.size()/2);
        ArrayList <Integer> higher = new ArrayList<>(); 
        ArrayList <Integer> lower = new ArrayList<>();

        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i) <= pivot) {
                lower.add(list.get(i));
            } else {
                higher.add(list.get(i));
            }
        }
        return _quicksort(higher)+ " " + pivot + " " + _quicksort(lower) + "";

    }
}                                    