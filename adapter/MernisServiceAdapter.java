package adapter;

import Abstract.PlayerCheckService;
import Entities.Player;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		String tcKimlik = player.getNationalID();
		String frtName = player.getFirstName();
		String lstName = player.getLastName();
		int date = player.getBirthDate();

		return true;
	}
}
