public class SnakeLadderGame {
public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        int pos1 = 0;
        int pos2 = 0;
        while (pos1 < 100 && pos2 < 100) {
            counter1 = counter1 + 1;
            double dice1 = (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println((int) dice1);
            double cond1 = Math.floor(Math.random() * 10) % 3;
            if (pos1 == 100) {
                break;
            }
				else if ((int) cond1 == 0)
                System.out.println("No Play || current position of player 1:" + pos1);
            else if ((int) cond1 == 1) {
                if (pos1 == 94 && (int) dice1 <= 6) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println("roll again || current position of player 1:" + pos1);
                    if (pos1 == 95 && (int) dice1 < 5) {
                        pos1 = pos1 + (int) dice1;
                        System.out.println(" current position of player 1:" + pos1);
                    }
                    else if (pos1 == 94 && (int) dice1 <= 6) {
                        pos1 = pos1 + (int) dice1;
                        System.out.println("roll again || current position of player 1:" + pos1);
                    }
                    else if (pos1 == 95 && (int) dice1 > 5) {
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

                } else if (pos1 == 95 && (int) dice1 < 5) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                    if (pos1 == 95 && (int) dice1 < 5) {
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
                } else if (pos1 == 95 && (int) dice1 > 5) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                    if (pos1 == 95 && (int) dice1 > 5) {
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
                } else if (pos1 == 96 && (int) dice1 < 4) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                    if (pos1 == 96 && (int) dice1 < 4) {
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
                } else if (pos1 == 96 && (int) dice1 > 4) {
                    System.out.println(" current position of player 1:" + pos1);
                    if (pos1 == 96 && (int) dice1 > 4) {
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
                } else if (pos1 == 97 && (int) dice1 < 3) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                    if (pos1 == 97 && (int) dice1 < 3) {
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
                } else if (pos1 == 97 && (int) dice1 > 3) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                    if (pos1 == 97 && (int) dice1 > 3) {
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
                } else if (pos1 == 98 && (int) dice1 < 2) {
                    pos1 = pos1 + (int) dice1;
                    System.out.println(" current position of player 1:" + pos1);
                    if (pos1 == 98 && (int) dice1 < 2) {
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
                } else if (pos1 == 98 && (int) dice1 > 2) {
                    System.out.println(" roll again || current position of player 1:" + pos1);
                    if (pos1 == 98 && (int) dice1 > 2) {
                        System.out.println(" roll again || current position of player 1:" + pos1);
                    } else if (pos1 == 99 && (int) dice1 > 1) {
                        System.out.println("roll again || current position of player 1:" + pos1);
                        if (pos1 == 99 && (int) dice1 > 1) {
                            System.out.println("roll again || current position of player 1:" + pos1);
                        } else {
                            pos1 = pos1 + (int) dice1;
                            System.out.println("Ladder || current position of player 1:" + pos1);
                        }
                    } else {
                        pos1 = pos1 + (int) dice1;
                        System.out.println("Ladder || current position of player 1:" + pos1);
                    }
                } else if (pos1 == 99 && (int) dice1 > 1) {
                    System.out.println("roll again || current position of player 1:" + pos1);
                } else {
                    pos1 = pos1 + (int) dice1;
                    System.out.println("Ladder || current position of player 1:" + pos1);
                    if(pos1==100){
                        break;
                    }
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
                   counter2 = counter2 + 1;
            double dice2 = (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("dice rolled :" + (int) dice2);
            double cond2 = Math.floor(Math.random() * 10) % 3;
            if (pos2 == 100) {
                break;
            } else if ((int) cond2 == 0)
                System.out.println("No Play || current position of player 2:" + pos2);
            else if ((int) cond2 == 1) {
                if (pos2 == 94 && (int) dice2 <= 6) {
                    pos2 = pos2 + (int) dice2;
                    System.out.println("roll again || current position of player 2:" + pos2);
                    if (pos2 == 94 && (int) dice2 <= 6) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("roll again || current position of player 2:" + pos2);

                    } else if (pos2 == 95 && (int) dice2 < 5) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 95 && (int) dice2 > 5) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 < 4) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 > 4) {
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }

                } else if (pos2 == 95 && (int) dice2 < 5) {
                    pos2 = pos2 + (int) dice2;
                    System.out.println(" current position of player 2:" + pos2);
                    if (pos2 == 95 && (int) dice2 < 5) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 95 && (int) dice2 > 5) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 < 4) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 > 4) {
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 95 && (int) dice2 > 5) {
                    System.out.println("roll again || current position of player 2:" + pos2);
                    if (pos2 == 95 && (int) dice2 > 5) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 < 4) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 > 4) {
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 96 && (int) dice2 < 4) {
                    pos2 = pos2 + (int) dice2;
                    System.out.println(" current position of player 2:" + pos2);
                    if (pos2 == 96 && (int) dice2 < 4) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 96 && (int) dice2 > 4) {
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 96 && (int) dice2 > 4) {
                    System.out.println(" current position of player 2:" + pos2);
                    if (pos2 == 96 && (int) dice2 > 4) {
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 97 && (int) dice2 < 3) {
                    pos2 = pos2 + (int) dice2;
                    System.out.println(" current position of player 2:" + pos2);
                    if (pos2 == 97 && (int) dice2 < 3) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 97 && (int) dice2 > 3) {
                    System.out.println("roll again || current position of player 2:" + pos2);
                    if (pos2 == 97 && (int) dice2 > 3) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 98 && (int) dice2 < 2) {
                    pos2 = pos2 + (int) dice2;
                    System.out.println(" current position of player 2:" + pos2);
                    if (pos2 == 98 && (int) dice2 < 2) {
                        pos2 = pos2 + (int) dice2;
                        System.out.println(" current position of player 2:" + pos2);
                    } else if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 98 && (int) dice2 > 2) {
                    System.out.println(" roll again || current position of player 2:" + pos2);
                    if (pos2 == 98 && (int) dice2 > 2) {
                        System.out.println(" roll again || current position of player 2:" + pos2);
                    } else if (pos2 == 99 && (int) dice2 > 1) {
                        System.out.println("roll again || current position of player 2:" + pos2);
                    } else {
                        pos2 = pos2 + (int) dice2;
                        System.out.println("Ladder || current position of player 2:" + pos2);
                    }
                } else if (pos2 == 99 && (int) dice2 > 1) {
                    System.out.println("roll again || current position of player 2:" + pos2);
                    }
                } else {
                    pos2 = pos2 + (int) dice2;
                    System.out.println("Ladder || current position of player 2:" + pos2);
                    if(pos2==10){
                        break;
                    }
                    pos2 = pos2 + (int) dice2;
                    System.out.println("Ladder || current position of player 2:" + pos2);
                }
            }
        if(pos1 == 100) {
            System.out.println("player 1 Won and he " + counter1 + " times played the dice");
            System.out.println("player 2 lost and he rolled dice " + counter2 + " times");
        } else {
            System.out.println("Player 2 won and he roller dice " + counter2 + " times played the dice");
            System.out.println("player 1 lost and he rolled dice " + counter1 + " times");

        }
    }
}
