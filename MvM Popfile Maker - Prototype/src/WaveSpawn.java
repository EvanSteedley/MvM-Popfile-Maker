import java.util.ArrayList;

public class WaveSpawn extends Enclosure {
	public ArrayList<TFBot> Bots = new ArrayList<TFBot>();
	public ArrayList<Parameter> Parameters = new ArrayList<Parameter>();
	public ArrayList<Output> WaveOutputs = new ArrayList<Output>();
	public ArrayList<Tank> Tanks = new ArrayList<Tank>();
	private Parameter Where = new Parameter("Where");
	private Parameter TotalCount = new Parameter("TotalCount", 0);
	private Parameter MaxActive = new Parameter("MaxActive", 999);
	private Parameter SpawnCount = new Parameter("SpawnCount", 1);
	private Parameter WaitBeforeStarting = new Parameter("WaitBeforeStarting", 0.0);
	private Parameter WaitBetweenSpawns = new Parameter("WaitBetweenSpawns", 0.0);
	private Parameter TotalCurrency = new Parameter("TotalCurrency", -1);
	private Parameter RandomSpawn = new Parameter("RandomSpawn", false);
	
	public void addBot(TFBot bot)
	{
		Bots.add(bot);
	}
	
	public void removeBot(TFBot bot)
	{
		Bots.remove(bot);
	}
	
	public void addParameter(Parameter p)
	{
		Parameters.add(p);
	}
	
	public void removeParameter(Parameter p)
	{
		Parameters.remove(p);
	}
	
	public void addTank(Tank t)
	{
		Tanks.add(t);
	}
	
	public void removeTank(Tank t)
	{
		Tanks.remove(t);
	}
	
	@Override
	public String toString()
	{
		Name = "WaveSpawn";
		Middle.add(Where.toString());
		Middle.add(TotalCount.toString());
		Middle.add(MaxActive.toString());
		Middle.add(SpawnCount.toString());
		Middle.add(WaitBeforeStarting.toString());
		Middle.add(WaitBetweenSpawns.toString());
		Middle.add(TotalCurrency.toString());
		Middle.add(RandomSpawn.toString());
		for(Output out : WaveOutputs)
		{
			out.SpaceOver(level);
			Middle.add(out.toString());
		}
		for(Parameter p : Parameters)
		{
			Middle.add(p.toString());
		}
		for(TFBot bot : Bots)
		{
			bot.SpaceOver(level);
			Middle.add(bot.toString());
		}
		for(Tank t : Tanks)
		{
			t.SpaceOver(level);
			Middle.add(t.toString());
		}
		return super.toString();
	}

	public void setWhere(String where) {
		Where.setText(where);
	}

	public void setTotalCount(int totalCount) {
		TotalCount.setValue(totalCount);
	}

	public void setSpawnCount(int spawnCount) {
		SpawnCount.setValue(spawnCount);
	}

	public void setWaitBeforeStarting(double waitBeforeStarting) {
		WaitBeforeStarting.setFloatValue(waitBeforeStarting);
	}

	public void setWaitBetweenSpawns(double waitBetweenSpawns) {
		WaitBetweenSpawns.setFloatValue(waitBetweenSpawns);
	}

	public void setTotalCurrency(int totalCurrency) {
		TotalCurrency.setValue(totalCurrency);
	}

	public void setRandomSpawn(boolean randomSpawn) {
		RandomSpawn.setState(randomSpawn);
	}
	
	public void setMaxActive(int maxactive) {
		MaxActive.setValue(maxactive);
	}
	
	public void addWaveOutput(Output waveOut)
	{
		WaveOutputs.add(waveOut);
	}
	
	public void removeWaveOutput(Output waveOut)
	{
		WaveOutputs.remove(waveOut);
	}
	
}
