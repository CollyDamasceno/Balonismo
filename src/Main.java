public class Main {
    public static void main
            (String[] args){

                // construindo balões
                Balao b1 = new Balao();

                Balao b2 = new Balao(18, "roxo", "medio", 1.56, 15.56, "medio", 23 );
                Balao b3 = new Balao(16, "amarelo", "pequeno", 1.31, 18.29, "medio", 8);

                // construindo pessoa
                Pessoa p1 = new Pessoa("Nicolly", "86486893643", 633357, 987560987, 978655885, "rua. duque de caxias");
                Pessoa p2 = new Pessoa("Mía", "9892748904", 738684, 976234541, 988005446, "rua. Santa monica");

                // construindo piloto
                Piloto pi1 = new Piloto("Miguel", "364836288", 736234);

    }
}