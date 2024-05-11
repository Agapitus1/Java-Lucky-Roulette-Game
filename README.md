# Java-Lucky-Roulette-Game

# Exercise A – Review The Lucky Roulette – Group of Two
Open the document ‘Tutorial 3 - Roulette Code.docx’ which is a version of the Roulette class from last week. You must find the answers to all questions… Good Luck ! Make sure you record your answers. 
 
# Exercise B – Modify the Roulette Class – Individual

1. Open your week2 project from last week and Save As a new project called week3. All work today will be done in this new project. If you are missing some code from the Roulette class, use the handout to help you finish it.

2. In the TestRoulette class, add code in the constructor BEFORE creating the Roulette objects so that the user is asked to enter the two names of the players. They are also asked to enter the two colours and the maximum score for the Roulette. After reading ALL input into local variables (FIVE variables are needed) using Scanner, use these values when creating the two roulette objects (when you call new Roulette (). Here is the sample output – you must match each message.

 



3. In the Roulette class, change the method void spin()  so that the method adds 0.5 to the random number, before rounding it to the nearest integer. HINT: look up the round() method in the Math class. Use a LOCAL variable to do this:

long result = Math.round((Math.random() * maxScore) + 0.5);

 
4. In the Roulette class, write a new method called void playRoulette() which allows the user to enter the number of times they wish to spin the Roulette. They are only allowed to enter 1, 2 or 3. Use the Scanner class from the Java API. 

After the user inputs the number:
-	Use an if-else statement to check that the number they entered was 1, 2 or 3
-	If the numberOfSpins entered was NOT 1, 2 or 3 display an error 
-	If the numberOfSpins entered was 1, 2 or 3, display a confirmation message such as this - “Success ! You can have 2 spins”
-	If the numberOfSpins is 1, call spin() once.
-	If the numberOfSpins is 2, call spin() twice.
-	etc.


5. Modify the spin() method so that it also displays what colour segment the arrow has stopped on.  For the spin below, the message displayed would be “Congratulations you have spun a Yellow 3!”

HINT: Revise what the symbol % means in Java, how could you use this to work out where the arrow has landed?  

 

6. In TestRoulette modify the constructor so that it:
	- Calls playRoulette() for the Roulette object
Sample output is below:
