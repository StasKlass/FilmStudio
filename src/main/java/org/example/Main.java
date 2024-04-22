package org.example;

public class Main {
    public static void main(String[] args) {
        FilmStudioEmployee.Director alice = new FilmStudioEmployee.Director("Alice", 10);
        FilmStudioEmployee.CameraOperator bob = new FilmStudioEmployee.CameraOperator("Bob", 5);
        FilmStudioEmployee.SoundEngineer charlie = new FilmStudioEmployee.SoundEngineer("Charlie", 8);

        FilmStudioEmployee[] employees = {alice, bob, charlie};

        MovieSet.simulateDayOfWork(employees);
    }
}
