import java.util.Random;


public class Player3{

    final String Hand_G = "グー";
    final String Hand_T = "チョキ";
    final String Hand_P = "パー";
 
    private String name       ;
    private String handStatus ;
    
    Player3(String nm) {
       this.name = nm;
    }

	void makeHandStatus(){
	
	Random rand = new Random();
    int num = rand.nextInt(2);
		
		switch(num) {
			
		case 0:
			this.handStatus = Hand_G;
			break;
			
		case 1:
			this.handStatus = Hand_T;
			break;
			
		case 2:
			this.handStatus = Hand_P;
			break;
		}
	
	}
	
	public String getName() {
		return this.name ;
	}
	
	public String getHandStatus() {
		return this.handStatus ;
	}

}