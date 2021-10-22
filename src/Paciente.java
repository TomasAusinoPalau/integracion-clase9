public class Paciente extends Usuario {
    private String sexo;
    private String discipilina;
    private int edad;
    private double pesoActual;
    private double medidaCintura;
    private PlanDeComidas planActivo;

    
    public Paciente(String nombre, String apellido, String sexo, String disciplina, int edad, double pesoActual, double medidaCintura) {
        super(nombre, apellido);
        this.sexo = sexo;
        this.discipilina = disciplina;
        this.edad = edad;
        this.pesoActual = pesoActual;
        this.medidaCintura = medidaCintura;

        
    }

    public void vincularPlan(PlanDeComidas planActivo) {
        this.setPlanActivo(planActivo);
    }

    public void aniadirRutina(RutinaDiaria rutina, int dia) {
        this.planActivo.agregarRutina(rutina, dia);

    }
    public void setPlanActivo(PlanDeComidas planActivo) {
        this.planActivo = planActivo;
    }

    public String getSexo() {
        return sexo;
    }
    public String getDiscipilina() {
        return discipilina;
    }
    public int getEdad() {
        return edad;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public double getMedidaCintura() {
        return medidaCintura;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setDiscipilina(String discipilina) {
        this.discipilina = discipilina;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

}
