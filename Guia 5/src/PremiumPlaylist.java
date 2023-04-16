import java.util.LinkedList;

public class PremiumPlaylist extends Playlist{
    LinkedList<Song> myPlaylist;

    public PremiumPlaylist() {
    }

    public PremiumPlaylist(LinkedList<Song> myPlaylist) {
        this.myPlaylist = myPlaylist;
    }

    public PremiumPlaylist(String name, LinkedList<Song> myPlaylist) {
        super(name);
        this.myPlaylist = myPlaylist;
    }



    @Override
    public void playMusic() {
        Song cancion = myPlaylist.removeFirst();

        myPlaylist.addLast(cancion);

        System.out.println("Reproduciendo: " + cancion.toString());
    }

    @Override
    public void addSong(Song song) {
        this.myPlaylist.add(song);
    }

    @Override
    public void deleteSong(Song song) {
        this.myPlaylist.remove(song);
    }

    @Override
    public void showPlaylist() {
        System.out.println(this.getName());
        int count = 0;
        for (Song cancionAux : myPlaylist){
            System.out.println(count + ": " + cancionAux.toString());
            count ++;
        }
    }
}
