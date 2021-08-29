package Interface;

public class Main {

    public static void main(String[] args) {
        Shape S1 = new Circle();


        Shape s2 = new Shape() {
            @Override
            public int width(int w) {
                return 0;
            }

            @Override
            public int width(int w, int h) {
                return 0;
            }
        };

        s2.width(56);
    }
}
