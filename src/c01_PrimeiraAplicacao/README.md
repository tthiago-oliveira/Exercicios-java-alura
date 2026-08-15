# ☕ Curso 01: Criando a Sua Primeira Aplicação

formação focado em construir a base necessária para programar em Java. Durante o curso, 
aprendemos como a JVM funciona, a diferença entre tipos primitivos e de referência, como capturar e 
validar dados do usuário, e como estruturar algoritmos interativos utilizando controle de fluxo.

## 📌 Conteúdos Praticados

- Sintaxe básica e estrutura de um programa em Java 
- Tipos primitivos, variáveis e conversões de tipos (casting)
- Leitura de dados do teclado com a classe Scanner e tratamento do buffer de memória (nextLine())
- Formatação de textos e saída de dados com Text Blocks (""") e o método .formatted()
- Estruturas condicionais (if, else, switch-case)
- Laços de repetição (while, for) e comandos de interrupção (break)
- Geração de números pseudoaleatórios utilizando a classe Random 
- Estruturação de menus interativos com execução contínua no console

## 📁 Estrutura do Repositório

| Exercícios                                                                     | Descrições                                                                           | Principais Conceitos                                |
|:-------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------|:----------------------------------------------------|
| [`ex01_ConversorTemp`](./src/c01_PrimeiraAplicacao/ex01_ConversorTemp)         | Conversor de Celsius para Fahrenheit/Kelvin com validação de loop                    | `Scanner`, `while(true)`, `equalsIgnoreCase`        |
| [`ex02_VariaveisECasting`](./src/c01_PrimeiraAplicacao/ex02_VariaveisECasting) | Sistema de compras com dois sistemas de moedas diferentes                            | `String`, `char`, `concatenação`, `Text Blocks`, `.formatted()` |
| [`ex03_JogoAdivinhacao`](./src/c01_PrimeiraAplicacao/ex03_JogoAdivinhacao)     | Jogo de adivinhação de números aleatórios com até 5 tentativas                       | `Random`, `Scanner`, `for`, `while`, `break`        |
| [`ex04_MathHub`](./src/c01_PrimeiraAplicacao/ex04_MathHub)                     | Central de utilitários: tabuada, comparação de inteiros, fatorial e cálculo de áreas | `Scanner`, `switch`, `for`, `if/else`               |
| [`ex05_JavaCash`](./src/c01_PrimeiraAplicacao/ex05_JavaCash)                   | Simulador de conta bancária com consulta, depósitos e transferências                 | `Scanner`, `Random`, `while`, `switch`, `if/else`   |

---
*Desenvolvido por Thiago Oliveira.*