package pokemon;

import move.status.CalmMind;
import move.special.ChargeBeam;
import move.special.ShockWave;
import move.special.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Celesteela extends Pokemon {
    public Celesteela(String name, int lvl) {
        super(name, lvl);
        super.setType(Type.STEEL, Type.FLYING);
        super.setStats(97, 101, 103, 107, 101, 61);
        super.setMove(new ChargeBeam(), new ShockWave(), new CalmMind(), new Thunder());
    }
}
