package move.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        Effect e = new Effect().turns(1).stat(Stat.EVASION, 6);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Double Team";
    }
}
