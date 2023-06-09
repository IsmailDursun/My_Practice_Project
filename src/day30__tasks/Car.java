package day30__tasks;

public class Car {

    int year, fuelLevel;
    String color,model;

    public Car(String model, int year, int fuelLevel, String color){
            this.model = model;
            this.year = year;
            this.fuelLevel = fuelLevel;
            this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", fuelLevel=" + fuelLevel +
                ", color='" + color + '\'' +
                ", isLow="+isLow()+
                '}';
    }

    public void drive(){
        System.out.println("Driving "+model);
        fuelLevel -= 25;
    }
    public void fillTank(){
        System.out.println("Filling tank");
        fuelLevel += 100-fuelLevel;
    }
    public boolean isLow(){
        if(fuelLevel<50){
            System.out.println("Gas level is low");
            fillTank();
            return true;
        }else{
            return false;
        }
    }

}
