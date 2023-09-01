

/**
 *
 * @author DANIEL BARRANTES
 */
public class Quiz {

/*a partir del numero de horas de paseo y el numero de perros calcular el costo que debe pagar la persona, tener en cuenta que el paseo de un perro grande es de 10.000 col/h, perro mediano 5.000 cop/h perro pequeño 3.000p/h, si contratas mas de un perro te hacen el 10% de descuento del costo total*/
    
        
        private int horasPaseo;
        private int perrosGrandes;
        private int perrosMedianos;
        private int perrosPequeños;
        private int costoTotal;
        String calcularCostoPaseo;
  
        
    
    public int calcularCostoPaseo() {
        int costoTotal = (perrosGrandes * 10000 + perrosMedianos * 5000 + perrosPequeños * 3000) * horasPaseo;
        
        int totalPerros = perrosGrandes + perrosMedianos + perrosPequeños;
        if (totalPerros > 1) {
            double descuento = costoTotal * 0.10;
            costoTotal -= descuento;
            
        }
        
        
        return costoTotal;
    }

    public int getHorasPaseo() {
        return horasPaseo;
    }

    public void setHorasPaseo(int horasPaseo) {
        this.horasPaseo = horasPaseo;
    }

    public int getPerrosGrandes() {
        return perrosGrandes;
    }

    public void setPerrosGrandes(int perrosGrandes) {
        this.perrosGrandes = perrosGrandes;
    }

    public int getPerrosMedianos() {
        return perrosMedianos;
    }

    public void setPerrosMedianos(int perrosMedianos) {
        this.perrosMedianos = perrosMedianos;
    }

    public int getPerrosPequeños() {
        return perrosPequeños;
    }

    public void setPerrosPequeños(int perrosPequeños) {
        this.perrosPequeños = perrosPequeños;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
}

        
                
        
        
   
    

