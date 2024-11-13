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
}


