# TASK INDEX — Master Checklist (Java FSE Angular)

Source of truth: `DN - Java FSE Mandatory hands-on detail.xlsx` + `Angular_HandsOn.pdf`.
Status legend: `Not Started` (default) / `In Progress` / `Done`.
Difficulty: B=Beginner, I=Intermediate, A=Advanced.

> React rows from the XLSX are **excluded** (React stream, not Angular).

## Mandatory Hands-On

| # | Task Name | Week | Mandatory/Optional | Difficulty | Status | Dependencies |
|---|---|---|---|---|---|---|
| 1 | Design Patterns — Ex 1 Singleton Pattern | 1 | Mandatory | B | Not Started | Java (Upskilling) |
| 2 | Design Patterns — Ex 2 Factory Method Pattern | 1 | Mandatory | B | Not Started | Java |
| 3 | DSA — Ex 2 E-commerce Platform Search Function | 1 | Mandatory | I | Not Started | Java |
| 4 | DSA — Ex 7 Financial Forecasting | 1 | Mandatory | I | Not Started | Java |
| 5 | PL/SQL — Ex 1 Control Structures | 1 | Mandatory | B | Not Started | Basic SQL (Upskilling) |
| 6 | PL/SQL — Ex 3 Stored Procedures | 1 | Mandatory | I | Not Started | #5 |
| 7 | JUnit — Ex 1 Setting Up JUnit | 1 | Mandatory | B | Not Started | Java |
| 8 | JUnit — Ex 3 Assertions in JUnit | 1 | Mandatory | B | Not Started | #7 |
| 9 | JUnit — Ex 4 AAA Pattern, Fixtures, Setup/Teardown | 1 | Mandatory | I | Not Started | #7 |
| 10 | Mockito — Ex 1 Mocking and Stubbing | 1 | Mandatory | I | Not Started | #7 |
| 11 | Mockito — Ex 2 Verifying Interactions | 1 | Mandatory | I | Not Started | #10 |
| 12 | SLF4J — Ex 1 Logging Error Messages & Warning Levels | 1 | Mandatory | B | Not Started | Java |
| 13 | Spring Core — Ex 1 Configuring a Basic Spring Application | 2 | Mandatory | B | Not Started | Java |
| 14 | Spring Core — Ex 2 Implementing Dependency Injection | 2 | Mandatory | I | Not Started | #13 |
| 15 | Maven — Ex 4 Creating & Configuring a Maven Project | 2 | Mandatory | B | Not Started | #13 |
| 16 | Spring Data JPA — Quick Example | 2 | Mandatory | I | Not Started | #13, JPA basics |
| 17 | Spring Data JPA — Difference: JPA vs Hibernate vs Spring Data JPA | 2 | Mandatory | B | Not Started | #16 |
| 18 | Spring REST — Create a Spring Web Project using Maven | 3 | Mandatory | I | Not Started | #13–15 |
| 19 | Spring REST — Spring Core: Load Country from Spring Config XML | 3 | Mandatory | I | Not Started | #18 |
| 20 | Spring REST — Hello World RESTful Web Service | 3 | Mandatory | B | Not Started | #18 |
| 21 | Spring REST — Country Web Service | 3 | Mandatory | I | Not Started | #16, #20 |
| 22 | Spring REST — Get country based on country code | 3 | Mandatory | I | Not Started | #21 |
| 23 | JWT — Create authentication service that returns JWT | 3 | Mandatory | A | Not Started | #20 |
| 24 | Microservices — Creating Microservices for account and loan | 4 | Mandatory | A | Not Started | #18–22 |
| 25 | Angular HO 1 — Env Setup, Project Structure & First Component | 5 | Mandatory | B | Not Started | Node/CLI |
| 26 | Angular HO 2 — Data Binding, Lifecycle & Component Communication | 5 | Mandatory | B | Not Started | #25 |
| 27 | Angular HO 3 — Directives & Pipes (built-in + custom) | 5 | Mandatory | B | Not Started | #26 |
| 28 | Angular HO 4 — Template-Driven Forms & Validation | 5 | Mandatory | I | Not Started | #27 |
| 29 | Angular HO 5 — Reactive Forms, FormArray, Custom/Async Validators | 5 | Mandatory | I | Not Started | #28 |
| 30 | Angular HO 6 — Services & Dependency Injection | 5 | Mandatory | I | Not Started | #29 |
| 31 | Angular HO 7 — Routing: Guards, Lazy Loading & Route Data | 5 | Mandatory | I | Not Started | #30 |
| 32 | Angular HO 8 — HTTP Client, Observables & Interceptors | 6 | Mandatory | A | Not Started | #31, JSON Server |
| 33 | Angular HO 9 — NgRx Store, Actions, Reducers, Effects, Selectors | 6 | Mandatory | A | Not Started | #32, @ngrx |
| 34 | Angular HO 10 — Unit Testing: Jasmine, Karma & TestBed | 6 | Mandatory | A | Not Started | #33 |
| 35 | Git — HOL 1 | 7 | Mandatory | B | Not Started | — |
| 36 | Git — HOL 2 | 7 | Mandatory | B | Not Started | #35 |
| 37 | Git — HOL 3 | 7 | Mandatory | B | Not Started | #36 |
| 38 | Git — HOL 4 | 7 | Mandatory | I | Not Started | #37 |
| 39 | Git — HOL 5 | 7 | Mandatory | I | Not Started | #38 |

## Optional / Additional Important Hands-On

| # | Task Name | Week | Mandatory/Optional | Difficulty | Status | Dependencies |
|---|---|---|---|---|---|---|
| O1 | Spring Core — Ex 5 Configuring the Spring IoC Container | 2 | Optional | I | Not Started | #13 |
| O2 | Spring Core — Ex 7 Constructor and Setter Injection | 2 | Optional | I | Not Started | #14 |
| O3 | Spring Core — Ex 9 Creating a Spring Boot Application | 2 | Optional | I | Not Started | #13 |
| O4 | JPA (1) — Implement services for managing Country | 2 | Optional | I | Not Started | #16 |
| O5 | JPA (1) — Find a country based on country code | 2 | Optional | I | Not Started | O4 |
| O6 | JPA (1) — Add a new country | 2 | Optional | I | Not Started | O4 |
| O7 | JPA (2) — Query Methods feature of Spring Data JPA | 2 | Optional | I | Not Started | #16 |
| O8 | JPA (2) — O/R Mapping | 2 | Optional | I | Not Started | #16 |
| O9 | JPA (3) — Hibernate Query Language & Native Query | 2 | Optional | A | Not Started | #16 |
| O10 | Spring REST (3) — All hands-on | 3 | Optional | I | Not Started | #18 |
| O11 | Microservices (2) — Eureka Discovery Server + register services | 4 | Optional | A | Not Started | #24 |
| O12 | JUnit Advanced / Mockito Advanced / Spring Test / Mock deps (extra PDFs) | 1 | Optional | A | Not Started | #7–11 |
| O13 | Microservices extras (Sample, Load balancing, Boot 3, composite) | 4 | Optional | A | Not Started | #24 |

## Study-Only Modules (examinable in KBA, no mandatory hands-on)

| Task | Week | Status |
|---|---|---|
| Code Quality & SonarQube | 4 | Not Started |
| DevOps & CI/CD | 7 | Not Started |
| Docker / Containerization | 7 | Not Started |
| Agile Methodology | 7 | Not Started |
| Cloud Fundamentals (AWS) | 7 | Not Started |
| GenAI Fundamentals + GitHub Copilot | 7 | Not Started |

## Final Gate

| Task | Week | Status |
|---|---|---|
| Final KBA Assessment (MCQ, one attempt) | 7 | Not Started |
| Public solution repo created + URL shared with POC | 7 | Not Started |
