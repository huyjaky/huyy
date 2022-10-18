package baicuoicungkhonhat;

import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

class Dagiac {
    Integer so_canh;
    ArrayList <Double> list_dodai;

    public Dagiac (Integer so_canh, ArrayList <Double> list ) {
        this.so_canh = so_canh;
        this.list_dodai = list;
    }

    public Dagiac (Integer so_canh) {
        this.so_canh = so_canh;
    }

    public void add_dodai () {
        this.list_dodai = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i=0; i<so_canh; i++) {
            System.out.print("nhap canh "+(i+1)+": "); Double do_dai = input.nextDouble();
            this.list_dodai.add(do_dai);
        }
    }

    public Double chu_vi () {
        Double chu_vi = 0d;
        for (Double i: this.list_dodai) {
            chu_vi += i;
        }
        return chu_vi;
    }

    public Integer getSo_canh() {
        return so_canh;
    }

    public void setSo_canh(Integer so_canh) {
        this.so_canh = so_canh;
    }

    public ArrayList<Double> getList_dodai() {
        return list_dodai;
    }

    public void setList_dodai(ArrayList<Double> list_dodai) {
        this.list_dodai = list_dodai;
    }
    

}

class tam_giac extends Dagiac {
    
    public tam_giac () {
        super(3);
    }

    public Double dien_tich () {
        Double P = (this.getList_dodai().get(0)+this.getList_dodai().get(1)+this.getList_dodai().get(2))*0.5;
        Double dien_tich = Math.sqrt(P*(P-this.getList_dodai().get(0))*(P-this.getList_dodai().get(1))*(P-this.getList_dodai().get(2)));
        return dien_tich;
    }

    public String toString () {
        for (int i=0; i<this.getList_dodai().size(); i++) {
            System.out.printf( "tam giac { "+"canh "+(i+1)+": "+this.getList_dodai().get(i)+" }"+"\t");
            
        }
        System.out.printf("%.2f", dien_tich()," ",chu_vi());
        System.out.println();
        return "";
    }

}

class danh_sach_tam_giac {
    ArrayList<tam_giac> danh_sach;

    public danh_sach_tam_giac (ArrayList<tam_giac> danh_sach) {
        this.danh_sach = danh_sach;
    }

    public danh_sach_tam_giac () {
        this.danh_sach = new ArrayList<tam_giac>();
    }

    public void add_tam_giac (tam_giac tam_giac) {
        this.danh_sach.add(tam_giac);
    }

    public void in_list_tam_giac () {
        for (tam_giac i: this.danh_sach) {  
            i.toString();
        }
    }

    // theo thu tu giam dan
    public void sort () {
        Collections.sort(this.danh_sach, new Comparator<tam_giac>() {

            @Override
            public int compare(tam_giac o1, tam_giac o2) {
                // TODO Auto-generated method stub
                return o2.dien_tich().compareTo(o1.dien_tich());
            }
        });
    }

    public void S_max () {
        if (this.danh_sach.size() == 1) {
            in_list_tam_giac();
        }
        else {
            ArrayList <tam_giac> list_cp = new ArrayList<>();
            for (tam_giac i: this.danh_sach) {
                list_cp.add(i);
            }
            Collections.sort(list_cp, new Comparator<tam_giac>() {

                @Override
                public int compare(tam_giac o1, tam_giac o2) {
                    // TODO Auto-generated method stub
                    return o2.dien_tich().compareTo(o1.dien_tich());
                }
                
            });
            System.out.println(list_cp.get(0).toString());
        }
    }

    public void index (Integer index) {
        try {
            System.out.println(this.danh_sach.get(index));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("khong ton tai!".toUpperCase());
        }
    }

    public void remove_index (Integer index) {
        try {
            this.danh_sach.remove(index-1);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("khong ton tai!".toUpperCase());
        }
    }
}


class baicuoicung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danh_sach_tam_giac danh_sach = new danh_sach_tam_giac();
        do {
            System.out.println("------------------------------------------------");
            System.out.println("0. thoat"+ "\n" +
                                "1. them danh sach cac tam giac" + "\n" +
                                "2. xuat danh sach cac tam giac" + "\n" +
                                "3. in tam giac co dien tich lon nhat" + "\n" +
                                "4. tim kiem tam giac theo vi tri index" + "\n" +
                                "5. xoa mot tam giac theo vi tri index" + "\n" +
                                "6. sap xep theo thu tu giam dan theo dien tich");
            System.out.println("------------------------------------------------");
            System.out.println("************************************************");        
            System.out.println();
            System.out.print("nhap lua chon: ");
            Integer choice = input.nextInt();
            switch (choice) {
                case 1:
                    tam_giac tam_giac = new tam_giac();
                    tam_giac.add_dodai();
                    danh_sach.add_tam_giac(tam_giac);
                    System.out.println("da add thanh cong!".toUpperCase());
                    break;
                case 2:
                    danh_sach.in_list_tam_giac();
                    break;
                case 3:
                    danh_sach.S_max();
                    break;
                case 4:
                    System.out.println("nhap vi tri: "); Integer index = input.nextInt();
                    danh_sach.index(index);
                    break;
                case 5:
                    System.out.println("nhap vi tri: "); Integer index_ = input.nextInt();
                    danh_sach.remove_index(index_);
                    break;
                case 6:
                    danh_sach.sort();
                    danh_sach.in_list_tam_giac();
                    System.out.println("da sort thanh cong!".toUpperCase());
                    break;
                default:
                    System.out.println("da thoat!".toUpperCase());
                    break;
            }
            System.out.println();
            System.out.println("************************************************"); 
        
        
        }while (true);
    }
}