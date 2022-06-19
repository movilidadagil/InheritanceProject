import encapsulatedPackage.Encapsulation;

public class InterfaceMain {


    public String turnOn;
    public String status="off";
    //üst sınıftan belli özellikler alıyor alttaki sınıf
    //ailemizden genleri alıyoruz
    //üst sınıftan özellikleri kendi sınıfıma alıyorum

    public static void main(String[] args){

        User user = new User();
        user.email = "ahmetmehmet";
        user.pass = "13455";
        user.car = new Car();
        System.out.println(user.car);


        User user1 = new User("sevcan","12345","mercedes");
     /*   System.out.println("*********************");
        //mercedes
        System.out.println(user1.car.model);
        //1990
        System.out.println(user1.car.modelYear);
        //red
        System.out.println(user1.car.color);*/

      /*  System.out.println(user1.car.headLightType);

        System.out.println("****************");
        //hiçbişey yazmaz
        System.out.println(user1.boat.model);
        //hiçbişey yazmaz
        System.out.println(user1.boat.modelYear);
        //hiçbişey yazmaz
        System.out.println(user1.boat.color);*/



        System.out.println("**************");
   /*     System.out.println(user1.email);
        System.out.println(user1.pass);

        user1.car.throttle();
*/
     /*   VehicleInheritance vehicleInheritance = new VehicleInheritance();
        System.out.println(vehicleInheritance.colorExtended);
        VipUser vipUser = new VipUser();*/
        //System.out.println(vipUser.color);
        //System.out.println(vipUser.colorExtended);


        /*VipUser vipUser = new VipUser();
        System.out.println(vipUser.colorExtended);
        System.out.println(vipUser.modelExtended);
        System.out.println(vipUser.modelYearExte);
        vipUser.changeColor("pink");
        System.out.println(vipUser.colorExtended);*/
        Bike bike = new Bike();
        bike.yakit();
        BikeInheritant bikeInheritant = new BikeInheritant();
        bikeInheritant.yakit();


        Encapsulation encapsulation = new Encapsulation();

       // System.out.println(encapsulation.name);
      //  System.out.println(encapsulation.surname);
      //  System.out.println(encapsulation.middleName);

    }





}
