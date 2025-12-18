# 📑 Loteamento Financeiro - Java Edition

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

O **Loteamento Financeiro** é uma solução robusta para a gestão de contratos de venda e recebíveis de loteamentos. Originalmente concebido em PHP/Laravel, esta nova versão foi totalmente reescrita em **Java com Spring Boot**, focando em escalabilidade, segurança de dados e precisão nos cálculos financeiros.

## 🚀 Funcionalidades Principais

* **Gestão de Contratos:** Cadastro detalhado de vendas de lotes.
* **Geração de Parcelas Automática:** Algoritmo inteligente que calcula o parcelamento subtraindo a entrada e distribuindo o saldo devedor.
* **Controle de Vencimentos:** Cálculo automático de datas de vencimento mensais.
* **Precisão Financeira:** Uso de `BigDecimal` para garantir arredondamentos corretos (padrão bancário).

## 🛠️ Stack Tecnológica

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3.2.0
* **Motor de Template:** Thymeleaf (HTML5/CSS3)
* **Persistência:** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 Database (em memória para desenvolvimento) / Suporte a PostgreSQL/MySQL
* **Estilização:** Bootstrap 5

## 📋 Pré-requisitos

Para rodar o projeto localmente, você precisará de:
* Java JDK 17 ou superior.
* Maven 3.6 ou superior.
* Uma IDE (IntelliJ IDEA, Eclipse ou VS Code).

## 🔧 Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/gusttavolopeshts/loteamento-financeiro-java.git](https://github.com/gusttavolopeshts/loteamento-financeiro-java.git)