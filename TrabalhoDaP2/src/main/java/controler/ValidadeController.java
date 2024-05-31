package controler;

import produto.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ValidadeController{

    public class ProdutoController {

        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProdutoPU");

        public void cadastrarProduto() {
            // Implementação anterior
        }

        public void atualizarProduto() {
            // Implementação anterior
        }

        public void listarProdutosProximosValidade(int diasAntes) {
            EntityManager em = emf.createEntityManager();
            List<Produto> produtos = ((EntityManager) em).createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
            em.close();

            NotificadorValidade notificador = new NotificadorValidade();
            notificador.notificarProdutosProximosValidade(produtos, diasAntes);
        }

        public void gerarRelatorioValidade() {
            EntityManager em = emf.createEntityManager();
            List<Produto> produtos = em.createQuery("SELECT p FROM Produto p ORDER BY p.validade", Produto.class).getResultList();
            em.close();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("\n=== Relatório de Validade ===");
            for (Produto produto : produtos) {
                System.out.println("ID: " + produto.getId() + ", Marca: " + produto.getMarca() +
                        ", Validade: " + format.format(produto.getValidade()));
            }
        }

        private Date obterData(String mensagem, Scanner scanner) {
            // Implementação anterior
            return null;
        }

        private void salvarProduto(Produto produto) {
            // Implementação anterior
        }

        public void main(String[] args) {
            ProdutoController controller = new ProdutoController();

            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n=== Menu ===");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Atualizar Produto");
                System.out.println("3. Listar Produtos Próximos da Validade");
                System.out.println("4. Gerar Relatório de Validade");
                System.out.println("5. Sair");
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
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 5);

            scanner.close();
        }
    }

}