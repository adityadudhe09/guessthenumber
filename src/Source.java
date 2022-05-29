import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void takeUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please guess the number: ");
        inputNumber = input.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (inputNumber == number){
            System.out.println("Bingo! That's the number....");
            System.out.printf("You guessed it in %d guesses", getNoOfGuesses());
            return true;
        } else if (inputNumber < number){
            System.out.println("It's lower! Try a bit higher number" + "\n");
        } else if (inputNumber > number){
            System.out.println("It's higher! Try a bit lower number" + "\n");
        }
        return false;
    }
}

public class Source {
    public static void main(String[] args) {
        Game game = new Game();
        boolean findNumber = false;
        while (!findNumber) {
            game.takeUserInput();
            findNumber = game.isCorrectNumber();
        }
    }
}