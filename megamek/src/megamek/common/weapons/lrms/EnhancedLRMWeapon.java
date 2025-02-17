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

import megamek.common.AmmoType;

/**
 * @author Sebastian Brocks
 */
public abstract class EnhancedLRMWeapon extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 8755275511561446251L;

    public EnhancedLRMWeapon() {
        super();
        ammoType = AmmoType.T_NLRM;
    }

    @Override
    public String getSortingName() {
        return "Enhanced LRM " + ((rackSize < 10) ? "0" + rackSize : rackSize);
    }
}
