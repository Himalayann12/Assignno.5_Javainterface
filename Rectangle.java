package Interface;
public class Rectangle implements shape {
       private int length;
       private int breadth;
       
       
       public int getlength() {
    	   return length;
       }
       
       public void setlength(int length) {
    	   this.length =length;
} 
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth=breadth;
}

    @Override 
    public void getArea() {
    	System.out.println("enter the breadth for Rectangle");
    	breadth=sc.nextInt();
    	
    	System.out.println("enter the length for Rectangle");
    	breadth=sc.nextInt();
    	
    	int  AreaCircle=length*breadth;
    	System.out.println("Area of Rectangle is:"+AreaCircle);
    }
}

