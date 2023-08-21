public class GuessGame {

    String player1 = "John";
    String player2 = "Tom";
    String player3 = "Harry";
    int generateNumber;
    int returnGuessNumber;
    public void startGame() {
        Player player = new Player();
        generateNumber = (int)(Math.random() * 10);
        System.out.println("Generated Number: " + generateNumber);
        System.out.print(player1 + " make a guess:");
        returnGuessNumber = player.guess();
        System.out.println("Guessed Number: " + returnGuessNumber);

        if (returnGuessNumber == generateNumber){
            System.out.println(player1 + " you win");
        }else {
            while (returnGuessNumber != generateNumber){
                System.out.println(player1 + " you lose");

                generateNumber = (int)(Math.random() * 10);
                System.out.println("Generated Number: " + generateNumber);
                System.out.print(player2 + " make a guess:");
                returnGuessNumber = player.guess();
                System.out.println("Guessed Number: " + returnGuessNumber);

                if (returnGuessNumber == generateNumber){
                    System.out.println(player2 + " you win");
                }
                else {
                    System.out.println(player2 + " you lose");

                    generateNumber = (int)(Math.random() * 10);
                    System.out.println("Generated Number: " + generateNumber);
                    System.out.print(player3 + " make a guess:");
                    returnGuessNumber = player.guess();
                    System.out.println("Guessed Number: " + returnGuessNumber);

                    if (returnGuessNumber == generateNumber){
                        System.out.println(player3 + " you win");
                    }
                    else {

                        System.out.println(player3 + " you lose");

                        generateNumber = (int)(Math.random() * 10);
                        System.out.println("Generated Number: " + generateNumber);
                        System.out.print(player1 + " make a guess:");
                        returnGuessNumber = player.guess();
                        System.out.println("Guessed Number: " + returnGuessNumber);

                        if (returnGuessNumber == generateNumber){
                            System.out.println(player1 + " you win");
                        }
//
                        }

                    }
                }
            }
        }

    }
//}
