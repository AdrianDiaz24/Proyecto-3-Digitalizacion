package com.proyecto.digitalizacion

/**
 * Punto de entrada del programa de gestión de contraseñas.
 * Proporciona un menú interactivo para crear y listar contraseñas.
 */
fun main() {
    val gestorContraseñas = GestorContraseñas()
    var salida = false

    while (!salida) {
        val eleccion = menu()
        when (eleccion) {
            3 -> salida = true
            2 -> gestorContraseñas.contraseñas.listarElementos()
            1 -> {
                val eleccion = submenu()
                when (eleccion) {
                    3 -> println("Volviendo al menú principal")
                    else -> {
                        println("Introduce la longitud de la contraseña")
                        gestorContraseñas.crearContraseña(eleccion, getNum(1, 1000))
                    }
                }
            }
        }
    }
}

/**
 * Solicita al usuario un número dentro de un rango válido.
 *
 * @param min Valor mínimo permitido.
 * @param max Valor máximo permitido.
 * @return Número entero introducido por el usuario.
 */
fun getNum(min: Int, max: Int): Int {
    var valorValido = false
    var input = 0
    while (!valorValido) {
        print(">> ")
        try {
            input = readln().toInt()
        } catch (e: IllegalArgumentException) {
            println("**ERROR** Introduce un Nº")
        }
        if (input in min..max) {
            valorValido = true
        } else {
            println("**ERROR** Introduce un Nº entre $min y $max")
        }
    }
    return input
}

/**
 * Muestra el menú principal.
 *
 * @return Opción seleccionada por el usuario.
 */
fun menu(): Int {
    println("1. Crear contraseña")
    println("2. Listar contraseñas")
    println("3. Salir")
    return getNum(1, 3)
}

/**
 * Muestra el submenú para la creación de contraseñas.
 *
 * @return Opción seleccionada por el usuario.
 */
fun submenu(): Int {
    println("La contraseña se creará con letras y números")
    println("1. Crear con caracteres especiales")
    println("2. Crear sin caracteres especiales")
    println("3. Cancelar")
    return getNum(1, 3)
}
