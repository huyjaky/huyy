import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Solution {
    
    
    
    public int process (int[] prices) {
        TreeMap <Integer, Integer> treemap = new TreeMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i ++) {
            treemap.put(prices[i], i);
            list.add(prices[i]);
        }
        Collections.sort(list);
        return treemap(treemap, list);
    }

    public int treemap(TreeMap <Integer, Integer> map, ArrayList <Integer> prices) {
        Integer mid_locate = map.size()/2;
        ArrayList <Integer> list = new ArrayList<>();
        try {
            for (int i = 0; i < mid_locate; i ++) {
                if ((prices.get((prices.size()-1)-i) - prices.get(i)) > 0 && map.get(prices.get(i)) < map.get(prices.get((prices.size()-1)-i))) {
                    list.add(prices.get((prices.size()-1)-i)-prices.get(i));
                    System.out.println(prices.get((prices.size()-1)-i)-prices.get(i));
                }
            }
            Collections.sort(list);
            return list.get(list.size()-1);
        } catch (Exception e) {
            // TODO: handle exception
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] array = {7,6,4,15,1}; //1,4,6,7,15
        Solution so = new Solution();
        System.out.println(so.process(array));
    }
}
