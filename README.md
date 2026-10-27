 Projeto FiapRide - Sofia F. L. Oliveira
## 
Informações do Aluno- **Nome:**  Sofia F. L. Oliveira - **RM:** 567824 **Turma:** 1CCPB - **Curso:** Ciência da Computação- **GitHub:** sofia oliveira 
## 
Descrição do Projeto
Este projeto é resultado do aprendizado adquirido ao longo das aulas 1 a 9 de Programação Orientada a Objetos (POO). 
O desenvolvimento foi realizado aula a aula, utilizando o caderno como objeto escolhido para aplicar, na prática, os conceitos abordados em cada tópico da matéria.
Durante esse processo, pude implementar os conteúdos estudados, 
compreender melhor seu funcionamento e aprimorar meus conhecimentos em programação orientada a objetos.

Perguntas de Reflexão
### Aula 1 - Classes e Objetos--
**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fá
cil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 5
0.0`?
**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"


Criamos uma classe, pois dentro dessa classe ficará os atributos do usuário.
Posso criar vários usuários com características diferentes.
As classes permitem estruturar o programa, encapsular dados e criar definições,
Se tivesse 1m de usuários, as classes ajudariam a manter a ordem, pois dentro dela, estaria a mesma estrutura para cada usuário. 
Sem precisar reescrever a mesma estrutura várias vezes.



### Aula 2 - Métodos
**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo \+ 100` di
retamente no código principal, por que dá tanto trabalho criar um método específico chamado `adi
cionarSaldo\(valor\)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade 
se deixássemos qualquer programador alterar o saldo diretamente?"
 
O risco de permitir que qualquer programador alterasse o saldo diretamente, era de poder inserir valores incorretos ou exorbitantes, 
possibilitando fraudes e prejuízos financeiros para a startup.
Por isso, criar um método específico permite controlar as alterações, validar os valores inseridos e garantir que apenas operações autorizadas sejam realizadas.
Isso torna o sistema mais seguro e confiável.

### Aula 3 - Encapsulamento
 
**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo\(\)` e `get
Nome\(\)` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo 
original público?


É seguro deixar os métodos `getSaldo()` e `getNome()` públicos porque eles permitem apenas sem validações ou regras de segurança.
Por isso, utilizamos o encapsulamento, com atributos `private` e métodos `public`, para proteger os dados e controlar o acesso a eles.

 
### Aula 4 - Construtores
 
**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes: consultar os valores dos atributos, sem modificá-los diretamente.
Já deixar os atributos públicos seria perigoso, pois qualquer parte do código poderia alterá-lo
>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualiza
rPlaca\(\)` para acessá-lo.
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters 
e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o s
istema de fraudes e falhas de lógica?"

Não é viável colocar tudo como get ou set, pois isso poderia deixar o código inseguro e com falhas. 
Podendo fazer com que haja alterações e permissões para atributos que, de fato, não possuem. Comprometendo assim
a integridade e segurança dos dados e do codigo.
 
 
### Aula 5 - Associação
 
**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro \(`Passageiro solicitan
te`\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve 
pedir apenas a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do ob
jeto todo?"

É necessário passar o objeto inteiro, pois o sistema precisa acessar outras informações do passageiro, como o saldo disponível, para verificar se ele tem dinheiro suficiente para realizar a viagem. Se passássemos apenas uma `String` com o nome, teríamos somente essa informação, dificultando o acesso aos outros dados e comportamentos do passageiro. 
Dessa forma, utilizar o objeto inteiro facilita a comunicação entre as classes e permite validar as regras de negócio do sistema.
 
### Aula 6 - Herança
 
**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `pr
ivate`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de 
`Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super\(\)` ou o `setPl
aca\(\)`.
 
Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princí
pio das aulas passadas que isso está protegendo?""

Não é permitido deixar a filha alterar as variáveis privadas pelo principio do encapsulamento, que controla como os dados podem ser
alterados e modificados. Por isso, é necessário utilizar o construtor super() ou um método público, como set, para acessar ou alterar esses valores de forma controlada, respeitando as regras definidas na classe.
 
### Aula 7 - Polimorfismo
 
**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo 
genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `
Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Ca
rro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

Não seria possível, precisa existir na base da hierarquia, pois leva a herança da classe mãe para a classe fillha. 
O que permite o polimorfismo, fazendo com que cada tipo execute sua versao com seus métodos.

### Aula 8 - Classes Abstratas
 
**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser 
um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem se
r carro, moto, caminhão ou nada disso?
 
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? P
or que ele não deduz isso sozinho?  
Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new V
eiculo\(\)` e quebrar a lógica do nosso sistema?"

Precisamos dizer que é abstract para indicar que ela é uma classe base, que serve como modelo para as classes filha
Se nao colocarmos abstract, ele podera ser lido como algo alterável, o que vai gerar erro no codigo e na seguranca, um veículo genérico pode não ter comportamentos específicos definidos, como calcular sua autonomia


 --
 
### Aula 9 - Interfaces
**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementaç
ão de interfaces \(vários contratos\)?
Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança mú
ltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`? 
Como as interfaces resolvem esse problema? "

Através do método implements, seria possivel definir quais das partes iria ser ligado,
através das interfaces que permitem implementar atraves do implements.

## 
Desafios Técnicos Implementados
### Desafio Pessoal (Seu Projeto)
**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Caderno, Caderno universitário.

**Quais classes você criou?**
Classe Obejto, Caderno, Caderno Universitario.

**Qual foi o maior desafio técnico que você enfrentou?**

Pegar o que foi passado em aula e trazer para o meu código, de modo que ele funcionasse do jeito que deveria e respeitando as boas práticas do clean code.
Também, começar a compreender JAVA e suas regras. 

## 
Conclusão
**O que você aprendeu nestas 9 aulas?**
Aprendi que estudar pós aula, estudar os códigos e a teoria é essencial para um bom aprendizado e um aprendiado completo.
Implementar para o meu objeto também foi ótimo para fixar o conteúdo, por mais que eu ainda ache complicado, por estar sendo meu primeiro contato com a matéria


**Qual conceito foi mais difícil de entender?**
Para mim, classes abstratas

**O que você melhoraria no seu projeto se pudesse refazer?**
teria feito sempre pós aula o meu objeto, e não esperado passar a aula pra fazer
