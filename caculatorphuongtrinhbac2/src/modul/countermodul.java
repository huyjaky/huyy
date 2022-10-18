package modul;


public class countermodul {
    private String answer;

    public countermodul () {
        
    }

    public void phuongtrinhbac2 (Double a, Double b, Double c) {
        if (a == 0) {
            this.answer ="a phai khac 0!";
        }

        Double delta = Math.pow(b, 2) - (4*a*c);
        if (delta == 0) {
            Double answer = (-b)/(2*a);
            this.answer = "x = " + answer;
        } else if (delta < 0) {
            this.answer = "phuong trinh vo nghiem!";
        } else {
            Double x1 = ((-b) - Math.sqrt(delta))/(2*a);
            Double x2 = ((-b) + Math.sqrt(delta))/(2*a);
            this.answer = "x1 = " + x1 + " || " + "x2 = " + x2;
        }
    }

    public String get_answer () {
        return this.answer;
    }


}
