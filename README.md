
# PRIME NUMBER GENERATOR(Java)

La idea es encontrar todos los números reales posibles cuyos divisores cumplen la formula d + n / d da como resultado un número primo, donde d es el divisor y n el número elegido.

## Problema a solucionar.

Encuentre la suma de todos los números enteros positivos n que no excedan 100.000.000 tal que para cada divisor d de n, d + n / d es primo.

Ejemplo: 30

Considera los divisores de 30: 1, 2, 3, 5, 6, 10, 15, 30. Puede verse que para cada divisor d de 30, d + 30 / d es primo.

## Resultados y analisis.

La Suma total de los números reales enteros  hasta 100.000.000 que cumplen la condición es 1739023853137.

El número de cálculos realizado aumenta de forma exponencial con cada número que añadimos, por lo que a partir de 1.000.000 los tiempos de ejecución son bastante altos, seguiré buscando métodos para mejorar el tiempo de ejecución.


## Solución adoptada.

El programa tiene dos clases una clase main y otra Divisors, en la clase Divisors están los métodos que determinan tanto los divisores reales del número dado, y otra para comprobar si estos son primos o no, y de esta forma determinar si cumplen los requisitos para ser añadidos al resultado final.
## Instalación.

Para ejecutar o ver la solución será necesario tener instalado java en tu ordenador y ejecutar a través de consola el comando:

	· $java -jar Prime_Number_Generator.jar (Linux/ Mac)
	· en Windows pulsar boton derecho del ratón sobre el archivo, seleccionar abrir con..
	y elegir Java.
	

## Contact info.

Puede visitar mi [web](https://enriquerevueltagarcia.com) para ver más proyectos mios.

o explorar mi [github](https://github.com/Gobuub)





