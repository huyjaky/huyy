package nhap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class nhap {
    public static void main(String[] args) {
        String string = "huy dep trai vl";
        String[] liststring = string.split("");
        
        // list chua cac ky tu khong trung lap
        Set <String> set_string = new HashSet<>();
        
        for (String i : liststring) {
            set_string.add(i);
        }

        // list chua so luong cac ky tu
        ArrayList <Integer> amount = new ArrayList<>();
        
        for (int i = 0; i<set_string.size(); i++) {
            Integer root = 0;
            for (int a=0; a<liststring.length; a++) {
                if (set_string.toArray()[i].equals(liststring[a])) {
                    root += 1;
                }
            }
            amount.add(root);
            root = 0;
        }
        System.out.println(set_string);
        System.out.println(amount);
    }
}