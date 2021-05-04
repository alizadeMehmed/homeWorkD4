package Abstract;

import Entities.*;

public interface GameSalesService {
	void sellGame(Player player, GameProduct game);

	void sellwCampaign(Player player, GameProduct game, Campaign campaign);
}
