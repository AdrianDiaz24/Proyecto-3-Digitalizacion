package com.proyecto.digitalizacion

/**
 * Representa una contraseña.
 *
 * @property contraseña Cadena de texto que representa la contraseña generada.
 */
data class Contraseña(val contraseña: String) {

    /**
     * Representación textual de la contraseña.
     */
    override fun toString(): String {
        return "Contraseña: $contraseña"
    }
}
