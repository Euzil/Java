import java.lang.Math;

public class ArchitekturTools {
    // *** Fuegen Sie hier Ihre Loesung ein:
     public static double skylineBerechnen(int a,int b,int x) {
	double y;
	y=(0.6*a*Math.cos(Math.pow(x, b)))/(a+3*Math.sin(Math.pow(x, 2)));
	return y;
}
public static char skylineWaehlen(double hoehe) {
	char a=',';
	char b='^';
	char c='~';
	char d;
	if(hoehe<0) {
		d=a;
	}else if(hoehe>1){
		d=b;
	}else {
		d=c;
	}
	return d;
}
public static String skylineZeichnen(int a,int b) {
	String S="";
	for(int x=0;x<=19;x++) {
		S+=skylineWaehlen(skylineBerechnen(a,b,x));
	}
	return S;
}
public static double bauhausSkylineBerechnen(int a,int x) {
	double H;
	char K;
	K=skylineWaehlen(skylineBerechnen(a,5,x));
	if(K=='~') {
		H=0;
	}else {
		H=(2*Math.sin(x+1))/(1+Math.cos(x)*Math.cos(1+a)*Math.sin(Math.pow(x, 2)));
		
	}
return H;
}
    
}
