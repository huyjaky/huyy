public class Nguoi {
    private String hovaten;
    private Integer tuoi;
    private String nghenghiep;
    private Integer cmnd;
    public Nguoi(String hovaten, Integer tuoi, String nghenghiep, Integer cmnd) {
        this.hovaten = hovaten;
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } 
        this.nghenghiep = nghenghiep;
        this.cmnd = cmnd;
    }
    @Override
    public String toString() {
        return "Thanh vien [cmnd=" + cmnd + ", hovaten=" + hovaten + ", nghenghiep=" + nghenghiep + ", tuoi=" + tuoi + "]";
    }

    
}
