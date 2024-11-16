package excecao;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	ArrayList<Item> itens = new ArrayList<>();

	public void adicionarItem(Item item) throws ItemInvalidoException{
		if (item == null) {
		throw new ItemInvalidoException("O item não pode ser nulo!");
		} else {
			itens.add(item);
		}
	}
	
	public void listarItens() {
		if (itens.isEmpty()) {
			System.out.println("A lista está vazia. Adicione um item.");
		} else {
			for (Item item : itens) {
				System.out.println(item);
			}
		}
	}
	
	public double calcularTotal () {
		double total = 0;
		
		for (Item item : itens) {
			total += item.getPreco();
		}
		return total;
	}
}
