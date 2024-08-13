//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;
class Project4{
    public static void main(String[]args) {
        Scanner myScanner = new Scanner (System.in);


//variables
  int firstNumber = 0;
  int secondNumber = 0;
  int thirdNumber = 0;
  int fourthNumber = 0;

//ask for input
  System.out.println("Enter a three diget number");
  firstNumber = myScanner.nextInt();
  System.out.println("ok " + firstNumber);
  
  System.out.println("another one");
  secondNumber = myScanner.nextInt();
  System.out.println("cool " + secondNumber);
  
  System.out.println("one more");
  thirdNumber = myScanner.nextInt();
  System.out.println("yay " + thirdNumber);
  
  System.out.println("last one");
  fourthNumber = myScanner.nextInt();
  System.out.println("thanks " + fourthNumber);

//sum as variable
int sumOfAll = firstNumber + secondNumber + thirdNumber + fourthNumber;
System.out.println("The sum is " + sumOfAll);


//compuet average and store in 6
double averageScore = sumOfAll / 4;

//print
System.out.println("The average is " + averageScore);
 }
}
