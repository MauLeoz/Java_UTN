import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class VideoStore {
    private ArrayList<Film> listaFilms;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Alquiler> listaAlquiler;

    public VideoStore() {
    }

    public VideoStore(ArrayList<Film> listaFilms, ArrayList<Cliente> listaCliente, ArrayList<Alquiler> listaAlquiler) {
        this.listaFilms = listaFilms;
        this.listaCliente = listaCliente;
        this.listaAlquiler = listaAlquiler;
    }

    public ArrayList<Film> getListaFilms() {
        return listaFilms;
    }

    public void setListaFilms(ArrayList<Film> listaFilms) {
        this.listaFilms = listaFilms;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Alquiler> getListaAlquiler() {
        return listaAlquiler;
    }

    public void setListaAlquiler(ArrayList<Alquiler> listaAlquiler) {
        this.listaAlquiler = listaAlquiler;
    }

    public Film existeFilm(String titulo) {
        for (Film film : listaFilms) {
            if (film != null && film.getTitulo().equals(titulo)) {
                return film;
            }
        }
        return null;
    }

    public int hayStock(Film film) {
        return film.getStock();
    }

    public Cliente existeCliente(String nombre) {
        for (Cliente cliente : listaCliente) {
            if (cliente != null && cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public Alquiler generarAlquiler(Cliente cliente, Film film) {
        Alquiler alquiler = new Alquiler(film, cliente);
        return alquiler;
    }

    public void agregarCliente(String nombre, Integer telefono, String direccion) {
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        listaCliente.add(cliente);
        System.out.println("Cliente agregado con exito");
    }

    public Alquiler existeAlquiler(int id) {
        for (Alquiler alquiler : listaAlquiler) {
            if (alquiler != null && alquiler.getId()==id) {
                return alquiler;
            }
        }
        return null;
    }

    public void eliminarAlquiler(int id){
        for (Alquiler alquiler : listaAlquiler) {
            if (alquiler != null && alquiler.getId()==id) {
                listaAlquiler.remove(alquiler);
                break;
            }
        }
    }

    public void verAlquileres(){
        for (Alquiler alquiler : listaAlquiler) {
            System.out.println(alquiler);
        }
    }

    public void vencenHoy(){
        for (Alquiler alquiler : listaAlquiler) {
            if (alquiler != null && alquiler.getDevolucion()==LocalDate.now()){
            System.out.println(alquiler);
        }else{
                System.out.println("No hay alquileres que venzan hoy");}
        }
    }

    public void mostarUltimos10(String nombre){
        for (Alquiler alquiler : listaAlquiler) {
            if(alquiler != null && alquiler.getCliente().equals(nombre)){
                List<Alquiler> ultimos10 = listaAlquiler.subList(Math.max(listaAlquiler.size() - 10, 0), listaAlquiler.size());
                for (Alquiler elemento : ultimos10) {
                    System.out.println(elemento);
            }
        }else{
                System.out.println("El cliente no registras alquileres");}
        }
    }













}



