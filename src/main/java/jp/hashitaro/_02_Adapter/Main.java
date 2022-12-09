package jp.hashitaro._02_Adapter;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();

        Print p2 = new PrintBanner("Good morning");
        p2.printWeek();
        p2.printStrong();
    }
}
