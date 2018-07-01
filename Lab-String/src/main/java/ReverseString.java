import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class ReverseString{

public static void main(String... args){

    System.out.println("works");
   System.out.println("running reverseByCharArray(apple): "+ reverseByCharArray("apple"));
   String s= new String();
  s+= reverseByRecursion("arun");
  System.out.println(s);
   System.out.println("Reverse by recursion ended");
   
}
//using for loop
private static String reverseByCharArray(String in)
{
  char[] c= in.toCharArray();
  String s= new String();
  for(int i=c.length-1; i>=0; i--)
    {
     s+= c[i];
    }
return s;
}

//using recursion

private static String reverseByRecursion(String in)
{

    if(in.length() >1)
      { 
return  reverseByRecursion(in.substring(1,in.length())) + String.valueOf(in.charAt(0));
      }
else{
    return in;
}

}

}