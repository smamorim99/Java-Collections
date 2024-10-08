import java.util.Comparator;

class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;

    }

    public int compareTo(Livro 1) {
            return titulo.compareTo(1.titulo);
    }

    public String getTitulo() {
            return titulo;
    }
    public String getAutor() {
            return autor;
    }
    public int getAno() {
            return ano;
    }

 
    
}


public class  compararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro 11, livro 12) {
        return interger.compare(11.getAno(), 12.getAno());
             if (l1.getAno() < l2.getAno())
			    return -1;
		    if (l1.getAno() > l2.getAno())
			    return 1;
		    else
			    return 0;
    }
    
}

class compararAutorTitulo implements Comparator<Livro>{
    @Override
    public int compare(Livros 11, Livro 12) {
        int ano = interger.compare(11.getAno(), 12.getAno());
            if (ano != 0)
                return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
            if (autor != 0)
        return autor;
            return l1.getTitulo().compareTo(l2.getTitulo());
    }
}