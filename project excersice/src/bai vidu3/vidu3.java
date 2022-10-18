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
        if (ngay <= 31)
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        if ((thang < 12) && (thang > 0))
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    
}


class lop{
    String ten_lop;
    String ten_khoa;
    public lop(String ten_lop, String ten_khoa) {
        this.ten_lop = ten_lop;
        this.ten_khoa = ten_khoa;
    }
    
}

class sinh_vien{
    String ma_sinh_vien;
    String ho_va_ten;
    date ngay_sinh;
    float diem_trung_binh;
    lop lop;
    public sinh_vien(String ma_sinh_vien, String ho_va_ten, date ngay_sinh, float diem_trung_binh, lop lop) {
        this.ma_sinh_vien = ma_sinh_vien;
        this.ho_va_ten = ho_va_ten;
        this.ngay_sinh = ngay_sinh;
        this.diem_trung_binh = diem_trung_binh;
        this.lop = lop;
    }

    public String ten_khoa(){
        return this.lop.ten_khoa;
    }

    public boolean check_diem(){
        return this.diem_trung_binh >= 5;
    }

    public boolean check_ngay_sinh(sinh_vien sinhvienkhac){
        return this.ngay_sinh == sinhvienkhac.ngay_sinh;
    }

}

class vidu3{
    public static void main(String[] args) {
        date sinh_sv1 = new date(2, 3, 2000);
        date sinh_sv2 = new date(12, 2, 2001);

        lop lop = new lop("A12", "KHTN");

        sinh_vien sv1 = new sinh_vien("1902", "Phan Duc Huy", sinh_sv1, 4.5f, lop);
        sinh_vien sv2 = new sinh_vien("2011", "Pham Gia Bao", sinh_sv2, 6, lop);
    
        System.out.println(sv1.ten_khoa());
        System.out.println(sv2.ten_khoa());

        System.out.println("thi sinh sv1 co do khong: "+sv1.check_diem());
        System.out.println("thi sinh sv2 co do khong: "+sv2.check_diem());

        System.out.println(sv1.check_ngay_sinh(sv2));
    
    }


}

