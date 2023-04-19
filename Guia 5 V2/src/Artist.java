public class Artist {
    private String name;
    private int age;
    private String nationality;

    public Artist() {
    }

    public Artist(String name, int age, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.nationality = String.valueOf(nationality);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
