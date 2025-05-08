package com.proyecto.digitalizacion

import kotlin.random.Random

/**
 * Clase encargada de gestionar la creación y almacenamiento de contraseñas.
 */
class GestorContraseñas {

    companion object {
        /** Letras minúsculas posibles en las contraseñas */
        val letras = ('a'..'z')

        /** Letras mayúsculas posibles en las contraseñas */
        val letrasMayus = ('A'..'Z')

        /** Caracteres especiales que pueden incluirse en las contraseñas */
        val caracteresEspeciales = arrayOf('/', '&', '%', '$', '|', '@', '#', '*', '!', '?', '+', '=', '-', '_', '^', '~', '<', '>')
    }

    /**
     * Repositorio que almacena todas las contraseñas generadas.
     */
    val contraseñas = RepositorioContraseña()

    /**
     * Crea una contraseña según la configuración especificada y la almacena.
     *
     * @param eleccion Indica si se usarán caracteres especiales (1) o no (2).
     * @param longitud Longitud deseada de la contraseña.
     */
    fun crearContraseña(eleccion: Int, longitud: Int) {
        var password = ""

        when (eleccion) {
            2 -> repeat(longitud) {
                password += when (Random.nextInt(1, 4)) {
                    1 -> letras.random()
                    2 -> letrasMayus.random()
                    3 -> Random.nextInt(0, 9).toString()
                    else -> ""
                }
            }

            1 -> repeat(longitud) {
                password += when (Random.nextInt(1, 5)) {
                    1 -> letras.random()
                    2 -> letrasMayus.random()
                    3 -> Random.nextInt(0, 9).toString()
                    4 -> caracteresEspeciales.random()
                    else -> ""
                }
            }
        }

        contraseñas.agregarElemento(Contraseña(password))
        println("Contraseña creada: $password")
        println("Presiona ENTER para continuar")
        val nada = readln()
    }
}
