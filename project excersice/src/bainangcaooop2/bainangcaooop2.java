package bainangcaooop2;

import java.nio.channels.ScatteringByteChannel;
import java.nio.file.WatchEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;



class DATE {
    private Integer date;
    private Integer month;
    private Integer year;
    public DATE(Integer date, Integer month, Integer year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
    }
    public Integer getMonth() {
        return month;
    }
    public void setMonth(Integer month) {
        this.month = month;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    
    public String toString () {
        return this.date + "/" + this.month + "/" + this.year;
    }
}

class detail {
    protected final String ma_tai_lieu;
    protected String ten_nha_xb;
    protected Integer so_luong_ph;

    public detail (String ma_tai_lieu, String ten_nha_xb, Integer soluonph)  {
        this.ma_tai_lieu = ma_tai_lieu;
        this.ten_nha_xb = ten_nha_xb;
        this.so_luong_ph = soluonph;
    }

    public detail (String ma_tai_lieu) {
        this.ma_tai_lieu = ma_tai_lieu;
    }

    public String toString_() {
        return " [ ma_tai_lieu = " + ma_tai_lieu + ", so_luong_ph = " + so_luong_ph + ", ten_nha_xb = " + ten_nha_xb;
    }


    

    public String getMa_tai_lieu() {
        return ma_tai_lieu;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ma_tai_lieu == null) ? 0 : ma_tai_lieu.hashCode());
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
        detail other = (detail) obj;
        if (ma_tai_lieu == null) {
            if (other.ma_tai_lieu != null)
                return false;
        } else if (!ma_tai_lieu.equals(other.ma_tai_lieu))
            return false;
        return true;
    }

}

class sach extends detail {
    private String ten_tacgia;
    private Integer so_trang;
    
    public sach (String ma_tai_lieu, String ten_nha_xb, Integer soluonph, String tentg, Integer so_trang) {
        super(ma_tai_lieu, ten_nha_xb, soluonph);
        this.ten_tacgia = tentg;
        this.so_trang = so_trang;
    }

    public sach (String ma_tai_lieu) {
        super(ma_tai_lieu);
    }

    public String toString() {
        return "sach" + this.toString_() + ", ten tac gia = " + this.ten_tacgia + ", so trang = " + this.so_trang + " ]";
    }


}

class tap_chi extends detail {
    private Integer so_ph;
    private DATE ngay_ph;

    public tap_chi (String ma_tai_lieu, String ten_nha_xb, Integer soluonph, Integer so_ph, DATE ngay_ph) {
        super(ma_tai_lieu, ten_nha_xb, soluonph);
        this.so_ph = so_ph;
        this.ngay_ph = ngay_ph;
    }

    public tap_chi (String ma_tai_lieu) {
        super(ma_tai_lieu);
    }

    public String toString () {
        return "tap chi" + this.toString_() + ", so phat hanh = " + this.so_luong_ph + ", ngay phat hanh = " + this.ngay_ph.toString() + " ]";
    }
}

class bao extends detail {
    private DATE ngay_ph;

    public bao (String ma_tai_lieu, String ten_nha_xb, Integer soluonph, DATE ngay_ph) {
        super(ma_tai_lieu, ten_nha_xb, soluonph);
        this.ngay_ph = ngay_ph;
    }

    public bao (String ma_tai_lieu) {
        super(ma_tai_lieu);
    }

    public String toString () {
        return "bao" + this.toString_() + ", ngay phat hanh = " + this.ngay_ph.toString() + " ]";
    }
}

class quanly <T> {
    private ArrayList <T> quan_ly;

    public quanly (ArrayList <T> quanly) {
        this.quan_ly = quanly;
    }

    public quanly () {
        this.quan_ly = new ArrayList<T>();
    }

    public void outputall () {
        for (T i : this.quan_ly) {
            System.out.println(i.toString());
        }
    }

    // add tai lieu
    public void add_tailieu (T tailieu) {
        this.quan_ly.add(tailieu);
    }

    // xoa tai lieu theo ma tai lieu
    public boolean remove_tailieu (T ma_tai_lieu) {
        if (this.quan_ly.contains(ma_tai_lieu)) {
            for (int i=0; i<this.quan_ly.size(); i++) {
                if (this.quan_ly.get(i).equals(ma_tai_lieu)) {
                    this.quan_ly.remove(i);
                    return true;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    // hien thi thong tin ve tai lieu
    public void output_tailieu (T ma_tai_lieu) {
        if (this.quan_ly.contains(ma_tai_lieu)) {
            for (int i=0; i<this.quan_ly.size(); i++) {
                if (this.quan_ly.get(i).equals(ma_tai_lieu)) {
                    System.out.println(this.quan_ly.get(i).toString());
                }
            }
        }
        else {
            System.out.println("ma tai lieu khong ton tai!".toUpperCase());
        }
    }

    
    
    // bo tro cho cai duoi
    public void check (String name_type) {
        for (T i : this.quan_ly) {
            if (i.toString().indexOf(name_type) >= 0) {
                System.out.println(i.toString());
            }
        }
    }
    
    
    
    //1 = sach, 2 = tap chi, 3 = bao
    public void find_type (Integer type) {
        switch (type) {
            case 1:
                check("sach");
                break;
            case 2:
                check("tap chi");
                break;
            case 3:
                check("bao");
                break;
        }
    }

}

class bainangcaooop2 {
    public static void main(String[] args) {
        quanly danh_sach = new quanly();
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("--------------------------------------------------------");
                System.out.println();
                System.out.println("1. them mot tai lieu" + "\n" +
                                        "2. xoa tai lieu theo ma tai lieu" + "\n" +
                                        "3. hien thong tin ve tai lieu theo ma tai lieu" + "\n" +
                                        "4. tim kiem theo loai tai lieu" + "\n" +
                                        "5. hien thi danh sach tai lieu" + "\n" +
                                        "0. thoat");
                System.out.println();
                System.out.println("--------------------------------------------------------");
                System.out.print("lua chon: "); Integer choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("chon loai tai lieu: ");
                        System.out.println("***********");
                        System.out.println("1. sach" + "\n" +
                                                "2. tap chi" + "\n" +
                                                "3. bao");
                        System.out.println("***********");
                        Integer lua_chon = input.nextInt();
                        System.out.println("***********");
                        String first_ = input.nextLine();
                        System.out.print("1. ma tai lieu: "); String ma_tai_lieu = input.nextLine();
                        System.out.print("2. ten nha xuat ban: "); String ten_nha_xb = input.nextLine();
                        System.out.print("3. so luong phat hanh: "); Integer soluonph = input.nextInt();
                
                        // 1. them mot tai lieu
                        switch (lua_chon) {
                            case 1:
                                String first_2 = input.nextLine();
                                System.out.print("4. ten tac gia: "); String tentg = input.nextLine();
                                System.out.print("5. nhap so trang: "); Integer so_trang = input.nextInt();
                                sach sach = new sach(ma_tai_lieu, ten_nha_xb, soluonph, tentg, so_trang);
                                danh_sach.add_tailieu(sach);
                                break;
                        
                            case 2:
                                System.out.print("4. nhap so phat hanh: "); Integer so_ph = input.nextInt();
                                System.out.println("5. nhap ngay thang:");
                                System.out.println("------------------");
                                System.out.print("nhap ngay: "); Integer date = input.nextInt();
                                System.out.print("nhap thang: "); Integer month = input.nextInt();
                                System.out.print("nhap nam:"); Integer year = input.nextInt();
                                System.out.println("------------------");
                                DATE ngay_ph = new DATE(date, month, year);
                                tap_chi tap_chi = new tap_chi(ma_tai_lieu, ten_nha_xb, soluonph, so_ph, ngay_ph);
                                danh_sach.add_tailieu(tap_chi);
                                break;

                            case 3:
                                System.out.println("4. nhap ngay thang:");
                                System.out.println("------------------");
                                System.out.print("nhap ngay: "); Integer date_ = input.nextInt();
                                System.out.print("nhap thang: "); Integer month_ = input.nextInt();
                                System.out.print("nhap nam:"); Integer year_ = input.nextInt();
                                System.out.println("------------------");
                                DATE ngay_ph_ = new DATE(date_, month_, year_);
                                bao bao = new bao(ma_tai_lieu, ten_nha_xb, soluonph, ngay_ph_);
                                danh_sach.add_tailieu(bao);
                                break;

                            default:
                                break;
                        }
                        break;
                    
                    // 2.     
                    case 2:
                        String fisrt_3 = input.nextLine();
                        System.out.print("nhap ma tai lieu: "); String ma_tai_lieu_String_2 = input.nextLine();
                        tap_chi ma_1 = new tap_chi(ma_tai_lieu_String_2);
                        bao ma_2 = new bao(ma_tai_lieu_String_2);
                        sach ma_3 = new sach(ma_tai_lieu_String_2);
                        if (danh_sach.remove_tailieu(ma_1) == true) {
                            danh_sach.outputall();
                            System.out.println("da xoa!");
                        }
                        else if (danh_sach.remove_tailieu(ma_2) == true) {
                            danh_sach.outputall();
                            System.out.println("da xoa!");
                        }        
                        else if (danh_sach.remove_tailieu(ma_3) == true) {
                            danh_sach.outputall();
                            System.out.println("da xoa!");
                        }
                        else {
                            System.out.println("ma tai lieu khong ton tai!".toUpperCase());
                        }
                        break;

                    // 3.     
                    case 3:
                        String first_2 = input.nextLine();
                        System.out.print("nhap ma tai lieu: "); String ma_tai_lieu_String_ = input.nextLine();
                        danh_sach.output_tailieu(ma_tai_lieu_String_);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("nhap loai tai lieu: "); Integer type_ = input.nextInt();
                        System.out.println("1. sach");
                        System.out.println("2. tap chi");   
                        System.out.println("3. bao");
                        danh_sach.find_type(type_);
                        break;
                    case 5:
                        danh_sach.outputall();
                        System.out.println();
                        System.out.println("xuat than cong!".toUpperCase());
                        System.out.println();
                        break;
                    default:
                        break;
                }
                System.out.println("--------------------------------------------------------");
            }catch (Exception e)  {
                System.out.println("nhap loi!");
                break;
            }
        }while (true);
    }
}
