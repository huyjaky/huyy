




class date{
    int thang;
    int ngay;
    int nam;
    public date(int thang, int ngay, int nam) {
        this.thang = thang;
        this.ngay = ngay;
        this.nam = nam;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        if ((thang>0)&&(thang<=12))
        this.thang = thang;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        if (ngay<31)
        this.ngay = ngay;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }

    
}


class quoc_gia{
    String ma_quoc_gia;
    String ten_quoc_gia;
    public quoc_gia(String ma_quoc_gia, String ten_quoc_gia) {
        this.ma_quoc_gia = ma_quoc_gia;
        this.ten_quoc_gia = ten_quoc_gia;
    }
    
}


class hang_sx{
    String ten_hang;
    quoc_gia quoc_gia;
    public hang_sx(String ten_hang, quoc_gia quoc_gia) {
        this.ten_hang = ten_hang;
        this.quoc_gia = quoc_gia;
    }
    
}

class Computer{
    hang_sx hang_sx;
    date ngay_sx;
    float gia_ban;
    date thoi_gian_bao_hanh;
    public Computer(hang_sx hang_sx, date ngay_sx, float gia_ban, date thoi_gian_bao_hanh) {
        this.hang_sx = hang_sx;
        this.ngay_sx = ngay_sx;
        this.gia_ban = gia_ban;
        this.thoi_gian_bao_hanh = thoi_gian_bao_hanh;
    }
    
    public boolean check_gia(Computer may_khac){
        return this.gia_ban > may_khac.gia_ban;
    }

    public String ten_quoc_gia_cua_may_tinh(){
        return this.hang_sx.ten_hang;
    }
}


class vidu4{
    public static void main(String[] args) {
        date ngay_sx1 = new date(2, 12, 2010);
        date ngay_sx2 = new date(2, 11, 2008);

        date thoi_gian_bao_hanh_1 = new date(11, 23, 2020);
        date thoi_gian_bao_hanh_2 = new date(12, 1, 2011);
        
        quoc_gia quoc_gia_1 = new quoc_gia("12A1", "MY");
        quoc_gia quoc_gia_2 = new quoc_gia("122c", "NGA");

        hang_sx hang_sx_1 = new hang_sx("ASUS", quoc_gia_1);
        hang_sx hang_sx_2 = new hang_sx("gygabyte", quoc_gia_2);

        Computer may_1 = new Computer(hang_sx_1, ngay_sx1, 12000, thoi_gian_bao_hanh_1);
        Computer may_2 = new Computer(hang_sx_2, ngay_sx2, 13000, thoi_gian_bao_hanh_2);

        System.out.println("may 1 dat hon may 2: "+may_1.check_gia(may_2));

        System.out.println("ten quoc gia sx: "+ may_1.hang_sx.quoc_gia.ten_quoc_gia);
        System.out.println("ten quoc gia sx: "+ may_2.hang_sx.quoc_gia.ten_quoc_gia);
    }
}