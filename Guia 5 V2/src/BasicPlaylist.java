import java.util.Stack;

public class BasicPlaylist extends Playlist {
    private Stack<Song> myPlaylist ;

    public BasicPlaylist() {
        this.myPlaylist = new Stack<Song>();
    }

    public BasicPlaylist(Stack<Song> myPlaylist) {
        this.myPlaylist = myPlaylist;
    }

    public BasicPlaylist(String name, Stack<Song> myPlaylist) {
        super(name);
        this.myPlaylist = myPlaylist;
    }

    public Stack<Song> getMyPlaylist() {
        return myPlaylist;
    }

    public void setMyPlaylist(Stack<Song> myPlaylist) {
        this.myPlaylist = myPlaylist;
    }

    @Override
    public void playMusic() {

        Song song = myPlaylist.pop();
        Stack<Song> listaAux = new Stack();

        for (Song SongAux : myPlaylist) {
            listaAux.push(SongAux);
        }
        listaAux.push(song);

        myPlaylist = listaAux;
        System.out.println("Reproduciendo: " + song.toString());
    }


    @Override
    public void addSong(Song song) {this.myPlaylist.push(song);
    }

    @Override
    public void deleteSong(Song song) {
        System.out.println("“Para acceder a estas opciones, compre el paquete PREMIUM.");
    }

    @Override
    public void showPlaylist() {
        System.out.println(this.getName());
        int count = 0;
        for (Song cancionAux : myPlaylist) {
            System.out.println(count + ": " + cancionAux.toString());
            count++;
        }
    }
}
