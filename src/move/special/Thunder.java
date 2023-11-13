package move.special;

import lab.BattleStart;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (BattleStart.chance(0.3)) {
            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
        }
    }

    @Override
    protected String describe() {
        return "применяет Thunder";
    }
}
