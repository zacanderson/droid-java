
public class Droid
{
	String name;
	int batteryLevel;

    public String toString()
	{
		return "Hello, I am a droid. My name is " + name + ".";
     }

    public Droid(String droidName)
    {
	   name = droidName;
	   batteryLevel = 100;
    }

    public void performTask(String task)
    {
	    System.out.println(name + " is performing task: " + task);
	    batteryLevel = batteryLevel - 10;
    }

    public void restTime(String task)
    {
		System.out.println(name + " is recharging through: " + task);
		batteryLevel = batteryLevel + 30;

		if(batteryLevel > 100)
		{
			System.out.println(name + " is overcharged!! Resetting now...");
			batteryLevel = 100;
		}
    }

    public static void main(String[] args)
    {
	   Droid Codey = new Droid("Codey");

	   System.out.println(Codey);

	   System.out.println(Codey.batteryLevel);

	   Codey.performTask("dancing");
	   Codey.performTask("eating");
	   Codey.performTask("playing pool");
	   Codey.performTask("learning Java");
	   
	   System.out.println(Codey.batteryLevel);

	   Codey.restTime("Wall outlet");

	   System.out.println(Codey.batteryLevel);

	   Codey.restTime("Wall outlet");

	   System.out.println(Codey.batteryLevel);

    }
}