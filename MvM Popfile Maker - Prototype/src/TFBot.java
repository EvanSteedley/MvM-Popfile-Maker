import java.util.ArrayList;

public class TFBot extends Enclosure {
	private ArrayList<Parameter> OtherParameters = new ArrayList<Parameter>();
	private ArrayList<Enclosure> OtherThings = new ArrayList<Enclosure>();
	private Parameter Class = new Parameter("Class");
	private Parameter Skill = new Parameter("Skill");
	private Parameter BotName = new Parameter("Name");
	
	public TFBot(String cl)
	{
		Class.setText(cl);
	}
	
	public TFBot(String cl, String Name)
	{
		Class.setText(cl);
		BotName.setText(Name);
	}
	
	@Override
	public String toString()
	{
		Name = "TFBot";
		if(BotName == null)
			BotName.setText(Class.getText());
		for(Parameter x : OtherParameters)
		{
			Middle.add(x + "\n");
		}
		Middle.add(Class.toString());
		Middle.add(Skill.toString());
		Middle.add(BotName.toString());
		for(Enclosure x : OtherThings)
		{
			x.SpaceOver(level);
			Middle.add(x + "\n");
		}
		return super.toString();
	}
	
	public void setClass(String cl)
	{
		Class.setText(cl);
	}
	
	public void setSkill(String sk)
	{
		Skill.setText(sk);
	}
	
	public void setName(String N)
	{
		BotName.setText(N);
	}
	
	public void addParameter(Parameter p)
	{
		OtherParameters.add(p);
	}
	public void removeParameter(Parameter p)
	{
		OtherParameters.remove(p);
	}
	public void addPiece(Enclosure e)
	{
		OtherThings.add(e);
	}
	public void removePiece(Enclosure e)
	{
		OtherThings.remove(e);
	}
}
