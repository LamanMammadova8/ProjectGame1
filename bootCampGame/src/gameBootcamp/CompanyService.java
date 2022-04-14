package gameBootcamp;

import gameBootcamp.entities.concretes.Game;
import gameBootcamp.entities.concretes.User;

public interface CompanyService {
    void companyAdd(Game game);
    void companyUpdate(Game game);
    void companyDelete(Game game);
}
