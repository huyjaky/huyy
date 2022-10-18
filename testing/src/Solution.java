import java.util.ArrayList;



class Solution {
    
    public String quicksort (ArrayList <Integer> list) {
        if (list.size() == 0) {
            return "";
        }
        Integer pivot = list.get(list.size()/2);
        list.remove(pivot);
        ArrayList <Integer> higher = new ArrayList<>();
        ArrayList <Integer> lower = new ArrayList<>();

        for (int i : list) {
            if (i <= pivot) {
                lower.add(i);
            } else {
                higher.add(i);
            }
        }

        return quicksort(lower) + " " + pivot + " " + quicksort(higher);
    }
}