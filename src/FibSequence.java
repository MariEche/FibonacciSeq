import java.util.Scanner;

public class FibSequence {

    static void calcSequence(int number){
        int num1 = 0;
        int num2 = 1;
        int nextnum = 0;

        if (number <= 0){
            System.out.println("negative integers not accepted");
        
        }

        for(int i = 0; i < (number -1); i++ ){

            nextnum = num1 + num2;

            num1 = num2;
            num2 = nextnum;
            
        }
        if (number == 1){
            nextnum = 0;
        }

        if (number == 2){
            nextnum = 1;
        }

        System.out.println(nextnum);
        
    }
    public static void main(String[] args) throws Exception {
        int input;
        Scanner Ask = new Scanner(System.in);
        input = Ask.nextInt();

        calcSequence(input);
        Ask.close();
    }
}
