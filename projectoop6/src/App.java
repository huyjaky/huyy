import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        quanlytruong danh_sach = new quanlytruong();
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1. them hoc sinh vao danh sach." + "\n" +
                                    "2. tim kiem hoc sinh dua tren tuoi." + "\n" +
                                    "3. tim kiem hoc sinh dua tren tuoi va que." + "\n" +
                                    "0. thoat.");
            System.out.print("nhap lua chon: "); Integer choice = input.nextInt();
            
            
            System.out.println("-----------------------------------");
            // lua chon
            if (choice == 1) {
                input.nextLine();
                System.out.print("nhap ho va ten: "); String hovaten = input.nextLine();
                System.out.print("nhap lop: "); String lop = input.nextLine();
                System.out.print("nhap que: "); String que = input.nextLine();
                System.out.print("nhap tuoi: "); Integer tuoi = input.nextInt();
                
                hocsinh hocsinh = new hocsinh(hovaten, tuoi, que, lop);
                danh_sach.addHocSinh(hocsinh);
            } else if (choice == 2) {
                System.out.println("nhap tuoi: "); Integer tuoi = input.nextInt();
                danh_sach.fill_tuoi(tuoi);
            } else if (choice == 3) {
                System.out.println("nhap tuoi: "); Integer tuoi = input.nextInt();
                System.out.println("nhap que: "); String que = input.nextLine();
                danh_sach.fill_tuoi_que(tuoi, que);
            }
            System.out.println("-----------------------------------");
        } while (true);
    }
}
