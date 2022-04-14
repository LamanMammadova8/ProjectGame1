package gameBootcamp;


import gameBootcamp.entities.concretes.Game;

public class CompanyManager implements CompanyService{


    @Override
    public void companyAdd(Game game) {
        if (game.getGamePrice()>2){
            System.out.println("Yeni kampaniya elave edildi:"+game.getGameName());
        }
        else{
            System.out.println("Kampaniya Sertleri duzgun deyil");
        }
    }

    @Override
    public void companyUpdate(Game game) {
        System.out.println("Kampaniya şertleri yenilendi: "+game.getGameName());
    }

    @Override
    public void companyDelete(Game game) {
        System.out.println("Kampaniya silindi: "+game.getGameName()
        );
    }
}
