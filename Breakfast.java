//amount int, cost double, description string, time double, int numbers left for the food
public class Breakfast{

//properties
  private double breakfastCost;
  private String breakfastDescription;
  private double time;
  private int breakfastLeft;

//constructor
public Breakfast(){
breakfastCost = 10.0;
breakfastDescription = "yum";
time = 11.11;
breakfastLeft = 0;
}


  public Breakfast(double cost, String description, double availableTime, int leftAmount)
  {
  breakfastCost = cost;
  breakfastDescription = description;
  time = availableTime;
  breakfastCost = leftAmount;
  }


}