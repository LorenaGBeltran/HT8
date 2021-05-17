/**
 * 
 */

/**
 * @author loren
 *
 * @param <E>
 */

public class Paciente<E> implements Comparable<E>{
    
    private String nombre;
    private String sintoma;
    private String prioridad;
    
    /**
     * @param nombre
     * @param sintoma
     * @param prioridad
     */
    public Paciente(String nombre, String sintoma, String prioridad){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }
    
    /**
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * @param sintoma
     */
    public void setSintoma(String sintoma){
        this.sintoma = sintoma;
    }
    /**
     * @param prioridad
     */
    public void setProri(String prioridad){
        this.prioridad = prioridad;
    }
    /**
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * @return sintoma
     */
    public String getSintoma(){
        return sintoma;
    }
    /**
     * @return prioridad
     */
    public String getPrioridad(){
        return prioridad;
    }
    
    /**
     *@return String
     */
    public String toString(){
        return nombre + "," + sintoma + "," + prioridad;
    }
       

    @Override
    public int compareTo(E nuevoPa) {
        String nPriority = ((Paciente<?>)nuevoPa).getPrioridad();        
        return prioridad.compareTo(nPriority);
        
    }

       
    
}



