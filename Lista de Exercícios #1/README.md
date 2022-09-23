# Lista de Exercícios #1

### **Exercício 1**

Implemente a classe *Funcionario* com *nome*, *salario* e os métodos **addAumento(double valor)**, **ganhoAnual( )** e **exibeDados( )** - imprime os valores do funcionário.

- **a)** crie a classe *Assistente*, que também é um funcionário, e que possui um *número de matrícula* (faça os métodos **GET** e **SET**). Sobrescreva o método **exibeDados( )**.

- **b)** sabendo que os Assistentes Técnicos possuem um *bônus salarial* e que os Assistentes Administrativos possuem um *turno* (dia ou noite) e um *adicional noturno*, crie as classes *Tecnico* e *Administrativo* e sobrescreva o método **ganhoAnual( )** de ambas as classes (*Administrativo* e *Tecnico*).

### **Exercício 2**

Implemente os diagramas de classe abaixo:

**a)**

![Diagrama de Classe 1](/Lista%20de%20Exerc%C3%ADcios%20%231/diagrama-1.jpg "Diagrama de Classe 1")

**b)**

![Diagrama de Classe 2](/Lista%20de%20Exerc%C3%ADcios%20%231/diagrama-2.jpg "Diagrama de Classe 2")

### **Exercício 3**

Crie uma classe chamada *Ingresso* que possui um *valor* em reais e um método **imprimeValor( )**.

- **a)** crie uma classe *VIP*, que herda *Ingresso* e possui um *valor adicional*. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).

- **b)** crie uma classe *Normal*, que herda *Ingresso* e possui um método que imprime: "Ingresso Normal".

- **c)** crie uma classe *CamaroteInferior* (que possui a *localização do ingresso* e métodos para acessar e imprimir esta localização) e uma classe *CamaroteSuperior*, que é mais cara (possui *valor adicional*). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe *VIP*.

### **Exercício 4**

Crie a classe *Imovel*, que possui um *endereço* e um *preço*.

- **a0)** crie uma classe *Novo*, que herda *Imovel* e possui um *adicional* no preço. Crie métodos de acesso e impressão deste valor adicional.

- **b)** crie uma classe *Velho*, que herda *Imovel* e possui um *desconto* no preço. Crie métodos de acesso e impressão para este desconto.

### **Exercício 5**

Crie uma classe de *Teste* com o método **main**. Neste método:

- **a)** crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada um deles.

- **b)** crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os dois animais caminharem.

- **c)** teste (como quiser) as classes *Rica*, *Pobre* e *Miseravel*.

- **d)** crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP. Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior. Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior. Imprima o valor do ingresso.

- **e)** crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a definição do usuário, imprima o valor final do imóvel.