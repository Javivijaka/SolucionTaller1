package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVariables;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }
    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }
    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVariables() {
        return gastoVariables;
    }
    public void setGastoVariables(Integer gastoVariables) {
        this.gastoVariables = gastoVariables;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase


    public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        Double calculo = new Double(1);
        calculo = (ingresosTotales - gastosFijos - gastoVariables)*POR_FIJO;
        return calculo.toString();
    }
}
