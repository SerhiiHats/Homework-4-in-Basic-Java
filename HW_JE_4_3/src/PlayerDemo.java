import handler.PlayHandler;
import handler.RecordHandler;
import interfaces.Playable;
import interfaces.Recodable;
import interfaces.impl.Player;

import java.util.Scanner;

public class PlayerDemo {
    public static void main(String[] args) {
        boolean keyOut = true;
        Scanner scanner = new Scanner(System.in);
        while (keyOut) {
            System.out.println("\u001B[32m" + "1.Проигрывание мелодии  2.Запись мелодии  0.(или другой) выход" + "\u001B[0m");
            switch (scanner.next()) {
                case "1": {
                    Playable playable = new Player();
                    PlayHandler.playHad(playable);
                    break;
                }
                case "2": {
                    Recodable recodable = new Player();
                    RecordHandler.recordHand(recodable);
                    break;
                }
                default: {
                    keyOut = false;
                }
            }
        }
        scanner.close();
        System.out.println("Конец программы");
    }
}
