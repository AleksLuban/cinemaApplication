package com.intellekta.cinema;

import java.util.ArrayList;

public class CinemaApplicationRun {

    public static void main(String[] args) {
        Viewer viewer1 = new Viewer("Alex", 18, 5);
        Viewer viewer2 = new Viewer("Jon", 19, 14);
        Viewer viewer3 = new Viewer("Melman", 24, 8);
        Viewer viewer4 = new Viewer("Stiff", 36, 19);
        Viewer viewer5 = new Viewer("Gerard", 15, 3);
        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
