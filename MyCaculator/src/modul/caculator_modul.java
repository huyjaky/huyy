package modul;

public class caculator_modul {
    private Double num1;
    private Double num2;
    private Double answer = 0d;

    public caculator_modul (Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void multiple () {
        this.answer = (this.num1 * this.num2);
    }

    public void divdie () {
        this.answer = (this.num1 / this.num2);
    }

    public void minus () {
        this.answer = (this.num1 - this.num2);
    }

    public void plus () {
        this.answer = (this.num1 + this.num2);
    }

    public void caps () {
        this.answer = (Math.pow(this.num1, this.num2));
    }

    public void extra () {
        this.answer = (this.num1 % this.num2);
    }
    
    public Double get_answer () {
        return this.answer;
    }


}