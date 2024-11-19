// Classe principal para executar o programa e testar a lista de histórico de navegação
public class Main {
    public static void main(String[] args) {
        ListaHistorico historico = new ListaHistorico(); // Cria uma nova lista de historico com URLs iniciais

        historico.listar(); // Lista as URLs iniciais

        historico.adicionar("www.fortnite.com"); // funcao pra adicionar uma nova URL ao histórico
        System.out.println("\nApós adicionar uma nova URL:");
        historico.listar(); // listar as URLs depois de adicionar

        historico.remover("www.facebook.com"); // funcao para Remover uma URL especifica do historico
        System.out.println("\nApós remover uma URL:");
        historico.listar(); // listar as URLs depois de remover
    }
}
