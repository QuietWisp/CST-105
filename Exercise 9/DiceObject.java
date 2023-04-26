
public class DiceObject 
{
	private int faceValue;
	private int rollValue;
	private int maxFaceValue = 7;
	 
	public void Dice() //automatically sets face value to 1
	{
		faceValue = 1;
	}
	
	public void Dice(int rollValue)
	{
		rollValue = faceValue;
	}
	
	public int rollDice(int rollValue)
	{
		return rollValue = (int)(Math.random() * maxFaceValue);
	}
	
	public int getRollValue()
	{
		return rollValue;
	}
	
}
