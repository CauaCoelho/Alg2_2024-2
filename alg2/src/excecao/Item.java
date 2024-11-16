package excecao;

public class Item {
 private String nome;
 private Double preco;

 public Item(String nome, Double preco) {
	if (preco < 0) {
		throw new IllegalArgumentException("O valor não pode ser menor que 0!");
	}
	this.nome = nome;
	this.preco = preco;
 }

 public String getNome() {
	 return nome;
 }

 public void setNome(String nome) {
	 this.nome = nome;
 }

 public Double getPreco() {
	 return preco;
 }

 public void setPreco(Double preco) {
	 this.preco = preco;
 }

 @Override
 public String toString() {
	 return "Item [nome=" + nome + ", preco=" + preco + "]";
 }

 
}
