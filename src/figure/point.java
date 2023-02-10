package figure;

public class point {
	public int x;
    public int y;

    public point(int x, int y) 
    {
        this.x=x;
        this.y=y;
        
    }


    public String toSting ()
    {
        return"point(" +x+ "," +y+")";
    }
   public double distance(point p) { 
	   int a=p.x-this.x;
	   int b=p.y-this.y;
	   return (Math.sqrt(a*a+b*b));
	   }
}
