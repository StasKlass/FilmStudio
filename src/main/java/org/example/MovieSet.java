package org.example;

public class MovieSet {
    public static void simulateDayOfWork(FilmStudioEmployee[] employees) {
        for (FilmStudioEmployee employee : employees) {
            employee.work();
        }
    }
}

