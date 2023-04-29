package Models;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Barco> puerto;

    public Puerto() {
        this.puerto = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puerto{");
        for (Barco barquito : puerto) {
            sb.append(barquito.toString()); // agrega la representación en cadena del barco
            sb.append("  patente=").append(barquito.getPatente()); // agrega la patente del barco
            sb.append(" ; ");

        }
        sb.append('}');
        return sb.toString();
    }

    public void addBarco(Barco barco){
        if(!puerto.contains(barco)){
            puerto.add(barco);
        }else{
            System.out.println("Patente ya registrada.");
        }
    }

    public void pescar(){
        for(Barco barquito : puerto){
            if(barquito instanceof IPesca){
                ((IPesca) barquito).pescar();
            }
        }
    }

    public int size(){
        return puerto.size();
    }
    public void getMontosTotales(){
        int cantCorbeta=0;
        int cantLanchaAmarilla=0;
        for(Barco barquito : puerto){
            if(barquito instanceof Corbeta){
                cantCorbeta+=((Corbeta) barquito).getMonto();
            }
            else if(barquito instanceof LanchaAmarilla) {
                cantLanchaAmarilla += ((LanchaAmarilla) barquito).getMonto();
            }
        }
        System.out.println("El monto total recaudado por las corbetas fue de: "+ cantCorbeta +" dolares");
        System.out.println("El monto total recaudado por las lanchas amarillas fue de: "+ cantLanchaAmarilla +" dolares");
        System.out.println("El monto total recaudado fue de: "+ (cantCorbeta+cantLanchaAmarilla) +" dolares");
    }




}