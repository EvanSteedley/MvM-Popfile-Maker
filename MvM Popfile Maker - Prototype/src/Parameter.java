
public class Parameter {
private String Name;
private int value = 0;
private double fvalue = 0.0;
private boolean isBool;
private String text;
public boolean isString = false;
public boolean isInt = false;
public boolean isFloat = false;
public boolean state = false;

public Parameter(String N, int v)
{
	isInt = true;
	Name = N;
	value = v;
}

public Parameter(String N, double v)
{
	isFloat = true;
	Name = N;
	fvalue = v;
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
	if(!isBool && !isInt && !isString && !isFloat)
		return "";
	if(isBool)
		if(state)
			return Name + " yes";
		else 
			return Name + " no";
	else if (isInt)
		return Name + " " + value;
	else if (isFloat)
		return Name + " " + fvalue;
	else return Name + " " + text;
	}

public int getValue()
{
	if(isInt)
		return value;
	return -100000;
}
public double getFloatValue()
{
	if(isFloat)
		return fvalue;
	return -9999.9;
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
		if(!isBool && !isString && !isFloat)
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
		if(!isInt && !isString &&!isFloat)
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
		if(!isBool && !isString && !isFloat)
		{
			text = i;
			isString = true;
		}
}

public void setFloatValue(double i)
{
	if(isFloat)
		fvalue = i;
	else
		if(!isBool && !isString && !isInt)
		{
			fvalue = i;
			isFloat = true;
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
