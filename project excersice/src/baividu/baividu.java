

class date{
    private int ngay;
    private int thang;
    private int nam;
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
        if (thang <= 12)
            this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }

    
    
}


class tac_gia{
    private String ten;
    private date ngay_sinh;
    public tac_gia() {
    }
    public tac_gia(String ten, date ngay_sinh) {
        this.ten = ten;
        this.ngay_sinh = ngay_sinh;
    }

    
}


class sach{
    private String ten_sach;
    private int nam_xuat_ban;
    private tac_gia tac_gia;
    private float gia_ban;
    
    public sach(String ten_sach, int nam_xuat_ban, tac_gia tac_gia, float gia_ban) {
        this.ten_sach = ten_sach;
        this.nam_xuat_ban = nam_xuat_ban;
        this.tac_gia = tac_gia;
        this.gia_ban = gia_ban;
    }
    
    public void in_ra_ten_sach(){
        System.out.println(this.ten_sach);
        return;
    }

    public boolean check(sach sach_khac){
        return this.nam_xuat_ban == sach_khac.nam_xuat_ban;
    }

    public float giam_gia(float  x){
        return this.gia_ban-((x/100)*this.gia_ban);
    }
}

class baividu{
    public static void main(String[] args) {
        date ngay1 = new date(12, 5, 2003);
        date ngay2 = new date(30, 1, 2010);
        date ngay3 = new date(12, 5, 2003);

        tac_gia _1 = new tac_gia("huy dep trai", ngay1);
        tac_gia _2 = new tac_gia("phan huy", ngay2);
        tac_gia _3 = new tac_gia("jordan huy", ngay3);

        sach hoa_hong = new sach("rose", 2008, _1, 500);
        sach the_door_open = new sach("the door", 2011, _2, 300);
        sach princes = new sach("prices", 2008, _3, 500);

        hoa_hong.in_ra_ten_sach();

        System.out.println(hoa_hong.check(princes));


        System.out.println(the_door_open.giam_gia(15));
    }

}
