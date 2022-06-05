package interfaces.impl;

import interfaces.Playable;
import interfaces.Recodable;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Проигрываю музыку");
    }

    @Override
    public void pause() {
        System.out.println("Пауза, музыка на паузе");
    }

    @Override
    public void stop() {
        System.out.println("Стоп мелодия");
    }

    @Override
    public void record() {
        System.out.println("Записываю музыку");
    }
}
