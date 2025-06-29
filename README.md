📊 Monitor de Peso - Resumen del Proyecto
📌 Descripción
Este proyecto desarrolla una aplicación para monitorear y actualizar el peso de usuarios, poniendo énfasis en la calidad de software mediante pruebas automatizadas, integración continua y análisis de código.

🛠️ Tecnologías y Herramientas
Herramienta	Uso Principal
Java 17	Desarrollo del backend y lógica del proyecto
Maven	Gestión de dependencias, compilación y pruebas
JUnit 5	Pruebas unitarias
Selenium WebDriver	Pruebas funcionales (automatización navegador)
JMeter	Pruebas de rendimiento y carga
SonarQube / SonarCloud	Análisis estático de calidad de código
GitHub Actions	Integración continua y ejecución automatizada
Python HTTP Server	Servidor local para pruebas de rendimiento
Git	Control de versiones

🚀 Proceso Realizado
1. Desarrollo y pruebas unitarias
Implementación de pruebas con JUnit 5 para validar la lógica de actualización de peso.

Validación de funcionalidades clave para asegurar la correcta operación.

2. Pruebas funcionales con Selenium
Automatización de pruebas que simulan la interacción de usuario en la interfaz web.

Actualmente estas pruebas se ejecutan localmente, debido a limitaciones de entorno en GitHub Actions.

3. Pruebas de rendimiento con JMeter
Simulación de carga con 50 usuarios concurrentes para evaluar tiempos de respuesta y estabilidad.

Uso de un servidor HTTP local (Python HTTP Server) para alojar la aplicación web durante las pruebas.

Recolección y análisis de métricas clave (latencia, throughput, errores).

4. Estrategia de pruebas de regresión
Integración de pruebas unitarias y funcionales en un único proyecto Maven.

Automatización para ejecutar estas pruebas en cada cambio de código para evitar regresiones.

Uso de Git para control de versiones con ramas y revisiones.

5. Integración Continua con GitHub Actions
Pipeline configurado para:

Descargar código y dependencias.

Configurar Java 17.

Compilar proyecto.

Ejecutar pruebas unitarias automáticamente.

Exclusión temporal de pruebas funcionales por limitaciones en el entorno CI.

6. Análisis de Calidad con SonarQube
Configuración para análisis estático local con Maven y SonarQube.

Generación de reportes para monitorear calidad, cobertura y vulnerabilidades.

Aplicación de la metodología “Clean as You Code” para mejorar continuamente el código.

⚠️ Retos y Consideraciones
Limitaciones en CI: Las pruebas Selenium con ChromeDriver no se ejecutan en GitHub Actions por incompatibilidades y permisos.

Solución temporal: Ejecutar pruebas funcionales localmente; pruebas unitarias en CI.

Importancia de adaptar pruebas para distintos entornos y garantizar estabilidad continua.

📈 Próximos Pasos
Implementar entorno Docker o Selenium Grid para pruebas funcionales automáticas en CI.

Ampliar cobertura y variedad de pruebas.

Automatizar análisis SonarQube dentro del pipeline CI.

Incorporar pruebas de seguridad y experiencia de usuario.

🎯 Conclusión
Este proyecto sentó las bases para un desarrollo sostenible y de calidad, integrando buenas prácticas con pruebas automatizadas, integración continua y análisis estático, asegurando estabilidad, rendimiento y facilidad para futuras mejoras.

