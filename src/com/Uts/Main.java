package com.Uts;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menampilkan Menu Makanan dan Minuman");
        System.out.println("");
        System.out.println("                 Pilih Pesanan:              ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("---------------------------------------------");
        System.out.print("Pilihan = [1/2] = ");
        int pilihan = input.nextInt();
        System.out.println("---------------------------------------------");

        switch (pilihan) {
            case 1: {
                Makanan a = new Makanan("Fried Chicken ", 19000, "Makanan Berat");
                System.out.println(a.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(a.getHarga());
                System.out.print("Tipe : ");
                System.out.print(a.getTipe());
                Makanan b = new Makanan("Burger ", 30000, "Makanan Berat");
                System.out.println("");
                System.out.println(b.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(b.getHarga());
                System.out.print("Tipe : ");
                System.out.print(b.getTipe());
                Makanan c = new Makanan("Chicken Wings ", 28000, "Makanan Berat");
                System.out.println("");
                System.out.println(c.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(c.getHarga());
                System.out.print("Tipe : ");
                System.out.print(c.getTipe());
                Makanan d = new Makanan("Rice", 7000, "Makanan Berat");
                System.out.println("");
                System.out.println(d.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(d.getHarga());
                System.out.print("Tipe : ");
                System.out.print(d.getTipe());
                Makanan e = new Makanan("Ice Cream ", 10000, "Desert");
                System.out.println("");
                System.out.println(e.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(e.getHarga());
                System.out.print("Tipe : ");
                System.out.print(e.getTipe());
                Makanan f = new Makanan("Waffle", 7000, "Desert");
                System.out.println("");
                System.out.println(f.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(f.getHarga());
                System.out.print("Tipe : ");
                System.out.print(f.getTipe());
                break;
            }

            case 2: {
                Minuman g = new Minuman("Apple Juice", 15000, "Minuman Dingin");
                System.out.println(g.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(g.getHarga());
                System.out.print("Tipe : ");
                System.out.print(g.getSuhu());
                Minuman h = new Minuman("Strawberry Juice", 16000, "Minuman Dingin");
                System.out.println("");
                System.out.println(h.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(h.getHarga());
                System.out.print("Tipe : ");
                System.out.print(h.getSuhu());
                Minuman i = new Minuman("Cafe Latte", 16000, "Minuman Dingin");
                System.out.println("");
                System.out.println(i.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(i.getHarga());
                System.out.print("Tipe : ");
                System.out.print(i.getSuhu());
                Minuman j = new Minuman("Hot Chocolate", 14000, "Minuman Dingin");
                System.out.println("");
                System.out.println(j.getNama());
                System.out.print("Harga = Rp ");
                System.out.println(j.getHarga());
                System.out.print("Tipe : ");
                System.out.print(j.getSuhu());
                break;
            }


        }
    }
}