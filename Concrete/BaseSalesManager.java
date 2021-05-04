package Concrete;

import Abstract.GameSalesService;
import Entities.Campaign;
import Entities.GameProduct;
import Entities.Player;

public class BaseSalesManager implements GameSalesService {

	@Override
	public void sellGame(Player player, GameProduct game) {
		System.out.println(game.getGameName() + " adlý oyun " + player.getFirstName() + player.getLastName()
				+ " adlý kullanýcýya " + game.getGamePrice() +  " fiyatýna satýldý ");

	}

	@Override
	public void sellwCampaign(Player player, GameProduct game, Campaign campaign) {
		double priceAfterDiscount = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscount() / 100);
		System.out.println(game.getGameName() + " adlý oyun " + player.getFirstName() + player.getLastName()
				+ " adlý kullanýcýya indirimli olarak " + priceAfterDiscount + " fiyatýna satýldý ");
	}

}
