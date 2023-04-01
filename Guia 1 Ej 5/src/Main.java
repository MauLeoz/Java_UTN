public class Main {
    public static void main(String[] args) {


        Hora horaActual = new Hora(22, 30, 45);
        horaActual.imprimirHora();
        horaActual.avanzarSegundo().imprimirHora();
        horaActual.retrocederSegundo().imprimirHora();
        horaActual.setHora(23);
        horaActual.setMinuto(59);
        horaActual.setSegundo(59);
        horaActual.imprimirHora();
        horaActual.avanzarSegundo().imprimirHora(); 
        horaActual.retrocederSegundo().imprimirHora();


    }
}