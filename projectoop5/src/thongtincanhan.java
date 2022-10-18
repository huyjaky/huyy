public class thongtincanhan {
    private String hoten;
    private Integer tuoi;
    private Integer cmnd;

    public thongtincanhan (String hoten, Integer tuoi, Integer cmnd) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
    }

    public thongtincanhan (Integer cmnd) {
        this.cmnd = cmnd;
    }

    public String toString () {
        return " ho va ten khach hang: " + this.hoten + "tuoi: " + this.tuoi + "so cmnd: " + this.cmnd;
    }

    public Integer getCmnd() {
        return cmnd;
    }


}
