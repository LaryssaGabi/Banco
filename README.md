# Sistema Bancário Simples

O Sistema Bancário Simples é um programa Java que simula as operações básicas de uma conta bancária. Ele oferece funcionalidades como crédito, débito, consulta de saldo e encerramento de conta para uma conta bancária.

## Conteúdo.

1. [Instruções de Uso](#instruções-de-uso)
2. [Visão Geral do Código](#visão-geral-do-código)
3. [Classe Application](#classe-application)
4. [Classe Bank](#classe-bank)


## Instruções de Uso

O Sistema Bancário Simples é executado via linha de comando e oferece as seguintes operações:

1. **Creditar**: Permite ao usuário depositar dinheiro na conta.
2. **Debitar**: Permite ao usuário retirar dinheiro da conta.
3. **Consultar Saldo**: Mostra o saldo atual da conta.
4. **Encerrar Conta**: Encerra a conta, se o saldo for zero.

O usuário pode escolher entre essas opções, e o programa responde de acordo com a operação selecionada. Ao encerrar a conta, é necessário que o saldo seja zero para que a operação seja bem-sucedida.

Siga as instruções exibidas no console para utilizar o programa.

## Visão Geral do Código

O código-fonte do Sistema Bancário Simples é composto por duas classes principais:

1. `Application`: Esta classe contém o método `main` que controla a execução do programa. Ela interage com o usuário por meio do console e oferece opções para gerenciar a conta bancária. As operações de crédito, débito, consulta de saldo e encerramento de conta são gerenciadas nesta classe.

2. `Bank`: A classe `Bank` representa uma conta bancária. Ela possui os seguintes atributos:

   - `numero`: O número da conta.
   - `ag_numero`: O número da agência.
   - `ag_nome`: O nome da agência.
   - `tipo`: O tipo de conta (utilizado para indicar se a conta está encerrada).
   - `saldo`: O saldo da conta.

A classe `Bank` oferece métodos para acessar e modificar esses atributos, além de implementar as operações de crédito, débito, consulta de saldo e encerramento de conta. Além disso, ela fornece uma representação textual da operação de encerramento no método `textoEncerrar`.

## Classe Application

A classe `Application` é a classe de entrada do programa. Ela interage com o usuário e gerencia as operações da conta bancária com base nas escolhas feitas pelo usuário. Essa classe também lida com exceções e erros.

## Classe Bank

A classe `Bank` representa uma conta bancária e é responsável por todas as operações relacionadas a essa conta. Ela possui métodos para:

- Creditar (adicionar dinheiro à conta).
- Debitar (retirar dinheiro da conta).
- Consultar saldo.
- Encerrar a conta.

Essas operações são realizadas com base nas interações do usuário com a classe `Application`.

