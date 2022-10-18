


package baioop1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

class Vehicle implements Comparable<Vehicle>
{
    String ma_xe;
    double dung_tich;
    double tri_gia;
    String mo_ta;
    public Vehicle(String ma_xe, double dung_tich, double tri_gia, String mo_ta) {
        this.ma_xe = ma_xe;
        this.dung_tich = dung_tich;
        this.tri_gia = tri_gia;
        this.mo_ta = mo_ta;
    }

    public Vehicle(String ma_xe) {
        this.ma_xe = ma_xe;
    }

    public String getMa_xe() {
        return ma_xe;
    }
    public void setMa_xe(String ma_xe) {
        this.ma_xe = ma_xe;
    }
    public double getDung_tich() {
        return dung_tich;
    }
    public void setDung_tich(double dung_tich) {
        this.dung_tich = dung_tich;
    }
    public Double getTri_gia() {
        return tri_gia;
    }
    public void setTri_gia(double tri_gia) {
        this.tri_gia = tri_gia;
    }
    public String getMo_ta() {
        return mo_ta;
    }
    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }
    
    
    
    public Double thue_xe() {
        double thue_xe = 0;
        if (this.dung_tich <= 100) {
            thue_xe = this.dung_tich*1/100;
        }
        else if (this.dung_tich > 100 && this.dung_tich <=200) {
            thue_xe = this.tri_gia*3/100;
        }
        else if (this.dung_tich>200) {
            thue_xe = this.tri_gia*5/100;
        }
        return (thue_xe);
    }
    @Override
    public String toString() {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        return "Vehicle [dung_tich = " + dung_tich + ", ma_xe = " + ma_xe + ", mo_ta  = " + mo_ta + ", tri_gia = " + numf.format(tri_gia) + " muc_thue_phai_tra = " + numf.format(thue_xe())
                + "]";
    }
    @Override
    public int compareTo(Vehicle o) {
        // TODO Auto-generated method stub
        return this.thue_xe().compareTo(o.thue_xe());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ma_xe == null) ? 0 : ma_xe.hashCode());
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
        Vehicle other = (Vehicle) obj;
        if (ma_xe == null) {
            if (other.ma_xe != null)
                return false;
        } else if (!ma_xe.equals(other.ma_xe))
            return false;
        return true;
    }


}


class danh_sach_bill
{
    ArrayList<Vehicle> danh_sach;

    public danh_sach_bill(ArrayList<Vehicle> danh_sach) {
        this.danh_sach = danh_sach;
    }
    
    public danh_sach_bill()
    {
        this.danh_sach = new ArrayList<Vehicle>();
    }

    // 1. them doi tuong xe va nhap mo ta
    public void add_xe (Vehicle xe) {
        this.danh_sach.add(xe);
    }

    // 2. in ra danh sach bill cua xe
    public void in_ra_DS_bill () {
        for (Vehicle i:this.danh_sach) {
            System.out.println(i.toString());
        }
    }

    // 3. xoa bill thel ma so xe
    public void xoa_bill ( Vehicle ma_xe) {        
        this.danh_sach.remove(ma_xe);
    }

    // 4. xuat ban thue xe theo ma xe
    public void thue_xe (String ma_xe) {
        for (Vehicle i:this.danh_sach) {
            if (i.ma_xe.equals(ma_xe)) {
                Locale lc = new Locale("us", "US");
                NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
                System.out.println("bill thue cua ma xe "+i.ma_xe+" la: "+numf.format(i.thue_xe()));
            }
        }
    }

    // 5. sap xep bill tu thap den cao
    public void sort () {
        Collections.sort(this.danh_sach);
    }

    // 6. tra cuu
    public boolean tra_cuu (Vehicle ma_xe) {
        return this.danh_sach.contains(ma_xe);
    }
}



class baioop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danh_sach_bill danh_sach = new danh_sach_bill();
        do {
            System.out.println("-------------------------------------------");
            System.out.println("1. them doi tuong xe va nhap mo ta.");
            System.out.println("2. in ra danh sach bill cua xe.");
            System.out.println("3. xoa bill theo ma xe.");
            System.out.println("4. xuat ban thue xe theo ma xe.");
            System.out.println("5. sap xep bill tu thap den cao.");
            System.out.println("6. tra cuu.");
            System.out.println("0. thoat.");
            System.out.println("-------------------------------------------");

            System.out.println("*******************************************");
            System.out.print("nhap lua chon: ");
            int choice = input.nextInt();

            if (choice == 1) {
                String fisrtline = input.nextLine();
                System.out.print("nhap ma_xe: "); String ma_xe = input.nextLine();
                System.out.print("nhap dung_tich xe: "); double dung_tich = input.nextDouble();
                System.out.print("nhap tri_gia xe: "); double tri_gia = input.nextDouble();
                String fisrtline_2 = input.nextLine();
                System.out.print("nhap mo_ta xe: "); String mo_ta = input.nextLine();
                Vehicle vehicle = new Vehicle(ma_xe, dung_tich, tri_gia, mo_ta);
                danh_sach.add_xe(vehicle);
            }
            else if (choice ==2) {
                danh_sach.in_ra_DS_bill();
            }
            else if (choice ==3) {
                String fisrtline = input.nextLine();
                System.out.print("nhap ma_xe can xoa: "); String ma_xe = input.nextLine();
                Vehicle vehicle = new Vehicle(ma_xe);
                danh_sach.xoa_bill(vehicle);
                System.out.println("da xoa!");
            }
            else if(choice ==4) {
                String fisrtline = input.nextLine();
                System.out.print("nhap ma_xe can xuat bill: "); String ma_xe = input.nextLine();
                System.out.println();
                danh_sach.thue_xe(ma_xe);
            }
            else if (choice ==5) {
                danh_sach.sort();
                danh_sach.in_ra_DS_bill();
                System.out.println("da sort!");
            }
            else if (choice ==6) {
                String fisrtline = input.nextLine();
                System.out.print("nhap ma_xe can tra cuu: "); String ma_xe = input.nextLine();
                Vehicle vehicle = new Vehicle(ma_xe);
                System.out.print("ket qua: "); System.out.println(danh_sach.tra_cuu(vehicle));
            }
            else if (choice ==0) {
                break;
            }
            System.out.println("*******************************************");               


        }while(true);
    }
}