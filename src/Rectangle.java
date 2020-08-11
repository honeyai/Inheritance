public class Rectangle {
  double width;
  int length;

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public double getArea(int w, int l){
    return w * l;
  }
  public Rectangle(double width, double length) {
    if(width < 0){
      this.width = 0;
    } else if (length < 0){
      this.length= 0;
    } else {
      this.width = width;
      this.length = (int) length;
    }
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5,10);
    System.out.println("rectangle width: " + rectangle.getWidth());
    System.out.println("rectangle length: " + rectangle.getLength());
    System.out.println("rectangle area: " + rectangle.getArea((int) rectangle.width, rectangle.length));
  }
}
