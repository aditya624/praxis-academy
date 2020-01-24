import java.util.Scanner;
import java.io.*;

public class ATMMachine{
    public static void withdrawMoney(){
        if (BalanceTersimpan.balance==0) {
            System.out.println("\tNabungooo");
        } else if (BalanceTersimpan.balance<=500) {
            System.out.println("\tJek Titik");
        } else if (Withdraw.withdraw>BalanceTersimpan.balance) {
            System.out.println("\tSing di jupuk kakean");
        }
        else{
            BalanceTersimpan.balance=BalanceTersimpan.balance-Withdraw.withdraw;
            System.out.println("\tDuite Kalong");        
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int pilih;
        int Selesai;
        do {
            System.out.println("\tSelamat Datang di ATM");
            System.out.println("\tMasukan transaksi :");
            System.out.println("\t1. Deposit");
            System.out.println("\t2. Windraw");
            System.out.println("\t3. Check");
            System.out.println("\t4. Exit");
            
            
            do {
                System.out.print("\tMasukkan Perintah : ");
                pilih=input.nextInt();
                if (pilih>4 || pilih<1) {
                    System.out.println("\tInputan Salah");
                }
            } while (pilih>4 || pilih<1);

            switch (pilih) {
                case 1:
                    System.out.print("\tMasukkan Uang Deposit : ");
                    Deposit.deposit=input.nextDouble();
                    BalanceTersimpan.balance=BalanceTersimpan.balance+Deposit.deposit;

                    break;
                case 2:
                    System.out.print("\tMasukkan Uang yang akan di ambil :");
                    Withdraw.withdraw=input.nextDouble();
                    withdrawMoney();
                    break;
                case 3:
                    System.out.println("\tUang Anda : "+BalanceTersimpan.getBalance());

                    break;
                default:
                    System.out.println("\n\tTransaksi Selesai");
                    break;
            }
            
            System.out.print("\tAda Transaksi Lain ? Pilih 1 untuk kembali Pilih 2 untuk Keluar.");
            Selesai=input.nextInt();
        } while (Selesai==1); 
    }
}