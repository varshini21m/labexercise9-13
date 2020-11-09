/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling2;

import java.util.*;
**
 *
 * @author VARSHINI M
 */
public class Manager1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in=new Scanner(System.in);
        String name,qual;
        int age;
        int experience;
         
         
        System.out.print("Enter name: ");
        name= in.nextLine();
         System.out.print("Enter age: ");
        age=in.nextInt();
        System.out.print("Enter experience: ");
        experience =in.nextInt();
        System.out.print("Enter quali ");
        qual= in.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("experience " + experience);
        System.out.println("qualification" + qual);
         try

        {

            Manager2 obj=new Manager2(name,age,qual,experience);

            obj.Check();

        }

        catch(RoleNotApplicableException e)

        {

            System.out.println(e);

        }

    }

}
  class Manager2

{

    String name,qualification;

    int age,experience;

    Manager2(String n,int a,String q,int e)

    {

        name=n;

        age=a;

        qualification=q;

        experience=e;

    }

    void Check() throws RoleNotApplicableException

    {

        char c[]=qualification.toCharArray();

        int b=experience;

        for(int i=0;i<1;i++)

        {

            if(c[i]=='m' && c[i+1]=='b' && c[i+2]=='a')

            {

                System.out.println("");

                break;

            }

            else

            {

                throw new RoleNotApplicableException("NOT ELIGIBLE QUALIFICATION!");

            }

        }

        if(b<10)

        {

            throw new RoleNotApplicableException("NOT ELIGIBLE EXPERIENCE");

        }

        else

        {

            System.out.println("ROLE APPLICABLE");

        }

        System.out.println("QUALIFICATION:"+qualification+"\nEXPERIENCE:"+b);

    }

}

class RoleNotApplicableException extends Exception

{

    String message;

    RoleNotApplicableException(String m)

    {

        super(m);

    }

}      
         
