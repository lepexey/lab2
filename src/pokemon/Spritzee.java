package pokemon;

import move.special.ChargeBeam;
import move.special.EnergyBall;
import move.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spritzee extends Pokemon {
    public Spritzee(String name, int lvl) {
        super(name, lvl);
        super.setType(Type.FAIRY);
        super.setStats(78, 52, 60, 63, 65, 23);
        super.setMove(new EnergyBall(), new Swagger(), new ChargeBeam());
    }
}
