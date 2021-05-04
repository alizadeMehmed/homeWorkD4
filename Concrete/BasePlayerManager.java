package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerControllerService;
import Entities.Player;

public class BasePlayerManager implements PlayerControllerService {

	PlayerCheckService playerCheckSrv;

	public BasePlayerManager(PlayerCheckService playerCheckSrv) {
		super();
		this.playerCheckSrv = playerCheckSrv;
	}

	@Override
	public void join(Player player) {
		if (playerCheckSrv.checkIfRealPerson(player)) {
			System.out.println("Oyuncu sisteme kaydedildi: " + player.getFirstName());
		} else {
			System.out.println("Oyuncu bilgileri hatalý");
		}

	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu sistemden silindi" + player.getFirstName());
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu sistemden silindi" + player.getFirstName());
	}
}
