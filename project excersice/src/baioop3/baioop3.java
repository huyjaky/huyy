package baioop3;

import java.sql.DatabaseMetaData;
import java.text.NumberFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

class date implements Comparable <date> {
    int date;
    int month;
    Long year;
    public date (int date, int month, Long year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return date + "/" + month + "/" + year;
    }
    @Override
    public int compareTo(date o) {
        // TODO Auto-generated method stub
        return this.year.compareTo(o.year); 
    }
}


class thuc_pham implements Comparable <thuc_pham> {
    final String ma_hang;
    String ten_hang;
    Double don_gia;
    date nsx;
    date nhh;
    public thuc_pham(String ma_hang, String ten_hang, Double don_gia, date nsx, date nhh) {
        this.ma_hang = ma_hang;
        this.ten_hang = ten_hang;
        this.don_gia = don_gia;
        this.nsx = nsx;
        this.nhh = nhh;
    }
    public thuc_pham (String ma_hang) {
        this.ma_hang = ma_hang;
    }

    @Override
    public String toString() {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        return "thuc_pham [don_gia = " + numf.format(don_gia) + ", ma_hang = " + ma_hang + ", nhh = " + nhh + ", nsx = " + nsx
                + ", ten_hang = " + ten_hang + "]";
    }
    public String getMa_hang() {
        return ma_hang;
    }
    public String getTen_hang() {
        return ten_hang;
    }
    public void setTen_hang(String ten_hang) {
        this.ten_hang = ten_hang;
    }
    public Double getDon_gia() {
        return don_gia;
    }
    public void setDon_gia(Double don_gia) {
        this.don_gia = don_gia;
    }
    public date getNsx() {
        return nsx;
    }
    public void setNsx(date nsx) {
        this.nsx = nsx;
    }
    public date getNhh() {
        return nhh;
    }
    public void setNhh(date nhh) {
        this.nhh = nhh;
    }
    @Override
    public int compareTo(thuc_pham o) {
        // TODO Auto-generated method stub
        return this.don_gia.compareTo(o.don_gia); 
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ma_hang == null) ? 0 : ma_hang.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        thuc_pham other = (thuc_pham) obj;
        if (ma_hang == null) {
            if (other.ma_hang != null)
                return false;
        } else if (!ma_hang.equals(other.ma_hang))
            return false;
        return true;
    }
}

class danh_sach_thuc_pham {
    ArrayList <thuc_pham> danh_sach;
    public danh_sach_thuc_pham (ArrayList <thuc_pham> danh_sach) {
        this.danh_sach = danh_sach;
    }
    
    public danh_sach_thuc_pham () {
        this.danh_sach = new ArrayList<thuc_pham>();
    }
    
    public boolean check_ngay_thang (thuc_pham thuc_pham) {
        Calendar cl = Calendar.getInstance();
        int date = cl.get(Calendar.DATE);
        int month = cl.get(Calendar.MONTH);
        int year = cl.get(Calendar.YEAR);
        if (thuc_pham.nhh.getYear() > year) {
            return true;
        }
        else if (thuc_pham.nhh.getYear() == year &&  thuc_pham.nhh.getMonth() > month) {
            return true;
        }
        else if (thuc_pham.nhh.getYear() == year &&  thuc_pham.nhh.getMonth() == month && thuc_pham.nhh.getDate() >= date) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
    // 1. add thuc pham
    public void add_thuc_pham (thuc_pham thuc_pham) {
        int date = thuc_pham.nsx.getDate();
        int month = thuc_pham.nsx.getMonth();
        long year = thuc_pham.nsx.getYear();
        if (thuc_pham.nhh.getYear() > year) {
            this.danh_sach.add(thuc_pham);
        }
        else if (thuc_pham.nhh.getYear() == year &&  thuc_pham.nhh.getMonth() > month) {
            this.danh_sach.add(thuc_pham);
        }
        else if (thuc_pham.nhh.getYear() == year &&  thuc_pham.nhh.getMonth() == month && thuc_pham.nhh.getDate() >= date) {
            this.danh_sach.add(thuc_pham);
        }
        else {
            System.out.println("loi!");
        }
    }

    // 2. in danh sach thuc pham
    public void output_danh_sach () {
        for (thuc_pham i: this.danh_sach) {
            System.out.println(i.toString());
        }
    }

    // 3. sort danh sach theo don gia
    public void sort_danh_sach_theo_don_gia() {
        Collections.sort(this.danh_sach);
        output_danh_sach();
    }

    // 4. check han su dung
    public void check_han_su_dung (String ma_hang){
        for (thuc_pham i: this.danh_sach) {
            if (i.ma_hang.equals(ma_hang)) {
                if (check_ngay_thang(i) == true) {
                    System.out.println("san pham con han su dung!");
                }
                else if (check_ngay_thang(i) == false){
                    System.out.println("san pham het han su dung!");
                }
            }
        }
    }

    // 5. check hang co ton tai trong danh sach hay khong 
    public boolean check_hang(thuc_pham ma_hang) {
        return this.danh_sach.contains(ma_hang);
    }

    // 6. in san pham theo ma hang
    public void find_out_san_pham (thuc_pham ma_hang) {
        for (thuc_pham i: this.danh_sach) {
            if (i.equals(ma_hang)) {
                System.out.println(i);
            }
        }
    }

    public boolean check_date(int date, int month, Long year) {
        if (date <=31 && month <=12){
            return true;
        }
        else {
            return false;
        }
    }
    
}


class baioop3{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danh_sach_thuc_pham danh_sach = new danh_sach_thuc_pham();
        do{
            System.out.println("-------------------------------------------------------");
            System.err.println("1.  them thong tin thuc pham.");
            System.out.println("2.  in ra danh sach thuc pham.");
            System.out.println("3.  sort danh sach theo don gia.");
            System.out.println("4.  check han su dung.");
            System.out.println("5.  check hang co ton tai trong danh sach hay khong.");
            System.out.println("6.  in ra san pham theo ma hang.");
            System.out.println("0.  thoat chuong trinh.");
            System.out.println("-------------------------------------------------------");
            System.out.println("*******************************************************");
            System.out.print("lua chon: "); Integer choice = input.nextInt();
            if (choice ==1) {
                System.out.print("nhap ma hang: "); String second = input.nextLine(); String ma_hang = input.nextLine();
                System.out.print("nhap ten hang: "); String ten_hang = input.nextLine();
                System.out.print("nhap don gia: "); Double don_gia = input.nextDouble();
                System.out.println("______");
                System.out.print("nhap ngay sx: "); int date_sx = input.nextInt();
                System.out.print("nhap thang sx: "); int month_sx = input.nextInt();
                System.out.print("nhap nam sx: "); Long year_sx = input.nextLong();
                System.out.println("______");
                System.out.print("nhap ngay het han: "); int date_hh = input.nextInt();
                System.out.print("nhap thang het han: "); int month_hh = input.nextInt();
                System.out.print("nhap nam het han: "); Long year_hh = input.nextLong();
                if (danh_sach.check_date(date_sx, month_sx, year_sx) == true && danh_sach.check_date(date_hh, month_hh, year_hh) == true) {
                    date nsx = new date(date_sx, month_sx, year_sx);
                    date nhh = new date(date_hh, month_hh, year_hh);
                    thuc_pham thuc_pham = new thuc_pham(ma_hang, ten_hang, don_gia, nsx, nhh);
                    danh_sach.add_thuc_pham(thuc_pham);
                    System.out.println("\n"+"them thanh cong!".toUpperCase()+"\n");
                }else{
                    System.out.println("\n"+"nhap loi ngay thang!".toUpperCase()+"\n");
                }
            }
            else if (choice == 2) {
                danh_sach.output_danh_sach();
                System.out.println("da in thanh cong!");
            }
            else if (choice == 3) {
                danh_sach.sort_danh_sach_theo_don_gia();
                System.out.println("sort thanh cong!");
            }
            else if (choice ==4 ) {
                System.out.print("nhap ma hang: "); String second = input.nextLine(); String ma_hang = input.nextLine();
                danh_sach.check_han_su_dung(ma_hang+"\n");
            }
            else if (choice ==5 ) {
                System.out.print("nhap ma hang: "); String second = input.nextLine(); String ma_hang = input.nextLine();
                thuc_pham ma_hang_ = new thuc_pham(ma_hang);
                System.out.println("ton tai: "+danh_sach.check_hang(ma_hang_));
            }
            else if (choice ==6 ) {
                System.out.print("nhap ma hang: "); String second = input.nextLine(); String ma_hang = input.nextLine();
                thuc_pham ma_hang_ = new thuc_pham(ma_hang);
                danh_sach.find_out_san_pham(ma_hang_);
                System.out.println("da in thanh cong!");
            }
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("nhap loi!");
            }
            System.out.println("*******************************************************");
        }while (true);

        }
}