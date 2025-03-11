public class TesteProdutos {
    public static void main(String[] args) {
        // Criando dois produtos
        Produto p1 = new Produto("Concha", 3, 5.99, 'U', true);
        Produto p2 = new Produto("Suco de laranja", 5, 7.50, 'B', true);
        Produto p3 = new Produto( "Pão frances", 9, 1.50, 'P', false);

        // Imprimindo detalhes dos produtos
        System.out.println("Detalhes do Produto 1:");
        p1.imprimirProduto();
        
        System.out.println("\nDetalhes do Produto 2:");
        p2.imprimirProduto();

        System.out.println("\nDetalhes do Produto 3:");
        p3.imprimirProduto();
    }
}

