package move.special;

import lab.BattleStart;
import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        Effect e = new Effect().turns(1).stat(Stat.SPEED, -6);
        if (BattleStart.chance(0.1))
            pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Bubble";
    }
}
