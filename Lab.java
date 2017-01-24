import java.util.*;


public class Lab
  
{
 public static void main(String[]args){
  Scanner input=new Scanner(System.in);

  System.out.println("Please enter the first number:");
  double first= input.nextDouble();

  System.out.println("Please enter the second number:");
  double second=input.nextDouble();

  System.out.println("Please enter the expression type:");
  String expression=input.next();
  System.out.println("The two number are: "+first +" "+ second);
  if(expression.equalsIgnoreCase("+"))
   System.out.println(addition(first,second));
  if(expression.equalsIgnoreCase("-"))
   System.out.println(subtraction(first,second));
  if(expression.equalsIgnoreCase("*"))
   System.out.println(multiplication(first,second));
  if(expression.equalsIgnoreCase("/"))
   System.out.println(division(first,second));
  else
    System.out.println("Erro! Sorry the results can't be displayed");
 }


 public static double addition(double first, double second){


  return(first+second); 
 }
 public static double subtraction(double first, double second){


  return(first-second); 
 }
 public static double multiplication(double first, double second){


  return(first*second); 
 }
 public static double division(double first, double second){

  if(first==0)
   return -1;
  else
   return(first/second); 
 }
}