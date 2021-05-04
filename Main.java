

import Abstract.CampaignService;
import Abstract.GameControllerService;
import Abstract.GameSalesService;
import Abstract.PlayerCheckService;
import Abstract.PlayerControllerService;
import Concrete.BaseCampaignManager;
import Concrete.BaseGameManager;
import Concrete.BasePlayerManager;
import Concrete.BaseSalesManager;
import Concrete.PlayerCheckManager;
import Entities.*;

public class Main {

	public static void main(String[] args) {
		// oyun ekle
		GameProduct game1 = new GameProduct(1, "BattleField", 560);
		GameProduct game2 = new GameProduct(2, "Counter Strike", 350);
		GameProduct game3 = new GameProduct(3, "PUBG", 1000);

		Player player1 = new Player(1, "Mehmet", "Parlak", 1987, "12345678910");
		Player player2 = new Player(2, "Ahmet", "Sencer", 2002, "12345645646");
		
		Campaign campaign1= new Campaign(1,"Ramazan Kampanyasý",10);
		Campaign campaign2= new Campaign(2, "Tam Kapanma Kampanyasý", 20);
		
		PlayerCheckService playerChk = new PlayerCheckManager();
		GameControllerService gameCtrl = new BaseGameManager();
		PlayerControllerService playerCtrl = new BasePlayerManager(playerChk);
		CampaignService campCtrl= new BaseCampaignManager();
		GameSalesService gameSell= new BaseSalesManager();
		
		gameCtrl.addGame(game1);
		gameCtrl.addGame(game2);
		gameCtrl.addGame(game3);
		System.out.println("------------------");
		playerCtrl.join(player1);
		playerCtrl.join(player2);
		System.out.println("------------------");
		campCtrl.addCampaign(campaign1);
		campCtrl.addCampaign(campaign2);
		System.out.println("------------------");
		gameSell.sellwCampaign(player2, game3, campaign2);
		gameSell.sellGame(player2, game2);
		
		
		
		
		

		// oyuncu ekle

		// kampanya ekle

		// join

		// kampanyalý bir satýþ yap

	}

}
