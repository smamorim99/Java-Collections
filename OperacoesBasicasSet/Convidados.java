package ConjutoConvidados;

import java.util.Objects;

public class Convidados { 
   private String nome; 
   private int codigo;
   
   public Convidados (String nome, int codigo){
    this.nome = nome;
    this.codigo = codigo; 
   }
   public String getNome() {
       return nome;
   }
   public int getCodigo() {
       return codigo;
   }
   @Override
   public boolean equals(Object c) {
       if (this == c) 
       return true;
       if (! (c instanceof  Convidados convidados))
       return false;
       return getCodigo() == convidados.getCodigo();
   }

   @Override public int hashCode(){
    return Objects.hash(getCodigo());
   }

   @Override
   public String toString() {
       return "Convidados{" + 
       "nome = '" + nome + '\'' +
       ", codigo = '" + codigo +
       '}';
    }
    }

