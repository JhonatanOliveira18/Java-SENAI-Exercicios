# 💻 Módulo 01: Lógica, Estruturas de Dados e Tratamento de Exceções

Este módulo abrange 34 exercícios desenvolvidos em Java, focados nos fundamentos da linguagem, estruturas condicionais e de repetição, além da manipulação de entrada de dados (Scanner/JOptionPane) e tratamento de erros (`try-catch`).

---

## 🎯 Estrutura do Módulo

| Seção | Tópicos Principais |
| :--- | :--- |
| **01-06** | Variáveis, Constantes, Operadores e Saída Fixa |
| **07-15** | Entrada de Dados (Scanner) e Cálculos Simples |
| **16-25** | Estruturas Condicionais (`if`, `else if`, `switch`) |
| **26-28** | Estruturas de Repetição (`for`, `while`, `do-while`) |
| **29-34** | Tratamento de Exceções (`try-catch`), Arrays e `Classe Math` |

---

## 📋 Índice Detalhado dos Exercícios

Abaixo, a lista completa de exercícios, com o tópico principal e o nome do arquivo de código.

| Nº | Tópico | Arquivo Java   |
| :--- | :--- | :--- |
| **01** | Cálculo de Corrente (Fórmula P=V×A) | `Exercicio01CalculoCorrente.java` |
| **02** | Operadores Aritméticos | `Exercicio02Operadores.java` |
| **03** | Área e Perímetro de Retângulo | `Exercicio03CalculoRetangulo.java` |
| **04** | Concatenação de Dados Pessoais | `Exercicio04DadosPessoais.java` |
| **05** | Cálculo de Média Fixa | `Exercicio05MediaAluno.java` |
| **06** | Cálculo de Valor de Venda (Acréscimo de 15%) | `Exercicio06CalculoVenda.java` |
| **07** | **[Scanner]** Cálculo de Idade | `Exercicio07CalculoIdade.java` |
| **08** | **[Scanner]** Potência Elétrica (P=V×I) | `Exercicio08CalculoPotencia.java` |
| **09** | **[Scanner]** Corrente (A) a partir de P e V | `Exercicio09CalculoCorrente2.java` |
| **10** | **[Scanner]** Média de 5 Números | `Exercicio10MediaCinco.java` |
| **11** | **[Scanner]** Conversão de Moedas (BRL para EUR/USD) | `Exercicio11ConversorMoedas.java` |
| **12** | **[Scanner]** Cálculo de Adiantamento e Desconto (Salário) | `Exercicio12CalculoSalario.java` |
| **13** | **[Scanner]** Conversão de Celsius para Fahrenheit | `Exercicio13ConversorTemperatura.java` |
| **14** | **[Scanner]** Operações Básicas (Soma, Subtração, Multiplicação, Divisão) | `Exercicio14OperacoesBasicas.java` |
| **15** | **[Scanner/IF]** Simulação de Conta Bancária (Saque com Validação) | `Exercicio15ContaBancariaSimples.java` |
| **16** | **[IF/ELSE]** Desconto de 15% em Compra (Valor > R$ 150,00) | `Exercicio16CalculoDesconto.java` |
| **17** | **[IF/ELSE]** Verificação Positivo, Negativo ou Zero | `Exercicio17VerificaSinal.java` |
| **18** | **[IF/ELSE]** Preço de Maçãs por Quantidade | `Exercicio18CalculoMacas.java` |
| **19** | **[IF/ELSE IF]** Aptidão para Voto (Obrigatório/Facultativo) | `Exercicio19AptidaoVoto.java` |
| **20** | **[IF/ELSE]** Média do Aluno (Aprovado/Reprovado) | `Exercicio20VerificaMedia.java` |
| **21** | **[IF/ELSE IF]** Categoria de Jogador de Futsal | `Exercicio21CategoriaFutsal.java` |
| **22** | **[IF/ELSE IF]** Reajuste Salarial por Faixa | `Exercicio22ReajusteSalarial.java` |
| **23** | **[IF/ELSE IF]** Cálculo e Situação do IMC | `Exercicio23CalculoIMC.java` |
| **24** | **[IF/ELSE IF]** Cálculo de Consulta Pet Shop (com Convênio) | `Exercicio24PetShopConsulta.java` |
| **25** | **[SWITCH]** Conversão de Lógica Visualg (Cidades por Estado) | `Exercicio25SwitchCidades.java` |
| **26** | **[WHILE]** Leitura de Números até Digitar Zero | `Exercicio26LoopPositivoNegativo.java` |
| **27** | **[DO-WHILE]** Tabuada Interativa com Opção de Novo Cálculo | `Exercicio27TabuadaLoop.java` |
| **28** | **[FOR/WHILE/DO-WHILE]** Reescrita de 3 Exercícios com Repetição | `Exercicio28ReescritaLoops.java` |
| **29** | **[TRY-CATCH]** Reescrever Exercício 23 (IMC) com Tratamento de Erros e JOptionPane | `Exercicio29IMCTryCatch.java` |
| **30** | **[TRY-CATCH/LOOP]** Minissistema Bancário (Saque, Depósito, Empréstimo) | `Exercicio30MiniBanco.java` |
| **31** | **[MATH]** Minicalculadora com Operações Básicas e Classe Math | `Exercicio31MiniCalculadoraMath.java` |
| **32** | **[MATH]** Sorteio de 6 Números Aleatórios | `Exercicio32SorteioRandom.java` |
| **33** | **[MATH]** Teorema de Pitágoras (Cálculo de Hipotenusa) | `Exercicio33Hipotenusa.java` |
| **34** | **[ARRAY/TRY-CATCH/LOOP]** Preenchimento de Array com Validação (Notas 0-10) | `Exercicio34ArrayValidacao.java` |

---

## 📝 Enunciados e Comandos Completos

Aqui estão os enunciados dos exercícios para referência.

### 1. Exercício 01: Cálculo de Corrente Elétrica

Considere a seguinte rede elétrica com chuveiros:
- Chuveiro 01: 8500 W em 220 V
- Chuveiro 02: 5000 W em 220 V
- Chuveiro 03: 7500 W em 220 V
Sabemos que a potência (P) é dada pela fórmula: $P = V \times A$.
Calcule a corrente (em amperes) necessária para cada chuveiro.

------------------------------------------------------------------------

### 2. Exercício 02: Operadores Aritméticos

Crie um programa em Java que defina 4 constantes. Utilize todos os operadores aritméticos para realizar os cálculos.
O programa deve exibir os resultados no terminal.

------------------------------------------------------------------------

### 3. Exercício 03: Área e Perímetro do Retângulo

Crie um programa em Java que defina 2 constantes, uma para o comprimento e outra para a largura de um retângulo. Utilize essas constantes para calcular e exibir no terminal a Área do retângulo (comprimento × largura) e o Perímetro do retângulo (soma dos 4 lados).

------------------------------------------------------------------------

### 4. Exercício 04: Concatenação de Dados Pessoais

Crie um programa em Java que declare variáveis para armazenar as informações de nome, dia, mês e ano de nascimento de uma pessoa. Em seguida, o programa deve exibir uma mensagem no terminal com os dados concatenados, no seguinte formato: "Nome: [nome], Nascimento: [dia]/[mês]/[ano]".

------------------------------------------------------------------------

### 5. Exercício 05: Média de 4 Notas Fixas

Crie um programa em Java que declare 4 variáveis, cada uma representando a nota de um aluno em uma disciplina diferente. O programa deve exibir no terminal as notas do aluno e calcular a média dessas notas, apresentando o resultado de forma clara.

------------------------------------------------------------------------

### 6. Exercício 06: Cálculo de Valor de Venda

Crie um programa em Java que declare variáveis para armazenar código, nome e valor de custo de um produto. Calcule o valor de venda do produto, aplicando um acréscimo de 15% sobre o valor de custo. Por fim, exiba as informações do produto, incluindo o valor de venda calculado.

------------------------------------------------------------------------

### 7. Exercício 07: Cálculo de idade utilizando Scanner

Crie um programa Java que solicite o nome e o ano de nascimento do usuário. Em seguida, calcule e exiba a idade da pessoa com base no ano atual. 

------------------------------------------------------------------------

### 08 - Cálculo de Potência Elétrica

Crie um programa em Java que receba a tensão (V) e a corrente (A) de um
aparelho eletroeletrônico, fornecidas pelo usuário.

O programa deve calcular a potência (P) consumida pelo aparelho
utilizando a fórmula:

P = V × I

Onde: - P é a potência em watts (W) - V é a tensão em volts (V) - I é a
corrente em amperes (A)

Ao final, o programa deve exibir a potência calculada no seguinte
formato:

"Potência consumida: \[valor\] W"

------------------------------------------------------------------------

### 09 - Cálculo de Corrente Elétrica

Desenvolva um programa em Java que receba a potência (P) e a tensão (V)
de um aparelho eletroeletrônico.

O programa deve calcular a corrente elétrica (I), utilizando a fórmula:

I = P / V

Exibir o resultado no formato:

"Corrente calculada: \[valor\] A"

------------------------------------------------------------------------

### 10 - Média de 5 Números

Crie um programa que solicite ao usuário a entrada de 5 números.

Após receber todos os valores: - Calcular a média aritmética. - Exibir o
resultado com mensagem clara.

------------------------------------------------------------------------

### 11 - Conversor de Moedas

Desenvolva um programa que: - Solicite um valor em Reais (BRL). -
Converta o valor para Euro (EUR) e Dólar (USD). - Utilize taxas fixas
definidas no código. - Exiba as taxas utilizadas. - Mostre os valores
convertidos de forma organizada.

------------------------------------------------------------------------

### 12 - Cálculo de Salário

O programa deve: - Solicitar o salário bruto. - Calcular: - 40% de
adiantamento. - 8% de desconto em folha. - Salário líquido final.

Exibir todos os valores de forma organizada.

------------------------------------------------------------------------

### 13 - Conversão Celsius para Fahrenheit

Solicitar a temperatura em Celsius.

Calcular usando a fórmula:

F = (C × 1.8) + 32

Exibir o valor convertido com mensagem explicativa.

------------------------------------------------------------------------

### 14 - Operações Matemáticas Básicas

Solicitar dois números.

Calcular e exibir: - Soma - Subtração - Multiplicação - Divisão

Apresentar resultados organizados.

------------------------------------------------------------------------

### 15 - Simulação de Conta Bancária

O programa deve: 1. Iniciar saldo em zero. 2. Solicitar valor de
depósito. 3. Atualizar saldo. 4. Solicitar valor de saque. 5. Permitir
saque apenas se houver saldo suficiente.

Exibir mensagens claras ao usuário.

------------------------------------------------------------------------

### 16 - Desconto em Compra

Solicitar valor da compra.

Regras: - Se valor \> R\$ 150, aplicar 15% de desconto. - Caso
contrário, informar "Sem desconto".

------------------------------------------------------------------------

### 17 - Verificação de Número

Solicitar número.

Exibir: - "Positivo" - "Negativo" - "O valor é zero"

------------------------------------------------------------------------

### 18 - Compra de Maçãs

Solicitar quantidade.

Regras: - Menor que 12 → R\$ 0,30 cada. - 12 ou mais → R\$ 0,25 cada.

Exibir preço unitário e total.

------------------------------------------------------------------------

### 19 - Verificação de Voto

Solicitar idade.

Regras: - 18 a 70 → Obrigatório. - 16-17 ou \>70 → Facultativo. - \<16 →
Não pode votar.

Informar quantos anos faltam, se necessário.

------------------------------------------------------------------------

### 20 - Média do Aluno

Receber 4 notas.

Calcular média: - ≥ 7 → Aprovado. - \< 7 → Reprovado.

Garantir validação das notas.

------------------------------------------------------------------------

### 21 - Categoria de Futsal

Receber nome e idade.

Categorias: - Até 10 → Infantil - Até 18 → Juvenil - Até 40 →
Profissional - Acima de 40 → Master

------------------------------------------------------------------------

### 22 - Reajuste Salarial

Solicitar nome, função e salário.

Aplicar reajuste: - Até 1280 → 20% - 1280.01 a 1700 → 15% - 1700.01 a
2500 → 10% - Acima → 5%

Exibir salário antigo, percentual e novo salário.

------------------------------------------------------------------------

### 23 - Cálculo de IMC

Solicitar peso e altura.

Fórmula: IMC = peso / (altura²)

Exibir valor e classificação.

------------------------------------------------------------------------

### 24 - Sistema Pet Shop

Especialidades: - Clínica Geral: 100 - Dermatologia: 150 - Odontologia:
120 - Banho e Tosa: 120

Aplicar 20% de desconto para convênio.

Exibir valor final.

------------------------------------------------------------------------

### 25 - Conversão Visualg para Java

Converter estrutura "escolha/caso" para switch-case em Java.

Identificar cidades de SP e MG.

------------------------------------------------------------------------

### 26 - Loop Positivo/Negativo

Ler números até usuário digitar 0.

Exibir se positivo ou negativo.

------------------------------------------------------------------------

### 27 - Tabuada com Repetição

Permitir cálculo da tabuada.

Oferecer opção de novo cálculo até usuário encerrar.

------------------------------------------------------------------------

### 28 - Reescrita com Repetições

Escolher 3 exercícios anteriores.

Aplicar: - for - while - do-while

Substituir Scanner por JOptionPane.

Incluir tratamento de exceções.

------------------------------------------------------------------------

### 29 - IMC com Try-Catch

Reescrever exercício 23.

Usar: - JOptionPane - try-catch - Opção de novo cálculo

------------------------------------------------------------------------

### 30 - Mini Sistema Bancário

Opções: - Saque - Depósito - Saldo - Empréstimo

Regras: - Saque ≤ saldo - Proibir valores negativos - Empréstimo ≤
saldo² - Bloquear se houver débito

------------------------------------------------------------------------

### 31 - Mini Calculadora

Operações: - Soma - Subtração - Multiplicação - Divisão - Métodos da
classe Math

------------------------------------------------------------------------

### 32 - Sorteio Aleatório

Sortear 6 números entre 1 e 100.

Exibir formato: Números sorteados: X X X X X X

Permitir novo sorteio.

------------------------------------------------------------------------

### 33 - Hipotenusa

Solicitar catetos A e B.

Usar Math.sqrt e Math.pow.

Calcular hipotenusa.

------------------------------------------------------------------------

### 34 - Array com Validação e Try-Catch

Criar array de notas.

Requisitos: - Loop para preenchimento. - Validar intervalo 0.0 a 10.0. -
Utilizar try-catch. - Impedir encerramento por erro de digitação. -
Garantir robustez contra dados inválidos.


