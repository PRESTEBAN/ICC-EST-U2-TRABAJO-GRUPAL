# Proyecto: Agenda de Contactos con Lista Enlazada

## 📌 Información General

- **Título:** Gestión de Contactos con Listas Enlazadas  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante1:** Carlos Antonio Gordillo Tenemaza  
- **Estudiante2:** Esteban Vicente Pesantez Rea
- **Fecha:** 11/06/2025  
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto en Java implementa una **agenda de contactos** utilizando una **lista enlazada simple**. Está estructurado bajo el patrón **Modelo-Vista-Controlador (MVC)** y permite añadir, buscar, eliminar y mostrar contactos desde un menú interactivo en consola.

### 🔧 Componentes

- `Model.Contact<T, U>`: clase genérica que representa un contacto con nombre y número de teléfono.
- `Model.Node<T>`: nodo genérico de una lista enlazada.
- `Model.LinkedList<T>`: implementación de lista enlazada simple, con métodos `appendToTail`, `findByValue`, `deleteByValue` y `print`.
- `Controller.ContactManager`: contiene la lógica para agregar, buscar, eliminar y mostrar contactos usando la lista enlazada.
- `Controller.MenuController`: presenta el menú principal y gestiona las opciones del usuario.
- `View.ConsoleView`: vista que permite la interacción por consola.
- `App.java`: clase principal que ejecuta el menú.

---

## 📋 Funcionalidades

- Agregar contacto (nombre y teléfono).
- Buscar contacto por nombre.
- Eliminar contacto por nombre.
- Mostrar todos los contactos almacenados.
- Menú interactivo que se repite hasta que el usuario decida salir.

---

## 🚀 Ejecución

Para compilar y ejecutar el programa:

```bash
javac src/**/*.java -d bin
java -cp bin App

## 🧑‍💻 Ejemplo de Uso

```plaintext
=== Contact Management Menu ===
1. Añadir contacto
2. Buscar Contacto
3. Eliminar Contacto
4. Mostrar Contactos
5. Salir
Seleccione una opción: 1
Ingrese el nombre: Esteban
Ingrese el teléfono: 0987654321
Contacto agregado exitosamente.

=== Contact Management Menu ===
1. Añadir contacto
2. Buscar Contacto
3. Eliminar Contacto
4. Mostrar Contactos
5. Salir
Seleccione una opción: 4
Contacto: Esteban | 0987654321


