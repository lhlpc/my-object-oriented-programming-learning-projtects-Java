import java.util.Arrays;

public class compareArrays{

public static void main(String [] args)
{
   int [] i1 = {1,3,4,5,2};
   int [] i2 = {1,3,4,5,2,5};
   int [] i3 = {1,3,4,5,2};
   double [] d1 = {1.1,2.2,3.3};
   double [] d2 = {1.1,2.2,4.4,3.3};
   double [] d3 = {1.1,2.2,3.3};
   String [] s1 = {"Jim","Laura","Juliet"};
   String [] s2 = {"Jim","Sue","Laura","Juliet"};
   String [] s3 = {"Jim","Laura","Juliet"};

   if(i1.equals(i3)) System.out.println("i1 equals i3");
   else System.out.println("i1 does not equal i3");

   if(Arrays.equals(i1,i3)) System.out.println("i1 equals i3");
   else System.out.println("i1 does not equal i3");

   if(Arrays.equals(i2,i3)) System.out.println("i2 equals i3");
   else System.out.println("i2 does not equal i3");
   
   if(Arrays.equals(d1,d3)) System.out.println("d1 equals d3");
   else System.out.println("d1 does not equal d3");

   if(Arrays.equals(d2,d3)) System.out.println("d2 equals d3");
   else System.out.println("d2 does not equal d3");

   if(Arrays.equals(s1,s3)) System.out.println("s1 equals s3");
   else System.out.println("s1 does not equal s3");

   if(Arrays.equals(s2,s3)) System.out.println("s2 equals s3");
   else System.out.println("s2 does not equal s3");

}

}
