import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       //Create Scanner Variable
        Scanner userInput = new Scanner(System.in);

        //Declare Variables
        int playerClass, playerChoice;
        //Get the player's class choice
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        playerClass = userInput.nextInt();

        //Player chooses an action
        System.out.println("There is a guard here, what do you do?");
        System.out.println("1 - Fight him");
        System.out.println("2 - Steal his wallet");
        System.out.println("3 - Throw a fireball");
        System.out.println("4 - Talk the guard into leaving");
        System.out.println("5 - Intimidate the guard");
        System.out.println("6 - Bond with the guard over your shared disdain for magic");

        playerChoice = userInput.nextInt();

        if(playerClass == 1 && playerChoice == 1){
            System.out.println("You pull your sword and you get hit but," +
                    " you win easily!");
        }
        else if (playerClass == 2 && playerChoice == 2){
            System.out.println("You steal the wallet. Despite your efforts with your imense speed and agility " +
                    "\n you crack under the pressure and you unfortunately fall and crack multiple bones " +
                    "\n and the guard fids you and cracks more of your bones.");
        }
        else if (playerClass == 3 && playerChoice == 3){
            System.out.println("You throw a fireball. Even though the tower is insanely strong and powerful " +
                    "\n you end up out battling the guards and you gain strength and satisfaction.");
        }
        else if ((playerClass == 2 || playerClass == 3) && playerChoice == 4){
            System.out.println("You observe the guard for a moment, and you notice several wrappers " +
                    "\n You fund them all and then end up blowing you up " +
                    "\n and then you crack multiple more bones in your body");
        }
        else if ((playerClass == 1 || playerClass == 3) && playerChoice == 5){
            System.out.println("You boldy walk up to the guard" +
                    "\n You make him so intimidated that you that he is scared" +
                    "\n and then he backs up as fast as a cheetah!");
        }
        else if (!(playerClass == 3) && playerChoice == 6){
            System.out.println("You explain your horrible story about the tragedies against your family," +
                    "\n You make him so sad that he starts to cry" +
                    "\n and then you jsutify your destroying and vigourous character towards him.");
        }
        else {
            System.out.println("You are the greatest in the entire world and no one else can take your throne!")
        }
    }
}
