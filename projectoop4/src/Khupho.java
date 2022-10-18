import java.util.ArrayList;

public class Khupho {
    private ArrayList <Hogiadinh> khupho;
    
    public Khupho (ArrayList <Hogiadinh> khupho ) {
        this.khupho = khupho;
    }

    public Khupho () {
        this.khupho = new ArrayList<Hogiadinh>();
    }

    public void add_hogiadinh (Hogiadinh Hogiadinh) {
        this.khupho.add(Hogiadinh);
    }

    public void in_danh_sach_hogiadinh () {
        System.out.println("so luong ho gia dinh: "+this.khupho.size());
        for (Hogiadinh i:this.khupho) {
            i.in_danh_sach();
        }
    }     
}
