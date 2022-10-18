import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class khachsan {
    private ArrayList<nguoithue> danhsachthue;

    public khachsan (ArrayList <nguoithue> danhsach) {
        this.danhsachthue = danhsach;
    }

    public khachsan () {
        this.danhsachthue = new ArrayList<nguoithue>();
    }

    public void add_nguoithue (nguoithue nguoithue) {
        this.danhsachthue.add(nguoithue);
    }

    public void remove_khach (Integer cmnd) {
        for (nguoithue i : this.danhsachthue) {
            if (i.getThongtin().getCmnd().equals(cmnd)) {
                this.danhsachthue.remove(i);
            }
        }
    }

    public String sotienphaitra (Integer songay, Integer cmnd ) {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        for (nguoithue i : this.danhsachthue) {
            if (i.getThongtin().getCmnd().equals(cmnd)) {
                return i.toString() + "gia phai tra trong " + songay + "la: " + numf.format(songay*i.getCost());
            }else {
                return "cmnd khong ton tai!";
            }
        }
        return "";
    }

    public void indanhsach () {
        for (nguoithue i : this.danhsachthue) {
            System.out.println(i.toString());
        }
    }
}
