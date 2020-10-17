package com.Uts;

public class Minuman extends Menu{
    private String Suhu;

    public Minuman(String nama, double harga, String suhu) {
        super(nama, harga);
        Suhu = suhu;
    }

    public String getSuhu() {
        return Suhu;
    }

    public void setSuhu(String suhu) {
        Suhu = suhu;
    }


}
