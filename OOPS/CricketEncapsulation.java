class CricketScore{
	private int score;
	
	public void four() {
			score +=4;
			System.out.println(score);
	}
}
public class CricketEncapsulation {
	public static void main(String args[]) {
		CricketScore scorer = new CricketScore();
		scorer.four();
	}
}
