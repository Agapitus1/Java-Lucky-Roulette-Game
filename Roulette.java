import java.util.*;

class Roulette
{
    //Attributes
    String playerName, colourA, colourB;
    int maxScore;
    
    //Alternate Constructor
    Roulette(String thePlayerName, String theColourA, String theColourB, int theMaxScore)
    {
        playerName = thePlayerName;
        colourA = theColourA;
        colourB = theColourB;
        maxScore = theMaxScore;
    }
    
    void playRoulette()
    {
        //user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of spin (1,2,3): ");
        int numSpins = in.nextInt();
        
        if(numSpins==1 ||numSpins==2 || numSpins==3)
        {
            System.out.println("Success! You can have " + numSpins + " spins!");
            if(numSpins == 1)
            spin();
            else if(numSpins == 2)
            {
            spin();
            spin();
        }
            else
            {
            spin();
            spin();
            spin();
        }
        }
        else
        {
            System.out.println("Please re-enter the valid number");
            playRoulette();
        }
        
}

    //Procedure
    void displayColours()
    {
      System.out.println("Colour A is: " + colourA + " and Colour B is: " + colourB);
    }
    
    void spin()
    {
        //double * int = double
        //long is a big int
        long result = Math.round((Math.random() * maxScore) + 0.5);
        if(result % 2 == 0)
        {
           System.out.println("Congratulation! You have spun a " + colourA + " " + result);
        }
        else
        {
            System.out.println("Congratulation! You have spun a "+ colourB + " " +  + result);
        }
       
    }
}