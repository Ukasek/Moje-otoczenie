public class TV {
        public static void main(String[] args) {

                TvDisplay display1 = new TvDisplay();
                display1.color = "black";
                display1.material = "amelinium";
                display1.matrix = "IPS";

                String display1Info = "Color: " + display1.color + " material: " + display1.material + " matrix: " + display1.matrix;
                System.out.println(display1Info);

                TvDisplay display2 = new TvDisplay();
                display2.color = "white";
                display2.material = "plastics ";
                display2.matrix = "AV";

                String display2Info = "Color: " + display2.color + " material: " + display2.material + "matrix: " + display2.matrix;
                System.out.println(display2Info);
        }
}
