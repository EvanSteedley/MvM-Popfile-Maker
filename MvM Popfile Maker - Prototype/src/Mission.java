import java.util.ArrayList;

public class Mission extends Enclosure {
private Parameter Objective = new Parameter("Objective");
private Parameter InitialCooldown = new Parameter("InitialCooldown", 0.0);
private Parameter Where = new Parameter("Where");
private Parameter CooldownTime = new Parameter("CooldownTime", 0.0);
public TFBot bot = new TFBot();
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
	Middle.add(InitialCooldown.toString());
	Middle.add(Where.toString());
	Middle.add(CooldownTime.toString());
	for (Parameter p : OtherParameters)
	{
		Middle.add(p.toString());
	}
	bot.SpaceOver(level);
	Middle.add(bot.toString());
	return super.toString();
}

public Parameter getInitialCooldown() {
	return InitialCooldown;
}

public void setInitialCooldown(double initialCooldown) {
	InitialCooldown.setFloatValue(initialCooldown);
}

public Parameter getWhere() {
	return Where;
}

public void setWhere(String where) {
	Where.setText(where);
}

public Parameter getCooldownTime() {
	return CooldownTime;
}

public void setCooldownTime(double cooldownTime) {
	CooldownTime.setFloatValue(cooldownTime);
}

}
