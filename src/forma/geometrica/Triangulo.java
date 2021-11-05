package forma.geometrica;

public class Triangulo implements FiguraGeometrica {

    String nome = "Triangulo";
    float base;
    float altura;
    float resultado;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void getArea() {
        resultado = (base * altura) / 2;
        System.out.printf("Area do triangulo = %.2f",resultado);
        System.out.println();
    }


}
