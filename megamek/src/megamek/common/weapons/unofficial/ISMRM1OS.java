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
package megamek.common.weapons.unofficial;

import megamek.common.TechAdvancement;
import megamek.common.weapons.missiles.MRMWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISMRM1OS extends MRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -1816363336605737063L;

    /**
     *
     */
    public ISMRM1OS() {
        super();
        name = "MRM 1 (OS)";
        setInternalName(name);
        addLookupName("ISMRM1OS");
        rackSize = 1;
        shortRange = 3;
        mediumRange = 8;
        longRange = 15;
        extremeRange = 16;
        bv = 2;
        flags = flags.or(F_ONESHOT);
        rulesRefs = "Unofficial";
        techAdvancement.setTechBase(TECH_BASE_IS)
        .setIntroLevel(false)
        .setUnofficial(true)
        .setTechRating(RATING_E)
        .setAvailability(RATING_X, RATING_X, RATING_E, RATING_X)
        .setISAdvancement(DATE_NONE, DATE_NONE, 3057, DATE_NONE, DATE_NONE)
        .setISApproximate(false, false, false, false, false);
    }
}
