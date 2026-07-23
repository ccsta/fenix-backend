# 🦅 Fênix Le Parfums - Catálogo Sombrio

![Preview do Projeto](https://img.shields.io/badge/Status-Em_Desenvolvimento-success)
![React](https://img.shields.io/badge/Frontend-React_|_Vite-61DAFB?logo=react&logoColor=black)
![Spring Boot](https://img.shields.io/badge/Backend-Spring_Boot_|_Java-6DB33F?logo=spring&logoColor=white)

> *"O catálogo sombrio está nascendo..."*

Um sistema **Full-Stack** desenvolvido para o gerenciamento de um catálogo premium de perfumaria, com uma estética visual noturna (dark mode), sofisticada e moderna.

## 💻 Sobre o Projeto
Este projeto foi construído do zero com o objetivo de integrar uma interface dinâmica e responsiva no frontend com uma API RESTful robusta no backend. A aplicação permite cadastrar novas fragrâncias e visualizá-las em uma vitrine interativa com persistência de dados.

## 🛠️ Tecnologias Utilizadas

### Frontend (Interface & UX)
*   **React (via Vite):** Renderização rápida e componentização.
*   **CSS3 Puro:** Estilização global focada em UI Design, CSS Grid, Flexbox e efeitos de *hover* flutuantes.
*   **Design System:** Paleta de cores escuras (Dark Mode) com destaques em azul elétrico e dourado premium.

### Backend (Regras de Negócio & API)
*   **Java 17+ & Spring Boot:** Motor da API REST para lidar com as requisições HTTP (GET, POST).
*   **Banco de Dados H2:** Configurado para **persistência física** (salvando os dados em arquivo local `.db`), garantindo que o catálogo não perca informações ao reiniciar o servidor.
*   **Spring Data JPA:** Mapeamento objeto-relacional para comunicação com o banco.

## 🚀 Funcionalidades
- [x] Listagem dinâmica de perfumes em formato de Grid de Cards.
- [x] Formulário de cadastro de novos produtos integrado à API.
- [x] Atualização da vitrine em tempo real após um novo cadastro (sem refresh da página).
- [x] Persistência definitiva de dados no disco (H2 File-based).

## ⚙️ Como executar o projeto localmente

Você precisará clonar dois repositórios (o Frontend e o Backend) e rodá-los simultaneamente.

**1. Rodando o Backend (Spring Boot)**
1. Clone o repositório do backend.
2. Abra o projeto na sua IDE (Eclipse, IntelliJ ou VS Code).
3. Aguarde o Maven baixar as dependências e execute o arquivo `DemoApplication.java`.
4. A API estará rodando em `http://localhost:8080`.

**2. Rodando o Frontend (React)**
1. Clone este repositório do frontend.
2. Abra o terminal na pasta do projeto e instale as dependências:
   ```bash
   npm install