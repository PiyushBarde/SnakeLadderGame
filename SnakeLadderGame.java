public class SnakeLadderGame{
	public static void main(String[] args){
	int pos = 0;
	double dice = (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("dice rolled : " + (int)dice);
	double cond = Math.floor(Math.random() * 10) % 3;
		if ((int) cond == 0)
                System.out.println("No Play");
	 	else if ((int) cond == 1) {
		pos = pos + (int) dice;
                    System.out.println("Ladder");
				}
		else{
		System.out.println("Snake");
		}
	}
}
