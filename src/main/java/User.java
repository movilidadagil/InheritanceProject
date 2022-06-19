import java.sql.SQLOutput;

public class User {
    public String email;
    public String pass;

    public Car car;
    public Boat boat;

    public User(){

    }

    public User(String email, String pass){
        this.email = email;
        this.pass =  pass;
    }

    public User(String pass){
        this.pass = pass;
    }

   // User user1 = new User("sevcan","12345","mercedes");

    public User(String user, String pass, String model){
        this.email = user;
        this.pass = pass;
        this.car = new Car();
        this.boat = new Boat();
        this.car.changeColor("blue");
    }


    public int getUserAge(String name){
        return 10;
    }

    public int getUserAge(String name, String surname){
        return 10;
    }


}
