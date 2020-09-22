import java.util.ArrayList;

public class Mission extends Enclosure {
private Parameter Objective = new Parameter("Objective");
public TFBot bot = new TFBot("Scout");
private ArrayList<Parameter> OtherParameters = new ArrayList<Parameter>();

public void addParameter(Parameter p)
{
	OtherParameters.add(p);
}

public void removeParameter(Parameter p)
{
	OtherParameters.remove(p);
}

public void setObjective(String obj)
{
Objective.setText(obj);	
}


@Override
public String toString()
{
	Name = "Mission";
	Middle.add(Objective.toString());
	for (Parameter p : OtherParameters)
	{
		Middle.add(p.toString());
	}
	bot.SpaceOver(level);
	Middle.add(bot.toString());
	return super.toString();
}

}
