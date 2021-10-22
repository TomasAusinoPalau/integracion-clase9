import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;
import javax.xml.namespace.QName;

public class PlanDeComidas {
    private float pesoActual, medidaCinturaActual;
    private ArrayList<String> objetivos;
    private String necesidad;
    private String observaciones;
    private Duracion duracion;
    private Calificacion calificacion;
    private RutinaDiaria[] rutinasDiarias;
    private ArrayList<Comida> colaciones;

    // private RutinaDiaria rutina;

    public enum Duracion {
        SEMANAL(7), QUINCENAL(14), MENSUAL(21);

        private int dias;

        private Duracion (int dias) {
            this.dias = dias;
        }

        public int getDias() {
            return this.dias;
        }
    }
    public enum Calificacion {
        EXELENTE("excelente"), BUENA("buena"), REGULAR("regular"); 

        private String calificacion;

        private Calificacion(String c) {
            this.calificacion = c;
        }

        public String getCalificacion() {
            return this.calificacion;
        }
    }

    public PlanDeComidas(float peso, float medida, int duracion) {
        this.pesoActual = peso;
        this.medidaCinturaActual = medida;
        this.inicializar(duracion);
        this.rutinasDiarias = new RutinaDiaria[duracion];

    }

    

    private void inicializar(int duracion) {
        switch(duracion) {
            case 7: 
                this.duracion = Duracion.SEMANAL;
                break;
            case 14:
                this.duracion = Duracion.QUINCENAL;
                break;
            case 30:
                this.duracion = Duracion.MENSUAL;
        }
    }

    public void establecerObjetivo(String objetivo) {
        this.objetivos.add(objetivo);
    }
    
    public ArrayList<String> getObjetivos() {
        return objetivos;
    }

    public void realizarObservaciones(String obs) {
        this.observaciones = obs;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public void calificar(String devolucion) {
        devolucion = devolucion.trim().toLowerCase();
        switch(devolucion) {
            case "excelente":
                this.calificacion = Calificacion.EXELENTE;
                break;
            case "buena":
                this.calificacion = Calificacion.BUENA;
                break;
            case "regular":
                this.calificacion = Calificacion.REGULAR;
        }
    }

    public String getCalificacion() {
        return this.calificacion.getCalificacion();
    }

    public void agregarRutina(RutinaDiaria rutina, int dia) {
        this.rutinasDiarias[dia - 1] = rutina;
    }




}
 