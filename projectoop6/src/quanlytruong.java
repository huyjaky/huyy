import java.util.ArrayList;

public class quanlytruong {
    ArrayList <hocsinh> quanly;

    public quanlytruong () {
        this.quanly = new ArrayList<hocsinh>();
    }

    public void addHocSinh (hocsinh hocSinh) {
        quanly.add(hocSinh);
    }

    public void fill_tuoi (Integer tuoi) {
        for (hocsinh i : this.quanly) {
            if (i.getTuoi().equals(tuoi)) {
                System.out.println(i.toString());
            }
        }
    }

    public void fill_tuoi_que (Integer tuoi, String que) {
        for (hocsinh i : this.quanly) {
            if (i.getTuoi().equals(tuoi) && i.getQue().equals(que)) {
                System.out.println(i);
            }
        }
    }
}
