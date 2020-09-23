
public class Output extends Enclosure {
	private String Action;
	private String Target;
	private String OutputName;
	
	public Output(String name, String target, String action)
	{
		OutputName = name;
		Target = target;
		Action = action;
	}
	
	public void setAction(String action) {
		Action = action;
	}
	public void setTarget(String target) {
		Target = target;
	}
	public void setOutputName(String outputname)
	{
		OutputName = outputname;
	}
	
	public String toString()
	{
		Name = OutputName;
		Middle.add("Action " + Action);
		Middle.add("Target " + Target);
		return super.toString();
	}
}
