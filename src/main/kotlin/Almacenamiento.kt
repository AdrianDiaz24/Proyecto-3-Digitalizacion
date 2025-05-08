package com.proyecto.digitalizacion

/**
 * Interfaz genérica para representar almacenamiento de elementos.
 *
 * @param T Tipo de elementos almacenados.
 */
interface Almacenamiento<T> {

    /**
     * Lista mutable de elementos almacenados.
     */
    val elementos: MutableList<T>

    /**
     * Agrega un solo elemento al almacenamiento.
     *
     * @param elemento Elemento a agregar.
     */
    fun agregarElemento(elemento: T) {
        elementos.add(elemento)
    }

    /**
     * Agrega múltiples elementos al almacenamiento.
     *
     * @param elemento Lista de elementos a agregar.
     */
    fun agregarElemento(elemento: List<T>) {
        for (elemento in elemento) {
            elementos.add(elemento)
        }
    }

    /**
     * Lista todos los elementos almacenados.
     */
    fun listarElementos() {
        var i = 0
        println("\n")
        for (elemento in elementos) {
            i++
            println("$i. $elemento")
        }
        println("Pulsa Intro para continuar")
        val intro = readln()
    }
}
