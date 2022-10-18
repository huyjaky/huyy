package baividu5;
import java.util.*;

import javax.print.DocFlavor.STRING;

class SinhVien implements Comparable<SinhVien>
{
    String maSinhVien;
    String Hovaten;
    Integer NamSinh;
    Double DiemTB;
    public SinhVien(String maSinhVien, String hovaten, Integer namSinh, Double diemTB) {
        this.maSinhVien = maSinhVien;
        this.Hovaten = hovaten;
        this.NamSinh = namSinh;
        this.DiemTB = diemTB;
    }
    
    public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
    
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHovaten() {
        return Hovaten;
    }
    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }
    public Integer getNamSinh() {
        return NamSinh;
    }
    public void setNamSinh(Integer namSinh) {
        NamSinh = namSinh;
    }
    public Double getDiemTB() {
        return DiemTB;
    }
    public void setDiemTB(Double diemTB) {
        DiemTB = diemTB;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
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
        SinhVien other = (SinhVien) obj;
        if (maSinhVien == null) {
            if (other.maSinhVien != null)
                return false;
        } else if (!maSinhVien.equals(other.maSinhVien))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SinhVien [DiemTB = " + DiemTB + ", Hovaten = " + Hovaten + ", NamSinh = " + NamSinh + ", maSinhVien = "
                + maSinhVien + "]";
    }

    @Override
    public int compareTo(SinhVien o) {
        // TODO Auto-generated method stub
        return this.DiemTB.compareTo(o.DiemTB);
    }
    
    
    
}


class option
{
    ArrayList<SinhVien> DanhSach;

    public option(ArrayList<SinhVien> DanhSach) {
        this.DanhSach = DanhSach;
    }

    public option ()
    {
        this.DanhSach = new ArrayList<SinhVien>();
    }
    
    
    public void in_ra_danh_sach()
    {
        for (SinhVien i: DanhSach)
        {
            System.out.println(i);
        }
    }
    
    
    // 1.them sinh vien vao danh sach
    public void add_SinhVien (SinhVien sv)
    {
        DanhSach.add(sv);
    }

    // 2. kiem tra danh sach co rong hay khong
    public boolean check_DanhSach ()
    {
        return this.DanhSach.isEmpty();
    }

    // 3. lay ra so luong sinh vien
    public Integer size_SinhVien()
    {
        return this.DanhSach.size();
    }

    // 4. lam rong danh sach sinh vien
    public void clear_DanhSach()
    {
        this.DanhSach.clear();
    }

    // 5. kiem tra sinh vien co ton tai trong danh sach hay khong
    public boolean check_SinhVien (SinhVien sv)
    {
        return this.DanhSach.contains(sv);
    }

    // 6. xoa mot sinh vien ra khoai danh sach dua tren ma sinh vien
    public void remove_SinhVien(SinhVien code_sv)
    {
        this.DanhSach.remove(code_sv);
    }
    
    // 7. tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim
    public void find_SinhVien(String ten)
    {
        for (SinhVien i: DanhSach)
        {
            if (i.Hovaten.indexOf(ten)>=0)
            {
                System.out.println(i);
            }
        }
    }

    // 8. xuat ra sinh vien co diem tu cao den thap
    public void sort ()
    {
        Collections.sort(this.DanhSach);
    }

    // 9. kiem tra co phai rong hay khong
    public boolean check_isempty()
    {
        return this.DanhSach.isEmpty();
    }

}
//test
class baividu5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        option op = new option();
        do
        {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1. them sinh vien vao danh sach");
            System.out.println("2. in ra danh sach sinh vien");
            System.out.println("3. lay ra so luong sinh vien");
            System.out.println("4. lam rong danh sach sinh vien");
            System.out.println("5. kiem tra sinh vien co ton tai trong danh sach hay khong");
            System.out.println("6. xoa mot sinh vien ra khoai danh sach dua tren ma sinh vien");
            System.out.println("7. tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim");
            System.out.println("8. xuat ra sinh vien co diem tu cao toi thap");
            System.out.println("9. kiem tra co phai la danh sach rong hay khong");
            System.out.println("0. ket thuc chuong trinh");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("lua chon: ");
            
            Integer choice = input.nextInt();
            if (choice == 1)
            {
                String firstNewLine = input.nextLine();
                System.out.print("nhap maSinhVien: "); String maSinhVien = input.nextLine();
                System.out.print("nhap HovaTen: "); String HovaTen = input.nextLine();
                System.out.print("nhap NamSinh: "); Integer NamSinh = input.nextInt();
                System.out.print("nhap DiemTB: "); Double DiemTB = input.nextDouble();
                SinhVien sv = new SinhVien(maSinhVien, HovaTen, NamSinh, DiemTB);
                op.add_SinhVien(sv);
            }
            else if (choice == 2)
            {
                op.in_ra_danh_sach();
            }
            else if (choice == 3)
            {
                System.out.println(op.size_SinhVien());
            }
            else if (choice == 4)
            {
                op.clear_DanhSach();
            }
            else if (choice == 5)
            {
                System.out.print("nhap ma sinh vien: ");
                String maSinhVien = input.next();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("tra loi: "+op.check_SinhVien(sv));
            }
            else if (choice == 6)
            {
                String maSinhVien = input.next();
                SinhVien sv = new SinhVien(maSinhVien);
                op.remove_SinhVien(sv);
            }
            else if (choice == 7)
            {
                String ten = input.next();
                op.find_SinhVien(ten);
            }
            else if (choice ==8)
            {
                op.sort();
                op.in_ra_danh_sach();
            }
            else if(choice ==9)
            {
                System.out.print("ket qua: ");
                System.out.println(op.check_isempty());
            }
            else if (choice ==0)
            {
                break;
            }
        
            
        }while(true);

    }
}
