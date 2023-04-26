public class MainDriver 
{
	public static void main(String[] args) 
	{
		//five dice in Yahtzee
		var dice1 = new DiceObject();
		var dice2 = new DiceObject();
		var dice3 = new DiceObject();
		var dice4 = new DiceObject();
		var dice5 = new DiceObject();
		
		int threeOFAKindTotal = 0;
		int fourOFAKindTotal = 0;
		int Yahtzee = 0;
		
		//Shaker cup 
		for (int i = 0; i < 100000; i++)
		{
			int die1 = dice1.rollDice(1);
			int die2 = dice2.rollDice(1);
			int die3 = dice3.rollDice(1);
			int die4 = dice4.rollDice(1);
			int die5 = dice5.rollDice(1);
			
			//Three-of-a-kind permutations
			if(die1 == die2 && die2 == die3 || //1,2,3
			   die2 == die3 && die2 == die4 || //2,3,4
			   die3 == die4 && die3 == die5) //3,4,5
				
				{
					threeOFAKindTotal++;
				}
			
			//Four-of-a-kind permutations
			if(die1 == die2 && die1 == die3 && die1 == die4 || //1,2,3,4
			   die2 == die3 && die2 == die4 && die2 == die5) //2,3,4,5
			{
				fourOFAKindTotal++;
			}
			
			//YAHTZEE! condition
			if(die1 == die2 && die1 == die2 && die1 == die3 && die1 == die4 && die1 == die5) // 1,2,3,4,5
			{
				Yahtzee++;
			}

		}
				
		System.out.println("In 100,000 rolls, you rolled 3-of-a-kind: " + threeOFAKindTotal + " times, 4-of-a-kind: " + fourOFAKindTotal + " times, and 5-of-a-kind: " + Yahtzee + " times.");
	}
}

