public class hocsinh {
    String hovaten;
    Integer tuoi;
    String que;
    String lop;

    public hocsinh(String hovaten, Integer tuoi, String que, String lop) {
        this.hovaten = hovaten;
        if (tuoi > 0) {
            this.tuoi = tuoi;
        }else {
            return;
        }
        this.que = que;
        this.lop = lop;
    }
    
    public String toString () {
        return "Ho va ten = " + this.hovaten + "| tuoi = " + this.tuoi + "| que = " + this.que + "| lop = " + this.lop; 
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public String getQue() {
        return que;
    }

    

}
