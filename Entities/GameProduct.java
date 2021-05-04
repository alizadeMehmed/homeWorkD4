package Entities;

public class GameProduct {
	private int gameId;
	private String gameName;
	private double gamePrice;
	private double gamePriceAfterDiscount;

	public GameProduct() {

	}

	public GameProduct(int gameId, String gameName, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;

	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public double getGamePriceAfterDiscount() {
		return gamePriceAfterDiscount;
	}

	public void setGamePriceAfterDiscount(double gamePriceAfterDiscount) {
		this.gamePriceAfterDiscount = gamePriceAfterDiscount;
	}

}
