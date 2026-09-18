# Taller 3 - Arreglos y Métodos en Java

## 1. Información del estudiante
* **Nombre completo:** Sergio Alexander Murillo Puentes
* **Programa académico:** Tecnología en Desarrollo de Software
* **Fecha de entrega:** 17 de septiembre de 2026

---

## 2. Detalle de la actividad y 3. Evidencias

### Ejercicio 1 (`Ej1.java- 4.a.1`)
**Enunciado:** Lectura e impresión de arreglos unidimensionales mediante consola.

![Código y Ejecución Ejercicio 1](Evidencias/Ej1.png)

---

### Ejercicio 2 (`Ej2.java` - Guía 4.a.2)
**Enunciado:** Leer 10 enteros, calcular de forma independiente la suma de los pares y los impares, y determinar cuál suma es mayor.

![Código Ejercicio 2](Evidencias/ej2uno.png)
![Ejecución Ejercicio 2](Evidencias/ej2dos.png)

---

### Ejercicio 3 (`Ej3.java` - Guía 4.a.3)
**Enunciado:** Almacenar las temperaturas registradas durante los 7 días de la semana y verificar si una nueva temperatura existe en el registro.

![Código Ejercicio 3](Evidencias/ej3uno.png)

![Ejecución Ejercicio 3](Evidencias/ej3dos.png)

---

### Ejercicio 4 (`Ej4.java` - Guía 4.b.1)
**Enunciado:** Implementar una rotación circular a la derecha sobre los elementos de un array de 5 posiciones.

![Código Ejercicio 4](Evidencias/ej4uno.png)

![Ejecución Ejercicio 4](Evidencias/ej4dos.png)

---

### Ejercicio 5 (`Ej5.java` - Guía 4.b.2)
**Enunciado:** Llenar un vector con números aleatorios e imprimir sus posiciones de forma intercalada (primero, último, segundo, penúltimo, etc.).

![Código y Ejecución Ejercicio 5](Evidencias/ej5.png)

---

### Ejercicio 6 (`Ej6.java` - Guía 4.b.6)
**Enunciado:** Determinar la letra del NIF correspondiente a un DNI de 8 dígitos mediante la operación de residuo `DNI % 23`.

![Código y Ejecución Ejercicio 6](Evidencias/ej6.png)

---

### Ejercicio 7 (`ej7.java` - Guía 4.c.1)
**Enunciado:** Identificar y mostrar por consola únicamente los elementos del array que no se encuentren repetidos.

![Código Ejercicio 7](Evidencias/ej7uno.png)

![Ejecución Ejercicio 7](Evidencias/ej7dos.png)

---

### Ejercicio 8 (`Ej8.java` - Guía 5.b.2)
**Enunciado:** Crear el método `String mostrarVector(int[] elementos)` para retornar entre corchetes `[ ]` solo los números que no tienen duplicados.

![Código Ejercicio 8](Evidencias/ej8uno.png)

![Ejecución Ejercicio 8](Evidencias/ej8dos.png)

---

### Ejercicio 9 (`Ej9.java` - Guía 5.c.5)
**Enunciado:** Implementar los métodos `esPrimo` y `soloPrimos` para filtrar números primos devueltos en un arreglo con dimensionamiento exacto.

![Código Ejercicio 9 - Parte 1](Evidencias/ej9uno.png)

![Código Ejercicio 9 - Parte 2](Evidencias/ej9dos.png)

![Ejecución Ejercicio 9](Evidencias/ej9tres.png)

---

### Ejercicio 10 (`Ej10.java` - Guía 5.c.4)
**Enunciado:** Crear el método `mostrarBinario` para representar en código binario de 8 bits cualquier entero ingresado entre 0 y 255.

![Código Ejercicio 10](Evidencias/ej10uno.png)

![Ejecución Ejercicio 10](Evidencias/ej10dos.png)

---
### Evaluación 1 - Programación Orientada a Objetos
**Duración:** 90 minutos

Desarrolle los siguientes requerimientos requeridos con base en el enunciado del problema:

Una estación meteorológica central en el departamento del Huila recibe datos mensuales de temperatura promedio desde tres subestaciones ubicadas en Rivera, Neiva y Campoalegre. Cada subestación registra una temperatura promedio por mes durante un año (12 meses). Se requiere desarrollar una clase que permita almacenar, analizar y comparar estos datos, detectando patrones, anomalías y simulando transformaciones climáticas.

**Requerimientos técnicos:**

**Estructura del programa:**
* Crear una clase llamada `MonitorClimaticoRegional` con métodos para:
  * Generar datos simulados para cada subestación
  * Calcular estadísticas por subestación
  * Comparar comportamiento climático entre subestaciones
  * Detectar anomalías y clasificar temperaturas

**En el método main:**
* Declarar tres arreglos de tipo `double` con 12 posiciones cada uno, representando las temperaturas de Rivera, Neiva y Campoalegre.
* Llenar los arreglos con datos simulados usando un método para generar temperaturas anuales. Este método debe solicitar un argumento de tipo booleano que indique si los datos se generan aleatoriamente o de forma manual. También debe pedir los valores de las temperaturas máximas y mínimas permitidas.
* Aplicar los métodos de análisis y transformación sobre cada arreglo.
* Mostrar resultados comparativos entre las tres subestaciones.

**Métodos adicionales para desarrollar:**

| Método | Descripción |
| :--- | :--- |
| **`compararSubestaciones(int[] t1, int[] t2)`** | Compara dos subestaciones y devuelve cuál fue más cálida. Se establece que el criterio es el promedio de temperatura anual. |
| **`detectarAnomalias(int[] temperaturas)`** | Devuelve un arreglo de tipo `int` con los índices de los meses con anomalías térmicas. Una anomalía térmica se determina cuando la temperatura de un mes específico está +/- el 20% del promedio del año. |
![Ejecución evaluacion](Evidencias/monitor.png)

![Ejecución evaluacion-2](Evidencias/monitor2.png)

![Ejecución evaluacion-3](Evidencias/monitor3.png)

![Ejecución evaluacion-4](Evidencias/monitor4.png)

![Ejecución evaluacion-5](Evidencias/monitor5.png)

## 4. Conclusiones

*El taller es, o al menos me resulto, extremadamente dificil y solía entender mas incluso cuando veia la salidda que cuando veia el codigo, siento que cadavex nos acercamos no a entender logica sino sintaxis, pero al ver el ejercicio una y otra vez, empezaba a conectar cosas y lograba escribir codigo, pero habian demasiadas cosas que no sabia y que tuve que aprender o buscar, sintaxis y logicas que espero poder aplicar en un futuro, a pesar de no poer recordarlas lo mejor posible. En cuanto a la evalución, simplemente no pude, me bloquee y tuve que recurrir a la ia y esta vez no para ayudarme sino para que directamente me escribiera el codigo y pudiera entender, tras eso creo que era un problema mas de longitud que de dificultad, gracias al taller sé que son los arreglos y los metodos, aunque aun tengo mucho camino por recorrer para dominarlos y asu logica.*
