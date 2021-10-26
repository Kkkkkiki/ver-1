import java.util.ArrayList;

//Money, time double, age, name
public class Student{

  //properties
  private double moneyLeft;
  private int age;
  private String name;
  private ArrayList<Lunch> lunchOrders;


  //constructor
  public Student()
  {
  moneyLeft = 0.0;
  age = 12;
  name = "unknown";
  lunchOrders = new ArrayList<>();
  }
  
  public Student(String newName)
  {
      name = newName;
      lunchOrders = new ArrayList<>();
  }

  public Student(double moneyleft, int ages, String firstname ){
  moneyLeft = moneyleft;
  age = ages;
  name = firstname;
  }

 
 // methods 
  public void orderLunch(String food) {
    Lunch orderLunch = new Lunch(food);
    lunchOrders.add(orderLunch);
  }
   
}