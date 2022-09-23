# Encapsulamento

### **Exercício 1**

Escreva a classe *Departamento* com as seguintes definições:

- Dois atributos:
    - **codigo** (*inteiro*) -> não pode receber valores menores que zero.
    - **nome** (*String*) -> não pode receber valores nulos ou String vazia.
- Métodos de acesso aos atributos (**get**/**set**).
- Um construtor que receba valores para todos os atributos da classe.
- Um método **public String toString( )** que retorna todos os dados do departamento em um formato String.
- **OBS**: Usar a técnica de encapsulamento sugerida no curso.

### **Exercício 2**

Escreva a classe *Funcionário* com as seguintes definições:

- Três atributos:
    - **matricula** (*inteiro*) -> não pode receber valores menores que zero.
    - **nome** (*String*) -> não pode receber valores nulos ou String vazia.
    - **depto** (utilize a classe *Departamento* implementada anteriormente) -> não pode receber valores nulos.
- Métodos de acesso aos atributos (**get**/**set**).
- Um construtor que receba valores para todos os atributos da classe.
- Um método **String toString( )** que retorna todos os dados do funcionário em um formato String.
- **OBS**: Usar a técnica de encapsulamento sugerida no curso.

### **Exercício 3**

Implementar uma aplicação que cria um objeto do tipo *Funcionario*, a partir de dados fornecidos pelo usuário e, ao final, imprime os valores dos atributos do objeto *Funcionario* criado.