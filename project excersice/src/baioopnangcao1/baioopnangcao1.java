package baioopnangcao1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

class rank {
    Integer number_rank;

    public rank (Integer numbeInteger) {
        this.number_rank = numbeInteger;
    }

    public String check_rank () {
        if (0 < this.number_rank && this.number_rank < 11) {
            return this.number_rank.toString();
        }
        else {
            return "nhap sai cap bac!".toUpperCase();
        }
    }

    public String toString () {
        return this.number_rank+"";
    }

    public Integer getNumber_rank() {
        return number_rank;
    }

    public void setNumber_rank(Integer number_rank) {
        this.number_rank = number_rank;
    }
}

class can_bo  {
    protected String ho_ten;
    protected Integer tuoi;
    protected String dia_chi;
    protected String gioi_tinh;
    public can_bo(String ho_ten, Integer tuoi, String dia_chi, Integer gioi_tinh) {
        this.ho_ten = ho_ten;
        this.tuoi = tuoi;
        this.dia_chi = dia_chi;
        switch (gioi_tinh) {
            case 1:
                this.gioi_tinh = "nam";
                break;
            case 2:
                this.gioi_tinh = "nu";
                break;
            case 3:
                this.gioi_tinh = "khac";
                break;
            default:
                break;
        }
    }

    public can_bo (String ho_ten) {
        this.ho_ten = ho_ten;
    }


    @Override
    public String toString() {
        return "can_bo [dia_chi=" + dia_chi + ", gioi_tinh=" + gioi_tinh + ", ho_ten=" + ho_ten + ", tuoi=" + tuoi
                + "]";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ho_ten == null) ? 0 : ho_ten.hashCode());
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
        can_bo other = (can_bo) obj;
        if (ho_ten == null) {
            if (other.ho_ten != null)
                return false;
        } else if (!ho_ten.equals(other.ho_ten))
            return false;
        return true;
    }
    
}

class cong_nhan extends can_bo {
    rank cap_bac;
    public cong_nhan (String ho_ten, Integer tuoi, String dia_chi, Integer gioi_tinh, rank cap_bac){
        super(ho_ten, tuoi, dia_chi, gioi_tinh);
        this.cap_bac = cap_bac;
    }

    public String getho_ten () {
        return this.ho_ten;
    }

    public String toString () {
        return "cong_nhan [ "+"ho ten = "+this.ho_ten+", "+" tuoi = "+this.tuoi+", "+"gioi tinh = "+this.gioi_tinh+", "+"dia chi = "+this.dia_chi+", "+"cap bac = "+this.cap_bac+" ]";
    }

}

class ky_su extends can_bo {
    String nganh_dao_tao;
    public ky_su (String ho_ten, Integer tuoi, String dia_chi, Integer gioi_tinh, String nganh) {
        super(ho_ten, tuoi, dia_chi, gioi_tinh);
        this.nganh_dao_tao = nganh;
    }

    public String getho_ten () {
        return this.ho_ten;
    }


    public String toString () {
        return "ky su [ "+"ho ten = "+this.ho_ten+", "+" tuoi = "+this.tuoi+", "+"gioi tinh = "+this.gioi_tinh+", "+"dia chi = "+this.dia_chi+", "+"nganh dao tao = "+this.nganh_dao_tao+" ]";
    }
}

class nhan_vien extends can_bo {
    String cong_viec;
    public nhan_vien (String ho_ten, Integer tuoi, String dia_chi, Integer gioi_tinh, String cong_viec) {
        super(ho_ten, tuoi, dia_chi, gioi_tinh);
        this.cong_viec = cong_viec;
    }

    public nhan_vien (String ho_ten)  {
        super(ho_ten);
    }


    @Override
    public String toString() {
        return "nhanh vien [" +"ho ten = "+this.ho_ten+", "+" tuoi = "+this.tuoi+", "+"gioi tinh = "+this.gioi_tinh+", "+"dia chi = "+this.dia_chi+", "+"cong viec = "+this.cong_viec+" ]";
    }

}

class danh_sach <T> {
    ArrayList <T> danh_sach;

    public danh_sach (ArrayList <T> danh_sach) {
        this.danh_sach = danh_sach;
    }

    public danh_sach () {
        this.danh_sach = new ArrayList<>();
    }

    // add can bo
    public void add_phan_tu (T can_bo) {
        this.danh_sach.add(can_bo);
    }
    
    public void in_phan_tu () {
        for (T i : this.danh_sach) {
            System.out.println(i.toString());
        }
    }

    public void find_out_hoten (T hoten) {
        for (T i: this.danh_sach) {
            if (i.equals(hoten)) {
                System.out.println(i.toString());
            }
        }
    }
}

class baioopnangcao1 {
    public static void main(String[] args) {
        danh_sach danh_sach = new danh_sach();
        nhan_vien nhan_vien = new nhan_vien("huy", 18, "hoang duc luong", 1, "phuc vu");
        ky_su ky_su = new ky_su("khoa", 18, "ngo quyen", 1, "sang tao noi dung");
        danh_sach.add_phan_tu(nhan_vien);
        danh_sach.add_phan_tu(ky_su);
        danh_sach.in_phan_tu();
        nhan_vien ten_nhanvien = new nhan_vien("huy");
        danh_sach.find_out_hoten(ten_nhanvien);
        
    }
}
