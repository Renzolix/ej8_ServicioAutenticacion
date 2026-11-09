import java.io.IOException;

public class AccesoCampusVirtual {

    public void iniciarSesion(String usuario, String clave) throws AutenticacionCampusException {
        try {
            // Simulación de falla técnica de bajo nivel
            throw new IOException("Falla de conexión al servidor LDAP/Base de Datos.");
        } catch (IOException ioException) {
            // Encadenamiento de excepción de bajo nivel en una de alto nivel (Domain Exception)
            throw new AutenticacionCampusException("Error al ingresar al campus virtual", ioException);
        }
    }

    public static void main(String[] args) {
        AccesoCampusVirtual servicio = new AccesoCampusVirtual();

        try {
            servicio.iniciarSesion("renzo", "12345");
        } catch (AutenticacionCampusException e) {
            System.err.println("Mensaje de alto nivel: " + e.getMessage());
            System.err.println("Causa raíz (Root Cause): " + e.getCause());
        }
    }
}