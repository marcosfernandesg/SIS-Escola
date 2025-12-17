SIS Escola – API REST com Spring Boot

Projeto backend desenvolvido em Java com Spring Boot, simulando um sistema escolar simples para gerenciamento de alunos e professores.

OBJETIVO
Projeto criado com foco em aprendizado prático de:
- Arquitetura em camadas (Controller, Service, Repository)
- APIs REST
- Spring Boot
- Spring Data JPA
- Organização de projetos backend

TECNOLOGIAS UTILIZADAS
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Maven

ARQUITETURA DO PROJETO
O projeto segue o padrão MVC adaptado para API REST:

Controller
- Responsável por receber e responder requisições HTTP

Service
- Contém as regras de negócio da aplicação

Repository
- Responsável pela comunicação com o banco de dados

Model
- Entidades do sistema

Main
- Classe principal responsável por iniciar a aplicação

FUNCIONALIDADES
- Cadastro de alunos
- Listagem de alunos
- Cadastro de professores
- Listagem de professores

COMO EXECUTAR O PROJETO
1. Clone o repositório:
   git clone https://github.com/marcosfernandesg/sisescola.git

2. Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)

3. Execute a classe:
   SisescolaaApplication

4. A aplicação será iniciada em:
   http://localhost:8080

ENDPOINTS PRINCIPAIS

ALUNOS
GET /alunos
- Lista todos os alunos

POST /alunos
- Cadastra um novo aluno

PROFESSORES
GET /professores
- Lista todos os professores

POST /professores
- Cadastra um novo professor

BANCO DE DADOS
- Banco H2 em memória
- Console H2 disponível em:
  http://localhost:8080/h2-console

AUTOR
Marcos Guilherme Fernandes Pereira
GitHub: https://github.com/marcosfernandesg
