# 💪 Monitor de Peso

Un proyecto Java para monitorear y actualizar el peso de usuarios, aplicando **pruebas automatizadas**, **integración continua** y **análisis de calidad de código**.

---

## 🚀 Tecnologías y Herramientas Utilizadas

| 🛠️ Herramienta           | 💡 Propósito                                                |
|--------------------------|------------------------------------------------------------|
| ☕ **Java 17**            | Desarrollo backend y lógica principal                      |
| 🧩 **Maven**             | Gestión de dependencias y automatización de builds         |
| ✅ **JUnit 5**            | Pruebas unitarias para validar la lógica del sistema       |
| 🌐 **Selenium WebDriver** | Pruebas funcionales simulando interacción del usuario      |
| ⚡ **JMeter**             | Pruebas de carga y rendimiento                             |
| 🛡️ **SonarQube/SonarCloud** | Análisis estático de calidad y seguridad del código        |
| 🔄 **GitHub Actions**     | Integración continua y ejecución automática de pruebas     |
| 🐍 **Python HTTP Server** | Servidor local simple para pruebas con JMeter              |
| 🌱 **Git**                | Control de versiones y flujo de trabajo en ramas           |

---

## 📝 Proceso de Desarrollo y Validación

### 🎯 1. Pruebas Unitarias
- Implementadas con **JUnit 5**.
- Validan la lógica de actualización de peso de los usuarios.

### 🧪 2. Pruebas Funcionales (Local)
- Realizadas con **Selenium WebDriver** y ChromeDriver.
- Simulan la interacción real con el formulario de actualización.
- ⚠️ *Estas pruebas se ejecutan localmente por limitaciones en CI.*

### 🔬 3. Pruebas de Rendimiento
- Configuradas en **Apache JMeter** con:
  - 50 usuarios concurrentes.
  - Ramp-up de 5 segundos.
  - Loop count de 5.
- Resultados almacenados con Summary Report y Aggregate Report.
- Para simular el entorno, se utilizó:
  python -m http.server 8000


### 4. Pruebas de Regresión
Todas las pruebas se integran con Maven para ejecutarse automáticamente.
Estrategia:
Versionado Git con ramas de desarrollo.
Revisión de pruebas al agregar nuevas funcionalidades.
Validación automática antes de merges.

###🛡️ Análisis de Calidad (SonarQube)
Se ejecutó el análisis con SonarQube Scanner for Maven de forma local
Resultados:
Métricas de calidad y cobertura generadas en la interfaz SonarQube.
Metodología Clean as You Code activada para futuros cambios.

###⚠️ Retos Identificados
Ejecución de Selenium en CI: GitHub Actions no permite usar ChromeDriver sin configuraciones avanzadas.
Solución temporal: Mantener las pruebas funcionales en ejecución local.
Acceso a puertos y rutas locales: Para JMeter y Selenium fue necesario un servidor HTTP local.

###🧭 Próximos Pasos
Integrar Selenium en CI con Docker o Selenium Grid.
Automatizar el análisis SonarQube dentro de GitHub Actions.
Incrementar cobertura de pruebas funcionales y de rendimiento.

###✨ Conclusión
Este proyecto demuestra un enfoque completo de:
✅ Desarrollo Java
✅ Pruebas unitarias y funcionales
✅ Pruebas de rendimiento
✅ Integración continua
✅ Control de calidad con SonarQube

Todo orientado a garantizar la calidad y mantenibilidad del software.
