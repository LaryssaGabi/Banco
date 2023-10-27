## Bank

Será possível criar uma conta (com agência, banco e tipo) e realizar operações financeiras, como creditar, debitar, consultar o saldo e encerrar a conta.

## Folder Structure

No sistema bancário brasileiro todas as contas possuem um número, um agência (nome e número), o banco (nome e número), o tipo (número indicando 1=corrente, 2=poupança, 3=conjunta, 4=conta encerrada, etc.) e saldo. Com estas contas podem ser feitas as seguintes ações:

· abrir: recebe os dados da conta e insere 0 como estado do saldo;

· encerrar: caso a conta não tenha saldo negativo, coloca o tipo da conta como 4 e retorna o valor atual do saldo zerando-o em seguida;

· consultar_saldo: retorna o valor atual do saldo;

· creditar: caso a conta não esteja encerrada, adiciona o valor recebido no parâmetro no estado saldo;

· debitar: caso a conta não esteja encerrada, retira o valor recebido como parâmetro do estado saldo.

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
