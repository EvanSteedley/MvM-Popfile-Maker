import java.util.ArrayList;

public class WaveSchedule extends Enclosure 
{
private Parameter StartingCurrency = new Parameter("StartingCurrency", 400);
private Parameter RespawnWaveTime = new Parameter("RespawnWaveTime", 5);
private Parameter CanBotsAttackWhileInSpawnRoom = new Parameter("CanBotsAttackWhileInSpawnRoom", false);
private Parameter testNull = new Parameter("Test");
public ArrayList<Enclosure> OtherThings = new ArrayList<Enclosure>();

@Override
public String toString()
{
	Name = "WaveSchedule";
	Middle.add(StartingCurrency.toString());
	Middle.add(RespawnWaveTime.toString());
	Middle.add(CanBotsAttackWhileInSpawnRoom.toString());
	Middle.add(testNull.toString());
	
	for(Enclosure x : OtherThings)
	{
		x.SpaceOver(level);
		Middle.add(x + "\n");
	}
	return super.toString();
}

public void setStartingCurrency(int i)
{
	StartingCurrency.setValue(i);
}
public void setRespawnWaveTime(int i)
{
	RespawnWaveTime.setValue(i);
}
public void setBotsSpawnAttack(boolean b)
{
	CanBotsAttackWhileInSpawnRoom.setState(b);
}

public void addPiece(Enclosure x)
{
	OtherThings.add(x);
}

public void removePiece(Enclosure x)
{
	OtherThings.remove(x);
}

}
