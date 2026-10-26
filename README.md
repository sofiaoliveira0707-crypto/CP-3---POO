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
Posso criar vários usuários com caracteristicas diferentes.
As classes permitem estruturar o programa, encapsular dados e criar definicoes,
Se tivesse 1m de usuários, as classes ajudariam a manter a ordem, pois dentro dela estaria a mesma estrutura para cada usuário. 
Sem precisar reescrever a mesma estrutura várias vezes 



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

É seguro deixar os métodos `getSaldo()` e `getNome()` públicos porque eles permitem apenas sem validações ou regras de segurança
Por isso, utilizamos o encapsulamento, com atributos `private` e métodos `public`, para proteger os dados e controlar o acesso a eles.

 
### Aula 4 - Construtores
 
**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes: consultar os valores dos atributos, sem modificá-los diretamente.
Já deixar os atributos públicos seria perigoso, pois qualquer parte do código poderia alterá-lo
>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualiza
rPlaca\(\)` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters 
e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o s
istema de fraudes e falhas de lógica?"
 
_Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar 
um dado no banco" e "executar um processo real no Detran"_"
 
**Sua Resposta:**
[Escreva sua reflexão aqui]
 --
 
### Aula 5 - Associação
 
**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro \(`Passageiro solicitan
te`\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve 
pedir apenas a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do ob
jeto todo?"
 
_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa desc
ontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro del
a? _"
 
**Sua Resposta:**
[Escreva sua reflexão aqui]
 --
 
### Aula 6 - Herança
 
**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `pr
ivate`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de 
`Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super\(\)` ou o `setPl
aca\(\)`.
 
Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princí
pio das aulas passadas que isso está protegendo?""
 
**Sua Resposta:**
[Escreva sua reflexão aqui]
 --
 
### Aula 7 - Polimorfismo
 
**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo g
enérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `
Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Ca
rro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"
 
**Sua Resposta:**
[Escreva sua reflexão aqui]
 --
 
### Aula 8 - Classes Abstratas
 
**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser 
um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem se
r carro, moto, caminhão ou nada disso?
 
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? P
or que ele não deduz isso sozinho? 
 
Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new V
eiculo\(\)` e quebrar a lógica do nosso sistema?"
 
**Sua Resposta:**
[Escreva sua reflexão aqui]
 --
 
### Aula 9 - Interfaces
**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementaç
ão de interfaces \(vários contratos\)?
Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança mú
ltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`? 
Como as interfaces resolvem esse problema? "
**Sua Resposta:**
[Escreva sua reflexão aqui]--
## 
Desafios Técnicos Implementados
### Desafio Pessoal (Seu Projeto)
**Qual foi o domínio que você escolheu para seu projeto pessoal?**
[Responda aqui: ex: Sistema de Biblioteca, Playlist de Música, PetShop, etc.]
**Quais classes você criou?**
[Liste suas classes: ex: Livro, Usuario, Emprestimo]
**Qual foi o maior desafio técnico que você enfrentou?**
[Descreva o desafio e como você o resolveu - 10-15 linhas]--
## 
Conclusão
**O que você aprendeu nestas 9 aulas?**
[Reflexão final - conte sobre sua jornada de aprendizado]
**Qual conceito foi mais difícil de entender?**
[Qual conceito e como você superou a dificuldade?]
**O que você melhoraria no seu projeto se pudesse refazer?**
[Reflexão crítica sobre seu próprio código]
