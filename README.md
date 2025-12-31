# 🚀 Java JDBC DAO – Sistema de Gestão de Vendedores e Departamentos

Projeto backend desenvolvido em **Java** utilizando **JDBC** e **MySQL**, aplicando o **padrão DAO (Data Access Object)** para acesso a dados.  
Este projeto demonstra conhecimento em **POO, SQL, arquitetura em camadas e boas práticas de persistência**.

---

## 📌 Visão Geral

O sistema realiza o gerenciamento de **Vendedores** e **Departamentos**, permitindo operações completas de **CRUD**, além de consultas relacionais entre entidades.

✔️ Projeto focado em **fundamentos sólidos de backend Java**.

---

## 🧠 Funcionalidades

### Departamentos
- Criar departamento
- Listar departamentos
- Buscar por ID
- Atualizar
- Remover

### Vendedores
- Criar vendedor
- Listar vendedores
- Buscar por ID
- Buscar vendedores por departamento
- Atualizar
- Remover

---

## 🛠️ Tecnologias

- **Java (JDK 8+)**
- **JDBC**
- **MySQL**
- **SQL**
- **POO**
- **Padrão DAO**
- **Git/GitHub**

---

## 🧱 Arquitetura

O projeto segue uma **arquitetura em camadas**, garantindo organização e manutenção:

```text
aplicacao/        → Camada de execução (testes via console)
db/               → Conexão, exceções e controle do banco
model/
 ├── entities/    → Entidades de domínio
 └── dao/
      ├── interfaces
      └── implementacao JDBC

## ▶️ Como Executar

Clone o repositório

Crie o banco de dados no MySQL

Crie as tabelas department e seller

Configure o arquivo db.properties

Execute:

ProgramaPrincipal.java (Vendedores)

Programa2.java (Departamentos)

## 👨‍💻 Autor

João Neto
Estudante de Sistemas de Informação
Foco em Backend, Banco de Dados e Arquitetura de Software

📫 LinkedIn: https://www.linkedin.com/in/joao-rodrigues-neto-855757293/
