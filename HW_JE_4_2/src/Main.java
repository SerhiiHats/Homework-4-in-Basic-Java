import services.AbstractHandler;
import services.imlements.DOCHandler;
import services.imlements.TXTHandler;
import services.imlements.XMLHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keyOutSwitch = true;
        Scanner scanner = new Scanner(System.in);
        AbstractHandler handler = null;
        System.out.println("\u001B[32m" + "Введите с клавиатуры один из трех форматов: XML, TXT, DOC, с которым будем работать / 0 - выход" + "\u001B[0m");
        while (keyOutSwitch) {
            switch (scanner.next().toUpperCase()) {
                case "XML": {
                    handler = new XMLHandler();
                    keyOutSwitch = false;
                    break;
                }
                case "TXT": {
                    handler = new TXTHandler();
                    keyOutSwitch = false;
                    break;
                }
                case "DOC": {
                    handler = new DOCHandler();
                    keyOutSwitch = false;
                    break;
                }
                case "0": {
                    keyOutSwitch = false;
                    break;
                }
                default: {
                    System.out.println("Формат отсутствует в списке наличия");
                }
            }
        }
        if (handler == null) {
            System.out.println("Небыло выбрано ниодного формата документа");
        } else {
            keyOutSwitch = true;
        }
        while (keyOutSwitch) {

            System.out.println("\u001B[36m" + "1.Открыть документ  2.Создать документ  3.Редактировать документ  4.Сохранить документ  0.(или другой) выход" + "\u001B[0m");
            switch (scanner.next()) {
                case "1": {
                    handler.open();
                    break;
                }
                case "2": {
                    handler.create();
                    break;
                }
                case "3": {
                    handler.change();
                    break;
                }
                case "4": {
                    handler.save();
                    break;
                }

                default: {
                    keyOutSwitch = false;
                }
            }
        }
        System.out.println("Конец программы");
        scanner.close();


    }
}
