# AGENTS.md — proyecto-09

## Quick start

```bash
./mvnw clean install           # full build
./mvnw test                    # run tests
./mvnw spring-boot:run         # dev server
```

`mvnw` is not executable on disk — run `chmod +x mvnw` or prefix with `bash`.

## Project layout

- **Spring Boot 4.0.6** / **Java 17** / **Maven wrapper**
- Dependencies: `spring-boot-starter-webmvc`, `spring-boot-starter-thymeleaf`
- Entrypoint: `src/main/java/.../Proyecto09Application.java` (package `com.github.Radu_A.proyecto_09`)
- Thymeleaf templates → `src/main/resources/templates/`
- Static assets → `src/main/resources/static/`
- Single context-load test: `src/test/java/.../Proyecto09ApplicationTests.java` (JUnit 5, `@SpringBootTest`)
- No CI, no lint/format/typecheck config

## Conventions

- Package name uses underscore: `com.github.Radu_A.proyecto_09`
- Original pom proposed hyphenated name was invalid, hence the underscore
- Standard Spring Boot property loading (`application.properties`)
- Strictly respect clean layered architecture. Always organize code into the following packages: model, repository, service (separating IService and ServiceImpl), and controller

## Frontend conventions

- **Framework:** Bootstrap 5 (no jQuery, use `data-bs-*` attributes)
- **Estilos:** No inline styles (`style="..."`) — only Bootstrap utility classes
- **Thymeleaf:** Extract navbar and forms into reusable `th:fragment` components
- **Validación:** Show validation errors with `.is-invalid` on inputs and `.invalid-feedback` for messages
- **Aesthetic:** Minimalist, clean. Strictly use Bootstrap grid (`.row`, `.col-*`) and Flexbox utilities (`.d-flex`, `.justify-content-*`) for responsive layout
