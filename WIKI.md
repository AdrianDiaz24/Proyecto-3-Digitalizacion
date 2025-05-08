## Descripción general
Este generador de contraseñas en Kotlin permite crear contraseñas seguras con configuración personalizada de longitud, inclusión de letras, números y símbolos especiales. Se diseñó con principios de orientación a objetos y buenas prácticas de software.

## Estructura del proyecto

```
/src
├── Main.kt -> Punto de entrada del programa
├── Almacenamiento.kt -> Interface para que hereden las clases reposttorios
│── Contraseña.kt -> Data Class que almacena la informacion de la contraseña
│── GestorContraseña.kt -> Clase que se encarga de la creacion de la contraseña
│── RepositorioContraseña.kt -> Clase que hereda de la interface y se encarga del almacenamiento de contraseñas y de listarlas
```

## Guía para desarrolladores
Requisitos: JDK 21+, IntelliJ IDEA o cualquier editor compatible con Kotlin.

Compilación: Usar Gradle o generar .jar manual con kotlinc.

Ejecución:
```Bash
    java -jar build/libs/generador.jar
```

## Añadir nuevas funcionalidades:.

- Usa GestorContraseñas.kt para definir opciones adicionales.

- Asegúrate de seguir el modelo orientado a objetos.

## Pruebas y ejecución
- Ejecutar Main.kt desde IntelliJ.

- Añadir tests con JUnit en la carpeta /test si se desea ampliar el proyecto.

- Verifica siempre que la contraseña generada cumpla con las reglas definidas por el usuario.

## Devlog

- [Devlog en Linkedin](https://www.linkedin.com/pulse/devlog-proyecto-de-creador-contrase%25C3%25B1a-automatizado-adrian-diaz-angulo-gnfef/)