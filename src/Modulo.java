public class Modulo {

    // Atributos publicos
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;

    // Métodos publicos
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre +
                            "\nLenguaje: " + lenguaje +
                            "\nVersión: " + version +
                            "\nTerminado: " + terminado);
    }

    public void marcarTerminado(){
        terminado = true;
        System.out.println("Módulo " + nombre + "terminado.");
    }

    // Métodos con acceso por defecto
    void mostrarEstado(){
        if (terminado){
            System.out.println("Estado de " + nombre + ": Terminado.");
        }else {
            System.out.println("Estado de " + nombre + ": En desarrollo.");

        }
    }

    void mostrarVersion(){
        System.out.println("Versión actual: " + version);
    }
}
