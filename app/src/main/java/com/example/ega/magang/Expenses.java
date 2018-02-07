package com.example.ega.magang;

/**
 * Created by Ega on 06/02/2018.
 */

public class Expenses {
    private String mNama, mCard;
    private int mGambar;

    public Expenses(String mNama, String mCard, int mGambar) {
        this.mNama = mNama;
        this.mCard = mCard;
        this.mGambar = mGambar;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmCard() {
        return mCard;
    }

    public void setmCard(String mCard) {
        this.mCard = mCard;
    }

    public int getmGambar() {
        return mGambar;
    }

    public void setmGambar(int mGambar) {
        this.mGambar = mGambar;
    }
}
