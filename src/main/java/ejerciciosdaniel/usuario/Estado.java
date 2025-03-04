package ejerciciosdaniel.usuario;

/**
 * Crea un paquete usuario y dentro de él una clase Usuario.
 * La clase Usuario debe contener:
 * Atributos: username, email, password
 * Constructor con tres parámetros para inicializar las instancias de la clase
 * Getters y setters para los atributos, teniendo en cuenta que una vez creado un usuario no podemos cambiar su nombre
 *  Añade un método toString para visualizar las propiedades de los usuarios.
 * En el paquete usuario crea también una clase Main con un método main
 * Añade un método crearUsuario(): Usuario, que pide los datos para crear un usuario.
 * Crea un usuario utilizando el método anterior, e imprime sus datos.
 * Añade un tipo enumerado de nombre Estado con los siguientes valores:pendiente, activo, bloqueado
 * En la clase Usuario:
 * Añade a la clase Usuario un atributo estado de tipo Estado;
 * Haz lo necesario para que cuando se crea un usuario se le asigne por defecto el estado pendiente.
 * Añade métodos para poder ver y cambiar el estado de un usuario.
 * También en la clase Usuario crea un método mensajeEstado():void.El método hace lo siguiente:
 * Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
 * Si el estado es ACTIVO, imprime "Todo ok, vía libre".
 * Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
 * Si no es ninguno de estos estados, imprime "Estado desconocido".
 * Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
 * A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método mensajeEstado.
 */
public enum Estado {
    pendiente,
    activo,
    bloqueado
}
