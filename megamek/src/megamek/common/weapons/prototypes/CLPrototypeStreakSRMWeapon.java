/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.prototypes;

import megamek.common.AmmoType;
import megamek.common.Game;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.common.weapons.AttackHandler;
import megamek.common.weapons.PrototypeStreakHandler;
import megamek.common.weapons.srms.SRMWeapon;
import megamek.server.Server;

/**
 * @author Sebastian Brocks
 */

public abstract class CLPrototypeStreakSRMWeapon extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 9157660680598071296L;

    public CLPrototypeStreakSRMWeapon() {
        super();
        ammoType = AmmoType.T_SRM_STREAK;
        toHitModifier = -1;
        flags = flags.andNot(F_ARTEMIS_COMPATIBLE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     * megamek.common.actions.WeaponAttackAction, megamek.common.Game,
     * megamek.server.Server)
     */
    @Override
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, Game game, Server server) {
        return new PrototypeStreakHandler(toHit, waa, game, server);
    }

}
