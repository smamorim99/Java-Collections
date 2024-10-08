import java.util.ArrayList;
import java.util.List;




public class ListaTarefa {
    private static List<Tarefa> tarefasList;

    public ListaTarefa() {
        ListaTarefa.tarefasList = new ArrayList<>(); 
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
            for (Tarefa t : tarefasList){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
        }
       }
            tarefasList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }
    public void obterDescricoesTarefa(){
        System.out.println(tarefasList);
    }


public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa3");
        listaTarefa.adicionarTarefa("tarefa4");
        System.out.println("o numero de elemento na lista: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("tarefa3");
        System.out.println("o numero de elemento na lista: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefa();
}
}

 
