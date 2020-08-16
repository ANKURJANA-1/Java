
public class checkedEvenOdd {
    int value=0;
    checkedEvenOdd(int a)
    {
     value=a;
    }
    public boolean isEven()
    {
      boolean flag;
      if(value%2==0)
      {
          flag=true;
      }
      else{
          flag=false;
      }
      return flag;  
    }
    public boolean isOdd()
    {
      boolean flag;
      if(value%2!=0)
      {
          flag=true;
      }
      else{
          flag=false;
      }
      return flag;  
    }


    public static void main(String []args)
    {
        checkedEvenOdd test=new checkedEvenOdd(5);
        System.out.println(test.isEven());
        System.out.println(test.isOdd());
    }        
}
