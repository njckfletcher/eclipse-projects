package quadraticclass;

public class QuadraticRunner
{
  
  public static void main(String[] args)
  {
    
    Quadratic test1 = new Quadratic(1, 5, 6);
    Quadratic test2 = new Quadratic(1, -4, 4);
    Quadratic test3 = new Quadratic(1, 0, 3);
    
    String equation1 = test1.toString();
    boolean hasSolution1 = test1.hasSolutions();
    double solution1 = test1.getSolution1();
    double solution1b = test1.getSolution2();
    
    String equation2 = test2.toString();
    boolean hasSolution2 = test2.hasSolutions();
    double solution2 = test2.getSolution1();
    double solution2b = test2.getSolution2();
    
    String equation3 = test3.toString();
    boolean hasSolution3 = test3.hasSolutions();
    double solution3 = test3.getSolution1();
    double solution3b = test3.getSolution2();
    
    
    System.out.println("Equation: " + equation1);
    System.out.println("This equation has a solution: " + hasSolution1);
    System.out.println("The first solution is " + solution1);
    System.out.println("The second solution is " + solution1b);
    System.out.println("Expected solutions: -2.0, -3.0");
    
    System.out.println();
    
    System.out.println("Equation: " + equation2);
    System.out.println("This equation has a solution: " + hasSolution2);
    System.out.println("The first solution is " + solution2);
    System.out.println("The second solution is " + solution2b);
    System.out.println("Expected solution: 2.0");
    
    System.out.println();
    
    System.out.println("Equation: " + equation3);
    System.out.println("This equation has a solution: " + hasSolution3);
    System.out.println("The first solution is " + solution3);
    System.out.println("The second solution is " + solution3b);
    System.out.println("Expected solution: NaN");
  }
}