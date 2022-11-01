# Exceções

### **Exercício 1**

- Implementar a exceção *ExcecaoDivisaoPorZero*. Esta exceção será lançada pelo método **double calcula(double a, double b)** da classe *Divisao*.
- Implementar também a aplicação *AplicacaoDivisao* que recebe dois números informados pelo usuário e faz a divisão do primeiro pelo segundo usando uma chamada ao método **calcula** da classe *Divisao*.

### **Exercício 2**

- Implementar o tratamento de exceções para o *Cadastro de Contas*.
- Os métodos **set** das classes básicas de negócio lançarão exceções do tipo *ExcecaoDadoInvalido* quando o dado passado como parâmetro não for válido.
- O método **inserir** da classe *CadastroContas* deve lançar a exceção *ExcecaoRepositorio* quando não puder mais inserir contas no array e a exceção *ExcecaoElementoJaExistente* quando uma conta com um mesmo número já estiver cadastrada.
- O método buscar da classe *CadastroContas* deve lançar a exceção *ExcecaoElementoInexistente* quando a conta que se deseja buscar não estiver cadastrada.