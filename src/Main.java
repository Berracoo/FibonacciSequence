import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1,givenN;
        // getting a number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times would you like to run the Fibonacci Sequence : ");
      givenN = scanner.nextInt();
        // to avoid getting negative number from the user
        while (givenN < 0) {
            System.out.println("Please be sure the number is bigger than 0 !" + "\n" +
                    "Enter the new number :");
            givenN = scanner.nextInt();

        }

        System.out.print("Fibonacci series till " + givenN + " " + "times"+ ":"  );
        // getting fibonacci series with a loop
        for(int i = 0; i <= givenN; i++) {
            //putting comma while sequencing the number and not letting it put comma to the end.
            if(n1 == 0){
                System.out.print(n1);
            }else{
                System.out.print("," + n1);
            }
            // the sequence of the processes in the is like that : first calculates the value of n1 and then sums n1 and n2 to find n3 and then changes the n2 and n1 according to the sequence.
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            }
        System.out.println();

        }







}
