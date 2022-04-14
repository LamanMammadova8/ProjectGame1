package gameBootcamp;

import gameBootcamp.entities.concretes.Game;
import gameBootcamp.entities.concretes.User;

public interface GameSalesService {
    void saleGame(User user, Game game);
    void companySalesGame(User user, Game game);
}
