package encapsulated;

import encapsulatedPackage.BeyzeEncapsulation;
import encapsulatedPackage.Encapsulation;

public class EncapsulationExample {

  public static  void main(String[] args){
      Encapsulation encapsulation = new Encapsulation();
      //System.out.println(encapsulation.name);
      //System.out.println(encapsulation.surname);
      //System.out.println(encapsulation.middlename);

      BeyzeEncapsulation beyzeEncapsulation = new BeyzeEncapsulation();
      System.out.println(beyzeEncapsulation.beyzaNAme);
      /*
      public
      private
      protected
      private protected
       */
  }
}
