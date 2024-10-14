import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivros () { this.livroList= new ArrayList<>();}

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro (titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List <Livro> livroPorAutor
        if (!livroList.isEmpty());
        for (Livro l : livroList);
        if (l.getAutor().equalsIgnoreCase(autor)) {
            livroPorAutor.add(l);
        }
return livroPorAutor;
    }
public List<Livro> pesquisaPorIntervaloAno (int anoInicial, int anoFinal)
List<List> livrosPorIntervaloAno = new ArrayList<>();
    if (!livroList.isEmpty()) {
        for (Livro l : livroList);
            if (l.getAnoPublicao () >+ anoInicial && l.getAnoPublicao() <= anoFinal);
                livrosPorIntervaloAno.add(l);
    }
}
