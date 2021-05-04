package Abstract;

import Entities.Player;

public interface PlayerControllerService {
	void join(Player player);

	void delete(Player player);

	void update(Player player);
}
