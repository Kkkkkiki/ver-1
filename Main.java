import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
  System.out.println("Welcome to the Eatrium pre-ordering system.");
  Scanner userInput = new Scanner(System.in); //new scanner
  ArrayList<Breakfast> arlistb = new ArrayList<Breakfast>(); 
  ArrayList<Lunch> arlistl = new ArrayList<Lunch>(); 
  ArrayList<Snack> arlists = new ArrayList<Snack>(); 
  ArrayList<Drink> arlistd = new ArrayList<Drink>(); 
  ArrayList<Student> arlistst = new ArrayList<Student>();
  ArrayList<String>arlistnames = new ArrayList<String>();
  String input = "";
  
  while(!input.toLowerCase().equals("exit"))//stop when user types exit
  {
    System.out.println( "What's your name?" );
    String name = userInput.next(); //read input and store it
    if (!arlistnames.contains(name)){
      arlistst.add(name);
    }
    else{
      System.out.println( "Welcome!" + name );
      
    }
    Student currStudent = new Student(name);
    
  System.out.println("What would you like to have today?");
  input = userInput.next(); 

  if(input.toLowerCase().equals("lunch"))// Check the input
    {
      ArrayList<String> orderedlunch = new ArrayList<>();
      String[] menul = {"Fries", "hamburger" ,"fried chicken"};
      // show menu

      for (int i = 0; i < menul.length; i++) {
        String iteml = menul[i];
        System.out.println(i + 1 + ":" + iteml);
      }
      // user order
      
      Lunch currLunch = new Lunch();
      arlistl.add(currLunch);
      
      while (true){
        System.out.println("Please input your order number(0 to exit");
        int dishNumber = userInput.nextInt();
      //Choosing the number of dish by entering a number
        orderedlunch.add(menul[dishNumber - 1]);
  
        if (dishNumber == 0) {
          break;
        }
        else {
          currStudent.orderLunch(menul[dishNumber - 1]);
        }
            
      }
      
    }

  else if(input.toLowerCase().equals("breakfast"))
    {
      input = userInput.next();
      Breakfast currfast = new Breakfast();
      arlistb.add(currfast);

       ArrayList<String> orderedbreakfast = new ArrayList<>();
      String[] menub = {"soy milk","bread","sausage break", "sunshine egg"};
      // show menu

      for (int i = 0; i < menub.length; i++) {
        String itemb = menub[i];
        System.out.println(i + 1 + ":" + itemb);
      }
      // user order
      
      Breakfast currBreakfast = new Breakfast();
      arlistb.add(currBreakfast);
      
      while (true){
        System.out.println("Please input your order number(0 to exit");
        int dishNumber = userInput.nextInt();
      //Choosing the number of dish by entering a number
        orderedbreakfast.add(menub[dishNumber - 1]);
  
        if (dishNumber == 0) {
          break;
        }
        else {
          currStudent.orderLunch(menub[dishNumber - 1]);
        }
      }
    }
  else if(input.toLowerCase().equals("snack"))
    {
      input = userInput.next();
      Snack currsnack = new Snack();
      arlists.add(currsnack);
    } 

  else if(input.toLowerCase().equals("drink"))
    {
      input = userInput.next();
      Drink currdrink = new Drink();
      arlistd.add(currdrink);
    } 

  else if(input.toLowerCase().equals("student"))
    {
      input = userInput.next();
      Student currstudent = new Student();
      arlistst.add(currstudent);
    } 

  }

  if(input.toLowerCase().equals("show breakfast")) // showing breakfast
  {
    System.out.println("what you have ordered are:");
  }

  else if(input.toLowerCase().equals("show lunch"))
  {
    System.out.println("what you have ordered are:");
  }

  else if(input.toLowerCase().equals("show snack"))
  {
    System.out.println("what you have ordered are:");
  }
  
  else if (input.toLowerCase().equals("show ed"))
  {
    System.out.println("That's all you ordered");
    System.out.println( arlistl );
  }

System.out.println("bye bye!"); //send when loop isn't running
  }
}
