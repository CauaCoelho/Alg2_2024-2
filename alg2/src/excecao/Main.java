package excecao;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        try {
            Eletronico laptop = new Eletronico("Laptop", 2500.00, "Dell");
            Alimento fruta = new Alimento("Banana", 3.50, "10/11/2024");
            Eletronico celular = new Eletronico("Celular", 1500.00, "Samsung");

            carrinho.adicionarItem(laptop);
            carrinho.adicionarItem(fruta);
            carrinho.adicionarItem(celular);

            System.out.println("Itens no carrinho:");
            carrinho.listarItens();
            System.out.println("Total: R$" + carrinho.calcularTotal());
        } catch (ItemInvalidoException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro de preço: " + erro.getMessage());
        }
    }
}
