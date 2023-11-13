package move;

import lab.BattleStart;
import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (BattleStart.chance(0.1)) {
            Effect e = new Effect().turns(1).stat(Stat.SPEED, -6);
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "применяет Bubble Beam";
    }
}