package handler;

import interfaces.Recodable;

import java.util.Scanner;

public class RecordHandler {

    public static void record(Recodable obj) {
        obj.record();
    }

    public static void pause(Recodable obj) {
        obj.pause();
    }

    public static void stop(Recodable obj) {
        obj.stop();
    }

    public static void recordHand(Recodable obj) {
        Scanner scanner = new Scanner(System.in);
        boolean keyOut = true;
        while (keyOut) {
            System.out.println("\u001B[31m" + "1.Запись мелодии  2.Пауза  3.Стоп   0.(или другой) выход в предыдущее меню" + "\u001B[0m");
            switch (scanner.next()) {
                case "1": {
                    RecordHandler.record(obj);
                    break;
                }
                case "2": {
                    RecordHandler.pause(obj);
                    break;
                }
                case "3": {
                    RecordHandler.stop(obj);
                    break;
                }
                default: {
                    keyOut = false;
                }
            }
        }

    }
}
