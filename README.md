# Desafio Estágio Ribeirão Preto 2024

Este repositório contém minha solução para o Desafio Estágio Ribeirão Preto 2024. O desafio consiste em uma série de tarefas para avaliar minhas habilidades em desenvolvimento de software.

## Main

O código da classe `Main` apresenta tratamentos de exceção e validações para garantir que o programa funcione corretamente e que o usuário forneça inputs válidos. Vamos explicar cada parte relevante do código:

### Desafio Soma e Desafio Fibonacci:

- No desafio da soma, não há tratamento de exceção específico porque o método `calculaSoma` não lança exceções.
- No desafio Fibonacci, é solicitado ao usuário que insira um número inteiro para verificar se pertence à sequência de Fibonacci. Para garantir que o input seja válido, o código está envolto em um bloco try-catch, onde:
    - Se o número inserido for menor ou igual a zero, é lançada uma exceção `IllegalArgumentException`, indicando que o número deve ser positivo e diferente de zero.
    - Se ocorrer qualquer outra exceção, como a inserção de um input que não seja um número inteiro, é lançada uma exceção genérica e exibida uma mensagem de erro solicitando que o usuário digite um número inteiro.

### Desafio Sequência:

- Não há tratamento de exceção neste desafio, pois não há operações suscetíveis a exceções.

### Desafio Interruptor:

- Neste desafio, não há input do usuário. O objetivo é descobrir qual interruptor controla qual lâmpada, utilizando apenas duas idas até uma das salas das lâmpadas. Implementei os métodos `descobrirInterruptores()`, `ligarInterruptor()` e `verificarInterruptoresLigados()` na classe `DesafioInterruptor`.

### Desafio String:

- No desafio da string, é solicitado ao usuário que insira uma string para ser invertida. Antes de prosseguir para o desafio, há uma validação do input do usuário:
    - Espera-se que o input contenha apenas letras (maiúsculas ou minúsculas). Se o input não corresponder a essa condição, uma mensagem de erro é exibida.

### Encerramento do Scanner:

- Após o término de todos os desafios, o scanner é fechado para liberar recursos.

Esses tratamentos e validações garantem uma experiência mais amigável para o usuário, evitando exceções não controladas e garantindo que os inputs fornecidos sejam válidos para a execução dos desafios propostos.

## Desafios

- **Desafio Soma**: Neste desafio, foi implementado um método chamado `calculaSoma` na classe `DesafioSoma`. Este método realiza a soma dos números de 1 a 13 e exibe o resultado. O método `calculaSoma` utiliza um loop `for` para iterar de 1 a 13 e acumular a soma dos números. Em cada iteração do loop, o número atual é adicionado à variável `soma`. Após o término do loop, o método exibe o resultado da soma.

    [Clique aqui para ver a implementação da classe DesafioSoma](https://github.com/PeuGomes/DesafioEstagioRibeiraoPreto2024/blob/master/src/DesafioSoma.java)

- **Desafio Fibonacci**: Neste desafio, foi implementado um método chamado `verificaFibonacci` na classe `DesafioFibonacci`. Este método verifica se um número informado pelo usuário pertence à sequência de Fibonacci. O método `verificaFibonacci` recebe como parâmetro um número inteiro. Ele utiliza um loop `while` para calcular os números da sequência de Fibonacci até atingir ou ultrapassar o número informado. Durante o processo, verifica se o número informado é igual a algum número na sequência. Se for, exibe uma mensagem indicando que o número pertence à sequência de Fibonacci. Caso contrário, exibe uma mensagem informando que o número não pertence à sequência. Se o número fornecido pelo usuário for negativo, uma exceção do tipo `IllegalArgumentException` é lançada, indicando que o número não pode ser negativo. Esta exceção é tratada no método `verificaFibonacci`, exibindo uma mensagem de erro adequada.

    [Clique aqui para ver a implementação da classe DesafioFibonacci](https://github.com/PeuGomes/DesafioEstagioRibeiraoPreto2024/blob/master/src/DesafioFibonacci.java)

- **Desafio Sequência**: Descubra a lógica e complete o próximo elemento:

    - a) 1, 3, 5, 7, ___

    - b) 2, 4, 8, 16, 32, 64, ____

    - c) 0, 1, 4, 9, 16, 25, 36, ____

    - d) 4, 16, 36, 64, ____

    - e) 1, 1, 2, 3, 5, 8, ____

    - f) 2,10, 12, 16, 17, 18, 19, ____

    Neste desafio, foi proposto completar sequências numéricas seguindo padrões específicos. Para resolver esse desafio, foram criados métodos na classe `DesafioSequencia` para calcular o próximo elemento de cada sequência com base nos padrões estabelecidos.

    - Método `calcularProximoA(int ultimo)`: Este método é responsável por calcular o próximo elemento da sequência a), onde cada número é o número ímpar consecutivo. Para isso, basta adicionar 2 ao último número da sequência.

    - Método `calcularProximoB(int ultimo)`: Para a sequência b), onde cada número é o dobro do anterior, utilizamos o método `calcularProximoB(int ultimo)` . Este método retorna o próximo número na sequência, que é o resultado da multiplicação do último número por 2.

    - Método `calcularProximoC(int indice)`: Na sequência c), cada número é o quadrado do índice. O método `calcularProximoC(int indice)` calcula o próximo elemento da sequência, que é o quadrado do próximo índice.

    - Método `calcularProximoD(int ultimo)`: Os números na sequência d) são quadrados perfeitos. Para calcular o próximo quadrado perfeito após o último número, utilizamos o método `calcularProximoD(int ultimo)` . Ele encontra a raiz quadrada do último número, adiciona 1 e retorna o quadrado desse resultado.

    - Método `calcularProximoE(int a, int b)`: Para a sequência e), que é a sequência de Fibonacci, cada número é a soma dos dois anteriores. O método `calcularProximoE(int a, int b)` calcula o próximo número na sequência de Fibonacci, que é a soma dos dois números fornecidos como argumento.

    - Método `calcularProximoF(int ultimo)`: Por fim, na sequência f), cada número parece seguir uma sequência aritmética. O método `calcularProximoF(int ultimo)` retorna o próximo número na sequência aritmética, que é o último número adicionado de 1.

    Esses métodos foram criados para facilitar a resolução do desafio, permitindo calcular o próximo elemento de cada sequência de forma simples e eficiente.

    [Clique aqui para ver a implementação da classe DesafioSequencia](https://github.com/PeuGomes/DesafioEstagioRibeiraoPreto2024/blob/master/src/DesafioSequencia.java)

- **Desafio Interruptor**: Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

    - Para resolver este desafio, implementei os métodos `descobrirInterruptores()`, `ligarInterruptor()` e `verificarInterruptoresLigados()` na classe `DesafioInterruptor`.

    [Clique aqui para ver a implementação da classe DesafioInterruptor](https://github.com/PeuGomes/DesafioEstagioRibeiraoPreto2024/blob/master/src/DesafioInterruptor.java)

- **Desafio String**: Escreva um programa que inverta os caracteres de um string. IMPORTANTE:

    - a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    - b) Evite usar funções prontas, como, por exemplo, reverse;

    - Criei um metodo `inverterString` utilizando da condicional if e dentro do if um for e um else dentro da classe `DesafioString` .

    [Clique aqui para ver a implementação da classe DesafioString](https://github.com/PeuGomes/DesafioEstagioRibeiraoPreto2024/blob/master/src/DesafioString.java)

## Tecnologias Utilizadas

- Java
- Git
- GitHub

## Instruções de Uso

Para executar os desafios, execute o arquivo `Main.java`.

## Contato

Se houver alguma dúvida ou feedback sobre minha solução, fique à vontade para entrar em contato comigo.

[Pedro Ivo Barreto Gomes](pedroivobarretogomes26@gmail.com)
