package bainangcaooop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.plaf.synth.SynthScrollBarUI;

import org.junit.platform.launcher.core.LauncherConfig;

class thi_sinh {
    private final Integer so_bao_danh;
    private String ho_ten;
    private String dia_chi;
    private Integer muc_uu_tien;
    private String khoi_thi;
    
    public thi_sinh(Integer so_bao_danh, String ho_ten, String dia_chi, Integer muc_uu_tien, String khoi_thi) {
        this.so_bao_danh = so_bao_danh;
        this.ho_ten = ho_ten;
        this.dia_chi = dia_chi;
        this.muc_uu_tien = muc_uu_tien;
        this.khoi_thi = khoi_thi;
    }

    public thi_sinh (Integer so_bao_danh) {
        this.so_bao_danh = so_bao_danh;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((so_bao_danh == null) ? 0 : so_bao_danh.hashCode());
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
        thi_sinh other = (thi_sinh) obj;
        if (so_bao_danh == null) {
            if (other.so_bao_danh != null)
                return false;
        } else if (!so_bao_danh.equals(other.so_bao_danh))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "thi_sinh [dia_chi=" + dia_chi + ", ho_ten=" + ho_ten + ", khoi_thi=" + khoi_thi + ", muc_uu_tien="
                + muc_uu_tien + ", so_bao_danh=" + (so_bao_danh+"").toUpperCase() + "]";
    }

    public Integer getMuc_uu_tien() {
        return muc_uu_tien;
    }

    
}

class danh_sach_thi_sinh {

    private ArrayList <thi_sinh> danh_sach_thi_sinh;
    
    public danh_sach_thi_sinh (ArrayList <thi_sinh> danh_sach) {
        this.danh_sach_thi_sinh = danh_sach;
    }

    public danh_sach_thi_sinh () {
        this.danh_sach_thi_sinh = new ArrayList<thi_sinh>();
    }

    // 1. add thi sinh 
    public void add_thi_sinh (thi_sinh thi_sinh) {
        this.danh_sach_thi_sinh.add(thi_sinh);
    }

    // 2. hien thi thong tin cua thi sinh theo ma thi sinh
    public void hien_thi_thong_tin_thi_sinh (thi_sinh ma_thi_sinh) {
        if (this.danh_sach_thi_sinh.contains(ma_thi_sinh)) {
            for (int i=0; i< this.danh_sach_thi_sinh.size(); i++) {
                if (this.danh_sach_thi_sinh.get(i).equals(ma_thi_sinh)) {
                    System.out.println(this.danh_sach_thi_sinh.get(i).toString());
                }
            }
        }
    }

    // 3. in ra danh sach 
    public void in_danh_sach () {
        for (thi_sinh i: this.danh_sach_thi_sinh) {
            System.out.println(i.toString());
        }
    }

    // 4. sort theo thu tu uu tien thu thap den cao 
    public void sort_thu_tu_uu_tien () {
        Collections.sort(this.danh_sach_thi_sinh, new Comparator<thi_sinh>() {

            @Override
            public int compare(thi_sinh o1, thi_sinh o2) {
                // TODO Auto-generated method stub
                return o2.getMuc_uu_tien().compareTo(o1.getMuc_uu_tien());
            }
            
        });
    }
}

class bainangcaooop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danh_sach_thi_sinh danh_sach = new danh_sach_thi_sinh();
        do {
            
            System.out.println("-----------------------------------------");
            System.out.println("1. add thi sinh \n" + 
                                "2. hien thi thong tin cua thi sinh \n" +
                                "3. in ra danh sach thi sinh");
            System.out.println("-----------------------------------------");                 
            System.out.println("*****************************************");
            System.out.print("lua chon: ");
            Integer choice = input.nextInt();
            if (choice == 1) {
                //String first = input.nextLine();
                System.out.print("nhap so bao danh: "); Integer so_bao_danh = input.nextInt();
                String second  = input.nextLine();
                System.out.print("nhap ho ten: "); String ho_ten = input.nextLine();
                System.out.print("nhap dia chi: "); String dia_chi = input.nextLine();
                System.out.print("nhap muc uu tien: "); Integer muc_uu_tien = input.nextInt();
                System.out.print("nhap khoi thi: "); String khoi_thi = input.next();
                String khoi = "abcd";
                if (khoi.contains(khoi_thi)) {
                    thi_sinh thi_sinh = new thi_sinh(so_bao_danh, ho_ten, dia_chi, muc_uu_tien, khoi_thi);
                    danh_sach.add_thi_sinh(thi_sinh);
                }          
                else {
                    System.out.println("khoi thi khong ton taiV!");
                }
            }
            else if (choice == 2 ) {
                Integer so_bao_danh = input.nextInt();
                thi_sinh ma_thi_sinh = new thi_sinh(so_bao_danh);
                danh_sach.hien_thi_thong_tin_thi_sinh(ma_thi_sinh);
            }
            else if (choice == 3 ) {
                danh_sach.in_danh_sach();
            }
            else if (choice == 4 ) {
                danh_sach.sort_thu_tu_uu_tien();
                danh_sach.in_danh_sach();                
            }
            else {
                break;
            }
            System.out.println("*****************************************");
        }while (true);
    }
}