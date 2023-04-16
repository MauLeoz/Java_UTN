public class Song {
    private String name;
    private String duration;
    private Genre genre;
    private Album album;
    private Artist invitedArtist;

    public Song() {
    }

    public Song(String name, String duration, Genre genre, Album album, Artist invitedArtist) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.invitedArtist = invitedArtist;
    }

    public Song(String name, String duration, Genre genre, Album album) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getInvitedArtist() {
        return invitedArtist;
    }

    public void setInvitedArtist(Artist invitedArtist) {
        this.invitedArtist = invitedArtist;
    }

    @Override
    public  String toString() {

        String invitado = "";
        if(invitedArtist != null)
            invitado = " - ft. " + invitedArtist;

        return name
                + invitado +
                " (" + duration + ") " +
                "- Genre: " + genre + " - " +
                this.getAlbum().toString();
    }
}
