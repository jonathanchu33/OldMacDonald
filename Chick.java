class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    }
    public Chick(String type, String sound, String soundTwo)
    {
    	myType = type;
    	if(Math.random()<.5)
    		mySound = sound;
    	else
    		mySound = soundTwo;
    }
    public String getSound() {return mySound;}
    public String getType() {return myType;}
}