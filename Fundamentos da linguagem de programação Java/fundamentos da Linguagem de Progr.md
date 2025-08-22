# fundamentos da Linguagem de Programação Java


## General

|Aula|Desc|Link|
|---|---|---|
|aula 1 - padrão de desenvolvimento | intro| (DIO)[https://web.dio.me/track/santander-2025-java-back-end/course/87b5f3d6-1ac7-4f86-89f2-a149794b26c2/learning/19451f79-b808-4284-bdc1-90ab09e7926d?autoplay=1]|
| Aula 2 - Keywords e tipos primitivos | tipos e variáveis | (DIO)[https://web.dio.me/track/santander-2025-java-back-end/course/87b5f3d6-1ac7-4f86-89f2-a149794b26c2/learning/ee66a618-86b7-4ee6-9b7b-8567960ad746?autoplay=1]
| Aula 3 - Trabalhando com operadores de atribuição e lógicas | Operadores simples | (DIO)[https://web.dio.me/track/santander-2025-java-back-end/course/87b5f3d6-1ac7-4f86-89f2-a149794b26c2/learning/fe92dd91-7304-415f-a35c-1d75e53cb22b?autoplay=1]|
| aula 4 - Operadores aritméticos | fazer calculadora | (DIO)[https://web.dio.me/track/santander-2025-java-back-end/course/87b5f3d6-1ac7-4f86-89f2-a149794b26c2/learning/4d4d8e8e-fb65-4074-a941-d7cdfb71efc5?autoplay=1]| 
| Aula 5 - Trabalhando com operadores bitwise| |(DIO)[https://web.dio.me/track/santander-2025-java-back-end/course/87b5f3d6-1ac7-4f86-89f2-a149794b26c2/learning/063222d1-e3ba-41cd-8eec-658cf9ec1c95?autoplay=1]


## 📚Resumos

## aula 1
- intro
Scanner entrada = new Scanner (System.in)
public static void main (String[] args) {
}
"\n" para pular linha

entrada.nextInt();


### aula 2
- Tipos primitivos
int, float, double, String, Boolean, char...
- Variáveis


### Aula 3

Operadores lógicos 
|operador | ação|
|--|--|
|=| atribui|
|==| igual|
|!= | diferente|
|!| diferente|
|> e >= | maior e maior ou igual|
|< e <= | menor e menor ou igual|
| "||" | Ou|
| && | e|

Tabela verdade
E - dois verdadeiros
Ou - um verdadeiro

##Aula 4 Operadores aritméticos

- Cuidado, mais ele concatena se for string
- Divisão com números inteiros temos que trabalhar com float senão ele não retorna certo | 
- "value = value +12" é igual a "value += 12"
- Classe math


|operador | ação|
|--|--|
|+| mais|
|- | menos|
|/|divisão|
| %| resto da divisão|
| Math.sqrt(value) | faz raíz quadrada|
| Math.pow(value,2)| potência (valor, potência)|
| ++value | é mais um|
|--value| é menos |
|value++ | só resolve na próxima linha|

## Aula 5 - Trabalhando com operadores bitwise
Operação Bit-a-Bit 
geralmente long, int, short e bits

Integer.toBinaryString(value1)

Faz a representação binária

"^" troca os 0 por 1 no início
"<<" joga os bytes para frente
">>" desloca para a direita e verifica se é positivo ou negativos
">>>" funciona igual ao "<<" 

# Material de apoio - DIO

Materiais de Apoio
Os materiais de apoio que oferecemos têm como objetivo fornecer informações para facilitar e enriquecer a sua jornada de aprendizado no curso "Fundamentos da Linguagem de Programação Java". Aqui você encontrará links úteis, como slides, repositórios e páginas oficiais, além de dicas sobre como se destacar na DIO e no mercado de trabalho 😉


Recursos Adicionais
Para ajudá-lo a aprofundar o conhecimento, disponibilizamos a seguir alguns materiais complementares específicos:

Repositório: https://github.com/digitalinnovationone/exercicios-java-basico

https://www.w3schools.com/java/java_ref_keywords.asp

https://www.dio.me/articles/java-tipos-primitivos

https://www.baeldung.com/java-bitwise-operators
 

Dicas e Links Úteis
Para se desenvolver ainda mais e se destacar na DIO e no mercado de trabalho, sugerimos os seguintes recursos:

- Artigos e Fórum da DIO: Compartilhe seus conhecimentos e dúvidas através dos artigos (visíveis globalmente na plataforma da DIO) e nos fóruns específicos para cada experiência educacional, como nossos Bootcamps.
- Rooms: Participe do Rooms, uma ferramenta de bate-papo em tempo real onde você pode interagir com outros participantes dos nossos Bootcamps, compartilhando dúvidas, dicas e snippets de código.
- Exploração na Web: Utilize motores de busca para aprofundar seu conhecimento sobre temas específicos. Páginas como o StackOverflow são recursos valiosos para encontrar soluções e expandir seu entendimento.
