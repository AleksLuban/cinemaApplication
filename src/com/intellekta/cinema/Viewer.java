package com.intellekta.cinema;

public class Viewer {

    private String nickName;

    private int age;

    private int numberFilms;

    public Viewer(String nickName, int age, int numberFilms) {
        this.nickName = nickName;
        this.age = age;
        this.numberFilms = numberFilms;
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
