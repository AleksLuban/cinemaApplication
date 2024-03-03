package com.intellekta.cinema;

public class Cinema {
    private String name;

    private String genre;

    private int clocks;

    public Cinema(String name, String genre, int clocks) {
        this.name = name;
        this.genre = genre;
        this.clocks = clocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getClocks() {
        return clocks;
    }

    public void setClocks(int clocks) {
        this.clocks = clocks;
    }
}
