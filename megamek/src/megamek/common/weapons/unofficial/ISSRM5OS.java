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
import megamek.common.weapons.srms.SRMWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISSRM5OS extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 2564548381701365334L;

    /**
     *
     */
    public ISSRM5OS() {
        super();
        name = "SRM 5 (OS)";
        setInternalName(name);
        addLookupName("ISSRM5OS");
        rackSize = 5;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        bv = 9;
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT);
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
