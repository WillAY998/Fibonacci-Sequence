import java.util.*;
class FibonacciSequence {
    public static void main(String[] args) {
    //This program will take a number from the user and output that number's representative in the Fibonacci Sequence.
    
    Scanner scan = new Scanner(System.in);
    int UserNumber = 0;
    int FibonacciNumber = 0;
    int Counter1 = 0;
    int Counter2 = 1;
    int StaticCounter = 1;
    
    System.out.println("Enter a number to see it's valuation in the Fibonacci Sequence.");
        UserNumber = scan.nextInt();
    
    while(StaticCounter < UserNumber) {
        FibonacciNumber = (Counter1 + Counter2);
        System.out.println(FibonacciNumber);
            
            Counter1 = Counter2;
            Counter2 = FibonacciNumber;
            
            StaticCounter++;
    }
        
      System.out.println(UserNumber + " in the Fibonacci sequence is " + Counter2);
    }
}