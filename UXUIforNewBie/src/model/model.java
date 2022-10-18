package model;

public class model {
    private Integer num = 0;

    public Integer getnum() {
        return this.num;
    }

    public void Increasenum () {
        this.num++;
    }

    public void Decreasenum () {
        this.num--;
    }

    public void Reset () {
        this.num = 0;
    }
}
