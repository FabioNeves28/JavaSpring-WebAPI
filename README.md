# JavaSpring-WebAPI

## Descrição

O projeto **JavaSpring-WebAPI** é uma aplicação desenvolvida com o framework Spring Boot que consiste em adicionar e gerenciar informações de escolas e estudantes através de uma Web API RESTful. Este projeto permite realizar operações CRUD (Create, Read, Update, Delete) tanto para escolas quanto para estudantes.

## Estrutura do Projeto

O projeto é organizado nas seguintes camadas:

1. **Controller**: Contém os endpoints da API.
2. **Service**: Implementa a lógica de negócio.
3. **Repository**: Interface para interação com o banco de dados.
4. **Model**: Contém as classes que representam as entidades do sistema (Escola e Estudante).

## Funcionalidades

### Endpoints da API

#### Escola

- **GET /escolas**: Retorna uma lista de todas as escolas.
- **GET /escolas/{id}**: Retorna uma escola específica pelo ID.
- **POST /escolas**: Adiciona uma nova escola.
- **PUT /escolas/{id}**: Atualiza as informações de uma escola existente.
- **DELETE /escolas/{id}**: Remove uma escola pelo ID.

#### Estudante

- **GET /estudantes**: Retorna uma lista de todos os estudantes.
- **GET /estudantes/{id}**: Retorna um estudante específico pelo ID.
- **POST /estudantes**: Adiciona um novo estudante.
- **PUT /estudantes/{id}**: Atualiza as informações de um estudante existente.
- **DELETE /estudantes/{id}**: Remove um estudante pelo ID.

## Requisitos

- **Java 11** ou superior.
- **Maven** para gerenciamento de dependências.
- **MySQL** ou outro banco de dados relacional.

## Configuração e Execução

### Banco de Dados MySQL

1. Instale o MySQL Server.
2. Crie um banco de dados chamado `school_db` ou ajuste o nome no arquivo de configuração da aplicação.
3. Atualize a string de conexão no arquivo `application.properties` com as credenciais do seu banco de dados MySQL.

### Configuração do Projeto

1. Clone o repositório do projeto:
    ```sh
    git clone https://github.com/FabioNeves28/JavaSpring-WebAPI.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd JavaSpring-WebAPI
    ```

3. Configure o arquivo `src/main/resources/application.properties` com suas credenciais do MySQL:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/school_db
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

### Execução do Projeto

1. Compile e execute o projeto usando Maven:
    ```sh
    mvn spring-boot:run
    ```

2. A API estará disponível em `http://localhost:8080`.

## Como Contribuir

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nome-da-sua-feature`).
3. Faça as modificações necessárias.
4. Commit suas mudanças (`git commit -m 'Adicionar nova feature'`).
5. Push para a branch (`git push origin feature/nome-da-sua-feature`).
6. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Para mais informações ou suporte, entre em contato com [Fabio Neves](mailto:seuemail@example.com).

---
