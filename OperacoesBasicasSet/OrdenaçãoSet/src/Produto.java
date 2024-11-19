import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long codigo;
    private String nome;
    private double preco;
    private int quant;

public Produto (long codigo, String nome, double preco, int quant){
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quant = quant;
}
public long getCodigo() {
    return codigo;
}
public String getNome() {
    return nome;
}
public double getPreco() {
    return preco;
}
public int getQuant() {
    return quant;
}
@Override
public boolean equals(Object obj) {
  if (this == obj)
  return true;
  if (!(obj instanceof Produto produto))
  return false;
  return getCodigo() == produto.getCodigo();
}
@Override
public int hashCode() {
return Objects.hash(getCodigo());
}
@Override
public String toString() {
 return '{' + "Produto" +
 ", código=" + codigo + '\'' +
 ", nome= " + nome + '\'' +
 ", preço= " +  preco + '\'' +
 ", quantidade= " + quant + 
 '}';
}
@Override
public int compareTo(Produto p){
return nome.compareToIgnoreCase(p.getNome());
}
class ComparatorPorPreco implements Comparator <Produto> {
    @Override
    public int compare(Produto p1, Produto p2){
    return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
    
}
    



