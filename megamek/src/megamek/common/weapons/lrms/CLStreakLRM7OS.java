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
package megamek.common.weapons.lrms;

import megamek.common.SimpleTechLevel;

/**
 * @author Sebastian Brocks
 */
public class CLStreakLRM7OS extends StreakLRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5240577239366457930L;

    /**
     *
     */
    public CLStreakLRM7OS() {
        super();
        name = "Streak LRM 7 (OS)";
        setInternalName("CLStreakLRM7OS");
        addLookupName("Clan Streak LRM-7 (OS)");
        addLookupName("Clan Streak LRM 7 (OS)");
        heat = 0;
        rackSize = 7;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 3.0;
        criticals = 1;
        bv = 120;
        cost = 105000;
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT).andNot(F_AERO_WEAPON).andNot(F_BA_WEAPON)
        		.andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_PROTO_WEAPON).andNot(F_ARTEMIS_COMPATIBLE);
        // Per Herb all ProtoMech launcher use the ProtoMech Chassis progression. 
        //But LRM Tech Base and Avail Ratings.
        rulesRefs = "327,TO";
        techAdvancement.setTechBase(TECH_BASE_CLAN).setTechRating(RATING_F)
            .setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setClanAdvancement(3057, 3079, 3088).setClanApproximate(false, true, false)
            .setPrototypeFactions(F_CCY).setProductionFactions(F_CJF)
            .setStaticTechLevel(SimpleTechLevel.EXPERIMENTAL);
    }
}
