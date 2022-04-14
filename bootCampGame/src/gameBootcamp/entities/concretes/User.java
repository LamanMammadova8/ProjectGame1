package gameBootcamp.entities.concretes;

import gameBootcamp.entities.abstracts.Entity;

import java.util.Date;

public class User implements Entity {
    private int id;
    private int age;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
    private String dateOfBirth;

    public User(){
    }
    public User(int id,int age, String nationalId, String firstName, String lastName, String email, String passWord, String dateOfBirth){
        this.id=id;
        this.age=age;
        this.nationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.passWord=passWord;
        this.dateOfBirth=dateOfBirth;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
