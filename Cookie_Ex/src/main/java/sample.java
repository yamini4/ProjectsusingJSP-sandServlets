class Test {
    int x, y;
}
  
// Contains a reference of Test and implements
// clone with deep copy.
class Test2 implements Cloneable {
    int a, b;
  
    Test c = new Test();
  
    public Object clone() throws CloneNotSupportedException
    {
        
        Test2 t = (Test2)super.clone();
  
        t.c = new Test();
  
        return t;
    }
}
public class sample {
	public static void main(String args[])
	        throws CloneNotSupportedException
	    {
	        Test2 t1 = new Test2();
	        t1.a = 10;
	        t1.b = 20;
	        t1.c.x = 30;
	        t1.c.y = 40;
	  
	        Test2 t3 = (Test2)t1.clone();
	        t3.a = 100;
	  
	        // Change in primitive type of t2 will not
	        // be reflected in t1 field
	        t3.c.x = 300;
	  
	        // Change in object type field of t2 will not
	        // be reflected in t1(deep copy)
	        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
	                           + " " + t1.c.y);
	        System.out.println(t3.a + " " + t3.b + " " + t3.c.x
	                           + " " + t3.c.y);
	    }
}
