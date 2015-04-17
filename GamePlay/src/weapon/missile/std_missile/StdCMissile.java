package weapon.missile.std_missile;

import map.populationHub.PopulationHub;
import player.Player;
import weapon.missile.IMissile;
import weapon.missile.base_missile.ConcentrationMissile;

/**
 * Created by hayesj3 on 4/15/2015.
 */
public class StdCMissile extends ConcentrationMissile {

    protected StdCMissile(Player owner, IMissile missile) { this(owner.getCapital(), missile); }
    protected StdCMissile(PopulationHub homebase, IMissile missile) {
        super(homebase, missile);
    }

    @Override
    public void strike () {
    }

    @Override
    public void intercepted (IMissile m) {
    }
}
