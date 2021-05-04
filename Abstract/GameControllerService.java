package Abstract;

import Entities.GameProduct;

public interface GameControllerService {
	void addGame(GameProduct game);

	void deleteGame(GameProduct game);

	void updateGame(GameProduct game);

}
