package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProdutoController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProdutoPU");

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

        Produto produto = new Produto(marca, categoria, quantidadeRecebida, precoCompra, precoVenda,
                fornecedor, validade, quantidadeMinimaEstoque, codigoBarras);

        salvarProduto(produto);
    }

    public void atualizarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Atualização de Produto ===");

        System.out.print("Código de barras do produto a ser atualizado: ");
        String codigoBarras = scanner.nextLine();

        EntityManager em = emf.createEntityManager();
        Produto produto = em.createQuery("SELECT p FROM Produto p WHERE p.codigoBarras = :codigoBarras", Produto.class)
                .setParameter("codigoBarras", codigoBarras)
                .getSingleResult();

        if (produto == null) {
            System.out.println("Produto não encontrado no sistema.");
        } else {
            System.out.print("Marca [" + produto.getMarca() + "]: ");
            String marca = scanner.nextLine();
            if (!marca.isEmpty()) {
                produto.setMarca(marca);
            }

            System.out.print("Categoria [" + produto.getCategoria() + "]: ");
            String categoria = scanner.nextLine();
            if (!categoria.isEmpty()) {
                produto.setCategoria(categoria);
            }

            System.out.print("Quantidade recebida [" + produto.getQuantidadeRecebida() + "]: ");
            String strQuantidadeRecebida = scanner.nextLine();
            if (!strQuantidadeRecebida.isEmpty()) {
                int quantidadeRecebida = Integer.parseInt(strQuantidadeRecebida);
                produto.setQuantidadeRecebida(quantidadeRecebida);
            }

            System.out.print("Preço de compra [" + produto.getPrecoCompra() + "]: ");
            String strPrecoCompra = scanner.nextLine();
            if (!strPrecoCompra.isEmpty()) {
                double precoCompra = Double.parseDouble(strPrecoCompra);
                produto.setPrecoCompra(precoCompra);
            }

            System.out.print("Preço de venda [" + produto.getPrecoVenda() + "]: ");
            String strPrecoVenda = scanner.nextLine();
            if (!strPrecoVenda.isEmpty()) {
                double precoVenda = Double.parseDouble(strPrecoVenda);
                produto.setPrecoVenda(precoVenda);
            }

            System.out.print("Nome do fornecedor [" + produto.getFornecedor().getNome() + "]: ");
            String nomeFornecedor = scanner.nextLine();
            if (!nomeFornecedor.isEmpty()) {
                produto.getFornecedor().setNome(nomeFornecedor);
            }

            System.out.print("Endereço do fornecedor [" + produto.getFornecedor().getEndereco() + "]: ");
            String enderecoFornecedor = scanner.nextLine();
            if (!enderecoFornecedor.isEmpty()) {
                produto.getFornecedor().setEndereco(enderecoFornecedor);
            }

            System.out.print("Telefone do fornecedor [" + produto.getFornecedor().getTelefone() + "]: ");
            String telefoneFornecedor = scanner.nextLine();
            if (!telefoneFornecedor.isEmpty()) {
                produto.getFornecedor().setTelefone(telefoneFornecedor);
            }

            System.out.print("Data de validade (dd/mm/aaaa) [" + produto.getValidade() + "]: ");
            String strValidade = scanner.nextLine();
            if (!strValidade.isEmpty()) {
                Date validade = obterData("Data de validade (dd/mm/aaaa): ", new Scanner(strValidade));
                produto.setValidade(validade);
            }

            System.out.print("Quantidade mínima em estoque [" + produto.getQuantidadeMinimaEstoque() + "]: ");
            String strQuantidadeMinimaEstoque = scanner.nextLine();
            if (!strQuantidadeMinimaEstoque.isEmpty()) {
                int quantidadeMinimaEstoque = Integer.parseInt(strQuantidadeMinimaEstoque);
                produto.setQuantidadeMinimaEstoque(quantidadeMinimaEstoque);
            }

            salvarProduto(produto);
            System.out.println("Produto atualizado com sucesso!");
        }

        em.close();
    }

    public void listarProdutos() {
        EntityManager em = emf.createEntityManager();
        List<Produto> produtos = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
        em.close();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("\n=== Produtos Cadastrados ===");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void calcularEAtualizarEstoque() {
        EntityManager em = emf.createEntityManager();
        List<Produto> produtos = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();

        for (Produto produto : produtos) {
            if (produto.getQuantidadeRecebida() < produto.getQuantidadeMinimaEstoque()) {
                System.out.println("Alerta: O produto " + produto.getMarca() + " precisa de reposição no estoque!");
            }
        }

        em.close();
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
        ProdutoController controller = new ProdutoController();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Listar Produtos Próximos da Validade");
            System.out.println("4. Gerar Relatório de Validade");
            System.out.println("5. Registrar Entrada de Produto");
            System.out.println("6. Registrar Saída de Produto");
            System.out.println("7. Listar Produtos em Estoque");
            System.out.println("8. Calcular e Atualizar Estoque");
            System.out.println("9. Sair");
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
                    System.out.print("Quant
