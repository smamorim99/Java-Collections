package ordenação;

import java.util.Comparator;

class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;

    public Pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, getIdade());
        
    } 

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Pessoa{" + 
        "nome ="  + nome + '\'' + 
        ", idade=" + idade + 
        ", altura=" +  altura +
        '}';
    }
    public static class comparatorPorAltura implements Comparator<Pessoa>{
        
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return Double.compare(o1.getAltura(), o2.getAltura());
            
        }
    
        
    }
}