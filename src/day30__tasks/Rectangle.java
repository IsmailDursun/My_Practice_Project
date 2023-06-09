package day30__tasks;

public class Rectangle {

/*    Rectangle

    Create a class called Rectangle in your Practice_Programming project and inside the da30_tasks package


    Task:
    create instance variables:
    base, height, perimeter, area

    create instance methods:

            - toString(): [return String]
    returns all the information of the Rectangle objects, including the perimeter and area

   			- calculatePerimeter(): [void]
    calculate the perimeter and store the result into the perimeter instance variable

    a perimeter of a rectangle is the 4 sides added together

    			- calculateArea(): [void]
    calculate the area and store the result into the area instance variable

    an area of a rectangle is the height x width*/
    public double base,
        height,
        perimeter,
        area;
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
     public void calculatePerimeter(){
         System.out.println("Calculating perimeter");
         perimeter = (base*2)+(height*2);
    }
    public void calculateArea(){
        System.out.println("Calculating area");
         area = base*height;
        }
    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
