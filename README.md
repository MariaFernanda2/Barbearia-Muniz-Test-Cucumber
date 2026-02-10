# 🧪 Projeto de Automação de Testes – BDD com Cucumber

Este projeto foi desenvolvido para demonstrar conhecimentos em **automação de testes utilizando BDD (Behavior Driven Development)**, aplicando **Cucumber, Gherkin e boas práticas de automação** em um cenário próximo da realidade.

A automação foi criada para um **site fictício de uma barbearia**, responsável por exibir informações como **serviços disponíveis**, navegação entre páginas e validações de elementos da interface.

---

## 🎯 Objetivo do Projeto

- Demonstrar domínio de BDD com Cucumber
- Escrever cenários utilizando Gherkin
- Aplicar o padrão Page Object Model (POM)
- Centralizar configurações de driver e interações
- Criar uma automação manutenível e escalável
- Simular um projeto real de automação de testes

---

## 🛠️ Tecnologias Utilizadas

- Java
- Cucumber
- Gherkin
- JUnit / TestNG
- Maven
- Selenium WebDriver

---

## 🌐 Contexto do Sistema Testado

O sistema automatizado é um **site fictício de uma barbearia**, que permite:

- Visualizar o nome da barbearia
- Visualizar endereço
- Listar serviços disponíveis
- Navegar entre páginas
- Validar textos e elementos visuais exibidos ao usuário

Os testes automatizados garantem que essas informações estejam corretas e visíveis para o usuário final.

---

## 📁 Estrutura do Projeto

.idea
.gitignore
pom.xml
README.md

src
├── main
│ └── java
│ └── br/com/exemplo
│ └── App.java
│
└── test
├── java
│ ├── Pages
│ │ ├── HomePageBarber.java
│ │ └── ServiçosPage.java
│ │
│ ├── core
│ │ ├── Browsers.java
│ │ ├── Driver.java
│ │ └── Interactions.java
│ │
│ ├── runners
│ │ └── RunCucumberTest.java
│ │
│ └── steps
│ ├── HomePageSteps.java
│ ├── LoginSiteSteps.java
│ └── ServiçosSteps.java
│
└── resources
└── features


---

## 🧱 Organização das Camadas

### Pages
Responsáveis pelo mapeamento dos elementos e ações das páginas, seguindo o padrão Page Object Model.

### Core
Camada responsável pela configuração do WebDriver, gerenciamento de navegadores e métodos genéricos de interação.

### Steps
Implementação dos passos definidos nos arquivos `.feature`, conectando o Gherkin ao código Java.

### Runner
Classe responsável por executar os testes automatizados do Cucumber.

### Features
Arquivos escritos em Gherkin contendo os cenários de teste.

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
