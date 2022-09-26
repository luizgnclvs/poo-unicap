# Lista de Exercícios #2

## Classes Abstratas

### **Exercício 1**

Implementar, usando classe abstrata, o seguinte modelo de classes:

![Diagrama de Classe 1](./assets/diagrama-1.jpg "Diagrama de Classe 1")

## Interfaces

### **Exercício 2**

Observe o seguinte diagrama UML:

![Diagrama de Classe 2](./assets/diagrama-2.jpg "Diagrama de Classe 2")

A seguir, observe também a seguinte interface:

    interface FormaGeometrica {
        public double area( );
        public double comprimento( );
    }

Construir as classes *Quadrado*, *Circulo* e *Retangulo* que implementam a interface *FormaGeometrica*. Implementar programa de testes que declara duas variáveis do tipo *FormaGeometrica* e instancia dois objetos um do tipo *Circulo* e outro do tipo *Quadrado*. Exibir a área e o comprimento dos objetos instanciados.

### **Exercício 3**

Observe o seguinte diagrama UML:

![Diagrama de Classe 3](./assets/diagrama-3.jpg "Diagrama de Classe 3")

Implementar uma aplicação que declara uma variável polimórfica do tipo *OperacaoMatematica*. A partir de dados fornecidos pelo usuário, a aplicação deve realizar uma operação matemática e imprimir o seu resultado. Oferecer para o usuário um menu para a escolha entre as operações matemáticas disponíveis.

**OBS 1:** Não defina *a* e *b* como atributos.

**OBS 2:** Implemente um construtor padrão para cada uma das classes