package org.example;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private int experienceYears;

    public FilmStudioEmployee(String name, String position, int experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void work() {
        System.out.println(name + " works on their current task.");
    }

    public static class Director extends FilmStudioEmployee {
        public Director(String name, int experienceYears) {
            super(name, "Director", experienceYears);
        }

        @Override
        public void work() {
            super.work();
            System.out.println(getName() + " directs the film crew.");
        }
    }

    public static class CameraOperator extends FilmStudioEmployee {
        public CameraOperator(String name, int experienceYears) {
            super(name, "Camera Operator", experienceYears);
        }

        @Override
        public void work() {
            super.work();
            System.out.println(getName() + " operates the camera.");
        }
    }

    public static class SoundEngineer extends FilmStudioEmployee {
        public SoundEngineer(String name, int experienceYears) {
            super(name, "Sound Engineer", experienceYears);
        }

        @Override
        public void work() {
            super.work();
            System.out.println(getName() + " records sound.");
        }
    }
}
