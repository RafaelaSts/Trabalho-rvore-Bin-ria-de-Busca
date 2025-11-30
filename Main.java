// Teste
public static void main(String[] args) {
    ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

    arvore.inserir(50);
    arvore.inserir(30);
    arvore.inserir(70);
    arvore.inserir(20);
    arvore.inserir(40);
    arvore.inserir(60);
    arvore.inserir(80);

    System.out.println("Percurso em ordem:");
    arvore.emOrdem(); // Saída: 20 30 40 50 60 70 80
}