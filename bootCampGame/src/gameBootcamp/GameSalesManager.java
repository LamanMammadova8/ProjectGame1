package gameBootcamp;

import gameBootcamp.entities.concretes.Game;
import gameBootcamp.entities.concretes.User;

public class GameSalesManager implements GameSalesService{
    @Override
    public void saleGame(User user, Game game) {
        System.out.println("Oyun satışı uğurla başa çatdı! "+ "oyun adi:  "+game.getGameName()+"...oyuncu adi: "+user.getFirstName());
    }

    @Override
    public void companySalesGame(User user, Game game) {
        if (game.getGamePrice()>0){
            System.out.println("Oyun kampaniyaya uyğundur: "+game.getGameId());
            saleGame(user, game);
            return;
        }
        else{
            System.out.println("Bu oyuna kampaniya tetbiq olunmus halda satila bilmez");
            saleGame(user,game);
        }
    }
}
