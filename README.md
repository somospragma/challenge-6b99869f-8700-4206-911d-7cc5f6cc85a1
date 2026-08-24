# Implementación de multithreading en la conexión a servicios externos

El equipo de desarrollo móvil necesita mejorar la conectividad con servicios externos, tanto legados como incipientes. Es crucial que las solicitudes a estos servicios no bloqueen la interfaz de usuario. El objetivo es implementar mecanismos avanzados de multithreading para manejar estas conexiones de manera eficiente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Mecanismos avanzados de multithreading |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Conexión básica a un servicio externo

**Objetivo:** Establecer una conexión simple a un servicio externo sin usar multithreading.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica el servicio externo al que conectarte.
- Escribe código para realizar una solicitud al servicio.

**Entregable:** Código que realiza una solicitud al servicio externo.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la solicitud debe ser sincrónica en esta fase.
- Considera las posibles respuestas del servicio.

</details>

### Fase 2: Introducción al multithreading

**Objetivo:** Implementar una conexión al servicio externo usando multithreading para evitar bloquear la interfaz de usuario.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Investiga los conceptos básicos de multithreading.
- Modifica el código para realizar la solicitud al servicio en un hilo separado.

**Entregable:** Código que realiza la solicitud al servicio externo en un hilo separado.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los hilos pueden ejecutarse de manera concurrente.
- Considera cómo manejar las respuestas del hilo.

</details>

### Fase 3: Manejo de errores y excepciones

**Objetivo:** Mejorar la implementación de multithreading para manejar errores y excepciones de manera adecuada.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Identifica posibles errores y excepciones que pueden ocurrir durante la solicitud.
- Modifica el código para manejar estos errores y excepciones.

**Entregable:** Código que realiza la solicitud al servicio externo en un hilo separado y maneja errores y excepciones.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los errores y excepciones pueden ocurrir en cualquier punto del proceso.
- Considera cómo notificar al usuario sobre los errores.

</details>

### Fase 4: Optimización y refactoring

**Objetivo:** Optimizar y refactorizar el código para mejorar el rendimiento y la mantenibilidad.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el código actual y busca oportunidades de optimización y refactoring.
- Aplica las mejoras identificadas.

**Entregable:** Código optimizado y refactorizado que realiza la solicitud al servicio externo en un hilo separado y maneja errores y excepciones.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la optimización y el refactoring pueden mejorar tanto el rendimiento como la mantenibilidad del código.
- Considera cómo hacer el código más legible y fácil de mantener.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el multithreading y por qué es importante en este contexto?
- **comoSeUsa**: ¿Cómo se usa el multithreading para realizar solicitudes a servicios externos sin bloquear la interfaz de usuario?
- **erroresComunes**: ¿Qué errores y excepciones pueden ocurrir durante la solicitud a un servicio externo y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización y refactorización del código de multithreading?

## Criterios de Evaluacion

- Implementar una conexión básica a un servicio externo.
- Realizar la solicitud al servicio externo en un hilo separado.
- Manejar errores y excepciones durante la solicitud.
- Optimizar y refactorizar el código para mejorar el rendimiento y la mantenibilidad.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
