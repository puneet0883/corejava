package ExDesignpatterns;

// Implementor
interface Color {
    String getColorType();
}

// Concrete Implementor
class Blue implements Color{

    @Override
    public String getColorType() {
        return "Blue";
    }
}

// Concrete Implementor
class Green implements Color {

    @Override
    public String getColorType() {
        return "Green";
    }
}

abstract class Shape {
    String type;
    Color color;

    public Shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }


}

// Refined Abstraction
class Trianglee extends Shape {
    String specification;

    public Trianglee(Color color) {
        super("Triangle", color);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}

// Refined Abstraction
class Squaree extends Shape {


    public Squaree(Color color) {
        super("Square", color);

    }
    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}


        public class ExBridge {
            public static void main(String[] args) {

                Trianglee blue = new Trianglee(new Blue());
                Trianglee green = new Trianglee(new Green());

                System.out.println(blue);
                System.out.println(green);

                Squaree greene = new Squaree(new Green());
                System.out.println(greene);

            }

}
