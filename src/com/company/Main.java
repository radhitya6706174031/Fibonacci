package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner krab = new Scanner(System.in);
        int i;

        System.out.print("Jumlah deret Fibonacci yang dimasukkan: ");
        i = krab.nextInt();

        for (int j = 1; j <= i; j++){
            int x = cari(j);
            System.out.print(x +" ");
        }
    }
    public static int cari (int i){
        if (i==1 || i==2){
            return 1;
        }else{
            return cari(i-1)+cari(i-2);
        }
    }
}
