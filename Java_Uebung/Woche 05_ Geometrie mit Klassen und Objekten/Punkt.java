
public class Punkt{
private int x;
private int y;
public Punkt(int x, int y){
  this.x=x;
  this.y=y;
}
public void setX(int x){
  this.x=x;  
}

public void setY(int y){
    this.y=y;
}

public int getX(){
   return x;
}
public int getY(){
    return y;
}

public double streckeBis(Punkt ziel) {
  double z;
  double dx=ziel.getX()-getX();
  double dy=ziel.getY()-getY();
  double p =Math.pow(dx,2)+Math.pow(dy,2);
  z=Math.sqrt(p);
  return z;
  }
}
  
   
   