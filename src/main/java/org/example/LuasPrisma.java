package org.example;
import java.util.Scanner;

/**
 * Program Java untuk menghitung luas permukaan prisma segitiga.
 */
public class LuasPrisma {
    /**
     * Metode utama untuk menghitung luas permukaan prisma segitiga.
     * Meminta input dari pengguna dan menghitung luas permukaan prisma.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tinggi prisma: ");
        double tinggi = input.nextDouble();

        System.out.println("Masukkan panjang alas segitiga: ");
        double panjangAlas = input.nextDouble();

        System.out.println("Masukkan tinggi alas segitiga: ");
        double tinggiAlas = input.nextDouble();

        double luasAlas = 0.5 * panjangAlas * tinggiAlas; // Luas segitiga alas prisma
        double luasPermukaan = (2 * luasAlas) + (panjangAlas * tinggi) + (tinggiAlas * tinggi); // Luas permukaan prisma

        System.out.println("Luas permukaan prisma adalah: " + luasPermukaan);

        input.close();
    }
}