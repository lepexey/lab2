package pokemon;

import move.status.HealPulse;

public class Aromatisse extends Spritzee {
    public Aromatisse(String name, int lvl) {
        super(name, lvl);
        super.setStats(101, 72, 72, 99, 89, 29);
        super.addMove(new HealPulse());
    }
}
