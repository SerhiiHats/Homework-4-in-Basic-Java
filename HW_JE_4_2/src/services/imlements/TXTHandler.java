package services.imlements;

import services.AbstractHandler;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT файл открыт");
    }

    @Override
    public void create() {
        System.out.println("TXT файл создан");

    }

    @Override
    public void change() {
        System.out.println("TXT файл отредактирован");
    }

    @Override
    public void save() {
        System.out.println("TXT файл сохранен");
    }
}
