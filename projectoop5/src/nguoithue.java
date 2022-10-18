import java.text.NumberFormat;
import java.util.Locale;

public class nguoithue {
    private Integer songaythue;
    private String loaiphong;
    private thongtincanhan thongtin;
    private Long cost;
    Long gia;
    
    public nguoithue(String loaiphong, thongtincanhan thongtin) {
        String type = "ABC";
        if (type.contains(loaiphong) && loaiphong.length() == 1) {
            this.loaiphong = loaiphong;
            if (loaiphong.equals("A")) {
                this.cost = 500l;
            }else if (loaiphong.equals("B")) {
                this.cost = 300l;
            }else {
                this.cost = 100l;
            }
        }else {
            System.out.println("nhap sai loai phong!");
            return;
        }
        this.thongtin = thongtin;
    }

    public nguoithue (Integer songay) {
        this.songaythue = songay;
    }

    public String toString() {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        return "so ngay thue: " + this.songaythue + "loai phong: " + this.loaiphong + this.thongtin.toString() + " so tien phai tra 1 ngay: " + numf.format(this.cost);
    }

    public thongtincanhan getThongtin() {
        return thongtin;
    }

    public Long getCost() {
        return cost;
    }

    public Integer getSongaythue() {
        return songaythue;
    }

    

    
}
