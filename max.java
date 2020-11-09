package lab12;
/*
 *
 * @author VARSHINI M
 */


public class maxvalue {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] arr1={104,587,69,54,7};
        Double[] arr2={14.9,38.9,98.47,36.3,5.4};
        //Integer v=Min(arr1);
        //Double v1=Min(arr2);
        maxx<Integer> iobj=new maxx<Integer>(arr1);
        maxx<Double> dobj=new maxx<Double>(arr2);
        Integer v=iobj.Max();
        Double v1=dobj.Max();
        System.out.println("Minimum of integer array : "+v);
        System.out.println("Minimum of double array : "+v1);
        
    }
}

class maxx<t extends Number>{
  t arr[];
  t max;
  maxx(t ar[])
  {
   arr=ar;
  }
  t Max()
  {
      max=arr[0];
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i].intValue()>max.intValue())
        {
          max=arr[i];
        }
      }
   return max;
  }     
}