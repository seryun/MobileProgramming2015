package shape2;



public class Rectangle extends Shape{


private int h;
private int w;


public Rectangle(Point center, int w, int h) {
	// TODO Auto-generated constructor stub
super(center);
this.w=w;
this.h=h;
}


public int getHeight() {

return h;

}

public int getWidth() {

return w;

}

public Rectangle getBounds() {

return this;

}

@Override

public void draw(Graphics g) {

g.draw(this);

}

@Override

public String toString() {

return "Rectangle";

}

}

