package day32_tasks;

public class Food {

    String name;
    int quantity;
    double unitPrice, totalPrice;

    public Food(String name){
        this.name = name;
    }
    public Food(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public void calculatePrice(){
        totalPrice = unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
