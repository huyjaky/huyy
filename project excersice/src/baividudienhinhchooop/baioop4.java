package baividudienhinhchooop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

class CD implements Comparable <CD>{
    private Integer number_CD;
    private String name_CD;
    private String name_singer;
    private Integer number_album = 0;
    private Double cost = 0d;
    public CD(Integer number_CD, String name_CD, String name_singer, Integer number_album, Double cost) {
        super();
        this.number_CD = number_CD;
        this.name_CD = name_CD;
        this.name_singer = name_singer;
        this.number_album = number_album;
        this.cost = cost;
    }

    protected CD (Integer number_CD) {
        this.number_CD = number_CD;
    }

    public Integer getNumber_CD() {
        return number_CD;
    }
    public void setNumber_CD(Integer number_CD) {
        this.number_CD = number_CD;
    }
    public String getName_CD() {
        return name_CD;
    }
    public void setName_CD(String name_CD) {
        this.name_CD = name_CD;
    }
    public String getName_singer() {
        return name_singer;
    }
    public void setName_singer(String name_singer) {
        this.name_singer = name_singer;
    }
    public Integer getNumber_album() {
        return number_album;
    }
    public void setNumber_album(Integer number_album) {
        this.number_album = number_album;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    
    

    @Override
    public int compareTo(CD o) {
        // TODO Auto-generated method stub
        return this.cost.compareTo(o.cost);
    }

    @Override
    public String toString() {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        return "CD [cost = " + numf.format(cost) + ", name_CD = " + name_CD + ", name_singer = " + name_singer + ", number_CD = " + number_CD
                + ", number_album = " + number_album + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number_CD == null) ? 0 : number_CD.hashCode());
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
        CD other = (CD) obj;
        if (number_CD == null) {
            if (other.number_CD != null)
                return false;
        } else if (!number_CD.equals(other.number_CD))
            return false;
        return true;
    }


    public String split_ten_dem () {
        String name = this.name_CD.trim();
        String ten_dem;
        if (name.contains(" ")){
            ten_dem = name.substring(name.lastIndexOf(" "));
        }
        else{
            ten_dem = name;
        }
        return ten_dem;
    }
}

class danh_sach {
    private ArrayList <CD> danh_sach;
    
    public danh_sach(ArrayList <CD> danh_sach) {
        this.danh_sach = danh_sach;
    }

    public danh_sach () {
        this.danh_sach = new ArrayList<CD>();
    }

    public void add_album (CD album) {
        if (this.danh_sach.contains(album)) {
            System.out.println("album da ton tai!");
        }
        else {
            this.danh_sach.add(album);
        }
    }

    public void out_put_danh_sach () {
        for (CD i: this.danh_sach) {
            System.out.println(i.toString());
        }
    }

    public void sum_cost () {
        Double sum = 0d;
        for (CD i: this.danh_sach) {
            sum += i.getCost();
        }
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        System.out.println(numf.format(sum));
    }

    public Integer size_cd () {
        return this.danh_sach.size();
    }

    public void sort () {
        Collections.sort(this.danh_sach);
    }
    
    // vi du cho comparator 
    public void sort_ten_dem () {
        Collections.sort(this.danh_sach, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                // TODO Auto-generated method stub
                return o2.split_ten_dem().compareTo(o1.split_ten_dem());
            } 
        }); 
    }
}

class baioop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danh_sach danh_sach = new danh_sach();
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println();
            System.out.println("1.  add album.");
            System.out.println("2.  in ra danh sach album.");
            System.out.println("3.  in ra tong gia thanh cua tat ca album trong danh sach.");
            System.out.println("4.  so luong album trong danh sach.");
            System.out.println("5.  sort album trong danh sach theo gia thanh tu thap den cao.");
            System.out.println("6.  sort album trong danh sach theo ten dem cua album.");
            System.out.println();
            System.out.println("----------------------------------- ********************************");
            System.out.println();
            System.out.print("nhap lua chon: "); Integer choice = input.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.print("nhap code cd: "); Integer number_CD = input.nextInt();
                System.out.print("nhap ten cd: "); String name_CD = input.nextLine();
                String first = input.nextLine();
                System.out.print("nham ten ca si: "); String name_singer = input.nextLine();
                System.out.print("nhap so bai hat trong album: "); Integer number_album = input.nextInt();
                System.out.print("nhap gia moi album: "); Double cost = input.nextDouble();
                CD cd = new CD(number_CD, name_CD, name_singer, number_album, cost);
                danh_sach.add_album(cd);
            }
            else if (choice == 2) {
                danh_sach.out_put_danh_sach();
                System.out.println("\n"+"da in thanh cong!".toUpperCase()+"\n");
            }
            else if (choice == 3) {
                System.out.print("tong so tien: ");
                danh_sach.sum_cost();
                System.out.println("\n"+"da in thanh cong!".toUpperCase()+"\n");
            }
            else if (choice == 4) {
                System.out.print("so luong album trong danh sach: ");
                System.out.println(danh_sach.size_cd());
                System.out.println("\n"+"da in thanh cong!".toUpperCase()+"\n");
            }
            else if (choice == 5) {
                danh_sach.sort();
                danh_sach.out_put_danh_sach();
                System.out.println("\n"+"da sort thanh cong!".toUpperCase()+"\n");
            }
            else if (choice == 6) {
                danh_sach.sort_ten_dem();
                danh_sach.out_put_danh_sach();
                System.out.println("\n"+"da sort thanh cong!".toUpperCase()+"\n");
            }
            else {
                break;
            }
            System.out.println();
            System.out.println("******************************************************************");
        }while (true);
    }
}