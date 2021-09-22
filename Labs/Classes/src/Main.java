public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testRectagle();

        /* Expected output:
        *
        *
        * Width: 5
        * Height: 6
        * Area: 30
        * Perimeter: 22
        *
        * Width: 3
        * Height: 9
        * Area: 27
        * Perimeter: 24
        */
    }

    private void testRectagle() {
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
  
        rectangle.setWidth(-3);
        rectangle.setHeight(9);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
    }
}
