/**
 * Created by laurashi on 10/26/17.
 */
import java.util.Scanner;

public class Number
{

    public static void main(String[] args)
    {
        int inputNum = 0;
        int tries = 0;
        Scanner in = new Scanner(System.in);


        do
        {
            System.out.print("Enter a number between 1 and 10: ");
            inputNum = in.nextInt();
            tries++;
        }
        while ((inputNum < 1 || inputNum > 10) && tries < 3);

            if (inputNum == 1) //set correct number to 1
            {
                System.out.println("Yay, you entered the correct number after " + tries + " try!");
            } else
            {
                System.out.println("Sorry, you did not enter the correct number. Please try again. You have " + (3 - tries) + " tries left.");
                while ((inputNum < 1 || inputNum > 10) && tries < 3) ;
                {
                    System.out.print("Enter a number between 1 and 10: ");
                    inputNum = in.nextInt();
                    tries++;

                    if (inputNum == 1) //set correct number to 1
                    {
                        System.out.println("Yay, you entered the correct number after " + tries + " tries!");
                    } else
                    {
                        System.out.println("Sorry, you did not enter the correct number. Please try again. You have " + (3 - tries) + " try left.");
                        while ((inputNum < 1 || inputNum > 10) && tries < 3) ;
                        {
                            System.out.print("Enter a number between 1 and 10: ");
                            inputNum = in.nextInt();
                            tries++;
                        }
                        if (tries >= 3 && inputNum == 1)
                            System.out.println("Yay, you entered the correct number after " + tries + " tries!");
                        else
                            System.out.println("Game over, you did not enter the correct number.");
                    }

                }
            }
        }
    }


