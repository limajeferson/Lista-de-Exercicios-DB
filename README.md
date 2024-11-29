# Lista-de-Exercicios-DB
Lista de exercícios DB - Equipe Academia

## Como Baixar o Código e Submeter Minha Solução?

Para completar a etapa do desafio, você precisará baixar o código, resolver os exercícios usando **Java** e entregá-lo no repositório do seu GitHub.

### Baixando o Código
Caso você queira baixar a estrutura do projeto, basta acessar o repositório público com a URL abaixo e fazer o download do código.

### Entregando o Desafio
Após resolver os exercícios e validá-los, liberei minhas respostas num repositório **público** no [GitHub](https://github.com/limajeferson) com o nome de `Exerc-cios_DB` e coloquei o código na **branch** `main`.

#### Passos para subir o repositório:
1. Crie um repositório no GitHub com o nome `Exerc-cios_DB`.
2. Faça o push do código para a branch `main`.
3. Permita acesso ao link do seu repositório para avaliação, deixando-o público.

Se você não tem familiaridade com o Git e GitHub, sugerimos que consulte o seguinte material: [Como usar Git e Github na prática](https://youtu.be/UBAX-13g8OM).

## O Desafio

Esta lista de exercícios em Java consiste em uma série de tarefas para aprimorar suas habilidades de programação. Ela está dividida em cinco partes: **Estruturas Básicas**, **Estruturas de Repetição**, **Vetores e Matrizes**, **Métodos** e **Orientação a Objetos**. Cada exercício tem o objetivo de trabalhar um conceito específico e testar suas habilidades de resolução de problemas.

### Exercícios de Estruturas Básicas

#### Usar `if-else`:
1. Defina a idade de uma pessoa e verifique se ela é maior de idade ou não.
2. Para cada produto informado (nome, preço e quantidade), escreva o nome do produto comprado e o valor total a ser pago, considerando que são oferecidos descontos pelo número de unidades compradas.
3. Implemente um jogo **Jokenpo** (Pedra, papel ou tesoura). Será o jogador contra a máquina. O código deve gerar as posições aleatórias e comparar com a escolha do jogador.

#### Usar `switch-case`:
4. Implemente o programa da **calculadora** utilizando uma instrução `switch-case` para determinar a operação que deve ser executada, conforme o usuário escolheu no menu de opções.

### Exercícios de Estruturas de Repetição

#### Usar `for`:
5. Construa a tabuada de um número.
6. Gere 10 números aleatórios entre 0 e 100; mostre todos na tela (em uma única linha); identifique o menor e o maior deles.
7. Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário.

#### Usar `while/do-while`:
8. Leia um número até que o usuário digite 10.
9. Altere o exercício 7 para o algoritmo contar a série Fibonacci até um determinado número.

### Exercícios com Vetores e Matrizes

10. Leia uma matriz quadrada e determine a soma da diagonal principal.
11. Ordene um vetor de 100 números inteiros gerados aleatoriamente.
12. Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor individualmente, e combine os dois vetores gerando um novo vetor de 100 posições, ordenando esse novo vetor.

### Exercícios com Métodos

13. Faça um método que calcule a média de um aluno de acordo com o critério definido neste curso. Além disso, faça um outro método que informe o status do aluno.
14. Leia do usuário o tempo em segundos e escreva em horas, minutos e segundos. Utilize cinco métodos para a leitura e escrita de dados e para a conversão de tempo.
15. Crie uma classe **Calculadora** que faça as operações de soma, subtração, multiplicação, divisão e potenciação. Cada operação deve ser um método estático.

### Exercícios de Orientação a Objetos

16. Faça um programa para controle de empréstimo de livros, com as classes **Emprestimo**, **Livro** e **Pessoa**.
17. Faça um programa para representar a árvore genealógica de uma família. Crie uma classe **Pessoa** que permita indicar nome, idade, pai e mãe.
18. Crie uma classe **Automóvel**, identificando seus atributos e métodos. Herdando tais características, crie as classes **Carro**, **Moto** e **Guincho**. A classe **CarroAutomático** deve exigir que o freio esteja pressionado para ligar, e a **MotoPartidaPedal** deve exigir que o acelerador esteja puxado. Utilize os 4 pilares da POO.
19. Implemente um sistema de **agenda telefônica** com interações para adicionar e deletar números.

### ProvaDaLista

20. O projeto **SuperMercadoProva** simula o sistema de gerenciamento de vendas de um supermercado, com controle de estoque e verificação de produtos no pedido. As tarefas incluem:
- Corrigir um bug (fácil).
- Desenvolver um método para calcular o troco (médio).
- Desenvolver um método para calcular a menor quantidade de notas para o troco (difícil).

---

## Instalando e Rodando o Código

Como cada exercício foi implementado em uma classe separada, você deve executar os exercícios **individualmente**. Siga os passos abaixo para compilar e rodar cada exercício:

1. **Acesse a pasta do exercício desejado**:
    - Por exemplo, se você deseja rodar o exercício da calculadora, vá até a pasta `src/ExerciciosBasicos/` e execute o arquivo correspondente.

2. **Compilar e Executar o Exercício**:
    - No terminal, navegue até o diretório onde está a classe do exercício.
      ```bash
      cd src/ExerciciosBasicos/
      ```
    - Compile o código com o seguinte comando (substitua `ClassePrincipal.java` pelo nome da classe principal do exercício):
      ```bash
      javac Calculadora.java
      ```
    - Para rodar o código, use o comando:
      ```bash
      java Calculadora
      ```

3. **Repita o processo para cada exercício**:
    - Basta seguir o mesmo procedimento, indo para o diretório correspondente ao exercício e rodando a classe principal.

---

## Validando a Solução

Junto com os exercícios, você pode criar seus próprios testes para garantir que o código está funcionando conforme o esperado. Crie mais cenários de teste para aumentar a confiabilidade da sua solução.

### Validando a Entrega

Para garantir que sua entrega será considerada válida, revise os seguintes pontos:

#### Git
- O repositório deve ser **público** e ter o **nome** e **branch** conforme indicado.
- O código deve ser colocado na **branch `main`**.

#### Código
- A solução deve ser entregue em **Java** e a **estrutura de pastas e arquivos** deve seguir as diretrizes do desafio.

---

Boa sorte e divirta-se com os exercícios!
