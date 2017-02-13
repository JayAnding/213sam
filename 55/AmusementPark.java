
/**
 * Write a description of class AmusementPark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AmusementPark
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner ( System.in );
        boolean keepPlaying = true;
        boolean keepPlaying2 = true;
        boolean keepPlaying3 = true;
        boolean keepPlaying4 = true;
        boolean keepPlaying5 = true;
        boolean keepPlaying6 = true;
        boolean keepPlaying7 = true;
    
        while ( keepPlaying )
        {
            System.out.println("You have arrived at the AmusementPark! What do you want to do?");
            System.out.println("You can [1]go to the waterpark or [2] go to the rollercoasters.");
        
        
            int userInt = scanner.nextInt();
            if( userInt == 1){
                System.out.println("You have decided to go to the waterpark. What will you do from here?");
                System.out.println("[3] Go to the world's highest waterslid or [4] Go to the Food Stand and get an Ice Cream cone.");
                keepPlaying = false;
            }
            if (userInt == 2) {
                System.out.println("You have made a good decision and decided to go to the rollercoasters. What is next?");
                System.out.println("[5] You can go ride and log flume or [6] You can go ride the new rollercoaster.");
                keepPlaying = false;
            }
        }
         
        
        while (keepPlaying2)
            {
                int userInt2 = scanner.nextInt();
                
                if (userInt2 == 3) {
                    System.out.println(" You decided to go on the world's highest waterslid. What will you do from here?");
                    System.out.println("[7] You can ride down the slid on your stomach or [8] slid down on your back.");
                    keepPlaying2 = false;
                }
                if (userInt2 == 4) {
                    System.out.println("You wanted to go get an ice cream cone. What will you do next?");
                    System.out.println("[9] You can eat it or [10] you can smash it in the workers face. ");
                    keepPlaying2 = false;
                }
                if (userInt2 == 5) {
                    System.out.println(" You have chose to ride the log flume. What will you do from here?");
                    System.out.println("[11] You can go ride the go karts or [12] you can ride the log flume again");
                    keepPlaying2 = false;
                }
                if (userInt2 == 6) {
                    System.out.println("You have chose to go ride the new rollercoaster but there is a 2 hour long wait.");
                    System.out.println("What will you do now?");
                    System.out.println("[13] You can wait in line for the new rollercoaster or [14] You can go get a hamburger?");
                    keepPlaying2 = false;
                }
            }
               
        while (keepPlaying3)
                {
                    int userInt3 = scanner.nextInt();
                    
                    if(userInt3 == 7) {
                        System.out.println("You chose ot ride down the waterslid on your stomch. That was a bad decision because it sliced your stomach open.");
                        System.out.println("YOU ARE DEAD! SORRY GAME OVER!");
                        System.exit(0);
                    }
                    if(userInt3 == 8) {
                        System.out.println("You chose to slid down on your back. That was a horrible desicion because you were going to fast and flew off.");
                        System.out.println("You landed in the parking lot and died. SORRY GAME OVER!");
                        System.exit(0);
                    }
                    if (userInt3 == 9) {
                        System.out.println("You decided to eat the ice cream cone. Good decsion, you are no longer hungry and are ready for the next thing.");
                        System.out.println("[15] You can go to the lazy river or [16] you can go to wavepool");
                       keepPlaying3 = false;
                    }
                    if (userInt3 == 10) {
                        System.out.println("You smashed the ice cream cone into the workers face.");
                        System.out.println("When you smashed it in his face he pulled a gun from behind the counter and killed you.");
                        System.out.println("YOU DIED! GAME OVER!");
                    }
                    if (userInt3 == 11) {
                        System.out.println("You have chose to ride the go karts.");
                        System.out.println("When you sat down in your go kart, the guy next to you challenged you to a race.");
                        System.out.println("[17] You can race him or [18] you can chicken out.");
                        keepPlaying3 = false;
                    }
                    if (userInt3 == 12) {
                        System.out.println("You chose to ride the log flume again. Bad choice");
                        System.out.println("The doctor didn't tell you but you are slightly overweight and broke the log flume.");
                        System.out.println("You left the amusement park in depression. GAME OVER!");
                        System.exit(0);
                    }
                    if (userInt3 == 13) {
                        System.out.println("You decided to wait in line for the new rollercoaster. Good decision");
                        System.out.println("Now you have a very big decision.");
                        System.out.println("[19] You can go to THE ULTIMATE BUNGEY CHAIR RIDE or [20] you can go home");
                        keepPlaying3 = false;
                    }
                    if (userInt3 == 14){
                        System.out.println("You chose to get a hamburger. Bad decision");
                        System.out.println("You got food posioning and died. Sorry buddy. GAME OVER!");
                        System.exit(0);
                    }
                }
        while (keepPlaying4) 
            {
                int userInt4 = scanner.nextInt();
                
                if (userInt4 == 15) {
                    System.out.println("You chose to go to the lazy river. Good decision");
                    System.out.println("It was very relaxing and now you are ready to do something else.");
                    System.out.println("[21] You can go get a Gatorade or [22] You can get a tea.");
                    keepPlaying4 = false;
                }
                if (userInt4 == 16) {
                    System.out.println("You chose to go to the wave pool. Bad decision");
                    System.out.println("You accidently drank some bad pool water and are now in the er. GAME OVER! ");
                    System.exit(0);
                }
                if (userInt4 == 17) {
                    System.out.println("You chose to race him. Bad decision");
                    System.out.println("While you guys were racing, you got ran 6over and you died. GAME OVER!");
                    System.exit(0);
                }
                if (userInt4 == 18) {
                    System.out.println("You decided to chicken out of the race. You are a baby.");
                    System.out.println("GAME OEVR YOUR A BABY!");
                    System.exit(0);
                }
                if (userInt4 == 19) {
                    System.out.println("You chose to go to the fancy new ride.");
                    System.out.println("They didn't tell you but it had not been tested yet and you were the first one on it. GAME OEVR! You died!");
                    System.exit(0);
                }
                if (userInt4 == 20) {
                    System.out.println("You decided to go home. GAME OVER! YOU QUIT!");
                    System.exit(0);
                }
                
            
            
            
            
            }
        while (keepPlaying5)
            {
                int userInt5 = scanner.nextInt();
                
                if (userInt5 == 21) {
                    System.out.println("You chose to go get a Gatorade. Good decision");
                    System.out.println("[23] You can go home or [24] Go see the new pregnant llama.");
                    keepPlaying5 = false;
                }
                if (userInt5 == 22) {
                    System.out.println("You chose to get a tea. Bad decision");
                    System.out.println("You died! It was posionus! BYE! BYE!");
                    System.exit(0);
                }
            }
        while (keepPlaying6)
            {
                int userInt6 = scanner.nextInt();
                
                if (userInt6 == 23) {
                    System.out.println("You chose to go home. You are no fun. GAME OVER!");
                    System.exit(0);
                }
                if (userInt6 == 24) {
                    System.out.println("You chose to go see the new pregnant llama. Great decsion");
                    System.out.println("When you were at the new pregnant llama enclosure, she gave birth and they are going to give the baby llama away to one lucky winnner.");
                    System.out.println("All you have to do is guess the number right. [25] If the number is 10 or [26] if the number is 6");
                    keepPlaying6 = false;
                }
               
            }
        while (keepPlaying7)
            {
                int userInt7 = scanner.nextInt();
                if (userInt7 == 25) {
                    System.out.println("You picked the number 10 you were correct. You won the baby llama.");
                    System.out.println("YOU WON THE GAME. CONGRATULATIONS!");
                    System.exit(0);
                }
                if (userInt7 == 26) {
                    System.out.println("You picked the number 6 you were incorrect. You lose.");
                    System.out.println("GAME OVER! You are a loser.");
                    System.exit(0);
                
                }
            }        
        
            }
           
            
            }


//end class

