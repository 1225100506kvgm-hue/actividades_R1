\# Práctica: Recursividad, Arreglos y Genéricos



Autor: Katya Valentina Grifaldo Martínez  

Fecha: 30/10/2026



\## 1. Recursividad: Palíndromo 



(a)-. Caso base: Hay dos, si los índices se cruzan (`izq >= der`) la cadena es

palíndromo (`true`), si los caracteres de los extremos son distintos, no lo es (`false`).

El caso recursivo compara los extremos y llama a la función con `izq+1` y `der-1`.



(b)-.Cada llamada reduce el problema en dos caracteres,

así que siempre llega al caso base. Es más corta y clara que una versión con

ciclos, y no crea cadenas nuevas al recorrer (solo mueve índices).



(c)-. Pruebas:

&#x20;Entrada                       Resultado esperado 



&#x20;"reconocer"                    true 

&#x20;"casa"                         false 

&#x20;"Anita lava la tina"           true 

&#x20;"" (límite)                    true 



\## 2. Arreglos: Invirtiendo el arreglo 



(a)-. Estructura: Arreglo unidimensional int\[]. Se usan dos índices: i desde

el inicio y j desde el final.



(b)-.Intercambiar en el mismo arreglo usa memoria constante O(1) y recorre solo la mitad de los elementos, O(n).



(c)-. Pruebas:

&#x20;Entrada                    Salida 



&#x20;\[1,2,3,4,5]                 \[5,4,3,2,1] |

&#x20;\[1,2,3,4]                   \[4,3,2,1] 

&#x20;\[7]                         \[7] 

&#x20;\[] (límite)                 \[] 



\## 3. Genéricos: Caja Genérica



(a)-. Parámetro de tipo: T representa cualquier tipo de objeto que guarde la caja.

Se define al crear la instancia: `CajaGenerica<Integer>`, `CajaGenerica<String>`.



(b)-. Con un tipo genérico se reutiliza una sola clase

para cualquier tipo y el compilador verifica los tipos, evitando casteos y errores

en ejecución.



(c) Pruebas:

&#x20;Caso                                        Resultado 



&#x20;`CajaGenerica<Integer>(42)`                 Caja con: 42 

&#x20;`CajaGenerica<String>("Hola")`              Caja con: Hola 

&#x20;`CajaGenerica<Double>()` vacía (límite)     Caja vacía 

&#x20;Guardar 3.14 y luego vaciar                `estaVacia()` = true 



\## Cómo ejecutar

&#x20;   javac -encoding UTF-8 \*.java

&#x20;   java Palindromo

&#x20;   java InvertirArreglo

&#x20;   java CajaGenerica

