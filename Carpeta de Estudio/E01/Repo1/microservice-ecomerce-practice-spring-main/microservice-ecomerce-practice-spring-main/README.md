# 🛒 Plataforma de Comercio Electrónico con Microservicios

## 📋 Descripción General

Bienvenido a la **Plataforma de Comercio Electrónico con Microservicios**, un sistema modular y escalable donde los usuarios pueden explorar productos, realizar pedidos y dejar comentarios. El proyecto consta de cinco microservicios: `Usuario`, `Producto`, `Comentario`, `OrdenItem` y `Orden`. Cada microservicio es independiente y se comunica mediante APIs REST para ofrecer una experiencia de compra fluida.

---

## 🎯 Funcionalidades

- **Microservicio de Usuarios**: Gestión de usuarios (registro, inicio de sesión, perfil).
- **Microservicio de Productos**: Catálogo de productos con información detallada.
- **Microservicio de Comentarios**: Los usuarios pueden dejar reseñas y comentarios sobre productos.
- **Microservicio de OrdenItem**: Gestiona los elementos dentro de cada orden.
- **Microservicio de Orden**: Administra las órdenes y su estado.

---

## 🏗️ Arquitectura

Cada microservicio funciona de manera independiente y se comunica mediante APIs REST. Esto permite escalar los servicios fácilmente o integrar nuevas características sin afectar al sistema completo.

```plaintext
Servicio Usuario   Servicio Producto   Servicio Comentario
      |                 |                      |
      |                 |                      |
      |                 |                      |
---------------------------------------------------------
      |                 |                      |
Servicio Orden    Servicio OrdenItem           |
      |                 |                      |
    Base de Datos      Base de Datos        Base de Datos
