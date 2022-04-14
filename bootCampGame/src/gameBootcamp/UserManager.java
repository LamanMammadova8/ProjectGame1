package gameBootcamp;

import gameBootcamp.entities.concretes.User;

public class UserManager implements UserService{
    private  User user;
    public UserManager(){

    }
    public UserManager(User user){
        this.user=user;
    }
    @Override
    public void addUser(User user) {
        if (user.getId()<=1){
            System.out.println("Istifadəçi daxil ola bilmir");
            return;
        }
        else{
            System.out.println("Istifadeci sisteme daxil oldu: "+user.getFirstName()+" "+user.getLastName());
        }

    }

    @Override
    public void updateUser(User user) {
        System.out.println("Istifadeci melumatlari yenilendi");
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("Istifadeci melumatlari silindi:"+user.getEmail());
    }
}
