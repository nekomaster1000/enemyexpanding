package net.mcreator.enemyexpproofofconcept.procedures;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class EyestalkerHostileConfigCheckProcedure {
	public static boolean execute() {
		if (BetterConfigConfiguration.EYESTALKERHOSTILITY.get() == true) {
			return true;
		}
		return false;
	}
}
