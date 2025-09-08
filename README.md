## 📂 Estrutura do Projeto

O projeto contém as seguintes classes:

- **Cliente.java**
  - Armazena dados do cliente: `nome`, `CPF`, `data de nascimento`.
  - Permite consultar produtos cadastrados e visualizar a lista de produtos disponíveis.
  - Faz a coleta dos dados do cliente via `Scanner`.

- **Produto.java**
  - Representa um produto com atributos como `nome`, `marca`, `descrição`, `preço`, `quantidade` e `código de barras`.
  - Possui um **ArrayList estático** (`estoque`) para armazenar todos os produtos cadastrados.
  - Métodos principais:
    - `Cadastrar()` → registra novos produtos.
    - `ExibirProduto()` → mostra todos os produtos cadastrados.

- **NotaFiscal.java**
  - Representa uma nota fiscal vinculada a um cliente e aos produtos comprados.
  - Atributos: `cpf`, `código da nota`, `data`, `hora`.
  - Métodos principais:
    - `exibir()` → exibe os detalhes da compra e os produtos.
    - `listarProdutos()` → lista todos os produtos do estoque.

- **Main.java**
  - Classe principal responsável por executar o programa.
  - Aqui devem ser instanciados os objetos de `Cliente`, `Produto` e `NotaFiscal` para simular a execução do sistema.
