public class App {
    public static void main(String[] args) throws Exception {
        khachsan danhsach_khachhang = new khachsan();
        thongtincanhan thongtin1 = new thongtincanhan("phan duc huy", 18, 123456789);
        nguoithue nguoi1 = new nguoithue("a".toUpperCase(), thongtin1);
        danhsach_khachhang.add_nguoithue(nguoi1);
        danhsach_khachhang.indanhsach();
        nguoithue songaythue_nguoi1 = new nguoithue(12);

        System.out.println( danhsach_khachhang.sotienphaitra(12, 123456789));
        danhsach_khachhang.indanhsach();

    }
}
