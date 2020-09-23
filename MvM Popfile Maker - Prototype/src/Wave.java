import java.util.ArrayList;

public class Wave extends Enclosure {
	public ArrayList<TFBot> Bots = new ArrayList<TFBot>();
	public ArrayList<WaveSpawn> WaveSpawns = new ArrayList<WaveSpawn>();
	public ArrayList<Output> WaveOutputs = new ArrayList<Output>();
	public ArrayList<Parameter> Parameters = new ArrayList<Parameter>();
	
	public void addBot(TFBot bot)
	{
		Bots.add(bot);
	}
	
	public void removeBot(TFBot bot)
	{
		Bots.remove(bot);
	}
	
	public void addWaveOutput(Output waveOut)
	{
		WaveOutputs.add(waveOut);
	}
	
	public void removeWaveOutput(Output waveOut)
	{
		WaveOutputs.remove(waveOut);
	}
	
	public void addWaveSpawn(WaveSpawn waveSpawn)
	{
		WaveSpawns.add(waveSpawn);
	}
	
	public void removeWaveSpawn(WaveSpawn waveSpawn)
	{
		WaveSpawns.remove(waveSpawn);
	}
	
	public void addParameter(Parameter p)
	{
		Parameters.add(p);
	}
	
	public void removeParameter(Parameter p)
	{
		Parameters.remove(p);
	}
	
	@Override
	public String toString()
	{
		Name = "Wave";
		for(TFBot bot : Bots)
		{
			bot.SpaceOver(level);
			Middle.add(bot.toString());
		}
		for(Output out : WaveOutputs)
		{
			out.SpaceOver(level);
			Middle.add(out.toString());
		}
		for(Parameter p : Parameters)
		{
			Middle.add(p.toString());
		}
		for(WaveSpawn ws : WaveSpawns)
		{
			ws.SpaceOver(level);
			Middle.add(ws.toString());
		}
		return super.toString();
		
	}
}
