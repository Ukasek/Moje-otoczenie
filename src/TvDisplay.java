public class TvDisplay {
    String color;
    String matrix;
    String material;

    TvDisplay(String col, String mat, String mate) {
        color = col;
        matrix = mat;
        material = mate;

    }

    void showInfo() {
        System.out.println("Color: " + color + " material: " + material + " matrix: " + matrix);
    }
}
