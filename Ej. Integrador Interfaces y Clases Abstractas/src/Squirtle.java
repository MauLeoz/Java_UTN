public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Hola, soy Squirtle y este es mi ataque araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola, soy Squirtle y este es mi ataque hidrobombra");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y este es mi ataque pistola agua");
    }
}


