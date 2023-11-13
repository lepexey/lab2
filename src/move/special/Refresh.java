package move.special;

import ru.ifmo.se.pokemon.*;

public class Refresh extends SpecialMove {
    public Refresh() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        if (pokemon.getCondition().equals(Status.PARALYZE) || pokemon.getCondition().equals(Status.BURN)
                || pokemon.getCondition().equals(Status.POISON))
            pokemon.setCondition(new Effect().condition(Status.NORMAL));
    }

    @Override
    protected String describe() {
        return "применяет Refresh";
    }
}
