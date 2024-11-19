import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class CadastroDeProdutos {
    private Set <Produto> produtosSet;

public CadastroDeProdutos (){
    this.produtosSet = new HashSet<>();
}
public void adicionarProduto (long codigo, String nome, double preco, int quant){
    produtosSet.add(new Produto(codigo, nome, preco, quant));
}
public Set <Produto> exibirProdutosPorNome(){
    Set <Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
} 
/*public Set<Produto> exibirProdutosPorPreco() { 
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco()); 
        produtosPorPreco.addAll(produtosSet); 
        return produtosPorPreco; */
}

public static void main(String[] args) {
    CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();

    cadastroDeProdutos.adicionarProduto(025500044455, "sabão em pó", 10.00, 8);
    cadastroDeProdutos.adicionarProduto(000000455544, "salada",8.00, 10);
    cadastroDeProdutos.adicionarProduto(111115552, "barra de chocolate", 7.00, 12);
    cadastroDeProdutos.adicionarProduto(000225532552, "snacks", 5.00, 15);
    cadastroDeProdutos.adicionarProduto(222335, "refrigerante", 10.00, 12);
    cadastroDeProdutos.adicionarProduto(88866, "fini", 6.00, 10);
    
    cadastroDeProdutos.exibirProdutosPorNome();

    //cadastroDeProdutos.exibirProdutosPorPreco();

}
