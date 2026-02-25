# El Senor de los Anillos (Java)

<div>
  <button id="toggle-lang" type="button">English</button>
</div>

<div id="lang-es">

## Descripcion
Proyecto de POO en Java basado en personajes de El Senor de los Anillos. Se implementa herencia, encapsulacion, y polimorfismo con una superclase comun y varias razas.

## Requisitos cumplidos
- 5 razas diferentes, con 3 personajes cada una, creados en `Main`.
- 1 superclase con atributos comunes.
- Atributos en `private`.
- Setters y Getters para cada atributo.
- Polimorfismo con `imprimirDetalles()` en la superclase y sobrescritura en cada raza.

## Estructura
- Superclase: `Personaje`
  - Atributos comunes: `nombre`, `edad`, `arma`, `bando`.
  - Metodos: getters, setters, `imprimirDetalles()`.
- Razas (subclases): `Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`.
  - Cada una agrega un atributo propio y sobrescribe `imprimirDetalles()`.

## Ejecucion
1. Abrir el proyecto en IntelliJ.
2. Ejecutar `Main`.
3. En consola se imprimen los detalles de cada personaje usando polimorfismo.

</div>

<div id="lang-en" style="display:none;">

## Description
Java OOP project based on The Lord of the Rings characters. It implements inheritance, encapsulation, and polymorphism with a shared superclass and multiple races.

## Requirements covered
- 5 different races, 3 characters each, created in `Main`.
- 1 superclass with common attributes.
- Attributes are `private`.
- Setters and Getters for each attribute.
- Polymorphism using `imprimirDetalles()` in the superclass and overridden in each race.

## Structure
- Superclass: `Personaje`
  - Common attributes: `nombre`, `edad`, `arma`, `bando`.
  - Methods: getters, setters, `imprimirDetalles()`.
- Races (subclasses): `Humano`, `Elfo`, `Enano`, `Hobbit`, `Orco`.
  - Each one adds its own attribute and overrides `imprimirDetalles()`.

## Run
1. Open the project in IntelliJ.
2. Run `Main`.
3. The console prints each character details using polymorphism.

</div>

<noscript>
  <p>Enable JavaScript to toggle the README language.</p>
</noscript>

<script>
  (function () {
    var btn = document.getElementById('toggle-lang');
    var es = document.getElementById('lang-es');
    var en = document.getElementById('lang-en');
    if (!btn || !es || !en) return;

    btn.addEventListener('click', function () {
      var showingEs = es.style.display !== 'none';
      if (showingEs) {
        es.style.display = 'none';
        en.style.display = 'block';
        btn.textContent = 'Espanol';
      } else {
        es.style.display = 'block';
        en.style.display = 'none';
        btn.textContent = 'English';
      }
    });
  })();
</script>
