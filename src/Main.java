public class Main {
    public static void main
            (String[] args){

                // construindo balões
                Balao b1 = new Balao();

                Balao b2 = new Balao(18, "roxo", "pequeno", 1.56, 15.65, "medio", 4 );
                Balao b3 = new Balao(16, "amarelo", "pequeno", 1.31, 18.92, "medio", 12);

                // construindo pessoa
                Pessoa p1 = new Pessoa("Rayane", "7438328", 795345, 55119433, 551193432, "rua. arco-iris");
                Pessoa p2 = new Pessoa("Ane", "7653456", 439023, 55110349, 551190549, "rua. gramado");

                // construindo piloto
                Piloto pi1 = new Piloto("Ronaldo", "743829", 842394);

    }
}