public class Drink{
  //properties
  private double drinkcost;
  private String drinkDescription;
  private double time;
  private int drinkLeft;

  //constructor
  public Drink(){
  drinkcost = 10.0;
  drinkDescription = "yum";
  time = 11.11;
  drinkLeft = 0;
}

public Drink(double costs, String des, double timee, int leftdrink)
{
  drinkcost = costs;
  drinkDescription = des;
  time = timee;
  drinkLeft = leftdrink;
}
}