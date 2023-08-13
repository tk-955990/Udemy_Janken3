public class Janken3 {

	public static void main(String[] args) {
	
            final String Hand_G = "グー";
	    final String Hand_T = "チョキ";
            final String Hand_P = "パー";

            String player1 = args[0];
	    String player2 = args[1];
	    String referee = args[2];

            Player3 p1   = new Player3(player1);
	    Player3 p2   = new Player3(player2);
	    Referee3 ref = new Referee3(referee);
	

	    ref.startJanken();

	    p1.makeHandStatus();
	    p2.makeHandStatus();

            ref.checkHand(p1);
            ref.checkHand(p2);

	    ref.judgeJanken(p1,p2);


	}
}