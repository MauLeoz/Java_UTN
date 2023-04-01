public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Autor autor = new Autor("Joshua", "Bloch","joshua@email.com",'M');
        Autor autor2 = new Autor("Mau", "Leoz","mleoz@email.com",'M');

        System.out.println(autor);
        System.out.println(autor2);

        Libro libro = new Libro("Effective Java", 450, 150, autor,autor2);
        System.out.println(libro);

        //Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
       // cantidad en 50 copias.

        libro.setPrecio(500);
        libro.setStock(200);

        System.out.println(libro);

        System.out.println(libro.getAutor());
        System.out.println(libro.getAutor2());

        libro.imprimirMensaje();





    }


}