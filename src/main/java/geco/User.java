package geco;

public class User {

    public User(){

    }

    public String getRandomPassword(){
        PasswordGeneration pass = new PasswordGeneration();
        return pass.generateRandomPassword();
    }
}
