# ContaTerminal

O `ContaTerminal` é um programa Java que simula um terminal de atendimento bancário. Com ele, os usuários podem criar uma nova conta bancária fornecendo informações básicas, como nome do cliente, agência, número da conta e saldo inicial.

## Funcionalidades

- **Menu de Opções**: Interface simples com opções para cadastrar uma nova conta ou sair do programa.
- **Cadastro de Conta**: Permite o cadastro de uma conta bancária e exibe uma mensagem de confirmação com os detalhes da conta criada.
- **Encerramento**: O usuário pode sair do programa a qualquer momento escolhendo a opção "Sair".

## Como Usar

1. Execute o programa.
2. Selecione a opção `1` para cadastrar uma nova conta.
3. Siga as instruções para inserir:
   - Seu nome.
   - O número da agência.
   - O número da conta.
   - O valor a ser depositado inicialmente.
4. O programa exibirá uma mensagem de confirmação com os detalhes da conta criada.
5. Para sair do programa, selecione a opção `0`.

## Exemplo de Uso

```bash
Bem-vindo ao Terminal de Atendimento!
Selecione a opção desejada:
1: Cadastro
0: Sair
1
Digite seu nome:
João Silva
Digite sua agência:
1234
Digite o numero da conta:
56789
Digite o valor a ser depositado:
1000.50

Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 1234, conta 56789 e seu saldo 1000.50 já está disponível para saque.
