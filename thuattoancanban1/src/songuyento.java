public class songuyento {
    Integer socancheck;
    
    public songuyento(Integer so) {
        this.socancheck = so;
    }

    public boolean check () {
        
        Integer count = 0;
        for (int i = 1; i <= Math.sqrt(this.socancheck); i++) {
            if (this.socancheck % i ==0) {
                count += 1;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

}