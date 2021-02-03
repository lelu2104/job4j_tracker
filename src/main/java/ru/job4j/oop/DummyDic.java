package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String text = "Неизвестное слово ";
        return text + eng;
    }

    public static void main(String[] args) {
        DummyDic it = new DummyDic();
        it.engToRus("Мир");
    }
}
