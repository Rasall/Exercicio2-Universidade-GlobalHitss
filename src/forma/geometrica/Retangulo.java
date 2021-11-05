package forma.geometrica;

public class Retangulo implements FiguraGeometrica{

    String nome = "Triangulo";
    float base;
    float altura;
    float resultado;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        resultado = (base * altura) ;
        System.out.printf("Area do Retangulo = %.2f",resultado);
        System.out.println();
    }


}
