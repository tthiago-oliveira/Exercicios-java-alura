# Exercício 03: Jogo de Adivinhação

Aplicação em Java que simula um jogo de adivinhação. O programa gera um número aleatório entre 0 e 100 e concede ao usuário até 5 tentativas para acertar, fornecendo dicas se o palpite foi maior ou menor que o número secreto a cada tentativa.

## 📌 Funcionalidades Desenvolvidas
- **Geração Aleatória:** Uso da classe `java.util.Random` para gerar o número secreto.
- **Entrada de Dados:** Leitura dos palpites via `Scanner`.
- **Controle de Tentativas:** Laço de repetição limitado a 5 tentativas.
- **Dicas Dinâmicas:** Condicionais (`if / else if`) avisando se o número digitado é maior ou menor que o alvo.
- **Interrupção de Laço:** Uso da instrução `break` ao acertar o número antes de esgotar as tentativas.
