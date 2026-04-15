# Samuel Vinicius Araujo do Prado

## Introdução

Meu nome é **Samuel Prado**, tenho 22 anos e atualmente curso **Banco de Dados na Fatec**.  
Ao longo da minha trajetória profissional, atuei em diferentes áreas, começando no setor bancário como menor aprendiz no **Banco do Brasil**, depois com experiências em empresa familiar de estética automotiva e na **Leroy Merlin**, onde desenvolvi habilidades de **análise de dados e atendimento ao cliente**.

Atualmente, atuo como **Analista de Sustentação na SPS Group**, com foco em **SQL no SAP HANA e suporte a sistemas ERP (SAP Business One)**.

Na área acadêmica, venho aprofundando meus conhecimentos em **bancos de dados, desenvolvimento backend com Java e Spring Boot, frontend com Vue.js e metodologias ágeis (Jira/Trello/Slack)**. Participei de projetos aplicados em parceria com empresas reais, que simulam desafios de mercado e proporcionam experiência prática em equipe.

---

## Contatos

- [GitHub](https://github.com/Samuelprado99)
- [LinkedIn](https://www.linkedin.com/in/samuel-prado99)

---

## Meus Principais Conhecimentos

- **Bancos de Dados Relacionais**: SQL, MySQL, PostgreSQL, SAP HANA, Supabase — Modelagem, consultas complexas e otimização.
- **Backend**: Java (Spring Boot) — Desenvolvimento de APIs e soluções lógicas.
- **JavaScript/TypeScript/Node.js** — Criação de funcionalidades no backend e integração com frontend.
- **Frontend**: Vue.js — Construção de interfaces funcionais.
- **Metodologias Ágeis**: Scrum, Jira, Trello, Slack — Gestão de projetos com sprints e clientes reais.
- **Suporte Técnico**: Hardware e Software — Experiência prática no Banco do Brasil e SPS Group.

---

## Meus Projetos

### 🚦 Tráfegou — Traffic Monitoring System

O **Tráfegou** foi desenvolvido como projeto do **4º semestre** do curso de Banco de Dados na **Fatec SJC**, pela equipe **Steam Ducks**, em parceria com a **Prefeitura de São José dos Campos**.

- **Empresa Parceira**: Prefeitura de São José dos Campos — órgão responsável pela gestão da mobilidade urbana do município.
- **Problema**: A prefeitura necessitava monitorar indicadores de tráfego em tempo real por região da cidade, gerar alertas automáticos quando parâmetros críticos fossem atingidos e permitir que gestores registrassem ações de resposta a incidentes — tudo em um sistema centralizado.
- **Solução**: A equipe desenvolveu uma **plataforma web de monitoramento de tráfego urbano** com mapa interativo sectorizado, dashboard de indicadores por região, sistema de alertas automáticos com 5 níveis de severidade (verde/amarelo/laranja/vermelho/roxo), notificações via Telegram, atualização automática a cada 10 minutos e painel de gestão de ocorrências. O sistema foi construído com **Spring Boot (backend)** e **Vue.js + TypeScript (frontend)**, containerizado com **Docker**.

🔗 [Link do Repositório do Projeto](https://github.com/Steam-Ducks/traffic-monitoring-system)  
🔗 [tms-server (Backend)](https://github.com/Steam-Ducks/tms-server)  
🔗 [tms-client (Frontend)](https://github.com/Steam-Ducks/tms-client)

---

#### 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=java,spring,vue,ts,docker,git,github,idea&theme=light)](https://skillicons.dev)

- **Java 17 + Spring Boot 3** — Desenvolvimento da API REST com regras de negócio e endpoints.
- **Vue.js 3 + TypeScript** — Interface web interativa com mapa sectorizado e dashboards.
- **Oracle Database** — Persistência dos dados de indicadores, regiões e alertas.
- **Leaflet.js** — Visualização geoespacial interativa no frontend.
- **Chart.js** — Gráficos e analytics dos indicadores de tráfego.
- **Docker / Docker Compose** — Containerização e orquestração dos serviços.
- **Git/GitHub** — Controle de versão com branches por feature e pull requests revisados.
- **Jira** — Gestão de tarefas e sprints com metodologia Scrum.

---

#### 💻 Contribuições Pessoais

Atuei no desenvolvimento backend e frontend, cobrindo desde exposição de dados geoespaciais até CRUD de gestores e ajustes de interface:

- **TMS-37 — Endpoint de dados para construção do mapa sectorizado (Backend)**  
  Implementação do `MapController` com endpoint REST que retorna os níveis de severidade por zona, com base no indicador de **Velocidade Média**. Criação do DTO `ZoneLevel`, do método de busca do último `RegionIndicator` por região e indicador, e resolução de conflitos de classes duplicadas durante o merge. Desenvolvido na Sprint 1.

- **TMS-49 — CRUD de Gestores (Backend)**  
  Implementação completa da camada de gestão de usuários gestores: criação dos DTOs `ManagerRequestDTO` e `ManagerResponseDTO`, do `ManagerController` com endpoints REST de criação, leitura, atualização e remoção, do `ManagerService` com as regras de negócio, e configuração do `UserRepository` e `RoleRepository`. Atualização da entidade `User` para suportar o relacionamento com gestores e ajuste nas configurações de segurança para liberar as novas rotas. Desenvolvido na Sprint 2.

- **TMS-82 — Ajustar tabela para exibir mensagens enviadas e seus status (Frontend)**  
  Ajuste da tela de controle de envios no cliente Vue.js para exibir corretamente as mensagens disparadas pelo sistema e seus respectivos status de entrega. Desenvolvido na Sprint 3.

---

#### 🔧 Hard Skills Desenvolvidas

- **Java / Spring Boot** — Construção de APIs REST em arquitetura MVC com camadas Controller, Service e Repository.
- **Vue.js / TypeScript** — Desenvolvimento de componentes e telas com tipagem estática.
- **Oracle Database** — Integração com banco de dados relacional para consultas de indicadores em tempo real.
- **Docker** — Containerização de aplicações backend e frontend com Docker Compose.
- **Git/GitHub** — Gestão de branches por feature, abertura de PRs e processo de code review.

---

#### 🌟 Soft Skills Desenvolvidas

- **Comunicação** — Alinhamento constante com o time para integração entre backend e frontend em features de ponta a ponta.
- **Trabalho em Equipe** — Colaboração em equipe de 8 desenvolvedores com responsabilidades divididas entre client e server.
- **Resolução de Problemas** — Diagnóstico e correção de conflitos de merge, classes duplicadas e inconsistências entre camadas.
- **Visão de Produto** — Compreensão do domínio de mobilidade urbana para implementar funcionalidades alinhadas às necessidades do cliente público.

---

🌱 Sempre em busca de novos desafios para evoluir como **desenvolvedor backend e analista de dados**.
