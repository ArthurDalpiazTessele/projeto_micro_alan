# Microserviços para Reserva de Salas


## Sobre o Projeto

O projeto é um sistema para reserva de salas com base em microserviços.
Tendo um gerenciador das salas, usuários e reservas com base em APIs REST, usando messageria para fazer a conversação entre os serviços.


## Arquitetura

    - **Microserviço de Usuários:** Gerencia os usuários
    - **Microserviço de Salas:** Gerencia as salas
    - **Microserviço de Reservas:** Gerencia as reservas
    - **API Nginx:** Entrada das rotas das requisições
    - **Banco de Dados:** PostgresSQL
    - **Message Broker:** RabbitMQ


## Tecnologias Utilizadas

### Infraestrutura

    - **Nginx:** API Gateway
    - **RabbitMQ:** Comunicação assíncrona
    - **Docker:** Containerização
    - **Docker Compose:** Gerencia os containers

### BackEnd

    - **Java 21:** - Linguagem da programação
    - **Spring Boot 3.4.4:** - Framework
    - **Spring Data JPA:** - Persistência de dados
    - **Spring AMQP:** - Integração com RabbitMQ
    - **PostgreSQL:** - Banco de dados
    - **Maven:** - Gerencia de dependências

### Documentação

    - **Swagger:** Documentação das APIs


## Portas Utilizadas
    - **80:** Nginx
    - **4040:** Adminer
    - **5432:** PostgreSQL Usuários
    - **5433:** PostgreSQL Salas
    - **5434:** PostgreSQL Reservas
    - **5672:** RabbitMQ
    - **15672:** RabbitMQ Management UI
