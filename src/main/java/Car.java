public class Car  implements Vehicle, Driver, AutomaticPass{


    public String headLightType="led";

    public Car(){
    }


    @Override
    public String throttle() {

        return "speeding up";
    }

    @Override
    public String changeColor(String color) {

        String colorIN="";
        switch (color){
            case "blue":
                colorIN = "blue";
                break;

            case "pink":
                colorIN = "pink";
                break;
        }
        return colorIN;
    }



}
