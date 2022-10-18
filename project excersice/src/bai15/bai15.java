package bai15;

import java.util.ArrayList;

class sinh_vien
{
    String maSinhVien;
    String HovaTen;
    double Diem_LT;
    double Diem_TH;
    public sinh_vien(String maSinhVien, String hovaTen, double diem_LT, double diem_TH) {
        this.maSinhVien = maSinhVien;
        HovaTen = hovaTen;
        Diem_LT = diem_LT;
        Diem_TH = diem_TH;
    }
    
    public double Diem_TB()
    {
        return (this.Diem_LT+this.Diem_TH)/2;
    }

    @Override
    public String toString() {
        return "sinh_vien [Diem_LT = " + Diem_LT + ", Diem_TH = " + Diem_TH + ", Diem_TB = " + Diem_TB() + ", HovaTen=" + HovaTen + ", maSinhVien = "
                + maSinhVien + "]";
    }
}

class danh_sach
{
    ArrayList <sinh_vien> danh_sach;
    public danh_sach (ArrayList <sinh_vien> danh_sach)
    {
        this.danh_sach = danh_sach;
    }


    public danh_sach() {
        this.danh_sach = new ArrayList<sinh_vien>();
    }


    public void add_sinh_vien (sinh_vien sv)
    {
        this.danh_sach.add(sv);
    }

    public void in_thong_tin_sv()
    {
        for (sinh_vien i: danh_sach)
        {
            System.out.println(i.toString());
        }
    }
}

class bai15
{
    public static void main(String[] args) {
        sinh_vien sv = new sinh_vien("MS1", "Phan Duc Huy", 9, 8.5);
        sinh_vien sv_2 = new sinh_vien("MS2", "Pham Gia Bao", 7, 8);
        danh_sach dssv = new danh_sach();
        dssv.add_sinh_vien(sv);
        dssv.add_sinh_vien(sv_2);
        dssv.in_thong_tin_sv();
        
    }
}
