public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Hola, soy Pikachu y este es mi ataque araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque puño trueno");
    }
}
