public class Balao {

    private int id;
    private String color;
    private String tipo;
    private double altura;
     private double peso;
    private String porte;
    private int capacidadePessoas;

    public Balao(){}

    public Balao(int id, String color, String tipo, double altura, double peso, String porte, int capacidadePessoas) {
        this.id = id;
        this.color = color;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.porte = porte;
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }
}
