import java.util.ArrayList;

public class Tank extends Enclosure {
	public ArrayList<Output> WaveOutputs = new ArrayList<Output>();
	private Parameter Health = new Parameter("Health", 10000);
	private Parameter Speed = new Parameter("Speed", 75.0);
	private Parameter StartingPathTrackNode = new Parameter("StartingPathTrackNode", "\"path\"");
	private Parameter tankName = new Parameter("Name", "\"boss\"");
	
	public void setHealth(int health)
	{
		Health.setValue(health);
	}
	
	public void setSpeed(double speed)
	{
		Speed.setFloatValue(speed);
	}
	
	public void setStartingPathTrackNode(String path)
	{
		StartingPathTrackNode.setText("\"" + path + "\"");
	}
	
	public void addWaveOutput(Output waveOut)
	{
		WaveOutputs.add(waveOut);
	}
	
	public void removeWaveOutput(Output waveOut)
	{
		WaveOutputs.remove(waveOut);
	}
	
	@Override
	public String toString()
	{
		Name = "Tank";
		Middle.add(Health.toString());
		Middle.add(Speed.toString());
		Middle.add(tankName.toString());
		Middle.add(StartingPathTrackNode.toString());
		addWaveOutput(new Output("OnKilledOutput", "boss_dead_relay", "Trigger"));
		addWaveOutput(new Output("OnBombDroppedOutput", "boss_deploy_relay", "Trigger"));
		for(Output out : WaveOutputs)
		{
			out.SpaceOver(level);
			Middle.add(out.toString());
		}
//		for(Parameter p : Parameters)
//		{
//			Middle.add(p.toString());
//		}
		return super.toString();
	}
}
