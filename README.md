#  Generador de Contraseñas en Kotlin (POO)

##  Motivación

La seguridad digital es una prioridad en cualquier sistema moderno. Este proyecto surge como una herramienta sencilla pero potente para generar contraseñas seguras mediante programación orientada a objetos en Kotlin. Permite al usuario personalizar la longitud de las contraseñas, incluir letras, números y caracteres especiales, todo de forma flexible y reutilizable.

---

##  Estructura del Proyecto

Este proyecto está organizado usando principios de programación orientada a objetos:

```
/src
├── Main.kt -> Punto de entrada del programa
├── Almacenamiento.kt -> Interface para que hereden las clases reposttorios
│── Contraseña.kt -> Data Class que almacena la informacion de la contraseña
│── GestorContraseña.kt -> Clase que se encarga de la creacion de la contraseña
│── RepositorioContraseña.kt -> Clase que hereda de la interface y se encarga del almacenamiento de contraseñas y de listarlas
```

##  Cómo ejecutarlo

###  IntelliJ IDEA
1. Clona o descarga el proyecto.
2. Ábrelo con IntelliJ IDEA como un proyecto Kotlin.
3. Asegúrate de que el SDK de Kotlin esté configurado.
4. Ejecuta `Main.kt`.

###  Kotlin desde la terminal
1. Instala [Kotlin CLI](https://kotlinlang.org/docs/command-line.html).
2. Compila el código:
   ```bash
   kotlinc src -include-runtime -d generadorContraseñas.jar
   ```
## Ejemplo de uso

En el archivo Main.kt, ejecutarlo esto te mostrara un menu en a consola, que te pedira la longitud de la misma y si desea que incluya caracteres especiales

### Salida esperada 
Contraseña generada: L8@zF3w9!bQp#T1m

### Características
- Personalización de longitud

- Inclusión opcional de caracteres especiales

- Código modular y orientado a objetos

- Fácil de mantener y ampliar

