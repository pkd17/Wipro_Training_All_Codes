package Lab24_07.Games;

public class Game {
	
	protected String GameName="BGMI";
	protected int GameId=656;
	protected String GameType="Adventure";
	
	protected void game1() {
		System.out.println("game name is"+ GameName);
		System.out.println("game Id is"+ GameId);
		System.out.println("game Type is"+ GameType);
	}
	
	public static void main(String[] args) {
		Game g=new Game();
		g.game1();
	}

}
