package ejerciciosdaniel.cajero;

/**
 * Crea un paquete cajero, con las siguientes clases:
 * CuentaCorriente, que almacena los datos: DNI, nombre del titular y saldo.
 * Las operaciones típicas con una cuenta corriente son:
 * Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 * Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
 * Ingresar dinero: se incrementa el saldo.
 * Mostrar información: muestra la información disponible de la cuenta corriente.
 * Sobrecarga los constructores para poder crear objetos:
 * Con el DNI del titular de la cuenta y un saldo inicial.
 * Con el DNI, nombre y el saldo inicial.
 * Escribe un programa que compruebe el funcionamiento de ambos métodos.
 * Modifica si es necesario la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas y la visibilidad de sus atributos para que:
 * saldo no sea visible para otras clases _> private
 * nombre sea público para cualquier clase -> public
 * dni sólo sea visible por clases del mismo paquete -> (default package, es decir, no pongas modificador de acceso)
 * Escribe un programa para comprobar la visibilidad de los atributos. (mirar el paquete acceso que está dentro de  teoria)
 * Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. Añadir un atributo que almacena el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un método que permita recuperar y modificar el nombre del banco.
 * Existen gestores que administran las cuentas bancarias y atienden a sus propietarios. Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
 * Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
 * Con respecto a los gestores, existen las siguientes restricciones:
 * Un gestor tendrá siempre un nombre y un teléfono. -> obligamos a esto en el constructor
 * Si no se asigna, el importe máximo autorizado por operación será de 10000 euros. → el valor por defecto será 10000
 * Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo. → me pide un getTelefono pero prohibido el setTeléfono
 * El nombre será público y el importe máximo sólo será visible por clases que estén en el mismo paquete.
 * Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios para consultar qué gestor tiene una cuenta corriente y también para poder cambiarlo..
 */
public class Main {
}
