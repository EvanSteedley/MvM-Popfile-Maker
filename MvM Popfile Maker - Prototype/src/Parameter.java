
public class Parameter {
private String Name;
private int value = -10909090;
private boolean isBool;
private String text;
public boolean isString = false;
public boolean isInt = false;
public boolean state = false;

public Parameter(String N, int v)
{
	isInt = true;
	Name = N;
	value = v;
}

public Parameter(String N, boolean b)
{
	isBool = true;
	Name = N;
	state = b;
}

public Parameter(String N, String t)
{
	isString = true;
	Name = N;
	text = t;
}

public Parameter(String N)
{
Name = N;	
}

@Override
public String toString()
	{
//	for(int i = 0; i < level; i++)
//	{
//		Name = "\t" + Name;
//	}
	if(!isBool && !isInt && !isString)
		return "";
	if(isBool)
		if(state)
			return Name + " yes";
		else 
			return Name + " no";
	else if (isInt)
		return Name + " " + value;
	else return Name + " " + text;
	}

public int getValue()
{
	if(isInt)
		return value;
	return -100000;
}
public boolean getState()
{
	if(isBool)
		return state;
	return false;
}

public String getText()
{
	if(isString)
		return text;
	return "";
}

public void setValue(int i)
{
	if(isInt)
		value = i;
	else
		if(!isBool && !isString)
		{
			value = i;
			isInt = true;
		}
}
public void setState(boolean c)
{
	if(isBool)
		state = c;
	else
		if(!isInt && !isString)
		{
			state = c;
			isBool = true;
		}
}

public void setText(String i)
{
	if(isString)
		text = i;
	else
		if(!isBool && !isString)
		{
			text = i;
			isString = true;
		}
}

public boolean Equals(Object other)
{
	if(!other.getClass().equals(this.getClass()))
		return false;
	Parameter b = (Parameter)other;
	if(this.Name.equals(b.Name))
	{
		if(isBool && b.isBool)
			if(state == b.state)
				return true;
			else return false;
		if(isInt && b.isInt)
			if(value == b.value)
				return true;
			else return false;
		if(isString && b.isString)
			if(text.equals(b.text))
				return true;
			else return false;
		return false;
	}
	return false;
}

}
