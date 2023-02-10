package figure;

public class cercle {
	 private point centre;                   
     private double rayon; 

     public cercle(point c,double r)
     {
    	 this.centre=c;
    	 this.rayon=r;
     }
     public cercle(point c,point p)
     {
        this.centre = c;
        this.rayon=centre.distance(p);
     }
     public double getsurface() {
    	 return Math.PI*rayon*rayon;
     }
     public double getperimetre() {
    	 return 2*Math.PI*rayon;
     }
     public boolean appartient(point p) {
    	 double d=centre.distance(p);
    	 return(d<=rayon);
     }
    public String toSting() {
    	return ("cercle("+centre.x+","+centre.y+","+rayon+")");
    }
    
    public void afficher() {
    	System.out.println("Cercle de centre ( "+centre.x+","+centre.y+") et de rayon "+rayon);
    }
}
