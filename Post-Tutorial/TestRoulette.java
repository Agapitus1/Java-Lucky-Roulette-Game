import java.util.*;

class TestRoulette
{
    Roulette r1, r2;
    
    TestRoulette()
    {
        //User input - 5 things to enter
        Scanner in = new Scanner(System.in);
        System.out.println("Enter player 1 name: "); //prompt the user
        String name1 = in.next();
        System.out.println("Enter player 2 name: ");
        String name2 = in.next();
        
        System.out.println("Enter colour A: ");
        String colourA = in.next();
        System.out.println("Enter colour B: ");
        String colourB = in.next();
        
        System.out.println("Enter the maximum score: ");
        int score = in.nextInt();
        
        r1 = new Roulette(name1,colourA,colourB,score);
        r2 = new Roulette(name2,colourA,colourB,score);
        
        r1.playRoulette();
        r2.playRoulette();
        
    }
}