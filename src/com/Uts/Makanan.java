package com.Uts;

public class Makanan extends Menu {
    private String tipe;

    public Makanan(String nama, double harga, String tipe) {
        super(nama, harga);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void Makan(){
        Makanan a = new Makanan()
    }


}
