# El Senor de los Anillos (Java)

Este repo es mi practica de POO en Java usando personajes de El Senor de los Anillos. La idea es simple: una clase base con lo comun, varias razas que heredan, y un metodo que se comporta distinto segun el tipo.

GitHub no ejecuta JavaScript en el README, asi que un boton real de cambio de idioma no puede funcionar aqui. Te dejo las dos versiones en secciones plegables para que elijas cual leer.

<details open>
  <summary><strong>Espanol</strong></summary>

## Que hay dentro
- `Personaje` es la base con lo comun: `nombre`, `edad`, `arma`, `bando`.
- Cada raza (`Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`) agrega un atributo propio.
- `imprimirDetalles()` vive en la base y se sobreescribe para mostrar lo que cambia en cada raza.
- En `Main` se crean 3 personajes por raza y se imprime todo desde polimorfismo.

## Como correrlo
1. Abrir el proyecto en IntelliJ.
2. Ejecutar `Main`.
3. Ver la salida en consola.

</details>

<details>
  <summary><strong>English</strong></summary>

## What's inside
- `Personaje` is the base class with common fields: `nombre`, `edad`, `arma`, `bando`.
- Each race (`Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`) adds its own field.
- `imprimirDetalles()` is defined in the base and overridden per race.
- `Main` creates 3 characters per race and prints everything using polymorphism.

## How to run
1. Open the project in IntelliJ.
2. Run `Main`.
3. Check the console output.

</details>
