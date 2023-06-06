public class Main {
    public static void main(String[] args){
        //criar objetos
        Pessoa Eduardo = new Pessoa();
        Pessoa Fernanda= new Pessoa();
        Pessoa Sara = new Pessoa();
        Pessoa Marcos = new Pessoa();

        //Declaração de objeto

        Pessoa qualquer;

        //Instaciação de objetos
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();

        qualquer.nome = "Eduardo";
        //Definir  comportamento do Objeto
         qualquer.voa();
         qualquer.voa("Pessoa viaja");
         //criar objeto piloto
        Piloto MariaJulia = new Piloto();
        //definir forma
        qualquer.nome = "MariaJulia";
        //definir comportamento
        Piloto.pilotar();
        Piloto.pilotar("Piloto pilota");
        //criar objeto balao
        Balao = new Balao();
        //definir objeto
        Balao = "123455";
        //definir comportamento
        Balao.voa();
        Balao.voa("Voar");



    }
}