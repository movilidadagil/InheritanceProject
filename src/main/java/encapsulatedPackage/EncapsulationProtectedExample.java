package encapsulatedPackage;

public class EncapsulationProtectedExample {

    public static  void main(String[] args){
    Encapsulation encapsulation = new Encapsulation();
    System.out.println(encapsulation.name);
    System.out.println(encapsulation.surname);
    System.out.println(encapsulation.middleName);

    BeyzeEncapsulation beyzeEncapsulation = new BeyzeEncapsulation();
    System.out.println(beyzeEncapsulation.beyzaNAme);
        System.out.println(beyzeEncapsulation.getBeyzaPrivateName());
        beyzeEncapsulation.setBeyzaPrivateName("anyway");
        System.out.println(beyzeEncapsulation.getBeyzaPrivateName());
      /*
      public
      private
      protected
      private protected
       */
}
}
