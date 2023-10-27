## Bank

Esse é um codigo na qual o usuário consegue criar uma conta (com agência, banco e tipo) e realizar operações financeiras, como creditar, debitar, consultar o saldo e encerrar a conta.

No sistema bancário todas as contas possuem um número, um agência (nome e número), o banco (nome e número), o tipo (número indicando 1=corrente, 2=poupança, 3=conjunta, 4=conta encerrada, etc.) e saldo. Com estas contas podem ser feitas as seguintes ações:

· abrir: recebe os dados da conta e insere 0 como estado do saldo;

· encerrar: caso a conta não tenha saldo negativo, coloca o tipo da conta como 4 e retorna o valor atual do saldo zerando-o em seguida;

· consultar_saldo: retorna o valor atual do saldo;

· creditar: caso a conta não esteja encerrada, adiciona o valor recebido no parâmetro no estado saldo;

· debitar: caso a conta não esteja encerrada, retira o valor recebido como parâmetro do estado saldo.


