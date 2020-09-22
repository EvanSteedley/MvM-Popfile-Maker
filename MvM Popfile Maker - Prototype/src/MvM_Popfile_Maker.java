import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Evvy
 *
 */
public class MvM_Popfile_Maker {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> Imports = new ArrayList<String>();
		Imports.add("#base robot_giant.pop");
		Imports.add("#base robot_standard.pop");
		WaveSchedule x = new WaveSchedule();
		x.setStartingCurrency(400);
		x.setRespawnWaveTime(5);
		x.setBotsSpawnAttack(true);
		for (String imp : Imports)
			System.out.println(imp);
		System.out.println("");
		Mission M1 = new Mission();
		M1.setObjective("DestroySentries");
		M1.addParameter(new Parameter("InitialCooldown", 30));
		M1.addParameter(new Parameter("Where", "spawnbot"));
		M1.addParameter(new Parameter("BeginAtWave", 1));
		M1.addParameter(new Parameter("RunForThisManyWaves", 13));
		M1.addParameter(new Parameter("CooldownTime", 40));
		M1.bot.addParameter(new Parameter("Template", "T_TFBot_SentryBuster"));
		x.addPiece(M1);
		Mission M2 = new Mission();
		M2.setObjective("Sniper");
		M2.addParameter(new Parameter("InitialCooldown", 20));
		M2.addParameter(new Parameter("Where", "spawnbot_mission_sniper"));
		M2.addParameter(new Parameter("BeginAtWave", 3));
		M2.addParameter(new Parameter("RunForThisManyWaves", 1));
		M2.addParameter(new Parameter("CooldownTime", 20));
		M2.addParameter(new Parameter("DesiredCount", 2));
		M2.bot.setClass("Sniper");
		M2.bot.setSkill("Hard");
		M2.bot.setName("Sniper");
		M2.bot.addParameter(new Parameter("MaxVisionRange", 3000));
		x.addPiece(M2);
		for(Enclosure e : x.OtherThings)
			e.SpaceOver(0);
		;
		System.out.print(x);
	}

}
