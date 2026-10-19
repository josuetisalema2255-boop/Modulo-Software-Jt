void main() {

    Modulo login = new Modulo();
    Modulo inventario = new Modulo();
    Modulo reportes = new Modulo();

    login.nombre = "Login";
    login.lenguaje = "Java";
    login.version = "1.34";
    login.terminado = false;

    inventario.nombre = "Inventario";
    inventario.lenguaje = "c++";
    inventario.version = "3.14";
    inventario.terminado = false;

    reportes.nombre = "Reportes";
    reportes.lenguaje = "C";
    reportes.version = "4.01";
    reportes.terminado = false;

    login.mostrarInformacion();
    inventario.mostrarInformacion();
    reportes.mostrarInformacion();

}