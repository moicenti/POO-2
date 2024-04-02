
public class Libro {
ISBN isbn = new ISBN();
private String nombre = new String();
private String autor = new String();
private int paginas;
private long id; 

public Libro(String name, String Autor, int pages, long isbn){
this.nombre = name;
this.autor = Autor;
this.paginas = pages;
this.id = isbn;
}
public Libro(String name, String Autor,int pages){
this.nombre = name;
this.autor=Autor;
this.paginas=pages;
this.id = isbn.generador();
}

public String getNombre(){return nombre;}
public String getAutor(){return autor;}  
public int getPAginas(){return paginas;}
public long getId(){return id;}
}