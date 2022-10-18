package baioop2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService;

class account implements Comparable<account>
{
    Long number_account;
    String name_account;
    Double wallet;
    public account(Long number_account, String name_account, Double wallet) {
        this.number_account = number_account;
        this.name_account = name_account;
        this.wallet = wallet;
    }

    public account (Long number_account, String name_account) {
        this.number_account = number_account;
        this.name_account = name_account;
    }

    public account (Long number_account) {
        this.number_account = number_account;
    }



    public Long getNumber_account() {
        return number_account;
    }

    public void setNumber_account(Long number_account) {
        this.number_account = number_account;
    }

    public String getName_account() {
        return name_account;
    }

    public void setName_account(String name_account) {
        this.name_account = name_account;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        Locale lc = new Locale("us", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        return "account [name_account = " + name_account + ", number_account = " + number_account + ", wallet = " + numf.format(wallet)
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number_account == null) ? 0 : number_account.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        account other = (account) obj;
        if (number_account == null) {
            if (other.number_account != null)
                return false;
        } else if (!number_account.equals(other.number_account))
            return false;
        return true;
    }

    @Override
    public int compareTo(account o) {
        // TODO Auto-generated method stub
        return this.wallet.compareTo(o.wallet);
    }
    
    
    

}

class bank {
    ArrayList<account> list_account;
    public bank (ArrayList<account> list_account) {
        this.list_account = list_account;
    }

    public bank() {
        this.list_account = new ArrayList<account>();
    }

    // 1. nhap thong tin cua khach hang 
    public void add_account (account account) {
        account.wallet = 50d;
        this.list_account.add(account);

    }

    // 2. xuat danh sach thong tin khach hang 
    public void output_listaccount () {
        for (account i: list_account) {
            System.out.println(i.toString());
        }
    }
    
    // 3. nap tien
    public void recharge (account number_account, Double money) {
        if (this.list_account.contains(number_account)){
            for(account i: this.list_account) {
                if (i.equals(number_account)) {
                    i.wallet = i.wallet +money;
                }
            }
        }
        else {
            System.out.println("tai khoan khong ton tai!");
        }
    }

    // 4. rut tien
    public void rut_tien (account number_account, Double money) {
        if (this.list_account.contains(number_account)) {
            for (account i:this.list_account) {
                if(i.equals(number_account)) {
                    if (i.wallet >= money) {
                        i.wallet = i.wallet - money;
                    }
                    else {
                        System.out.println("tien khong du!");
                    }
                }
            }
        }
        else {
            System.out.println("tai khoan nay khong ton tai!");
        }
    }

    public void dao_han (account number_account) {
        if (this.list_account.contains(number_account)) {
            for (account i:this.list_account) {
                if (i.equals(number_account)) {
                    i.wallet = i.wallet + i.wallet*0.035;
                }
            }
        }
        else {
            System.out.println("tai khoan nay khong ton tai!");
        }
    }

    public void chuyen_khoan (account number_aAccount, account numberAccount_chuyenkhoan, Double money) {
        for (account i:this.list_account) {
            if (i.equals(number_aAccount)) {
                if (i.wallet >= money) {
                    rut_tien(number_aAccount, money);
                    recharge(numberAccount_chuyenkhoan, money);
                }
            }
        }
    }

    // xoa tai khoan 
    public void remove_account (account number_account) {
        for (account i: this.list_account){
            if (i.equals(number_account)) {
                this.list_account.remove(i);
            }
        }
    }

    // xoa het tai khoan
    public void clear_account () {
        this.list_account.clear();
    }

    // sort tai khoan co so du lon nhat
    public void sort () {
        Collections.sort(this.list_account);
        output_listaccount();
    }

    // xuat ra tai khoan theo ma tai khoan
    public void find_out (account number_account) {
        for (account i: this.list_account) {
            if (i.equals(number_account)) {
                System.out.println(i.toString());
            }
        }
    }

    // tim tai khoan theo ten 
    public void find_name (String name) {
        for (account i :this.list_account) {
            String name_account = i.name_account.toLowerCase();
            if (name_account.contains(name.toLowerCase()) == true) {
                System.out.println(i);
            }
        }
    }

}


class baioop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bank danh_sach = new bank();
            do {
                System.out.println("----------------------------------------------------");
                System.out.println("1.  nhap thong tin khach hang.");
                System.out.println("2.  xuat danh sach thong tin khach hang.");
                System.out.println("3.  nap tien.");
                System.out.println("4.  rut tien.");
                System.out.println("5.  dao han.");
                System.out.println("6.  chuyen khoang.");
                System.out.println("7.  xoa tai khoan.");
                System.out.println("8.  xoa het tai khoan.");
                System.out.println("9.  tim tai khoan theo ten.");
                System.out.println("10. sap xep so du trong tai khoan tu thap den cao");
                System.out.println("11. xuat ra tai khoan theo ma tai khoan.");
                System.out.println("0. thoat.");
                System.out.println("----------------------------------------------------");
                System.out.println("****************************************************");
                System.out.print("nhap lua chon: ");
                Integer choice = input.nextInt();


                if (choice ==1) {
                    //String first = input.nextLine();
                    System.out.println("nhap ma so the: "); Long number_account = input.nextLong(); String first = input.nextLine(); 
                    System.out.println("nhap ten chu the: "); String name_account = input.nextLine();
                    account account = new account(number_account, name_account);
                    danh_sach.add_account(account);
                }
                else if (choice ==2 ) {
                    danh_sach.output_listaccount();
                }
                else if (choice ==3) {
                    System.out.println("nhap ma the: "); Long number_account_ = input.nextLong();
                    System.out.println("nhap so tien can rut: "); Double money = input.nextDouble();
                    account number_account = new account(number_account_);
                    danh_sach.recharge(number_account, money);
                }
                else if (choice ==4) {
                    System.out.println("nhap ma the: "); Long number_account_ = input.nextLong();
                    System.out.println("nhap so tien can rut: "); Double money = input.nextDouble();
                    account number_aAccount = new account(number_account_);
                    danh_sach.rut_tien(number_aAccount, money);
                }
                else if (choice ==5) {
                    System.out.println("nhap ma the: "); Long number_account_ = input.nextLong();
                    account number_account = new account(number_account_);
                    danh_sach.dao_han(number_account);
                }
                else if (choice ==6) {
                    System.out.println("nhap ma the chuyen khoan: "); Long number_account_ = input.nextLong();
                    System.out.println("nhap ma the nhan chuyen khoan: "); Long number_account_re = input.nextLong();
                    System.out.println("nhap so tien can chuyen khoan: "); Double money = input.nextDouble();
                    account number_aAccount = new account(number_account_);
                    account number_aAccount2 = new account(number_account_re);
                    danh_sach.chuyen_khoan(number_aAccount, number_aAccount2, money);
                }
                else if (choice==7) {
                    System.out.println("nhap ma the: "); Long number_account_ = input.nextLong();
                    account number_account = new account(number_account_);
                    danh_sach.remove_account(number_account);
                }
                else if (choice ==8) {
                    danh_sach.clear_account();
                    System.out.println("da clear!");
                }
                else if (choice ==10) {
                    danh_sach.sort();
                }
                else if (choice ==9) {
                    String first = input.nextLine();
                    System.out.println("nhap ten: "); String name = input.nextLine();
                    danh_sach.find_name(name);
                }
                else if (choice ==11) {
                    System.out.println("nhap ma the: "); Long number_account_ = input.nextLong();
                    account number_account = new account(number_account_);
                    danh_sach.find_out(number_account);
                }
                else if(choice ==0) {
                    break;
                }
                System.out.println("****************************************************");
        }while(true);
        
        
    }
}