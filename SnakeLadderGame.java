public class SnakeLadderGame {
    public static void main(String[] args) {
    int pos1 = 0;
     while (pos1 < 100 ){
            double dice1 = (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println((int) dice1);
            double cond1 = Math.floor(Math.random() * 10) % 3;
            if (pos1 == 100) {
                break;
            } else if ((int) cond1 == 0)
                System.out.println("No Play || current position of player 1:" + pos1);
            else if ((int) cond1 == 1) {
                if (pos1 == 94 && (int) dice1 <= 6) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println("roll again || current position of player 1:" + pos1);
                } else if (pos1 == 95 && (int) dice1 < 5) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                } else if (pos1 == 95 && (int) dice1 > 5) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                } else if (pos1 == 96 && (int) dice1 < 4) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                } else if (pos1 == 96 && (int) dice1 > 4) {
                    System.out.println(" current position of player 1:" + pos1);
                } else if (pos1 == 97 && (int) dice1 < 3) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                } else if (pos1 == 97 && (int) dice1 > 3) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                } else if (pos1 == 98 && (int) dice1 < 2) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                } else if (pos1 == 98 && (int) dice1 > 2) {
                    System.out.println(" roll again || current position of player 1:" + pos1);
                } else if (pos1 == 99 && (int) dice1 > 1) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                } else {
                    pos1 = pos1 + (int) dice1;
                    System.out.println("Ladder || current position of player 1:" + pos1);
                }
            } else if ((int) cond1 == 2) {
                if (pos1 == 0) {
                    System.out.println("Roll again || current position of player 1:" + pos1);
                } else if (pos1 == (int) dice1 || pos1 <= (int) dice1) {
                    pos1 = 0;
                } else {
                    pos1 = pos1 - (int) dice1;
                    System.out.println("Snake || current position of player 1:" + pos1);
                }
            }
        }
    }
}
