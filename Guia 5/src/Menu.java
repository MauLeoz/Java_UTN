import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Song> canciones;
    Playlist miLista;
    Scanner miScanner;

    public Menu(Playlist miLista) {
        this.canciones = bringSongs();
        this.miLista = miLista;
        this.miScanner = new Scanner(System.in);
    }

    public void menuCanciones() {
        int respuesta;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Elija una opcion (0 para volver)");

            System.out.println("1- Reproducir lista");
            System.out.println("2- Ver mi lista");
            System.out.println("3- Añadir Canción");
            System.out.println("4- Eliminar Canción");

            respuesta = miScanner.nextInt();

            switch (respuesta) {
                case 1:
                    reproducir();
                    break;
                case 2:
                    miLista.showPlaylist();
                    break;
                case 3:
                    elegirCancion();
                    break;
                case 4:
                    eliminarCancion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro no valido, Reintente...");
                    break;
            }
        } while (respuesta != 0);
    }

    public void reproducir() {
        String pausa;
        miLista.playMusic();
        System.out.println("Presione 'p' para pausar y regresar al menu.");
        do {
            pausa = miScanner.nextLine();
        } while (!pausa.equals("p"));
    }

    public void elegirCancion() {

        System.out.println("-----------------------------------");

        System.out.println("Elegir canción a agregar: ");

        int count = 0;
        for (Song cancionAux : canciones) {
            System.out.println(count + ": " + cancionAux.toString());
            count++;
        }
        int numeroCancion = miScanner.nextInt();
        Song cancion = canciones.get(numeroCancion);
        miLista.addSong(cancion);
        System.out.println("Cancion agregada correctamente.");
    }

    public void eliminarCancion() {

        System.out.println("-----------------------------------");

        System.out.println("Elegir canción a eliminar: ");

        miLista.showPlaylist();

        int numeroCancion = miScanner.nextInt();
        Song cancion = canciones.get(numeroCancion);
        miLista.deleteSong(cancion);
    }



    public static List<Song> bringSongs() {
        List<Song> songs = new ArrayList<Song>();

        Artist disturbed = new Artist("Disturbed", 25, Nationality.AMERICAN);
        Album theSickness = new Album("The Sickness", 2000, disturbed);
        Song downWithTheSickness = new Song("Down With The Sickness", "4:38", Genre.METAL, theSickness);
        songs.add(downWithTheSickness);

        Artist gunsNRoses = new Artist("Guns 'n Roses", 34, Nationality.AMERICAN);
        Album appetiteForDestruction = new Album("Appetite for Destruction", 1987, gunsNRoses);
        Song sweetChildOMine = new Song("Sweet Child o' Mine", "5:38", Genre.ROCK, appetiteForDestruction);
        songs.add(sweetChildOMine);

        Artist billieEilish = new Artist("Billie Eilish", 18, Nationality.AMERICAN);
        Album whenWeAllFallAsleep = new Album("When We All Fall Asleep, Where Do We Go?", 2019, billieEilish);
        Song badGuy = new Song("Bad Guy", "3:33", Genre.POP, whenWeAllFallAsleep);
        songs.add(badGuy);

        Artist queen = new Artist("Queen", 45, Nationality.BRITISH);
        Artist davidBowie = new Artist("David Bowie", 69, Nationality.AMERICAN);
        Album hotSpace = new Album("Hot Space", 1982, queen);
        Song underPressure = new Song("Under Pressure", "5:33", Genre.ROCK, hotSpace, davidBowie);
        songs.add(underPressure);

        Album newsOfTheWorld = new Album("News Of The World", 1977, queen);
        Song weWillRockYou = new Song("We Will Rock You", "5:21", Genre.ROCK, newsOfTheWorld);
        songs.add(weWillRockYou);

        Artist gorillaz = new Artist("Gorillaz", 21, Nationality.BRITISH);
        Album demonDays = new Album("Demon Days", 2005, gorillaz);
        Song feelGoodInc = new Song("Feel Good Inc", "4:25", Genre.ROCK, demonDays);
        songs.add(feelGoodInc);

        Artist michaelJackson = new Artist("Michael Jackson", 50, Nationality.AMERICAN);
        Album bad = new Album("Bad", 1987, michaelJackson);
        Song smoothCriminal = new Song("Smooth Criminal", "5:33", Genre.POP, bad);
        songs.add(smoothCriminal);

        Artist theWeeknd = new Artist("The Weeknd", 30, Nationality.CANADIAN);
        Artist daftPunk = new Artist("Daft Punk", 26, Nationality.FRENCH);
        Album starboy = new Album("Starboy", 2016, theWeeknd);
        Song iFeelItComing = new Song("I Feel It Coming", "4:33", Genre.POP, starboy, daftPunk);
        songs.add(iFeelItComing);

        Artist theStrokes = new Artist("The Strokes", 21, Nationality.AMERICAN);
        Album roomOnFire = new Album("Room On Fire", 2003, theStrokes);
        Song reptilia = new Song("Reptilia", "4:15", Genre.POP, roomOnFire);
        songs.add(reptilia);

        Album randomAccessMemories = new Album("Random Access Memories", 2013, daftPunk);
        Song instantCrush = new Song("Instant Crush ", "4:15", Genre.POP, randomAccessMemories, theStrokes);
        songs.add(instantCrush);

        return songs;
    }
}
