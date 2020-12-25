import java.util.Random;
import java.util.Scanner;



class rps{


    public static String RPS() {

        int computer = (int) (Math.random() * 3);

        Scanner input = new Scanner(System.in);
        System.out.println("Rock/Paper/Scissors ?");

        String user = input.next().toLowerCase();

        String robot = "";


        if (user.equals("rock") || user.equals("paper") || user.equals("scissors"));
        else {
            System.out.println("Enter a valid value!");
            System.exit(0);
        }

        switch (computer) {
            case 0 : 
                robot = "rock";
                break;
            case 1 : 
                robot = "paper";
                break;
            case 2 :
                robot = "scissors";
                break;
        }

        System.out.println(robot);

        if (user.equals(robot)) return "Tie.";


        if (user.equals("rock")) {
            if ( robot.equals("paper")) {
                return ("Computer won.");
            } else {
                return ("You won.");
            }
        } else if (user.equals("paper")) {

            if (robot.equals("scissors")) {
                return ("Computer won.");
            } else {
                return ("You won.");
            }


        } else {
            if (robot.equals("rock")) {
                return ("Computer won.");
            } else {
                return ("You won.");
            }
        }
    }

    public static void main(String[] args) {

        boolean resume = false;

        do {
            System.out.println(RPS()+"\n\n");

            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to continue? If so type yes ");
            resume = input.next().equals("yes"); // boolean true false


        } while (resume);


    }
}














