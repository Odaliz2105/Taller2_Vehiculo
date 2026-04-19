Va, este ya es un proyecto más “completo” porque tienes capas (`controller`, `dao`, `modelo`, etc.), así que el README debe reflejar una **arquitectura más organizada**, no solo hilos.

Te lo dejo listo para copiar 👇

---

# 🚗 Taller2_Vehiculo - Simulación con Hilos y Arquitectura por Capas

## 📌 Descripción

Este proyecto implementa una simulación de vehículos utilizando **JavaFX** junto con **programación concurrente (hilos)** y una **arquitectura por capas**.

Cada vehículo se ejecuta como un hilo independiente, permitiendo simular movimiento concurrente dentro de una interfaz gráfica.

Además, el sistema está organizado en múltiples paquetes siguiendo buenas prácticas de desarrollo, separando responsabilidades.

---

## 🎯 Objetivos

* Aplicar **Programación Orientada a Objetos (POO)**.
* Implementar **hilos en Java** para simular procesos concurrentes.
* Utilizar **JavaFX** para la interfaz gráfica.
* Organizar el proyecto usando una **arquitectura en capas**.

---

## 🧠 Conceptos clave

### 🔹 Hilos (Threads)

Cada vehículo se ejecuta en su propio hilo, lo que permite que todos se muevan al mismo tiempo.

💡 *¿Por qué usar hilos?*
Porque simulan procesos reales que ocurren simultáneamente. Sin hilos, los vehículos avanzarían uno por uno, lo cual no representa un sistema real.

---

### 🔹 Arquitectura por capas

El proyecto está dividido en paquetes, cada uno con una responsabilidad específica:

```id="v0u2rk"
src/
│── controller/
│── dao/
│── hilo/
│── modelo/
│── resources/
│── vista/
│── Formulario.fxml
```

#### 📦 `modelo`

Contiene las clases que representan los datos (ej: Vehículo).

#### 📦 `dao`

Encargado del acceso a datos (simulado o estructural).

#### 📦 `controller`

Gestiona la lógica entre la vista y el modelo.

#### 📦 `vista`

Contiene la interfaz gráfica.

#### 📦 `hilo`

Implementa la lógica de concurrencia (threads de los vehículos).

#### 📦 `resources`

Archivos auxiliares (imágenes, estilos, etc.).

---

## ⚙️ Tecnologías usadas

* Java
* JavaFX
* IntelliJ IDEA

---

## ▶️ Ejecución

1. Clonar el repositorio:

```bash id="i1qv9y"
git clone https://github.com/Odaliz2105/Taller2_Vehiculo.git
```

2. Abrir en IntelliJ IDEA.

3. Configurar JavaFX en VM Options:

```id="6xkzq2"
--module-path /ruta/javafx/lib --add-modules javafx.controls,javafx.fxml
```

4. Ejecutar la clase principal del proyecto.

---

## 🏁 Funcionamiento

* Se registran vehículos mediante la interfaz (`Formulario.fxml`).
* Cada vehículo inicia como un hilo.
* Los hilos se ejecutan simultáneamente.
* Se simula movimiento o comportamiento independiente.

---

## 🚀 Posibles mejoras

* Validaciones más robustas en el formulario.
* Persistencia real con base de datos.
* Control de estados (iniciar, pausar, reiniciar).
* Sincronización de hilos para evitar conflictos.
* Mostrar resultados en tiempo real.

---

## 👩‍💻 Autor

* Odaliz Balseca Valencia

---

## 📚 Contexto académico

Proyecto desarrollado como parte del aprendizaje en:

* Programación concurrente (hilos)
* Arquitectura de software por capas
* Interfaces gráficas con JavaFX


