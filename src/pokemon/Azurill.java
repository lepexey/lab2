package pokemon;

import move.special.Bubble;
import move.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azurill extends Pokemon {
    public Azurill(String name, int lvl) {
        super(name, lvl);
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(50, 20, 40, 20, 40, 20);
        super.setMove(new DoubleTeam(), new Bubble());
    }
}
