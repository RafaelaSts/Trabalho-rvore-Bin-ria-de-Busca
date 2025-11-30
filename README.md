Este projeto implementa uma Árvore Binária de Busca (Binary Search Tree – BST), uma estrutura de dados onde cada nó possui, no máximo, dois filhos: um à esquerda e um à direita.

A principal regra de uma árvore binária de busca é:

Valores menores que o nó ficam à esquerda.

Valores maiores que o nó ficam à direita.

Essa organização torna a busca por elementos mais rápida e eficiente.

Objetivo

O objetivo deste código é:

Inserir valores em uma árvore binária de busca

Organizar automaticamente os valores seguindo suas regras

Exibir os valores em ordem crescente por meio do percurso in-order

Funcionalidades

O código implementa as seguintes funções:

Inserção de valores inteiros na árvore

Percurso em ordem (In-order)

Organização automática dos valores na estrutura de árvore

Estrutura básica do código

O código é composto por:

Classe No (ou Node)
Responsável por armazenar:

O valor do nó

Referência para o filho da esquerda

Referência para o filho da direita

Função inserir()
Responsável por inserir novos valores seguindo a regra:

Se for menor, vai para a esquerda

Se for maior, vai para a direita

Função inOrder()
Responsável por percorrer a árvore em ordem crescente:

Primeiro visita a subárvore esquerda

Depois o nó atual

Por fim a subárvore direita

Como executar

Abra o projeto no IntelliJ (ou outra IDE Java)

Execute a classe principal (main)

A árvore será montada automaticamente com os valores definidos

O resultado em ordem será exibido no console

Exemplo de saída (in-order)

Se os valores inseridos forem:
40, 20, 60, 10, 30, 50, 70

A saída no console será:
10 20 30 40 50 60 70

Isso prova que a árvore organizou os valores corretamente.

Importância da Árvore Binária de Busca

A Árvore Binária de Busca é muito utilizada em:

Sistemas de busca

Bancos de dados

Organização de informações

Algoritmos de ordenação

Ela é uma base importante para o estudo de árvores mais avançadas, como:

Árvores AVL

Árvores Rubro-Negras

Árvores B

Autor(a)

Rafaela Santos do Nascimento
Victoria Sabriny 

Trabalho de Estruturas de Dados
