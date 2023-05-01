package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Local {
    private int numeroLocal;
    private String direccion;
    private List<Plato> plato;
    private Map<String,Integer> recargosMetodosPago;

    public Local() {
    }

    public Local(int numeroLocal, String direccion) {
        this.numeroLocal = numeroLocal;
        this.direccion = direccion;
        this.plato = new ArrayList<>();
        this.recargosMetodosPago = new HashMap<>();
    }

    //region GETTER Y SETTER
    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Plato> getPlato() {
        return plato;
    }

    public void setPlato(List<Plato> plato) {
        this.plato = plato;
    }

    public Map<String, Integer> getRecargosMetodosPago() {
        return recargosMetodosPago;
    }

    public void setRecargosMetodosPago(Map<String, Integer> recargosMetodosPago) {
        this.recargosMetodosPago = recargosMetodosPago;
    }
    //endregion


    @Override
    public String toString() {
        return "Local{" +
                "numeroLocal=" + numeroLocal +
                ", direccion='" + direccion + '\'' +
                ", plato=" + plato +
                ", recargosMetodosPago=" + recargosMetodosPago +
                '}';
    }
}
