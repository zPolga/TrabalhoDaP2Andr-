package produto;

import controler.Fornecedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Produto {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProdutoPU");

    public Produto() {
    }

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Produto ===");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Quantidade recebida: ");
        int quantidadeRecebida = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Preço de compra: ");
        double precoCompra = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Preço de venda: ");
        double precoVenda = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("\n=== Cadastro de Fornecedor ===");

        System.out.print("Nome do fornecedor: ");
        String nomeFornecedor = scanner.nextLine();

        System.out.print("Endereço do fornecedor: ");
        String enderecoFornecedor = scanner.nextLine();

        System.out.print("Telefone do fornecedor: ");
        String telefoneFornecedor = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(nomeFornecedor, enderecoFornecedor, telefoneFornecedor);

        System.out.print("Data de validade (dd/mm/aaaa): ");
        Date validade = obterData("Data de validade (dd/mm/aaaa): ", scanner);

        System.out.print("Quantidade mínima em estoque: ");
        int quantidadeMinimaEstoque = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Código de barras: ");
        String codigoBarras = scanner.nextLine();

        Produto produto = new Produto(
        );

        salvarProduto(produto);
    }

    public void atualizarProduto() {
        // Implementação anterior
    }

    public void listarProdutosProximosValidade(int diasAntes) {
        // Implementação anterior
    }

    public void gerarRelatorioValidade() {
        // Implementação anterior
    }

    public void registrarEntradaProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Registro de Entrada de Produto ===");

        System.out.print("Código de barras: ");
        String codigoBarras = scanner.nextLine();

        EntityManager em = emf.createEntityManager();
        Produto produto = em.createQuery("SELECT p FROM Produto p WHERE p.codigoBarras = :codigoBarras", Produto.class)
                .setParameter("codigoBarras", codigoBarras)
                .getSingleResult();

        if (produto == null) {
            System.out.println("Produto não encontrado no sistema. Realizando cadastro...");

            cadastrarNovoProduto(codigoBarras);
        } else {
            System.out.print("Quantidade recebida: ");
            int quantidadeRecebida = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            produto.setQuantidadeRecebida(produto.getQuantidadeRecebida() + quantidadeRecebida);
            salvarProduto(produto);

            System.out.println("Entrada de produto registrada com sucesso!");
        }

        em.close();
    }

    private void setQuantidadeRecebida(int i) {

    }

    private Object getQuantidadeRecebida() {
        Object o = null;
        return o;
    }

    private void cadastrarNovoProduto(String codigoBarras) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Cadastro de Novo Produto ===");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Quantidade recebida: ");
        int quantidadeRecebida = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Preço de compra: ");
        double precoCompra = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Preço de venda: ");
        double precoVenda = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("\n=== Cadastro de Fornecedor ===");

        System.out.print("Nome do fornecedor: ");
        String nomeFornecedor = scanner.nextLine();

        System.out.print("Endereço do fornecedor: ");
        String enderecoFornecedor = scanner.nextLine();

        System.out.print("Telefone do fornecedor: ");
        String telefoneFornecedor = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(nomeFornecedor, enderecoFornecedor, telefoneFornecedor);

        System.out.print("Data de validade (dd/mm/aaaa): ");
        Date validade = obterData("Data de validade (dd/mm/aaaa): ", scanner);

        System.out.print("Quantidade mínima em estoque: ");
        int quantidadeMinimaEstoque = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produto novoProduto = new Produto(
        );

        salvarProduto(novoProduto);

        System.out.println("Produto cadastrado e entrada registrada com sucesso!");
    }

    private Date obterData(String mensagem, Scanner scanner) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date data = null;
        while (data == null) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            try {
                data = format.parse(input);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        }
        return data;
    }

    private void salvarProduto(Produto produto) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(produto); // Usamos merge para atualizar um produto existente
            tx.commit();
            System.out.println("Produto atualizado com sucesso!");
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Erro ao atualizar produto: " + e);
        } finally {
            em.close();
        }
    }

    public static void main(String[] args) {
        Produto controller = new Produto();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Listar Produtos Próximos da Validade");
            System.out.println("4. Gerar Relatório de Validade");
            System.out.println("5. Registrar Entrada de Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    controller.cadastrarProduto();
                    break;
                case 2:
                    controller.atualizarProduto();
                    break;
                case 3:
                    System.out.print("Quantos dias antes para notificação? ");
                    int diasAntes = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    controller.listarProdutosProximosValidade(diasAntes);
                    break;
                case 4:
                    controller.gerarRelatorioValidade();
                    break;
                case 5:
                    controller.registrarEntradaProduto();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
