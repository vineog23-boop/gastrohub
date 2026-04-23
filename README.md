# 🍔 Lanchonete API
(em homenagem ao estabelecimento do meu pai)

Backend em Java + Spring Boot para gerenciamento de pedidos de uma lanchonete.

![Java 21](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring)
![H2](https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge)
![Validation](https://img.shields.io/badge/Validation-0A7E07?style=for-the-badge)

---

## 📌 Sobre o projeto

A **Lanchonete API** é uma API REST backend para gerenciamento completo de uma lanchonete — do cardápio ao pedido entregue.

O sistema diferencia pedidos de **balcão** (sem identificação de cliente) de pedidos de **entrega** (com cadastro de cliente e entregador). Um pedido percorre um ciclo de status bem definido: `ABERTO → EM_PREPARO → PRONTO → ENTREGUE`, com regras de negócio aplicadas em cada transição.

Projeto desenvolvido para prática de Java backend com Spring Boot, aplicando arquitetura em camadas, persistência com JPA e boas práticas de API REST.

---

## ✅ Funcionalidades

- Cadastro e gerenciamento de produtos (cardápio)
- Cadastro de clientes para pedidos de entrega
- Cadastro de entregadores
- Abertura e gerenciamento de pedidos
- Adição e remoção de itens em um pedido
- Controle de status do pedido
- Cálculo automático do total do pedido
- Snapshot de preço no momento do pedido

> 🚧 Endpoints em desenvolvimento — seção será atualizada em breve.

---

## 🔗 Endpoints

> 🚧 Em desenvolvimento.

---

## 🧱 Stack utilizada

| Tecnologia        | Uso                               |
|-------------------|-----------------------------------|
| Java 21           | Linguagem principal               |
| Spring Boot 3.4.x | Framework base                    |
| Spring Data JPA   | Persistência e mapeamento ORM     |
| Spring Validation | Validação de dados de entrada     |
| H2 Database       | Banco de dados em memória (dev)   |
| Lombok            | Redução de boilerplate            |

---

## 🗂️ Entidades

| Entidade      | Descrição                                                     |
|---------------|---------------------------------------------------------------|
| `Produto`     | Item do cardápio com nome, preço, categoria e disponibilidade |
| `Cliente`     | Cliente cadastrado para pedidos de entrega                    |
| `Entregador`  | Responsável pela entrega do pedido                            |
| `Pedido`      | Pedido com tipo (balcão/entrega), status e total              |
| `ItemPedido`  | Item dentro de um pedido com quantidade e preço snapshot      |

---

## 🏛️ Estrutura do projeto

```
src/
 ├── controller      # Endpoints REST
 ├── service         # Regras de negócio
 ├── repository      # Acesso ao banco de dados
 ├── entity          # Entidades JPA
 ├── enums           # Enums de status e categorias
 ├── dto             # Objetos de transferência de dados
 ├── mapper          # Conversão entre entidades e DTOs
 └── exception       # Tratamento global de erros
```

---

## ⚙️ Como executar

> 🚧 Em desenvolvimento.

---

## 🎯 Conceitos aplicados

- Arquitetura em camadas (Controller → Service → Repository)
- Persistência com JPA/Hibernate
- Relacionamentos `@ManyToOne` e `@OneToMany`
- Enums persistidos com `@Enumerated(EnumType.STRING)`
- Validação com Bean Validation
- Tratamento global de erros com `@ControllerAdvice`
- `ResponseEntity` com status HTTP semânticos

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Oliveira Gonçalves**
[GitHub](https://github.com/vineog23-boop)
