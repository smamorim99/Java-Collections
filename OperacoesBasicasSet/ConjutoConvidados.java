package ConjutoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    private Set <Convidados> convidadosSet;

public ConjutoConvidados() {
    this.convidadosSet = new HashSet<>();

}
public void adicionarConvidadoSet (String nome, int codigo){
    convidadosSet.add(new Convidados(nome, codigo));
}
public void removerConvidadoPeloCodigo(int codigo){
     Convidados convidadoParaRemover = null;
    for (Convidados c : convidadosSet ){
        if (c.getCodigo()== codigo ){
            convidadoParaRemover = c;
            break;
        }
    }
    convidadosSet.remove(convidadoParaRemover);
}
public int contarConvidados (){
    return convidadosSet.size();
}
public void exibirConvidados (){
    System.out.println(convidadosSet);
}
public static void main(String[] args) {
    ConjutoConvidados conjutoConvidados = new ConjutoConvidados();

    System.out.println("exitem" + conjutoConvidados.contarConvidados() + "dentro deste set." );

    conjutoConvidados.adicionarConvidadoSet("convidado 1 ", 1230);
    conjutoConvidados.adicionarConvidadoSet("convidado 2 ", 1234);
    conjutoConvidados.adicionarConvidadoSet("convidado 3 ", 1235);
    conjutoConvidados.adicionarConvidadoSet("convidado 4 ", 1230);
    conjutoConvidados.adicionarConvidadoSet("convidado 5 ", 1236);

    System.out.println("exitem" + conjutoConvidados.contarConvidados() + "dentro deste set." );

    conjutoConvidados.exibirConvidados();

    //conjutoConvidados.removerConvidadoPeloCodigo(1230);
    conjutoConvidados.removerConvidadoPeloCodigo(1235);

    conjutoConvidados.exibirConvidados();
}
}

