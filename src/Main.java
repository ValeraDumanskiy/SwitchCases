import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//-----------------------------------

        System.out.print("Enter your age : ");
        Scanner scaner = new Scanner(System.in);
        int age = scaner.nextInt();

        switch (age){
            case 0 :{
                System.out.print("you bern");
                break;
            }
            case 7 :{
                System.out.print("you child ");
                break;
            }
            case 21 :{
                System.out.print("you student");
                break;
            }
            case 22 :{
                System.out.print("  not sTUDENT: ");
                break;
            }
            default: System.out.print("Enter your age : ");
        }
/*
        while (true){
            System.out.println("My Nomber  " + myInt + " Your nomber "+ i + ". ");
            System.out.print("  set  you NEXT Nomber : ");
            i = scaner.nextInt();
            if (i == 5) break;
        }

 */


/*
        do{
            System.out.print("  set  you NEXT Nomber : ");
            i = scaner.nextInt();
            System.out.println("My Nomber  " + myInt + " Your nomber "+ i + ". ");
        }while(i!=myInt);


 */
        System.out.print("Eeee! You understand what I want from you");


    }

//-----------------------------------
  /*
        while(myInt <= 50){
            System.out.println("Hello world! - " + myInt);
            myInt +=10;
        }

   */
//-----------------------------------
 /*       for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world! - " + i);
        }
*/
//-----------------------------------
/*
        if (myInt < i) {
            System.out.println("My Nomber  " + myInt + " is less your "+ i + ". ");
        } else if (myInt > i) {
            System.out.println("Nomber myInt " + myInt + " is higher your  "+ i + ". ");
        } else System.out.println("Nomber myInt " + myInt + " is the same as  "+ i + ". ");

    }
*/
}
