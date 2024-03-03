package com.intellekta.cinema;

import java.util.ArrayList;

public class Viewer {

    private String nickName;

    private int age;

    private int numberFilms;

    private ArrayList<Cinema> filmsWatched;

    public Viewer(String nickName, int age, ArrayList<Cinema> filmsWatched) {
        this.nickName = nickName;
        this.age = age;
        this.filmsWatched = filmsWatched;
        if (!this.filmsWatched.isEmpty())
            this.numberFilms = this.filmsWatched.size();
        else this.numberFilms = 0;

    }

    public ArrayList<Cinema> getFilmsWatched() {
        return filmsWatched;
    }

    public void setFilmsWatched(ArrayList<Cinema> filmsWatched) {
        this.filmsWatched = filmsWatched;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberFilms() {
        return numberFilms;
    }

    public void setNumberFilms(int numberFilms) {
        this.numberFilms = numberFilms;
    }
}
