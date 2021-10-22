import java.util.ArrayList;

public class Profesional extends Usuario {
    private String especialidad;
    private String matricula;
    private ArrayList<PlanDeComidas> planes;
    
    public Profesional(String nombre, String apellido) {
        super(nombre, apellido);
        this.especialidad = "Nutricionista";
        this.inicializar();
    }

    private void inicializar() {
        planes = new ArrayList<PlanDeComidas>();
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String getMatricula() {
        return matricula;
    }

    public ArrayList<PlanDeComidas> getPlanes() {
        return planes;
    }

    public void aniadirPlan(PlanDeComidas plan) {
        this.planes.add(plan);
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void diseniarPlanAlimenticio(float peso, float medida, int duracion, Paciente paciente) {
        PlanDeComidas planActual = new  PlanDeComidas(peso, medida, duracion);
        aniadirPlan(planActual);

        paciente.vincularPlan(planActual);

        //registrar paciente
        //establecer duracion
        //establecer objetivos
        //asignar profesional al plan
        //establecer rutinaDiariaDeseada(prote, carb, vegetal)
    }

    public

}
