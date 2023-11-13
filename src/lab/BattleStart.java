package lab;

import pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class BattleStart {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon a1 = new Pokemon("Чужой", 1);
        Celesteela f1 = new Celesteela("My pok", 1);
        Aromatisse a2 = new Aromatisse("Roma", 1);
        Spritzee f2 = new Spritzee("Spir", 1);
        Azurill a3 = new Azurill("Aziz", 1);
        Azumarill f3 = new Azumarill("Azum", 1);
//        b.addAlly(a1);
//        b.addAlly(a2);
//        b.addAlly(a3);
//        b.addFoe(f1);
//        b.addFoe(f2);
//        b.addFoe(f3);

        b.addAlly(new Aromatisse("Rick", 1));
        b.addAlly(new Celesteela("Morty", 1));
        b.addFoe(new Azumarill("Rick Prime", 1));
        b.addFoe(new Celesteela("Angry Morty", 1));
        b.go();
    }

    public static boolean chance(double kf) {
        return kf >= Math.random();
    }
}
