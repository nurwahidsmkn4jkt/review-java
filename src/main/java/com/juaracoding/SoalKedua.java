package com.juaracoding;

public class SoalKedua {
    public static void main(String[] args){
        System.out.println("Jawaban Soal No 2: ");
        int i, j, k = 10;
        for (i = 1; i < 6; i++) {               // Untuk mengulangi jumlah baris ada berapa (i<6, berarti ada 5 baris kebawah)
            for (j = i; j < k; j++) {           // Untuk mengeluarkan angka perbaris dan setiap baris akan kebawah akan mengilangkan angka yang belakang
                if (j % 2 == 0) {               // Agar bilangan genap outputnya "_"
                    System.out.print("_");
                }else{                          // Agar bilangan sisanya (bilangan ganjil) outputnya bilangan angka biasa
                    System.out.print(j);
                }
            }
            k--;                                // Untuk menghilangkan angka paling belakang per barisnya
            System.out.println();
        }
    }
}
