public class ListaHistorico {
    private No cabeca; // referencia que usamos para o primeiro nó da lista
    private No cauda;  // referencia que usamos para o último nó da lista

    // classe que inicializa o histórico com as urls que o professor sugeriu
    public ListaHistorico() {
        // array contendo URLs iniciais que serão adicionadas ao histórico
        String[] urlsIniciais = {
                "www.google.com",
                "www.facebook.com",
                "www.youtube.com",
                "www.twitter.com",
                "www.instagram.com",
                "www.chatgpt.com",
                "www.github.com",
                "www.stackoverflow.com",
                "www.reddit.com",
                "www.wikipedia.org"
        };

        // Adiciona cada URL inicial à lista, utilizando o método 'adicionar'
        for (String url : urlsIniciais) {
            adicionar(url);
        }
    }

    // classe para adicionar uma nova URL ao final da lista
    public void adicionar(String url) {
        // Cria um novo nó que armazenará a URL fornecida
        No novoNo = new No(url);

        // Verifica se a lista está vazia (ou seja, se a cabeça é null)
        if (cabeca == null) {
            // Se a lista estiver vazia, define o novo nó como cabeça e cauda ao mesmo tempo
            cabeca = cauda = novoNo;
        } else {
            // Se já houver elementos na lista, adiciona o novo nó ao final
            cauda.proximo = novoNo; // O próximo do nó atual (cauda) agora aponta para o novo nó
            novoNo.anterior = cauda; // O anterior do novo nó é a cauda atual
            cauda = novoNo; // Atualiza a cauda para referenciar o novo nó
        }
    }

    // Método para remover uma URL específica da lista
    public void remover(String url) {
        No atual = cabeca; // Começa a busca pelo primeiro nó

        // Percorre a lista enquanto houver nós disponíveis
        while (atual != null) {
            // Verifica se encontrou a URL que precisa ser removida
            if (atual.url.equals(url)) {
                // Ajusta os ponteiros para remover o nó atual da lista

                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo; // ajusta o próximo do nó anterior
                } else {
                    cabeca = atual.proximo; // atualiza a cabeça se for o primeiro no da lista
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior; // Ajusta o anterior do próximo nó
                } else {
                    cauda = atual.anterior; // atualiza a cauda se for o ultimo no da lista
                }

                return; // Sai do metodo apos remover o no encontrado
            }

            atual = atual.proximo; // move para o próximo nó na lista
        }
    }

    // metodo para listar todas as URLs visitadas no histórico
    public void listar() {
        No atual = cabeca; // comeca pela cabeça da lista

        // Verifica se a lista está vazia e imprime uma mensagem adequada se necessário
        if (atual == null) {
            System.out.println("Histórico vazio."); // Mensagem informando que não há histórico
            return;
        }

        System.out.println("Histórico de navegação:");

        // metodo para percorrer a lista imprimindo cada URL ate chegar ao final da lista
        while (atual != null) {
            System.out.println(atual.url); // imprimir a URL do no atual no console
            atual = atual.proximo; // mover para o próximo no na lista para continuar a impressão
        }
    }
}