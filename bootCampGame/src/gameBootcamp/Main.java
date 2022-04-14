package gameBootcamp;

import gameBootcamp.entities.concretes.Game;
import gameBootcamp.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user=new User(4,22, "83748374","Leman","Memmedova","Mamadova@gmail.com", "3897", "30/07/2000");
        User user1=new User(2,12,"948593","Zeyneb", "Seyidova","zeyidova@mail.ru","zz8934","28/09/2010");
        User user2=new User(0,23,"84392","Mansuma", "Mammedova", "mansuma@gmail.com", "8935","08/07/1999");
        UserService userService = new UserManager();
        userService.addUser(user);

        System.out.println("******************************");
        ConfirmationService confirmationService=new ConfirmationManager();
        confirmationService.userConfirmation(user);
        confirmationService.userConfirmation(user1);
        confirmationService.userConfirmation(user2);
        System.out.println("**************************************************");


        Game game=new Game(643,"Miracle birdy",1);
        Game game1=new Game(287,"Crimson", 84);
        Game game2=new Game(37,"Ballistic Missiles", 56);
        GameSalesService gameSalesService=new GameSalesManager();
        gameSalesService.saleGame(user,game1);
        gameSalesService.saleGame(user1,game2);
        System.out.println("***************************************************");

        CompanyService companyService=new CompanyManager();
        companyService.companyAdd(game);
        companyService.companyUpdate(game1);
        companyService.companyDelete(game2);




    }

}
