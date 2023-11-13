package pokemon;

import move.special.BubbleBeam;

public class Azumarill extends Marill {
    public Azumarill(String name, int lvl) {
        super(name, lvl);
        super.setStats(100, 50, 80, 60, 80, 50);
        super.addMove(new BubbleBeam());
    }
}
