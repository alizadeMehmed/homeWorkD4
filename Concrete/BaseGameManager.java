package Concrete;

import Abstract.GameControllerService;
import Entities.GameProduct;

public class BaseGameManager implements GameControllerService {

	@Override
	public void addGame(GameProduct game) {
		System.out.println(" Oyun eklendi: " + game.getGameName());
	}

	@Override
	public void deleteGame(GameProduct game) {
		System.out.println(" Oyun silindi: " + game.getGameName());
	}

	@Override
	public void updateGame(GameProduct game) {
		System.out.println(" Oyun güncellendi: " + game.getGameName());

	}

}
