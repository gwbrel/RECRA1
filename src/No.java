// classe pra representar um nó da lista duplamente encadeada, usamos para poder armazenar uma URL e as
// referências do nó anterior e próximo
public class No {
    String url; // string da URL da página
    No anterior; // referencia que usamos para o nó anterior
    No proximo; // referencia que usamos para o próximo nó


    public No(String url) { // nó parar iniciar com a url fornecida e tambem definindo o nó anterior e proximo como nulo
        // para que ele comece sem conexoes
        this.url = url;
        this.anterior = null;
        this.proximo = null;
    }
}
