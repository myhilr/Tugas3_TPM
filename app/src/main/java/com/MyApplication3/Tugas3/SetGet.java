package com.MyApplication3.Tugas3;

public class SetGet {
    private String image, series, release, judul;

    public SetGet(String image, String series, String release, String judul) {
        this.image   = image;
        this.series = series;
        this.release = release;
        this.judul = judul;
    }

    public SetGet() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}