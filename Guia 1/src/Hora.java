public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }



    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
    }
    public int getHora() {
        return hora;
    }


    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
    }

    public int getMinuto() {
        return minuto;
    }


    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
    }
    public int getSegundo() {
        return segundo;
    }


    public void imprimirHora(){
        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
    }

    public Hora avanzarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
        return this;
    }

    public Hora retrocederSegundo() {
        segundo--;
        if (segundo == -1) {
            segundo = 59;
            minuto--;
            if (minuto == -1) {
                minuto = 59;
                hora--;
                if (hora == -1) {
                    hora = 23;
                }
            }
        }
        return this;
    }


}
