# El Senor de los Anillos (Java)

Este repo es mi practica de POO en Java usando personajes de El Senor de los Anillos. Lo hice para afianzar herencia, encapsulacion y polimorfismo de forma clara: una clase base con lo comun, varias razas que heredan, y un metodo que cambia segun el tipo real del objeto. No es un juego ni un framework, es un ejercicio completo y ordenado para demostrar fundamentos.

Elige tu idioma. GitHub no ejecuta JavaScript en el README, por eso un boton real de cambio de idioma no puede funcionar aqui. En su lugar dejo dos secciones plegables: una en Espanol y otra en English.

<details open>
  <summary><strong>Espanol</strong></summary>

## Resumen rapido
Este proyecto modela razas de la Tierra Media en Java con una superclase `Personaje` y subclases por raza. En `Main` se instancian varios personajes y se imprime su informacion usando polimorfismo. Si entiendes este codigo, entiendes la base de POO en Java.

## Estructura de clases
- `Personaje` es la clase base con lo comun: `nombre`, `edad`, `arma`, `bando`.
- Cada raza (`Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`) agrega un atributo propio.
- `imprimirDetalles()` vive en la base y se sobreescribe para mostrar lo que cambia en cada raza.
- En `Main` se crean 3 personajes por raza y se imprime todo desde polimorfismo.

## Patrones aplicados (en simple)
No hay patrones de diseno complejos, pero si hay patrones de POO clasicos:
- Herencia para reutilizar lo comun.
- Encapsulacion con atributos `private` y sus getters/setters.
- Polimorfismo cuando se imprime cada personaje con el mismo metodo.
- Sobrescritura para cambiar el comportamiento segun la raza.

![Patrones aplicados en el proyecto](assets/patrones-intellij.png)

## Como correrlo
1. Abrir el proyecto en IntelliJ.
2. Ejecutar `Main`.
3. Ver la salida en consola.

## Nota del autor
Este repo esta pensado como practica limpia. Me interesa que el codigo se entienda rapido y que la estructura sea clara, sin ruido ni dependencias raras.

</details>

<details>
  <summary><strong>English</strong></summary>

## Quick summary
This project models Middle-earth races in Java with a `Personaje` base class and race-specific subclasses. In `Main` I instantiate several characters and print their details using polymorphism. If you can read this code, you understand core Java OOP.

## Class structure
- `Personaje` is the base class with common fields: `nombre`, `edad`, `arma`, `bando`.
- Each race (`Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`) adds its own field.
- `imprimirDetalles()` is defined in the base and overridden per race.
- `Main` creates 3 characters per race and prints everything using polymorphism.

## Patterns used (simple)
No advanced design patterns here, but classic OOP patterns are present:
- Inheritance to reuse shared state.
- Encapsulation using `private` fields and getters/setters.
- Polymorphism when printing each character with the same method.
- Overriding to change behavior per race.

![Patterns applied in the project](assets/patrones-intellij.png)

## How to run
1. Open the project in IntelliJ.
2. Run `Main`.
3. Check the console output.

## Author note
This repo is a clean practice project. The goal is readable code and a clear structure without extra noise or heavy dependencies.

</details>
