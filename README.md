# BeerTP
Cuantos consumidores se necesitan para que el stock llegue a 0?
Se necesita un solo consumidor para que el stock llegue a 0.

Bloques synchronized porque deben serlos? 
El bloque synchronized evita que cualquier otro thread ejecute ningún otro método synchronized sobre ese mismo objeto

Explicar el recurso compartido. El recurso compartido son los datos a los que 2 o mas threads deben acceder. 
La exclusion mutua ocurre cuando unicamente uno de los procesos puede ejecutar la seccion critica, que es un bloque de codigo donde se accede al recurso compartido.

Explicar las 3 formas de instanciar un thread. Formas de instanciar un thread: 
a. Extender la clase Thread.
b. implementar la interfaz Runnable 
c. Hacer un new de Thread Para ejecutarlos debemos llamar al metodo start().
