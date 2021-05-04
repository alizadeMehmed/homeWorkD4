package Entities;

public class Sales {
	private int saleID;
	private GameProduct game;
	private Player player;
	private Campaign campaign;

	public Sales() {

	}

	public Sales(int saleID, GameProduct game, Player player, Campaign campaign) {
		super();
		this.saleID = saleID;
		this.game = game;
		this.player = player;
		this.campaign = campaign;
	}

	public int getSaleID() {
		return saleID;
	}

	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}

	public GameProduct getGame() {
		return game;
	}

	public void setGame(GameProduct game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
