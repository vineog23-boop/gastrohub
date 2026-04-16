# GastroHub

Backend em **Java + Spring Boot** desenvolvido para o **Tech Challenge da FIAP**, com foco atual no gerenciamento de usuários de uma plataforma de restaurantes.
## Escopo atual do projeto
- cadastro de usuários
- atualização de dados do usuário
- alteração de senha em endpoint separado
- busca de usuários por nome
- validação de login
- garantia de e-mail único
- registro da data da última atualização

## Stack identificada no projeto
- Java 21
- Spring Boot 4.0.5
- Spring Data JPA
- Spring Security
- Spring Validation
- Spring MVC
- Thymeleaf
- Spring Mail
- MySQL
- Docker / Docker Compose

## Estrutura em alto nível

```text
src/
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── mapper
 ├── config
 └── exception
```
