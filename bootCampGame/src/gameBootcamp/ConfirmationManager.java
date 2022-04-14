package gameBootcamp;

import gameBootcamp.entities.concretes.User;

public class ConfirmationManager implements ConfirmationService{
    @Override
    public void userConfirmation(User user) {
        if (user.getAge()<13){
            System.out.println("Istifadeci oyuna daxil ola bilmez: "+user.getFirstName());
            return;
        }
    }
}
