package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        String text = "Привет!";
        Fix item = new Fix(text);
    }
}
