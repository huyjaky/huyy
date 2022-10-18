import java.util.ArrayList;

public class Hogiadinh {
    private ArrayList <Nguoi> Hogiadinh;
    private String sonha;

    public Hogiadinh (ArrayList <Nguoi> Hogiadinh, String sonha) {
        this.Hogiadinh = Hogiadinh;
        this.sonha = sonha;
    }

    public Hogiadinh (String sonha) {
        this.sonha = sonha;
        this.Hogiadinh = new ArrayList<Nguoi>();
    }

    public void add_thanh_vien (Nguoi nguoi) {
        this.Hogiadinh.add(nguoi);
    }

    public void in_danh_sach () {
        System.out.println("\t *| so thanh vien la: " + this.Hogiadinh.size());
        System.out.println("\t *| so nha: "+this.sonha);
        for (Nguoi i:this.Hogiadinh) {
            System.out.println("\t \t *| "+i.toString());
        }
        System.out.println("\t ----------------------------------------------------------------------------------------------");
    }


}
