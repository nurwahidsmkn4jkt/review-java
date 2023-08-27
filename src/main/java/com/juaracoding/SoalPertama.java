package com.juaracoding;

public class SoalPertama {
    public static void main(String[] args){
        System.out.println("Jawaban Soal No 1: ");
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {             // Agar kelipatan 3 & 5 outputnya kata "BIZZBUZZ"
                System.out.println("BIZZBUZZ");
            }
            else if (i % 3 == 0) {                      // Agar kelipatan 3 outputnya kata "BIZZ"
                System.out.println("BIZZ");
            }
            else if (i % 5 == 0) {                      // Agar kelipatan 5 outputnya kata "BUZZ"
                System.out.println("BUZZ");
            }else {                                     // Sisanya yang bukan kelipatan 3 & 5 outputnya angka biasa
                System.out.println(i);
            }
        }
    }
}
