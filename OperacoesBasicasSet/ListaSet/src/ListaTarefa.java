import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set <Tarefa> tarefasSet;
public ListaTarefa(){
    this.tarefasSet = new HashSet<>();
}
public void adicionarTarefa (String descricao){
    tarefasSet.add(new Tarefa(descricao));
}
public void removerTarefa (String descricao){
    tarefasSet.removeIf(tarefasSet -> tarefasSet.getDescricao().equals(descricao));
}
public void exibirTarefas (){
    System.out.println(tarefasSet);
}
public int contarTarefas (){
    return tarefasSet.size();
}
public Set <Tarefa> tarefasConcluidas(){
    Set <Tarefa> concluidas = new HashSet<>();
    for (Tarefa t : tarefasSet){
        if (t.isConcluida()){
            concluidas.add(t);

        }
    }
    return concluidas;
}
public Set <Tarefa> tarefasPendentes (){
    Set <Tarefa> pendentes = new HashSet<>();
    for (Tarefa t : tarefasSet){
        if (!t.isConcluida()){
            pendentes.add(t);
        }
    }
    return pendentes;
}
public void marcarconcluidas (String descricao){
    for (Tarefa tarefa : tarefasSet){
        if (tarefa.getDescricao().equals(descricao)){
            tarefa.setConcluida(true);
            break;
        }
    }
}
public void marcarPendentes (String descricao){
    for (Tarefa tarefa : tarefasSet){
        if (tarefa.getDescricao().equals(descricao)){
            tarefa.setConcluida(false);
            break;
        }
    }
}
public void limparTarefas (){
    tarefasSet.clear();
}
public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    
    listaTarefa.exibirTarefas();

    listaTarefa.adicionarTarefa("dobrar roupa");
    listaTarefa.adicionarTarefa("Arrumar a casa");
    listaTarefa.adicionarTarefa("Estudar");
    listaTarefa.adicionarTarefa("limpar o chão");
    listaTarefa.adicionarTarefa("Trabalhar");

    listaTarefa.exibirTarefas();

    /*listaTarefa.marcarconcluidas("Arrumar a Casa");
    listaTarefa.marcarconcluidas("limpar o chão");

    listaTarefa.marcarPendentes("dobrar roupa");
    listaTarefa.marcarPendentes("Estudar");
    listaTarefa.marcarPendentes("Trabalhar");/* */

    

    /*System.out.println("tarefas pendentes: " + listaTarefa.tarefasPendentes());
    System.out.println("tarefas concluidas: "+ listaTarefa.tarefasConcluidas());
    
    listaTarefa.limparTarefas();
    listaTarefa.exibirTarefas();/* */
}
}


