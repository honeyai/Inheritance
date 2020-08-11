public class Cuboid extends Rectangle{
  double height;

  public Cuboid(double width, double length, double height) {
    super(width, length);
    if(height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getHeight() {
    return height;
  }
  public double getVolume() {
    return getArea((int) width, length) * height;
  }

  public static void main(String[] args) {
    Cuboid cuboid = new Cuboid(5,10,5);
    System.out.println("cuboid width: " + cuboid.getWidth());
    System.out.println("cuboid length: " + cuboid.getLength());
    System.out.println("cuboid area: " + cuboid.getArea((int) cuboid.width, cuboid.length));
    System.out.println("cuboid height: " + cuboid.getHeight());
    System.out.println("cuboid volume: " + cuboid.getVolume());
  }
}
