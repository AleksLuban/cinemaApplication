package com.intellekta.cinema;

import java.util.ArrayList;

public class CinemaApplicationRun {

    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Lord of the Rings", "Fentesy", 4);
        Cinema cinema2 = new Cinema("Hobbit", "Fentesy", 3);
        Cinema cinema3 = new Cinema("Terminator", "Action", 2);
        Cinema cinema4 = new Cinema("Robocop", "Action", 2);
        Cinema cinema5 = new Cinema("Gladiator", "Historical", 2);
        ArrayList<Cinema> cinemas1 = new ArrayList<>();
        ArrayList<Cinema> cinemas2 = new ArrayList<>();
        ArrayList<Cinema> cinemas3 = new ArrayList<>();
        ArrayList<Cinema> cinemas4 = new ArrayList<>();
        ArrayList<Cinema> cinemas5 = new ArrayList<>();
        cinemas1.add(cinema1);
        cinemas2.add(cinema1);
        cinemas2.add(cinema3);
        cinemas3.add(cinema3);
        cinemas3.add(cinema4);
        cinemas3.add(cinema5);
        cinemas4.add(cinema5);
        cinemas5.add(cinema1);
        cinemas5.add(cinema2);
        cinemas5.add(cinema3);
        cinemas5.add(cinema4);
        cinemas5.add(cinema5);

        Viewer viewer1 = new Viewer("Alex", 18,  cinemas1);
        Viewer viewer2 = new Viewer("Jon", 19,  cinemas2);
        Viewer viewer3 = new Viewer("Melman", 24,  cinemas3);
        Viewer viewer4 = new Viewer("Stiff", 36,  cinemas4);
        Viewer viewer5 = new Viewer("Gerard", 15,  cinemas5);

        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
