# 🎬 Sistema de Locadora de Filmes (CRUD)

> Projeto de estudos desenvolvido em **Java** para praticar conceitos de desenvolvimento desktop,
> arquitetura **MVC** (Model-View-Controller),
>  operações CRUD e persistência em banco de dados relacional com **MySQL**.

---

## 🚀 Status do Projeto
- [x] Estrutura MVC e Lógica de Negócio implementadas
- [x] Conexão com banco de dados via JDBC
- [ ] Refinamento da modelagem do banco de dados e scripts oficiais

---

## 🛠️ Tecnologias e Stack
Projeto focado em **Desktop & Back-end com banco de dados relacional**:
* **Linguagem:** Java (JDK 17+)
* **Interface Gráfica (Front-end Desktop):** Java Swing
* **Arquitetura:** MVC (Model-View-Controller)
* **Banco de Dados:** MySQL
* **Conexão:** JDBC (`PreparedStatement`, `Connection`)

---

## 📂 Organização do Projeto (MVC)

O código está dividido em pacotes organizados para separar responsabilidades:
* `locadora.model`: Classes de entidades de negócio (`Filme.java`, `Cliente.java`, `Ator.java`, `Item.java`).
* `locadora.dao`: Classes de persistência e comunicação com o MySQL (`FilmeDAO.java`, `ClienteDAO.java`, `ConnectionMVC.java`).
* `locadora.controller`: Controladores que fazem a ponte entre as regras de negócio e a interface.
* `locadora.view`: Telas e componentes visuais desenvolvidos com Java Swing.

---

## ⚙️ Funcionalidades (CRUD)
- [x] **Gerenciamento de Cadastros:** Telas estruturadas para manipulação de Filmes, Atores e Clientes.
- [x] **Persistência de Dados:** Integração ativa com o SGBD MySQL.

---

## 🔧 Como Executar o Projeto

### Pré-requisitos
* **Java JDK 17** (ou superior) instalado.
* **MySQL Server** configurado localmente.
* IDE Java (Eclipse).

