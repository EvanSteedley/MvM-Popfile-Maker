import java.util.ArrayList;

public abstract class Enclosure 
{
	private String Beginning = "{";
	protected ArrayList<String> Middle = new ArrayList<String>();
	private String End = "}";
	protected String Name;
	protected int level = 0;
	@Override
	public String toString()
	{
		for(int i = 0; i < level; i++)
		{
			//Name = "\t" + Name;
			Beginning = "\t" + Beginning;
			End = "\t" + End;
		}

		String result = Name + "\n" + Beginning + "\n";
		for (String s : Middle)
		{
			if(s.trim().equals(""))
				continue;
			for(int i = 0; i < level+1; i++)
				s = "\t" + s;
			s +="\n";
			result += s;
		}
		return result + End;
	}
	
	public void SpaceOver(int l)
	{
		level = l + 1;
	}
}
