Projeto em Java que simula um carrinho de mercado em movimento, utilizando os padrões de projeto Singleton, Strategy e Facade.

Carrinho de mercado indo para frente, parando, virando a esquerda, e parando; quando ele chega no ponto final aparece um texto "fila única máximo 15 itens " 
Feito com vscode, linux LXQT.

Singleton: Usado para gerenciar o estado do carrinho de mercado (por exemplo, a posição do carrinho).
Strategy: Usado para definir diferentes comportamentos de movimento do carrinho (ir para frente, parar, virar à esquerda).
Facade: Usado para simplificar a interação com o carrinho de mercado e seus comportamentos.

Singleton (CartManager): Garante que apenas uma instância do gerenciamento do carrinho existe e mantém o estado do carrinho.

Strategy (CartStrategy, MoveForwardStrategy, TurnLeftStrategy, StopStrategy): Define comportamentos específicos do carrinho e permite que eles sejam alterados dinamicamente.

Facade (CartFacade): Simplifica a interface para o carrinho, agrupando comportamentos e facilitando o uso.


Criado a partir do fork: https://github.com/digitalinnovationone/lab-padroes-projeto-java 