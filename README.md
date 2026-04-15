![](https://github.com/sabrinaceciliajeria-cmyk/RefugioAnimales/raw/main/screenshot-1775781823.png)

```markdown
# 🎬 CineApp

Sistema de gestión de cine por consola desarrollado en Java,
aplicando principios de Programación Orientada a Objetos (POO).

## 📋 Descripción

CineApp permite gestionar clientes, películas, funciones y compra
de entradas a través de un menú interactivo por consola.

## 🛠️ Tecnologías

- Java 17+
- Paradigma: Programación Orientada a Objetos
- Sin dependencias externas

## 📁 Estructura del proyecto

CineApp/
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── model/
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── Pelicula.java
│   │   ├── Funcion.java
│   │   └── Entrada.java
│   ├── service/
│   │   └── CineService.java
│   └── util/
│       └── ConsolaUtil.java
└── README.md

## ▶️ Cómo ejecutar

1. Clonar el repositorio
   git clone https://github.com/tu-usuario/CineApp.git

2. Compilar el proyecto
   javac -d out src/**/*.java

3. Ejecutar
   java -cp out app.Main

## 🧩 Funcionalidades

- Crear y gestionar clientes
- Registrar películas y funciones
- Comprar entradas con validación de disponibilidad
- Consultar entradas compradas por cliente
- Manejo de errores con try/catch

## 👥 Autores

- Integrante 1 – Persona / Cliente
- Integrante 2 – Pelicula / Funcion
- Integrante 3 – Entrada
- Integrante 4 – CineService (menú y flujo)
- Integrante 5 – CineService (lógica de compra)
- Integrante 6 – Util / Validaciones
- Integrante 7 – Main / Integración / Testing
```

---

## 👥 División de tareas (7 personas)

La clave es que **cada persona tenga una responsabilidad clara y sin bloqueos** entre sí al inicio. Por eso se recomienda definir primero una estructura base.

---

### ⚠️ Paso previo (hacer entre todos o asignarlo al líder del equipo)

Antes de dividir, alguien debe crear el repositorio y la estructura de carpetas vacía con los archivos `.java` en blanco, para que todos puedan trabajar en paralelo sin conflictos.

```
CineApp/
└── src/
    ├── app/Main.java          → vacío
    ├── model/Persona.java     → vacío
    ├── model/Cliente.java     → vacío
    ├── model/Pelicula.java    → vacío
    ├── model/Funcion.java     → vacío
    ├── model/Entrada.java     → vacío
    ├── service/CineService.java → vacío
    └── util/ConsolaUtil.java  → vacío
```

Esto evita que nadie espere a nadie para comenzar.

---

### 🗂️ Asignación por persona

| # | Persona | Archivos | Responsabilidad |
|---|---------|----------|-----------------|
| 1 | Arantxa Fischer - Manuel Labrador | `model/Persona.java` `model/Cliente.java` | Clase base con `nombre`, herencia en Cliente, lista de entradas |
| 2 | Cristian Diaz | `model/Pelicula.java` | Atributos título/duración, getters, método `mostrarInfo()` |
| 3 | Cristopher Contreras | `model/Funcion.java` | Película, horario, capacidad, control de asientos disponibles |
| 4 | Natalia Medel | `model/Entrada.java` | Asociar cliente + función + asiento, método `mostrarResumen()` |
| 5 | Diego Peña | `service/CineService.java` | Menú por consola, listas de clientes y funciones, switch/while |
| 6 | Diego Peña | `service/CineService.java` | Lógica de compra de entrada, validaciones, manejo de errores |
| 7 | Sabrina Jeria | `app/Main.java` `util/ConsolaUtil.java` | Arranque del sistema, utilidades de consola, integración y pruebas |

> ⚠️ **Integrantes 5 y 6** trabajan sobre el mismo archivo. Se recomienda que coordinen quién hace el esqueleto del menú primero, y luego el otro agrega la lógica de compra. Pueden usar ramas Git separadas.
> 
---

### 🔗 Orden de dependencias (para no bloquearse)

```
Integrante 1 (Persona/Cliente)
        ↓
Integrante 3 (Funcion) depende de Pelicula → coordinar con Integrante 2
        ↓
Integrante 4 (Entrada) depende de Cliente y Funcion
        ↓
Integrantes 5 y 6 (CineService) dependen de todo lo anterior
        ↓
Integrante 7 (Main) integra todo al final
```

---

### ✅ Recomendaciones de equipo

- Usar **Git con ramas por persona** (`feature/persona`, `feature/funcion`, etc.)
- Acordar **nombres de atributos y métodos** antes de comenzar para evitar conflictos
