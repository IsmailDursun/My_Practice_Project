package day32_tasks;
public class Hobby {
    /*Tasks 1 - Hobby

    Create a class Hobby Food in your Practice_Programming project and inside the da32_tasks package


        Task:

		- data/create instance variables::
			name, annual cost, is outdoors (boolean), requires others (boolean)

		- constructor
			- create a constructor that creates a Hobby object with the name
			- create a constructor that creates a Hobby object with the name and annual cost
			- create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

		- method/create instance methods:
			- dolt ()
				print: Doing $name-of-hobby $outside-or-inside


			- toString ()
				print all the Food information




    Create a class called UsingHobby in your Practice_Programming project and inside the da32_tasks package

	Task:
		create and test the Hobby objects
			- create an ArrayList of Hobby objects
			- create and add a couple Hobby objects
			- iterate through the ArrayList and execute the dolt () method on each Hobby object
			- create a copy ArrayList and remove all outdoors Hobbies
			- create a copy ArrayList and remove all hobbies requiring other people
			- create a copy ArrayList and remove all hobbies that cost more than $500 annually

*/
    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;
    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
    public Hobby(String name){
        this.name = name;
    }
    public Hobby(String name, double annualCost){
        this.name = name;
        this.annualCost = annualCost;
    }
    public Hobby(String name,double annualCost, boolean isOutdoors, boolean requiresOthers){
        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }
    public void doit(){
        System.out.println("Doing "+name+ (isOutdoors?" outdoors":" indoors"));
    }
}
