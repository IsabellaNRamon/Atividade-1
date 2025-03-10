 public class Produto {
        private String descricao;
        private int quantidade;
        private double valorUnitario;
        private char setor; // Mercearia, Bebidas, Padaria, Utensilios
        private boolean disponivel;
    
        // Construtor padrão
        public Produto() {
        }
    
        // Construtor com parâmetros obrigatórios
        public Produto(String descricao, int quantidade, double valorUnitario, char setor, boolean disponivel) {
            this.setDescricao(descricao);
            this.setQuantidade(quantidade);
            this.setValorUnitario(valorUnitario);
            this.setSetor(setor);
            this.setDisponivel(disponivel);
        }
    
        // Métodos Getters e Setters
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        public int getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(int quantidade) {
            if (quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                throw new IllegalArgumentException("Quantidade não pode ser negativa.");
            }
        }
    
        public double getValorUnitario() {
            return valorUnitario;
        }
    
        public void setValorUnitario(double valorUnitario) {
            if (valorUnitario >= 0) {
                this.valorUnitario = valorUnitario;
            } else {
                throw new IllegalArgumentException("Valor unitário não pode ser negativo.");
            }
        }
    
        public char getSetor() {
            return setor;
        }
    
        public void setSetor(char setor) {
            if (setor == 'M' || setor == 'B' || setor == 'P' || setor == 'U') {
                this.setor = setor;
            } else {
                throw new IllegalArgumentException("Setor inválido. Use M, B, P ou U.");
            }
        }
    
        public boolean isDisponivel() {
            return disponivel;
        }
    
        public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }
    
        // Método para imprimir detalhes do produto
        public void imprimirProduto() {
            System.out.println("Descrição: " + descricao);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor Unitário: R$" + valorUnitario);
            System.out.println("Setor: " + setor);
            System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        }
    }
    
