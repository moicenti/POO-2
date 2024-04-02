public class Main{
public static void main(String[] args){
Biblioteca biblio = new Biblioteca();
Libro libro1 = new Libro("libro1","yo",10,1983420);
Libro libro2 = new Libro("libro2","yo",1000);
Libro libro3 = new Libro("libro3","yo",100);
biblio.agregarLibro(libro1);
biblio.agregarLibro(libro2);
biblio.agregarLibro(libro3);
biblio.mostrarLIbros();

}
}

