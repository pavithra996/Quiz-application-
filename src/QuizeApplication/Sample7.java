package QuizeApplication;
import java.util.Scanner;
public class Sample7 {
    static class Player {
        String name;
        int totalAmount;

        Player(String name) {
            this.name = name;
            this.totalAmount = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Collect player details
            System.out.println("Welcome to Quiz");
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();
            Player player = new Player(playerName);

            // Ask if the player is ready to take the quiz
            System.out.print("Hello " + player.name + ", are you ready to take the quiz? (yes/no): ");
            String startQuiz = scanner.nextLine().toLowerCase();

            if (!startQuiz.equals("yes")) {
                System.out.println("Game terminated. Goodbye!");
                return;
            }

            // Display quiz rules
            System.out.println("\n--- Quiz Rules ---");
            System.out.println("1. You will be asked a series of questions.");
            System.out.println("2. Each question has 4 options. Choose wisely.");
            System.out.println("3. You have 2 lifelines: 50-50 and Phone a Friend.");
            System.out.println("4. You can use each lifeline only once.");
            System.out.println("5. If you give a wrong answer, you lose and will be awarded the amount you won.");
            System.out.println("6. If you give a correct answer, you earn an amount and move to the next question.");
            System.out.println("Good luck!\n");

            // Start quiz questions
            askQuestion(player, scanner);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Function to ask questions
    private static void askQuestion(Player player, Scanner scanner) {
        boolean lifelineUsed = false;

        try {
            // Question 1
            String question = "What is the capital of France?";
            String[] options = {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"};
            String correctAnswer = "C";
            int rewardAmount = 1000;

            System.out.println(question);
            for (String option : options) {
                System.out.println(option);
            }

            // Ask the player if they want to use a lifeline
            if (!lifelineUsed) {
                System.out.print("\nDo you want to use a lifeline? (yes/no): ");
                String useLifeline = scanner.nextLine().toLowerCase();

                if (useLifeline.equals("yes")) {
                    lifelineUsed = true;
                    useLifeline(player, scanner);
                }
            }

            // Take the answer from player
            System.out.print("\nChoose an option (A, B, C, D): ");
            String playerAnswer = scanner.nextLine().toUpperCase();

            if (playerAnswer.equals(correctAnswer)) {
                // Correct answer
                player.totalAmount += rewardAmount;
                System.out.println("Correct answer! You've won " + rewardAmount + "!");
                System.out.println("Total Amount: " + player.totalAmount);
                // Proceed to the next question
                askNextQuestion(player, scanner);
            } else {
                System.out.println("Wrong answer! You've won " + player.totalAmount);
                System.out.println("Game Over.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while processing the question: " + e.getMessage());
        }
    }

    // Function to use lifeline
    private static void useLifeline(Player player, Scanner scanner) {
        try {
            System.out.println("\nAvailable Lifelines:");
            System.out.println("1. 50-50");
            System.out.println("2. Phone a Friend");

            System.out.print("\nChoose a lifeline (1 for 50-50, 2 for Phone a Friend): ");
            int lifelineChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (lifelineChoice) {
                case 1:
                    System.out.println("You chose the 50-50 lifeline. Two wrong answers will be removed.");
                    break;
                case 2:
                    System.out.println("You chose the Phone a Friend lifeline. A friend suggests the correct answer is C.");
                    break;
                default:
                    System.out.println("Invalid choice. No lifeline used.");
            }
        } catch (Exception e) {
            System.out.println("Error while selecting a lifeline: " + e.getMessage());
            scanner.nextLine(); // Clear the input buffer
        }
    }

    // Function to ask the next question
    private static void askNextQuestion(Player player, Scanner scanner) {
        try {
            System.out.println("\n--- Next Question ---");
            String nextQuestion = "Who is the author of 'Janaganamana'?";
            String[] nextOptions = {"A. Rabindranath Tagore", "B. George Orwell", "C. Mark Twain", "D. J.R.R. Tolkien"};
            String nextCorrectAnswer = "A";
            int nextRewardAmount = 2000;
            
            System.out.println(nextQuestion);
            for (String option : nextOptions) {
                System.out.println(option);
            }

            System.out.print("\nChoose an option (A, B, C, D): ");
            String nextPlayerAnswer = scanner.nextLine().toUpperCase();

            Object nextCorrectAnswer111 = null;
			if (nextPlayerAnswer.equals(nextCorrectAnswer111)) {
                int nextRewardAmount111 = 0;
				player.totalAmount += nextRewardAmount111;
                System.out.println("Correct answer! You've won " + nextRewardAmount111 + "!");
                System.out.println("Total Amount: " + player.totalAmount);
            } else {
                System.out.println("Wrong answer! You've won " + player.totalAmount);
                System.out.println("Game Over.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while processing the question: " + e.getMessage());
        }
    }
}

