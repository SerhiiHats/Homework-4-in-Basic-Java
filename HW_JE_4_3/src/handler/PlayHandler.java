package handler;

import interfaces.Playable;

import java.util.Scanner;


public class PlayHandler {

    public static void play(Playable obj) {
        obj.play();
    }

    public static void pause(Playable obj) {
        obj.pause();
    }

    public static void stop(Playable obj) {
        obj.stop();
    }

    public static void playHad(Playable obj) {

        Scanner scanner = new Scanner(System.in);
        boolean keyOut = true;
        while (keyOut) {
            System.out.println("\u001B[34m" + "1.Слушать мелодию  2.Пауза  3.Стоп   0.(или другой) выход в предыдущее меню" + "\u001B[0m");
            switch (scanner.next()) {
                case "1": {
                    PlayHandler.play(obj);
                    break;
                }
                case "2": {
                    PlayHandler.pause(obj);
                    break;
                }
                case "3": {
                    PlayHandler.stop(obj);
                    break;
                }
                default: {
                    keyOut = false;
                }
            }
        }
    }
}
