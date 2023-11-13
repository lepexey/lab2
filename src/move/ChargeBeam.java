package move;

import lab.BattleStart;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        if (BattleStart.chance(0.7)) {
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "применяет Charge Beam";
    }
}
