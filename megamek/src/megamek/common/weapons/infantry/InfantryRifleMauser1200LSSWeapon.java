/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantryRifleMauser1200LSSWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryRifleMauser1200LSSWeapon() {
		super();

		name = "Laser Rifle (Mauser 1200 LSS)";
		setInternalName(name);
		addLookupName("InfantryMauser1200");
		addLookupName("Mauser 1200 LSS");
		ammoType = AmmoType.T_INFANTRY;
		cost = 10000;
		bv = 5.32;
		tonnage = .011;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_LASER).or(F_ENERGY).or(F_INF_BURST);
		/*Errata
		 * https://bg.battletech.com/forums/index.php?topic=60038.msg1377699#msg1377699
		 * No Primary Infantry Weapon may have a Damage Value greater than 0.60. 
		 * If the weapon selected has a Damage Value greater than 0.60, then reduce it's Damage Value to 0.60 
		 * when determining final damage values (pg.152). Platoons that have their primary weapon damage reduced 
		 * in this way automatically gain the Heavy Burst Weapon special feature
		*/
		infantryDamage = .66; //was 1.04
		infantryRange = 2;
		ammoWeight = 0.0003;
		shots = 6;
		bursts = 1;
		rulesRefs = "273,TM";
		techAdvancement.setTechBase(TECH_BASE_IS).setISAdvancement(3052, 3055, 3075, DATE_NONE, DATE_NONE)
		        .setISApproximate(true, false, false, false, false)
		        .setPrototypeFactions(F_WB)
		        .setProductionFactions(F_WB).setTechRating(RATING_E)
		        .setAvailability(RATING_X, RATING_X, RATING_E, RATING_D);

	}
}
