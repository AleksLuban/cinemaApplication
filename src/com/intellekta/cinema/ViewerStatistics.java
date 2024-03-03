package com.intellekta.cinema;

import java.util.List;

public class ViewerStatistics {

    public static double averageAge(List<Viewer> listViewer) {
        double a = 0;
        for (Viewer viewer : listViewer)
            a += viewer.getAge();
        return a / listViewer.size();
    }
}
