# EXECUTION PLAN — Java FSE (Angular) | 7-Week Roadmap

Effort target: **10–12 hrs/week**. The handbook gives explicit time budgets; this plan maps them
onto 7 weeks. Mandatory items come from `DN - Java FSE Mandatory hands-on detail.xlsx`.
Optional items are the "Additional important hands-on" column + the extra files in each folder.

**Time budget from handbook:** Engineering Concepts 2 days · Programming Languages 3 days ·
Products & Frameworks 5 weeks (Spring Core/Maven 0.5w, JPA 0.5w, REST 1w, SonarQube 0.5w,
Microservices 0.5w, Angular+Debugging 2w) · Platforms & GenAI 1 week.

Legend: 🔴 Mandatory · 🟡 Optional/Additional · 📖 Study only (no mandatory hands-on)

---

## WEEK 1 — Engineering Concepts + Programming Languages foundations

**Objectives:** Internalise SOLID/GoF patterns, core DSA, PL/SQL procedural programming, and
test-driven development with logging.

**Topics:** SRP/OCP/LSP/ISP/DIP · Creational/Structural/Behavioral patterns · arrays, linked lists,
search & sort, Big-O · PL/SQL blocks, cursors, procedures, functions, packages, triggers · TDD
Red-Green-Refactor · JUnit 5 · Mockito · SLF4J + Lombok.

**Required reading:** Handbook Modules 1–4. baeldung SOLID; geeksforgeeks DSA, PL/SQL, JUnit 5.

**🔴 Mandatory hands-on:**
- Design Patterns (`Design Patterns and Principles.docx`): Ex 1 Singleton · Ex 2 Factory Method
- DSA (`Algorithms_Data Structures.docx`): Ex 2 E-commerce Platform Search · Ex 7 Financial Forecasting
- PL/SQL (`PLSQL_Exercises.docx`): Ex 1 Control Structures · Ex 3 Stored Procedures
- JUnit (`1. JUnit_Basic Testing Exercises.pdf`): Ex 1 Setting Up JUnit · Ex 3 Assertions · Ex 4 AAA Pattern/Fixtures/Setup-Teardown
- Mockito (`3. Mockito exercises.pdf`): Ex 1 Mocking & Stubbing · Ex 2 Verifying Interactions
- SLF4J (`6. SL4J Logging exercises.pdf`): Ex 1 Logging Error Messages & Warning Levels

**🟡 Optional:** other exercises in the above files; `2. JUnit_Advanced`, `3. Mockito_Advanced`,
`4. JUnit_Spring Test`, `5. Mockito_Mock dependencies` PDFs.

**Coding challenges / practice:** Design Patterns Quiz · DSA Quiz · PL/SQL Quiz.

**Deliverables:** `Week1/` folder with Patterns, DSA, PL/SQL, JUnit, Mockito, SLF4J solutions.

**Estimated effort:** ~12 hrs. **Dependencies:** none (Java + basic SQL from Upskilling).

**Checklist:**
- [ ] 2 Design Pattern exercises
- [ ] 2 DSA exercises
- [ ] 2 PL/SQL exercises
- [ ] 3 JUnit + 2 Mockito exercises
- [ ] 1 SLF4J exercise

---

## WEEK 2 — Spring Core & Maven + Spring Data JPA / Hibernate

**Objectives:** Wire Spring beans via IoC/DI, build with Maven, persist data with Spring Data JPA + Hibernate.

**Topics:** IoC container, BeanFactory vs ApplicationContext, XML & annotation config, constructor/setter
injection, AOP, Maven `pom.xml`/lifecycle · JPA entities, repositories, derived queries, CRUD, pagination,
sorting, auditing, projections, Hibernate dialect/HQL.

**Required reading:** Handbook Modules 5 & 6. baeldung IoC/DI; persistence layer with Spring Data JPA.

**🔴 Mandatory hands-on:**
- Spring Core & Maven (`Spring Core_Maven.docx`): Ex 1 Configuring a Basic Spring Application ·
  Ex 2 Implementing Dependency Injection · Ex 4 Creating & Configuring a Maven Project
- Spring Data JPA (`1. spring-data-jpa-handson.docx`): Spring Data JPA – Quick Example ·
  Difference between JPA, Hibernate & Spring Data JPA

**🟡 Optional / Additional important:**
- Spring Core: Ex 5 Configuring the Spring IoC Container · Ex 7 Constructor & Setter Injection · Ex 9 Spring Boot App
- JPA `1.`: Implement services for managing Country · Find country by code · Add a new country
- JPA `2. spring-data-jpa-handson.docx`: Query Methods feature · O/R Mapping
- JPA `3. spring-data-jpa-handson.docx`: Hibernate Query Language & Native Query

**Practice:** Maven Quiz · Spring Quiz · Spring Data JPA Quiz · Hibernate Quiz.

**Deliverables:** `Week2/` — Spring Core/Maven project + JPA Country project.

**Estimated effort:** ~12 hrs. **Dependencies:** Week 1 (Java/TDD); JUnit used for tests.

**Checklist:**
- [ ] 3 mandatory Spring Core/Maven exercises
- [ ] 2 mandatory Spring Data JPA exercises
- [ ] (optional) Country CRUD + Query Methods + HQL

---

## WEEK 3 — Spring REST using Spring Boot 3 (+ JWT security)

**Objectives:** Build production-style REST APIs with Boot 3: controllers, DTOs, CRUD, exception
handling, content negotiation, Actuator, security (JWT), testing, Swagger docs.

**Topics:** REST architecture, `@RestController`, path/query params, DTO mapping, HATEOAS,
content negotiation, Actuator, Spring Security + JWT, CORS, MockMvc testing, OpenAPI/Swagger.

**Required reading:** Handbook Module 7.

**🔴 Mandatory hands-on:**
- `1. spring-rest-handson.docx`: Create a Spring Web Project using Maven · Spring Core – Load Country from Spring Configuration XML
- `2. spring-rest-handson.docx`: Hello World RESTful Web Service · REST – Country Web Service · REST – Get country based on country code
- `5. JWT-handson.docx`: Create authentication service that returns JWT

**🟡 Optional / Additional important:**
- `3. spring-rest-handson.docx`: **All hands-on** in that document
- `4. spring-rest-handson.docx`

**Practice:** REST Quiz.

**Deliverables:** `Week3/` — Country REST service + JWT auth service.

**Estimated effort:** ~12 hrs (1 full week). **Dependencies:** Weeks 1–2 (JPA entities, Spring Core, JUnit).

**Checklist:**
- [ ] Spring Web project + XML config (2 exercises)
- [ ] 3 REST Country service exercises
- [ ] 1 JWT auth exercise

---

## WEEK 4 — Code Quality (SonarQube) + Microservices (Spring Cloud)

**Objectives:** Inspect code quality with SonarQube; decompose into microservices with Eureka & API Gateway.

**Topics:** SonarQube architecture, quality gates, `mvn sonar:sonar`, code smells/coverage ·
microservice principles, service discovery (Eureka), API Gateway, Feign, circuit breaker, Spring Cloud Config.

**Required reading:** Handbook Module 6 (Code Quality) & Module 8 (Microservices).

**🔴 Mandatory hands-on:**
- Microservices (`2. Microservices with API gateway.pdf`): Creating Microservices for account and loan

**🟡 Optional / Additional important:**
- Microservices `2.`: Create Eureka Discovery Server and register microservices
- `0. Sample Microservices exercises.pdf` · `0. Sample Microservices Load balancing exercises.pdf`
- `1. Microservices using Spring Boot 3 exercises.pdf` · `3. Microservices composite handson.docx`

**📖 Study only (examinable, no mandatory hands-on):** SonarQube (set up + run a scan on your Week 3 project as self-practice).

**Deliverables:** `Week4/` — account + loan microservices, Eureka server; SonarQube scan report screenshot.

**Estimated effort:** ~12 hrs. **Dependencies:** Week 3 (Spring Boot REST).

**Checklist:**
- [ ] account + loan microservices (mandatory)
- [ ] (optional) Eureka discovery + API gateway
- [ ] (practice) Run SonarQube on a Spring project

---

## WEEK 5 — Angular v20 (Part 1): Foundations → Routing  ▶ Student Course Portal

> All Angular work is **one incremental project** (`student-course-portal`). Do not skip; each
> hands-on depends on the previous. Build in `Angular_HandsOn/<YourName>/`.

**Objectives:** Scaffold the portal; master components, binding, lifecycle, directives, pipes, both
form styles, services/DI, and routing with guards & lazy loading.

**Topics:** Angular CLI, project structure, components, property/event/two-way binding, `@Input`/`@Output`,
lifecycle hooks, structural/attribute directives, custom directive & pipe, template-driven & reactive
forms, validators, services, hierarchical DI, routing, route params, guards, lazy loading.

**Required reading:** Handbook Module 9 (Angular); `Angular_HandsOn.pdf` HO 1–7.

**🔴 Mandatory hands-on (all build the portal):**
- HO 1 — Environment Setup, Project Structure & First Component *(Beginner)*
- HO 2 — Data Binding, Lifecycle Hooks & Component Communication *(Beginner)*
- HO 3 — Directives & Pipes (built-in + custom) *(Beginner)*
- HO 4 — Template-Driven Forms & Validation *(Intermediate)*
- HO 5 — Reactive Forms (FormBuilder, FormArray, custom/async validators) *(Intermediate)*
- HO 6 — Services & Dependency Injection *(Intermediate)*
- HO 7 — Routing: Guards, Lazy Loading & Route Data *(Intermediate)*

**Tooling required:** Node.js LTS 20+, Angular CLI v20, VS Code + Angular Language Service,
Chrome + Angular DevTools.

**Practice:** javaguides / w3schools / geeksforgeeks Angular quizzes.

**Deliverables:** `student-course-portal` through HO 7 (Home, Course Listing, Enrollment forms, Navigation/guards).

**Estimated effort:** ~12 hrs. **Dependencies:** none Angular-internal, but Week 3 REST concepts help in HO 8.

**Checklist:**
- [ ] HO 1 setup & components
- [ ] HO 2 binding & lifecycle
- [ ] HO 3 directives & pipes
- [ ] HO 4 template-driven forms
- [ ] HO 5 reactive forms
- [ ] HO 6 services & DI
- [ ] HO 7 routing & guards

---

## WEEK 6 — Angular v20 (Part 2): HTTP, NgRx, Testing + Application Debugging

**Objectives:** Connect the portal to a backend, manage state with NgRx, write unit tests, and
debug Angular apps with Chrome DevTools + VS Code.

**Topics:** HttpClient (GET/POST/PUT/DELETE), Observables, RxJS operators (map, catchError, tap,
switchMap, retry), interceptors (auth, error, loading) · NgRx store, actions, reducers, selectors,
effects · Jasmine/Karma, TestBed, HttpClientTestingModule, MockStore · DevTools breakpoints,
source maps, VS Code `launch.json`, inspecting NgRx state.

**Required reading:** Handbook Module 9 (HTTP/State/Testing) + Module 10 (Application Debugging);
`Angular_HandsOn.pdf` HO 8–10.

**🔴 Mandatory hands-on:**
- HO 8 — HTTP Client: API Integration, Observables & Interceptors *(Advanced)* — needs JSON Server (`npm i -g json-server`)
- HO 9 — State Management: NgRx Store, Actions, Reducers, Effects, Selectors *(Advanced)* — needs `@ngrx/*` + Redux DevTools
- HO 10 — Unit Testing: Jasmine, Karma & TestBed *(Advanced)*

**📖 Study (Module 10, no separate mandatory hands-on):** Debug the portal with Chrome DevTools
and VS Code debugger — apply to HO 8/9 bugs as practice.

**Deliverables:** Complete `student-course-portal` (HTTP + NgRx + passing `ng test`). Push final
project to your public repo.

**Estimated effort:** ~12 hrs. **Dependencies:** Weeks 5 HO 1–7 (same project); Week 3 REST mental model.

**Checklist:**
- [ ] HO 8 HttpClient + interceptors
- [ ] HO 9 NgRx state management
- [ ] HO 10 unit tests passing (`ng test`)
- [ ] Debugging practice (DevTools + VS Code)

---

## WEEK 7 — Platforms (Git, DevOps/CI-CD, Docker, Agile, Cloud) + GenAI + Final KBA

**Objectives:** Round out platform/enabler skills, learn GenAI tooling, then sit the final assessment.

**Topics:** Git (init/clone/branch/merge/remote/fork, workflows) · DevOps & CI/CD (Jenkins, GitHub
Actions) · Docker (images, compose, networking, orchestration) · Agile/Scrum (roles, ceremonies,
user stories, estimation) · AWS (EC2, S3, EBS, VPC, ELB, RDS, DynamoDB, Lambda, API Gateway) ·
GenAI fundamentals, prompt engineering, GitHub Copilot.

**Required reading:** Handbook Modules 11–16.

**🔴 Mandatory hands-on:**
- Git (`1.`–`5. Git-HOL.docx`): all 5 Git hands-on labs

**📖 Study only (examinable, no mandatory hands-on):** DevOps/CI-CD · Docker · Agile · Cloud (AWS) · GenAI/Copilot.

**Practice:** DevOps Quiz · Docker Quiz · GenAI/Prompt-Engineering quizzes.

**Deliverables:** `Week7/` Git labs; ensure full week-wise solution repo is public and shared with POC.

**🎓 FINAL KBA ASSESSMENT** — stream-specific MCQ covering **all** Deep Skilling topics. One attempt only.

**Estimated effort:** ~12 hrs + assessment. **Dependencies:** all prior weeks.

**Checklist:**
- [ ] 5 Git hands-on labs
- [ ] DevOps / Docker / Agile / Cloud / GenAI study + quizzes
- [ ] Final solution repo public + URL shared with POC
- [ ] Sit & pass the KBA
