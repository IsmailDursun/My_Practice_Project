package day33_tasks;
/*Tasks 1 - Square

    Create a class called Square in your Practice_Programming project and inside the da33_tasks package


        Task:

		- data/create instance variables:
			side

		- constructor
			- create a constructor that creates a Square object with the side
				call setter here

        	- encapsulate the Square class
        		- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

		- other methods methods:
	            	- calculateArea()
  				calculate and return the area of a Square

           	 - calculatePerimeter()
  			calculate and return the perimeter of a Square

            	- toString()
                	print the side, area, and perimeter of the Square object


		Create a separate class to create and test the Square objects
*/
public class Square {
    private int side;

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "\ncalculatedArea="+side*side+"\ncalculatedPerimeter="+side*4+'}';
    }

    public Square(int side){
        setSide(side);
    }
    public void setSide(int side){
        if(side>0){
            this.side = side;
        }
    }
    public int getSide(){
        return side;
    }
    public int calculateArea(){
        return side*side;

    }
    public int calculatePerimeter(){
        return 4*side;
    }


}
