import javax.swing.plaf.synth.SynthScrollBarUI;

class date{
    int ngay;
    int thang;
    int nam;
    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        if (ngay < 31)
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        if ((0< thang) && (thang<12))
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
}


class hang_san_xuat{
    String ten_hang_san_xuat;
    String quoc_gia;
    public hang_san_xuat(String ten_hang_san_xuat, String quoc_gia) {
        this.ten_hang_san_xuat = ten_hang_san_xuat;
        this.quoc_gia = quoc_gia;
    }
}


class phim{
    String ten_phim;
    int nam_san_xuat;
    hang_san_xuat hang_san_xuat;
    float gia_ve;
    date ngay_chieu;
    public phim(String ten_phim, int nam_san_xuat, hang_san_xuat hang_san_xuat, float gia_ve, date ngay_chieu) {
        this.ten_phim = ten_phim;
        this.nam_san_xuat = nam_san_xuat;
        this.hang_san_xuat = hang_san_xuat;
        this.gia_ve = gia_ve;
        this.ngay_chieu = ngay_chieu;
    }

    public boolean kiem_tra_gia_ve(phim phim_khacPhim){
        return this.gia_ve <= phim_khacPhim.gia_ve;
    }

    public String ten_hang_san_xuat(){
        return this.hang_san_xuat.quoc_gia;
    }
    
    public float sale(float x){
        return this.gia_ve-((x/100)*this.gia_ve);
    }
}

public class baivd2{
    public static void main(String[] args) {
        date ngay1 = new date(2, 5, 2010);
        date ngay2 = new date(3, 8, 2010);

        hang_san_xuat hang_1 = new hang_san_xuat("MARVEL", "MY");
        hang_san_xuat hang_2 = new hang_san_xuat("kobobo", "Nhat Ban");

        phim phim_1 = new phim("Iron Man", 2007, hang_1, 200, ngay1);
        phim phim_2 = new phim("koboo", 2008, hang_2, 200, ngay2);

        //phim_1.kiem_tra_gia_ve(phim_2);
        System.out.println(phim_1.kiem_tra_gia_ve(phim_2));


        System.out.println(phim_1.ten_hang_san_xuat());
        }
    }