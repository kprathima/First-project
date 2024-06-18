public class circle {

    public circle(double radius) {
        this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    public void set(double radius) {
        this.radius = radius;

    }

    public double getarea() {
        return math.PI * radius * radius;
    }

    public double getcircumference() {
        return 2 * math.PI * radius;
    }

}