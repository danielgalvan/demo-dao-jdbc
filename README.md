# Demo DAO JDBC

Um projeto Java de demonstração que implementa o padrão **DAO (Data Access Object)** utilizando **JDBC puro**, com foco em boas práticas de arquitetura e acesso a banco de dados relacional.

---

## 🚀 Objetivo

Este projeto tem como finalidade demonstrar a estruturação de uma aplicação Java com camadas bem definidas (aplicação, modelo, persistência) e a implementação manual de DAOs para controle de entidades como **Seller** e **Department**.

---

## 🧩 Estrutura do Projeto

```
demo-dao-jdbc-main/
├── src/
│   ├── application/
│   │   ├── ProgramSeller.java
│   │   └── ProgramDepartment.java
│   │
│   ├── db/
│   │   ├── DB.java
│   │   ├── DbException.java
│   │   └── DbIntegrityException.java
│   │
│   ├── model/
│   │   ├── dao/
│   │   │   ├── DaoFactory.java
│   │   │   ├── SellerDao.java
│   │   │   ├── DepartmentDao.java
│   │   │   └── impl/
│   │   │       ├── SellerDaoJDBC.java
│   │   │       └── DepartmentDaoJDBC.java
│   │   │
│   │   └── entities/
│   │       ├── Seller.java
│   │       └── Department.java
│   │
│   └── module-info.java
│
└── README.md
```

---

## 🧠 Conceitos Aplicados

- **DAO Pattern (Data Access Object)**  
  Abstração da camada de acesso a dados, desacoplando o código de persistência das regras de negócio.

- **Factory Pattern**  
  Criação centralizada de instâncias de DAO através da classe `DaoFactory`.

- **JDBC puro (Java Database Connectivity)**  
  Manipulação direta do banco de dados usando `Connection`, `PreparedStatement` e `ResultSet`.

- **Tratamento de exceções customizado**  
  Classes `DbException` e `DbIntegrityException` encapsulam erros SQL de forma amigável.

- **Modularização (Java 9+)**  
  Uso do arquivo `module-info.java` para definir o módulo principal do projeto.

---

## 🧱 Entidades

- **Department**
  - `id`: Integer  
  - `name`: String

- **Seller**
  - `id`: Integer  
  - `name`: String  
  - `email`: String  
  - `birthDate`: Date  
  - `baseSalary`: Double  
  - `department`: Department  

---

## 🗄️ Estrutura do Banco

O projeto pressupõe a existência de um banco relacional com as tabelas:

```sql
CREATE TABLE department (
  Id INT PRIMARY KEY AUTO_INCREMENT,
  Name VARCHAR(60) NOT NULL
);

CREATE TABLE seller (
  Id INT PRIMARY KEY AUTO_INCREMENT,
  Name VARCHAR(60) NOT NULL,
  Email VARCHAR(100),
  BirthDate DATE,
  BaseSalary DOUBLE,
  DepartmentId INT,
  FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```

---

## ⚙️ Como Executar

### Pré-requisitos
- Java 17+  
- MySQL ou outro banco compatível com JDBC  
- IDE (Eclipse, IntelliJ ou VS Code)

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/danielgalvan/demo-dao-jdbc.git
   cd demo-dao-jdbc-main
   ```
2. Configure o arquivo `db.properties` (caso exista) com as credenciais do seu banco.  
3. Execute as classes `ProgramSeller` ou `ProgramDepartment` para testar os DAOs.

---

## 📚 Funcionalidades

- Inserção, atualização, exclusão e listagem de vendedores e departamentos.
- Testes individuais de cada operação dentro das classes de aplicação.
- Conexão com o banco feita de forma centralizada (`DB.java`).

---

## 🧩 Tecnologias

| Tecnologia | Descrição |
|-------------|------------|
| Java 17+ | Linguagem principal |
| JDBC | Comunicação com o banco de dados |
| MySQL | Banco relacional usado nos testes |
| DAO Pattern | Camada de abstração de dados |

---

## 🧑‍💻 Autor

**Daniel Galvan**  
Desenvolvedor Java | Entusiasta de Arquitetura de Software  
📫 [LinkedIn](https://www.linkedin.com/in/daniel-galvan1989) • [GitHub](https://github.com/danielgalvan)


---

## 🏗️ Licença

Este projeto é apenas para fins educacionais e demonstração.  
Sinta-se livre para clonar, modificar e usar como base para seus próprios estudos.
