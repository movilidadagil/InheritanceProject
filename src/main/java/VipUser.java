public class VipUser extends VehicleInheritance{



    public VipUser(){
        changeColor("blue");
    }

    @Override
    public void changeColor(String color) {
        super.changeColor(color);
        colorExtended = "bize ne oldu";
    }
}
