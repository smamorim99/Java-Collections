public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicao;

public Livro(String titulo, String autor, int anoPublicao){
    this.titulo;
    this.autor;
    this.anoPublicao;
}
public String getTitulo() {
    return titulo;
}
public String getAutor() {
    return autor;
}
public int getAnoPublicao() {
    return anoPublicao;
}
@Override
public String toString() {
    return "Livro{" + 
    "titulo='" + titulo + '\'' +
    ", autor='" + autor + '\'' +
    ", anoPublicacao=" + anoPublicao +
    '}';
}

     
}