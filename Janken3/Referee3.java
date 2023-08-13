public class Referee3 {

	final String Hand_G = "グー";
	final String Hand_T = "チョキ";
	final String Hand_P = "パー";

	private String name;

	Referee3(String nm) {
		this.name = nm;
	}

	void startJanken(){

		messageReferee("じゃんけん。。。ぽん！！！");
	}

	void checkHand(Player3 p) {

		if( (p.getHandStatus() ).equals(Hand_G) ) {
			messageReferee(p.getName() + "さんの手はグーでした");

		}else if( (p.getHandStatus() ).equals(Hand_T) ) {
			messageReferee(p.getName() + "さんの手はチョキでした");

		}else if( (p.getHandStatus() ).equals(Hand_P) ) {
			messageReferee(p.getName() + "さんの手はパーでした");
		}else{
			System.out.println("[ERROR]じゃんけんの判定が不正です");
		}


	}


	void judgeJanken(Player3 p1,Player3 p2) {

		messageReferee("結果は。。。");


		if( (p1.getHandStatus() ).equals(p2.getHandStatus() ) ) {
			messageReferee("あいこ！　勝負つかず！");
		}else if (
				( (p1.getHandStatus() ).equals(Hand_G) && (p2.getHandStatus() ).equals(Hand_T) )
				|| ( (p1.getHandStatus() ).equals(Hand_T) && (p2.getHandStatus() ).equals(Hand_P) )
				|| ( (p1.getHandStatus() ).equals(Hand_P) && (p2.getHandStatus() ).equals(Hand_G) )
				) {
			messageReferee(p1.getName() + "さんの勝利！！");
		}else {
			messageReferee(p2.getName() + "さんの勝利！！");
		}

	}



	void messageReferee(String msg) {
		System.out.println("審判" + this.name + "『" + msg + "』");
      }
	
	public String getName() {
		return this.name ;
	}









}
