import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
   private Set <Contato> contatosSet;

public AgendaContatos (){
    this.contatosSet = new HashSet<>();
}
public void adicionarContatoSet (String nome, int telefone){
    contatosSet.add(new Contato(nome, telefone));
}
public void exibirContatos(){
    System.out.println(contatosSet);
}
public Set <Contato> pesquisarPorNome (String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato c : contatosSet ){
        if (c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
        }
    }
    return contatosPorNome;
}
public Contato atualizarContatoNumero (String nome, int novoNumero){
    Contato contatoAtualizado = null;
    for (Contato c : contatosSet){
        if (c.getNome().equalsIgnoreCase(nome)){
            c.setTelefone(novoNumero);
            contatoAtualizado = c;
            break;
        }
       } 
       return contatoAtualizado; 
      }
public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();
    
    agendaContatos.adicionarContatoSet("sabrina", 123456);
    agendaContatos.adicionarContatoSet("sabrina", 0);
    agendaContatos.adicionarContatoSet("Carol", 123321);
    agendaContatos.adicionarContatoSet("Sabrina S", 1111156);
    agendaContatos.adicionarContatoSet("Sabrina Cavalcante", 55556456);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Sabrina"));

    System.out.println("Contato atualizado:" + agendaContatos.atualizarContatoNumero("Sabrina S", 4555555));
}
    }

   
