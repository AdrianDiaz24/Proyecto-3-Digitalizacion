## Ciclo de vida del dato (5b):
- ¿Cómo se gestionan los datos desde su generación hasta su eliminación en tu proyecto?
  - Los datos se almacenan en memoria en una lista de contraseñas que despues se pueden listar para ser comprobadas, una vez se deja de ejecutar el programa se eliminan los datos de la memoria


- ¿Qué estrategia sigues para garantizar la consistencia e integridad de los datos?
  - La integridad se asegura controlando la entrada del usuario con la función 'pedirNum', validando que siempre se introduzca un número dentro de un rango permitido. 


- Si no trabajas con datos, ¿cómo podrías incluir una funcionalidad que los gestione de forma eficiente?
  - Aunque si se trabaja con datos estos se almacena en memoria y se eliminan una vez finalizada la ejecucion pero seria interesante guardas estos datos en un JSON o una base de datos o en la nube

## Almacenamiento en la nube (5f):

- Si no usas la nube, ¿cómo podrías integrarla en futuras versiones?
  - Actualmente, las contraseñas se almacenan en una lista en memoria. Para mayor seguridad y disponibilidad, se podría implementar un guardado en la nube

## Seguridad y regulación (5i):

- Si no implementaste medidas de seguridad, ¿qué riesgos potenciales identificas y cómo los abordarías en el futuro?
  - Actualmente no tiene ninguna medida de seguridad, pero tampoco le hace falta ya que las contraseñan solo se guardan mientras se ejecuta el programa, aunque si en un futuro se implementara un guardado de datos duradero,en JSON o en una base de datos o en la nuve, haria falta cifrar las contraseñas y la opcion de eliminarlas completamente

## Implicación de las THD en negocio y planta (2e):
- ¿Qué impacto tendría tu software en un entorno de negocio o en una planta industrial?
  - Este gestor de contraseñas podría mejorar la gestión de credenciales en empresas, asegurando la generación de contraseñas robustas y en un futuro el almacenamiento seguro de las mismas.


- ¿Cómo crees que tu solución podría mejorar procesos operativos o la toma de decisiones?
  - Automatiza la creación reduciendo errores humanos y aumentando la eficiencia.
  

- Si tu proyecto no aplica directamente a negocio o planta, ¿qué otros entornos podrían beneficiarse?
  - Aunque aplican a los negocios, tambien se podria usar en entornos personales y domesticos



## Mejoras en IT y OT (2f):
- ¿Cómo puede tu software facilitar la integración entre entornos IT y OT?
  - Este software podría facilitar el acceso seguro a sistemas industriales (OT) usando contraseñas robustas generadas de manera eficiente.
  

- ¿Qué procesos específicos podrían beneficiarse de tu solución en términos de automatización o eficiencia?
  - Seguridad en el acceso a sistemas de control y bases de datos en entornos industriales.


## Tecnologías Habilitadoras Digitales (2g):

- Si no has utilizado THD, ¿cómo podrías implementarlas para enriquecer tu solución?
  - Actualmente, no se emplean tecnologías avanzadas. Se podría integrar el cifrado y almacenamiento en la nube, ademas de sistemas de autenticación multifactor

