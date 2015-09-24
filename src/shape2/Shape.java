package shape2;



public class Shape {



  protected Point center;

   

  public Shape(Point center) {

  this.center=center;

  }

//Implement here

  public Point getCenter() {

  return center;

  }

  public Rectangle getBounds() {

  return null;

  }

  public void draw(Graphics g) {

  }

}

