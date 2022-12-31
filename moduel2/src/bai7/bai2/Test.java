package bai7.bai2;

public class Test {
    public static void main(String[] args) {
        Shape shape[] = new Shape[4];
        shape[0] = new Cricle(5, "Blue", true);
        shape[1] = new Rectangle(2, 1, "yellow", false);
        shape[2] = new Square("Black",true,8);
        shape[3] = new Square("Red",true,2);

        for (Shape s : shape) {
            if (s instanceof Square) {
                ((Square) s).howToColor();
            } else {
                System.out.println(s);
            }
        }

    }
}
