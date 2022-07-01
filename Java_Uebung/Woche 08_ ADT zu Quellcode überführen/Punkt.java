public class Punkt {
public static double GibX;
public static double GibY;
public Punkt(double X,double Y) {
	this.GibX =X;
	this.GibX=Y;
}
public double gibX() {
	double gibX;
	gibX=Punkt.GibX;
	return gibX;

}
public double gibY() {
	double gibY;
	gibY=Punkt.GibY;
	return gibY;
}

public double entfernungBerechnen(Punkt a) {
	double entfernungBerechnen;
	double i;
	double j;
	i=a.gibX()-gibX();
	j=a.gibY()-gibY();
	entfernungBerechnen=Math.sqrt(i*i+j*j);
	return entfernungBerechnen;
}


public boolean liegtImUrsprung() {
	if(gibX()==0&&gibY()==0) {
	System.out.println();
		return true;
	}
	return false;
	
	
}
public  Punkt addiereHinzu(Punkt a) {
	GibX=a.gibX();
	GibY=a.gibY();
	return a;
}
public boolean istIdentisch(Punkt a) {
	if(gibX()==a.gibX()&&gibY()==a.gibY()) {
		
		return true;
	}
	return false;
}
public Punkt verschiebe(double a, double b) {
	GibX=a;
	GibY=b;
	istIdentisch(verschiebe(a,b));
	return verschiebe(a,b);
	

}
}
