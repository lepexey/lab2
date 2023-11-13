package pokemon;

import move.Refresh;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Azurill {
    public Marill(String name, int lvl) {
        super(name, lvl);
        super.setType(Type.WATER, Type.FAIRY);
        super.setStats(70, 20, 50, 20, 50, 40);
        super.addMove(new Refresh());
    }
}
