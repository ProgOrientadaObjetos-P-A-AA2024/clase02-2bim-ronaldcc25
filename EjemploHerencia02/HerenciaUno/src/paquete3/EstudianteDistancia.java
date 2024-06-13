
package paquete3;

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    
    public EstudianteDistancia(String n, String ap, String iden, int e){
        super(n, ap, iden, e);
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    /*
    @Override
    public String toString() {
        String cadena = String.format("Nombre estudiante: %s\n"
                + "Apellido estudiante: %s\n"
                + "Identificacion estudiante: %s\n"
                + "Edad del estudiante: %d\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de asignatura: %.2f\n"
                + "Valor matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                numeroAsignaturas,
                costoAsignatura,
                matriculaDistancia);
        
        return cadena;
    }
    */
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de asignatura: %.2f\n"
                + "Valor matricula: %.2f\n",
                super.toString(),
                numeroAsignaturas,
                costoAsignatura,
                matriculaDistancia);
        
        return cadena;
    }
    
    /*
    Para presetnar el toString podemos usar tambien el toString de la superClase
    por lo que esta heredando de dicha 
    */
    
}
