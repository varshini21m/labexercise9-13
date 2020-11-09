package lab12;

import java.util.Scanner;
**
 *
 * @author VARSHINI M
 */
public class arraygeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Integer arr[]=new Integer[100];
        Integer capacity=100;
        System.out.println("Enter number of elements in array  : ");
        Integer n=obj.nextInt();
        System.out.println("Enter the elements os the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Array before insertion : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        arraygen<Integer> io=new arraygen<Integer>(arr,n,capacity);
        System.out.println("\nOPERATIONS CHOICES");
        System.out.println("1-->Add element in beginning");
        System.out.println("2-->Add element in middle");
        System.out.println("3-->Add element in end");
        System.out.println("4-->Delete element in given position");
        System.out.println("Enter choice : ");
        int choice=obj.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter the value to be added in the beginning : ");
                Integer k=obj.nextInt();
                n=io.insertbegin(k);
                io.printarray(n);
                break;
            }
            case 2:
            {
                System.out.println("Enter the value to be added in the middle : ");
                Integer k=obj.nextInt();
                n=io.insertmiddle(k);
                io.printarray(n);
                break;
            }
            case 3:
            {
                System.out.println("Enter the value to be added in the end : ");
                Integer k=obj.nextInt();
                n=io.insertend(k);
                io.printarray(n);
                break;
            }
            case 4:
            {
                System.out.println("Enter the position of element to be deleted : ");
                Integer p=obj.nextInt();
                n=io.delpos(p);
                io.printarray(n);
                break;
            }
            default:

        }
    }

}
class arraygen<T extends Number>
{
    T arr[],n,key,cap;
    arraygen(T a1[],T no,T c)
    {
        arr=a1;
        n=no;
        cap=c;
    }
    int insertbegin(T k)
    {
        key=k;
        for(int i=n.intValue()-1;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=key;
        int c=n.intValue()+1;
        return c;
    }
    int insertmiddle(T k)
    {
        key=k;
        for(int i=n.intValue()-1;i>=n.intValue()/2;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[n.intValue()/2]=key;
        int c=n.intValue()+1;
        return c;
    }
    int insertend(T k)
    {
        key=k;
        if(n.intValue()>=cap.intValue())
        {
            System.out.println("Array full");
            return n.intValue();
        }
        arr[n.intValue()]=key;
        int c=n.intValue()+1;
        return c;
    }
    int delpos(T pos)
    {
        if(pos.intValue()>n.intValue() || pos.intValue()<0)
        {
            System.out.println("Invalid position");
            return n.intValue();
        }
        for(int i=pos.intValue();i<n.intValue()-1;i++)
        {
            arr[i]=arr[i+1];
        }
        int c=n.intValue()-1;
        return c;
    }
    void printarray(T no)
    {
        System.out.println("Printing array : ");
        for(int i=0;i<no.intValue();i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
} 