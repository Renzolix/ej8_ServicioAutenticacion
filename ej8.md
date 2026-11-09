# Ejercicio 8: ServicioAutenticacion

## Explicación Lógica
1. **Encadenamiento (Exception Wrapping):** Oculta excepciones técnicas de infraestructura (`IOException`) dentro de excepciones propias del dominio del negocio (`AutenticacionCampusException`).
2. **Preservación de Causa:** Se pasa la excepción original mediante `super(mensaje, causa)`, permitiendo consultar el origen real mediante `e.getCause()`.