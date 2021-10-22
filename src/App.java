public class App {
    public static void main(String[] args) throws Exception {
        /*
            1. Identificar el problema. Que hay que hacer y como.
            2. Identificar las clases, métodos y datos.
            3. Ver si existe algún patron a aplicar, o alguna abstracción.
            4. Desarrollar la solución, desde las clases de bajo nivel, 
               hasta las de alto nivel


            Usuario <-- Profesionales:    .(Nombre*, Apellido*, Especialidad*, Matrícula)
                                          . Diseñar el Plan Alimenticio 
                                          . registra los datos básicos del paciente (Edad, Peso Actual y Medida de cintura)
                                          . establece la duración del Plan Alimenticio (semanal, quincenal o mensual)
                                          . establecen una serie de objetivos a lograr 
                                          . evaluar cuantos de esos objetivos pudieron ser cumplidos, y generará una calificación final para el plan

                       <-- Pacientes: .(Nombre*, Apellido*, Edad*, Sexo*, Disciplina*)
                                      . seguir el Plan Alimenticio

                       <-- Administrador: carga o actualización de las colaciones y bebidas
                                          dará de alta nuevos usuarios,
                                          generará los reportes solicitados por los profesionales


            Plan Alimenticio <-- (duracion, necesidadDelAtleta)
                                 .rutinaDiaria: (desayuno, almuerzo, merienda y cena)

            Comidas <-- AC (Almuerzo Cena) 
                                        . Porcentaje de macronutrientes: 3 float que no se pasen más del 100%
                                                                         y permita calcular 
                    <-- DM (Desayuno Merienda)
                    <-- Colacion
                    <-- Bebidas

            3) 
            - Singleton en Administrador
            - Abstracción usuario.
            - Profesional debe tener 2 constructores (uno mínimo y otro con TODO)
            - Factory Method comidas
        */
    }
}
