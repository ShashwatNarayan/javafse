# REPOSITORY MAP

This repo is a **content/exercise distribution** for DN 5.0 Java FSE. There is no source code —
each file is a handbook, an exercise spec, or the mandatory-list spreadsheet. You download these,
solve the exercises in your **own** public repo, and share that URL with your POC.

```
Java FSE/
├── cognizantDocs/                         ← Program-level reference documents
│   ├── DN5.0-Upskilling-Handbook-Java-FSE.pdf          Prerequisite recap (Java, SQL, HTML/CSS/JS)
│   ├── DN 5.0-Deepskilling-Handbook-Java-FSE-Angular.pdf  ★ MASTER plan: 16 modules, sequence, links
│   ├── Angular_HandsOn.pdf                              Duplicate of the Angular exercise book
│   └── DN 5.0 - FAQ.pdf                                 Rules: assessment, attendance, plagiarism
│
├── Upskilling/                            ← Prerequisite recap material (study, not deep-skill deliverables)
│   ├── Module 1-HTML 5.pdf
│   ├── Module 1-CSS3.pdf
│   ├── Module 1-JavaScript.pdf
│   ├── Module 1-Bootstrap5.pdf
│   ├── Module 2-ANSI SQL Using MySQL.pdf
│   └── Module 3-Core Java.pdf
│
└── Deepskilling/                          ← The graded skill exercises
    ├── DN - Java FSE Mandatory hands-on detail.xlsx     ★ Defines which exercises are MANDATORY
    │
    ├── Engineering concepts/
    │   ├── Design Patterns and Principles.docx          Singleton, Factory (+ more) — Week 1
    │   └── Algorithms_Data Structures.docx              Search Function, Forecasting (+ more) — Week 1
    │
    ├── PL SQL programming/
    │   └── PLSQL_Exercises.docx                         Control Structures, Stored Procedures — Week 1
    │
    ├── JUnit, Mockito and SL4J/
    │   ├── 1. JUnit_Basic Testing Exercises.pdf         ★ mandatory (Ex 1,3,4) — Week 1
    │   ├── 2. JUnit_Advanced Testing exercices.pdf      optional
    │   ├── 3. Mockito exercises.pdf                     ★ mandatory (Ex 1,2) — Week 1
    │   ├── 3. Mockito_Advanced exercises.pdf            optional
    │   ├── 4. JUnit_Spring Test exercises.pdf           optional
    │   ├── 5. Mockito_Mock dependencies exercises.pdf   optional
    │   └── 6. SL4J Logging exercises.pdf                ★ mandatory (Ex 1) — Week 1
    │
    ├── Spring Core and Maven/
    │   └── Spring Core_Maven.docx                       ★ mandatory Ex 1,2,4 (+5,7,9 optional) — Week 2
    │
    ├── Spring Data JPA with Hibernate/
    │   ├── Spring Data JPA and Hibernate.docx           Concept/reference doc
    │   ├── 1. spring-data-jpa-handson.docx              ★ mandatory (Quick Example, JPA-vs-Hibernate) — Week 2
    │   ├── 2. spring-data-jpa-handson.docx              optional (Query Methods, O/R Mapping)
    │   └── 3. spring-data-jpa-handson.docx              optional (HQL & Native Query)
    │
    ├── Spring REST using Spring Boot/
    │   ├── 1. spring-rest-handson.docx                  ★ mandatory (Web project, XML config) — Week 3
    │   ├── 2. spring-rest-handson.docx                  ★ mandatory (Hello World, Country WS, by-code) — Week 3
    │   ├── 3. spring-rest-handson.docx                  optional (All hands-on)
    │   ├── 4. spring-rest-handson.docx                  optional
    │   └── 5. JWT-handson.docx                          ★ mandatory (JWT auth service) — Week 3
    │
    ├── Microservices/
    │   ├── 0. Sample Microservices exercises.pdf        optional/reference
    │   ├── 0. Sample Microservices Load balancing exercises.pdf  optional
    │   ├── 1. Microservices using Spring Boot 3 exercises.pdf     optional
    │   ├── 2. Microservices with API gateway.pdf        ★ mandatory (account+loan; Eureka optional) — Week 4
    │   └── 3. Microservices composite handson.docx      optional
    │
    ├── Angular/
    │   └── Angular_HandsOn.pdf                          ★ THE Angular deliverable — 10 incremental HOs (Weeks 5–6)
    │
    ├── React/                              ← ⚠ OUT OF SCOPE for the Angular track (React stream only)
    │   └── 1–17. ReactJS-HOL.docx                       Ignore for Java FSE Angular
    │
    └── GIT/
        └── 1–5. Git-HOL.docx                            ★ mandatory all 5 — Week 7
```

## Key file purposes

| File | Why it matters |
|---|---|
| **DN 5.0-Deepskilling-Handbook-Java-FSE-Angular.pdf** | The authoritative curriculum: 16 modules, learning objectives, time budgets, and every self-learning link. Start here. |
| **DN - Java FSE Mandatory hands-on detail.xlsx** | Decides what you *must* submit. Columns: Skill → Mandatory (Filename/Name) → Additional important (Filename/Name). |
| **Angular_HandsOn.pdf** | 10 hands-ons building ONE `student-course-portal` app. Submit the whole project, not per-exercise folders. |
| **DN 5.0 - FAQ.pdf** | Hard rules: 7 weeks, 100% attendance, single-attempt KBA, zero-tolerance plagiarism. |
| **Upskilling/** | Prerequisite refresh (Java, SQL, web basics). Not part of Deep Skilling submission. |

## Modules with NO exercise file in the repo (study-only, still examinable)

Code Quality/SonarQube · DevOps & CI/CD · Docker · Agile · Cloud (AWS) · GenAI/Copilot —
these live only in the handbook (Modules 6, 12–16). No mandatory hands-on, but tested in the KBA.

## ⚠ Conflicts / things to note

- **`.NET` label in Angular_HandsOn.pdf header** — the Angular exercise book reuses a header that
  says ".NET Full Stack Engineer Track". This is a template artefact; the content is Angular for the
  **Java** FSE track. Ignore the .NET wording.
- **React in the mandatory XLSX** — the spreadsheet is shared across FSE streams and lists 17 React
  HOLs. For the **Angular** track these are not required; the Angular row points to `Angular_HandsOn.pdf`.
- **Two copies of `Angular_HandsOn.pdf`** exist (in `cognizantDocs/` and `Deepskilling/Angular/`) — identical.
