import java.util.*;


public class Lunch{
  //properties
  private double lunchcost;
  private String lunchDescription;
  private double time;
  private int lunchLeft;
  private String lunchName;

//constructor
public Lunch(){
lunchcost = 10.0;
lunchDescription = "yum";
time = 11.11;
lunchLeft = 0;
}

public Lunch(String food){
   lunchName = food;
  }
//methods
public Lunch(double costz, String descrip, double timing, int lLeft)
{
  costz = lunchcost;
  descrip = lunchDescription;
  timing = time;
  lunchLeft = lLeft;
}



}

