


import javax.print.DocFlavor.STRING;

class filter{
    String arr;
    public filter (String arr){
        this.arr = arr;
    }

    public void check(){
        if (this.arr.length()%2==0){
            int mid = this.arr.length()/2;
            String right = this.arr.substring(0, mid);
            String[] list_mid = this.arr.substring(mid, this.arr.length()).split("");
            String left = "";
            for (int i = list_mid.length-1; i>=0; i-=1 ){
                left += list_mid[i];
            }
            if (left.equals(right)){
                System.out.println("day la mot chuoi doi xung!");
            }else{
                System.out.println("day ko phai mot chuoi doi xung!");
            }
            
        }else{
            int mid = this.arr.length()/2;
            String right = this.arr.substring(0, mid);
            String[] list_mid = this.arr.substring(mid+1, this.arr.length()).split("");
            String left = "";
            for (int i = list_mid.length-1; i>=0; i-=1 ){
                left += list_mid[i];
            }
            if (left.equals(right)){
                System.out.println("day la mot chuoi doi xung!");
            }else{
                System.out.println("day ko phai mot chuoi doi xung!");
            }
        }
    }
}

class bai8{
    public static void main(String[] args) {
        filter new_ = new filter("huyweyuh");
        new_.check();
    }
}