package forma.geometrica;

public class Circulo implements FiguraGeometrica{

    String nome = "Circulo";
    float raio;
    float diametro;
    final float PI= 3.14f;
    float resultado;

    public Circulo(float raio) {
        this.raio = raio;
        this.diametro = raio*2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getPI() {
        return PI;
    }

    public float getResultado() {
        return resultado;
    }


    @Override
    public void getArea() {
        resultado=2*raio*PI;
        System.out.printf("Area do Circulo = %.2f",resultado);
        System.out.println();
    }
}
