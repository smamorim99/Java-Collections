import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private static List<Item> itemList;

public CarrinhoDeCompra(){
    CarrinhoDeCompra.itemList = new ArrayList<>();
}    
public void adicionarItem (String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    CarrinhoDeCompra.itemList.add(item);
}
public void removerItem (String nome){
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itemList.isEmpty()) {
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)); {
                itensParaRemover.add(i);
            }
        }
    itemList.removeAll(itensParaRemover);
    } else {System.out.println("A lista está vazia!");}
    
}
public double calcularValor(){
    double valorTotal = 0d;
    if (itemList.isEmpty()){
        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
        } else { 
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exbirItens (){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    
    @Override
    public String toString() {
        return "carrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
    }
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("lapis", 2d, 3);
        carrinhoDeCompra.adicionarItem("lapis", 2d, 3);
        carrinhoDeCompra.adicionarItem("caderno", 35d, 1);
        carrinhoDeCompra.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompra.exbirItens();
        carrinhoDeCompra.removerItem("lapis");
        carrinhoDeCompra.exbirItens();

        System.out.println("O valor da compra é? " + carrinhoDeCompra.calcularValor());
    }
}

