# API Bank

<p align="center">
    <img src="https://github.com/OlirumNunes/API_Bank/assets/150186772/2030b571-b342-4aa8-9683-61270c5f26d4" width="200px">
</p>

[![GitHub license](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE)

_Leia em outra lingua:_
[_Português_](https://github.com/OlirumNunes/API_Bank/blob/main/README.md)

Este projeto é a criação de uma API simulando as operações bancarias. Feito utilizando Spring Boot, ela realiza todas as operações de CRUD. Além de armazenar em banco todas as operações feitas, criando assim, um historico das movimentações ao se realizar um Deposito, um Saque ou uma Transferencia entre contas cadastradas.

## Estrutura do projeto

O projeto está organizado nos seguintes pacotes:

- `controller`: Controlador para gerir as contas.
- `dto`: Responsável pelo encapsulamento e transferência de dados entre diferentes partes de uma aplicação, facilitando a comunicação e mantendo uma separação clara de preocupações.
- `entity`: Representam um objeto ou conceito comercial no domínio da aplicação, encapsulando os seus atributos e comportamento, frequentemente mapeados para uma tabela de base de dados, e fornecendo métodos de manipulação e interação de dados.
- `exception`: Representam condições excepcionais ou erros que ocorrem durante a execução de um programa, fornecendo informações sobre o erro e facilitando o tratamento e a propagação do erro através da aplicação.
- `mapper`: Mapeia um objeto AccountDto para um objeto Account.
- `repository`: Fornecer uma camada de abstração para aceder e gerir o armazenamento de dados.
- `service`: Encapsular a lógica comercial e orquestrar a execução de várias operações na aplicação.

## Classes e Interfaces principais

1. `BankingAppApplication`: Classe principal para inicializar a aplicação bancária.
2. `AccountRepository`: Esta interface estende JpaRepository para fornecer operações CRUD básicas para entidades Account.
3. `TransactionRepository`: Esta interface estende o JpaRepository para fornecer operações CRUD básicas para entidades de transação.

## Como começar

Para iniciar o projeto, siga estes passos:

1. Clone o repositório para a sua máquina.
2. Abra o projeto em seu IDE Java favorito.
3. Compile o projeto utilizando o script de compilação fornecido ou as ferramentas de compilação do seu IDE.
4. Execute a classe principal para começar..
5. Juntamente com os arquivos, existe um json chamado 'api_bank.postman_collection.json' que pode ser utilizado para efetuar operações na BD, bastando exportá-lo no Postman.

ps1.: A classe de aplicação criará automaticamente a base de dados e as colunas, basta configurar o seu banco com o link, o usuário e a senha corretos.

ps2.: Não se esqueça de alterar o nome de usuário e a senha conforme as suas necessidades.
<p align="center">
    <img src="https://github.com/OlirumNunes/Back_menuProject/assets/150186772/4ce8947b-c49f-475e-a44c-c9699c259d73" width="250px">
    <img src="https://github.com/OlirumNunes/Back_menuProject/assets/150186772/cc4afa90-db75-40ca-add5-2adf62ad2377">
</p>

## Contribuição

As contribuições para o projeto são bem-vindas! Se quiser contribuir, por favor siga estas diretrizes:

1. Bifurca(Fork) o repositório.
2. Crie um novo branch para a sua funcionalidade ou correção de erros.
3. Faça as suas alterações e teste-as.
4. Confirme as suas alterações e envie-as para a sua branch.
5. Envie um pull request com uma descrição detalhada das suas alterações.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais informações.
