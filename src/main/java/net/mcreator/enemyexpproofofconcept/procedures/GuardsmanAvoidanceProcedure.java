package net.mcreator.enemyexpproofofconcept.procedures;

public class GuardsmanAvoidanceProcedure {
	public static boolean execute() {
		boolean advancementCheck = false;
		if (Math.random() < 0.03) {
			return true;
		}
		return false;
	}
}
