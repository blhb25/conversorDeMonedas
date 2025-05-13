# conversorDeMonedas
Practica

# Mi Conversor de Monedas 💱

¡Hola! Este es mi proyecto de un conversor de monedas que hice en Java. La idea principal es usar datos reales de internet para saber cuánto vale una moneda en comparación con otra.

## ¿Qué puede hacer?

* Se conecta a una página web (ExchangeRate-API) para obtener los precios de las monedas.
* Puedes elegir una moneda principal (por ahora, dólar o euro) para ver los otros precios.
* Convierte entre cualquier par de monedas que la página web soporte.
* Funciona desde la consola de tu computadora, con un menú fácil de usar.
* Si algo sale mal (no hay internet o una moneda no existe), te avisa.

## Monedas que soporta

Soporta todas las monedas que aparecen en la página [ExchangeRate-API](https://www.exchangerate-api.com/docs/supported-currencies). ¡Son muchísimas de América y de todo el mundo! Cuando eliges el dólar o el euro como base, puedes convertir a casi cualquier otra.

## ¿Qué necesitas para usarlo?

* Tener instalado Java (versión 8 o más nueva).
* Estar conectado a internet para que pueda buscar los precios de las monedas.
* Una clave de la API de [ExchangeRate-API](https://www.exchangerate-api.com/). Es gratis registrarse y te dan una.

## Cómo ponerlo a funcionar

1.  **Si lo ves en GitHub, primero cópialo a tu compu:**
    ```bash
    git clone [la dirección de mi proyecto aquí]
    cd ConversorMonedas
    ```

2.  **Luego, hay que preparar el programa:**
    * Abre el archivo `src/main/java/com/conversor/ExchangeRateService.java` con un editor de texto.
    * Busca la línea que dice `private static final String API_KEY = "TU_API_KEY";` y cambia `"TU_API_KEY"` por la clave que te dieron al registrarte en ExchangeRate-API. ¡No borres las comillas!

3.  **Ahora, a correr el programa:**
    * Si usas un programa como IntelliJ IDEA, puedes darle al botón de "Run" en la clase `Main.java`.
    * Si prefieres usar la terminal, primero tienes que "compilar" el código:
        ```bash
        javac -d out src/com/conversor/*.java
        ```
    * Y luego ejecutarlo:
        ```bash
        java -cp out com.conversor.Main
        ```

4.  **¡Listo!** En la consola te saldrá un menú. Sigue los pasos para elegir las monedas y la cantidad que quieres convertir.

## Cómo está organizado el proyecto

## Ideas para el futuro

* Que soporte más monedas principales para buscar los precios.
* Guardar un historial de las conversiones que haces.
* Hacerlo más bonito con una ventana en lugar de solo texto.
* Ser más cuidadoso con lo que escribes para que no se rompa fácil.

BLHB
