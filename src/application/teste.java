package application;

import figure.cercle;
import figure.point;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        point p1=new point (100,100);
        point p2=new point (200,200);
        point p3=new point (130,100);
        point p4=new point (120,100);
		cercle c1=new cercle(p1,p2);
		cercle c2=new cercle(p3,40);
		System.out.println("le perimetre du cercle de coordonnee "+c1.toSting()+" est :"+c1.getperimetre()+" et la surface est:"+c1.getsurface());
		System.out.println("le perimetre du cercle de coordonnee "+c2.toSting()+" est :"+c2.getperimetre()+" et la surface est:"+c2.getsurface());
		if ((c1.appartient(p4)==true)&&(c2.appartient(p4)))
		System.out.println("le point de coordonnee("+p4.x+","+p4.y+") appartient aux deux cercles");
		else
		System.out.println("le point de coordonnee("+p4.x+","+p4.y+") n'appartient pas aux deux cercles");
	}
}