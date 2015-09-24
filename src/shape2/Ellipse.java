package shape2;

public class Ellipse extends Shape {

//Implement here

private int w;
private int h;


 public Ellipse(Point center, int w, int h) {
	// TODO Auto-generated constructor stub
	 super(center);
	 this.w=w;
	 this.h=h;
}

public Rectangle getBounds(){
   return new Rectangle(center, w*2, h*2);
}

public int getSemiMajorAxis() {
    return 0;
}

public int getSemiMinorAxis() {
    return 0;
  }



@Override

public void draw(Graphics g) {
   g.draw(this);
 }

@Override

public String toString() {

return "Ellipse";

   }

}