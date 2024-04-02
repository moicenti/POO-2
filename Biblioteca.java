import java.util.*;

public class Biblioteca {

private List<Libro> libros;

public Biblioteca(){this.libros = new ArrayList<>();}

public void agregarLibro(Libro libro){ libros.add(libro);}

public void mostrarLIbros(){

System.out.println("Libros en la biblioteca:" + libros.size());
libros.forEach(libro -> {
System.out.println("Autor:"+ libro.getAutor()) ;
System.out.println("nombre:"+ libro.getNombre());
System.out.println("Autor:"+ libro.getPAginas());  
System.out.println("Autor:"+ libro.getId()) ;

});

}}