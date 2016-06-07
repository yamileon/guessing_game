import java.util.*;

class guessGame{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int randomno = 0;//random number genrated by genrator
		int input = 0;//user input value
		int counter = 0;//amount of tries
		
		System.out.println("guess a number between 1 and 100");
		System.out.println("you have 20 tries");
		input = in.nextInt();
		
		Random Roller = new Random();
		randomno = Roller.nextInt(99)+1;//genrates a value of between 1 and 100
		//System.out.println("randomno"+randomno); //used to test number does not change each loop
		while(input > 0 && counter != 20)//when input is not zero or less and counter is set not 20 
			{
				if(input > randomno && input >= 1 && input <= 100)//if input is greater than random number but between 1-100
					{
						System.out.println("too high");
					}
				else if(input < randomno && input >= 1 && input <= 100)//if input is less than random number but between 1-100
					{
						System.out.println("too low");
					}
				else if(input == randomno)// if random is = to random number end program
					{
						System.out.println("you have guessed right");
						System.out.println("the amount of tries it took you is :"+counter);
						break;
					}
				else if(input > 100)// if use input a value that is greater than limit resets counter to value before this attempt
					{
						System.out.println("in valid entry please enter a value thats below 100");
						counter--;//to reduce counter by one due to invalid entry
					}
				counter++;//increace counter after attempt
				System.out.println("Amount of attempts " + counter);
				System.out.println("guess a number between 1 and 100");
				//System.out.println("randomno"+randomno); //used to test number does not change during each loop
				input = in.nextInt();
			}
		if(counter == 20)//when counter = 20 end game
			{
				System.out.println("You have reached the guess limit please try again later");
				System.out.println("thanks for playing");
				System.out.println("the number you were trying to guess is " + randomno);
			}

		else//if user ends or runs outta credits
			{
				System.out.println("your number is :" + randomno);
				System.out.println("thanks for playing");
			}
}
}