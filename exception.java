/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
**
 *
 * @author VARSHINI M
 */


import java.util.*;
public class exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        System.out.println ("enter your choice");
        Scanner obj=new Scanner(System.in);
        int ch=obj.nextInt();
        switch(ch){
                        case 1:
            {
                try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
           break; 
        }}
                
                case 2:
                {
                    try{
        int a[]=new int[10];
        //Array has only 10 elements
        a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
         break;
      }
                }
                case 3:
                {
                    try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
                case 4:
                {
                    try{
	 String str="sheisgoodgirl";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
          break;
      }
                    
        }
        default:
                {
                    System.out.println("invalid exeception");
                    break;
                }
        
        }
    }
}

    
        
    
    
    




    


                 

        
    




        
                
                
        
    


                   
    
                
                
                
                
            
            
    
    

