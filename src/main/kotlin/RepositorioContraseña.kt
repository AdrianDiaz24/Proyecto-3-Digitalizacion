package com.proyecto.digitalizacion

/**
 * Implementación concreta de almacenamiento de contraseñas.
 */
class RepositorioContraseña : Almacenamiento<Contraseña> {

    /**
     * Lista de contraseñas almacenadas.
     */
    override val elementos: MutableList<Contraseña> = mutableListOf()
}
