package forma.geometrica;

public class MainFiguraGeometrica {

    public static void main(String[] args) {


        Triangulo tri1 = new Triangulo(52f, 23f);
        Retangulo ret1 = new Retangulo(12f, 20f);
        Circulo cir1 = new Circulo(15f);

        cir1.getArea();
        ret1.getArea();
        tri1.getArea();
    }

}
