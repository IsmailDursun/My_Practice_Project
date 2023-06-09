package day33_tasks;

public class Pizza {
    private String size;
    private int toppings;

    public Pizza(String size, int toppings){
        setSize(size);
        setToppings(toppings);
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }else {
            System.out.println("Not correct size");
        }
    }
    public int getToppings(){
        return toppings;
    }
    public void setToppings(int toppings){
        if(toppings>0){
            this.toppings = toppings;
        }else{
            System.out.println("The number can not be less than zero.");
        }
    }
    public double calculatePrice(){
        double price = 0;
        if(size.equalsIgnoreCase("small")){
            price = 10 + (toppings*0.5);
        }else if(size.equalsIgnoreCase("medium")){
            price = 12 + (toppings*0.5);
        }else if(size.equalsIgnoreCase("large")){
            price = 14 + (toppings*0.5);
        }
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", toppings=" + toppings +
                "Total price $"+calculatePrice()+
                '}';
    }
}
