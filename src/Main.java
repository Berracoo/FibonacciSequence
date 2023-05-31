import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1,givenN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times would you like to run the Fibonacci Sequence : ");
      givenN = scanner.nextInt();

        while (givenN < 0) {
            System.out.println("Please be sure the number is bigger than 0 !" + "\n" +
                    "Enter the new number :");
            givenN = scanner.nextInt();

        }

        System.out.print("Fibonacci series till " + givenN + " " + "times"+ ":"  );

        for(int i = 0; i <= givenN; i++) {
            if(n1 == 0){
                System.out.print(n1);
            }else{
                System.out.print("," + n1);
            }
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            }
        System.out.println();

        }







}