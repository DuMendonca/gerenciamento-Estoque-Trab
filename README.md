# Gerenciamento Estoque - Trabalho de Banco de Dados II 
* **Author**: Eduardo Mendonça 
* **University**: UDESC
* Gerenciamento de Estoque para o trabalho de BAN II, onde será realizada a entrada e saída de **produtos/pedidos**.

## **Para a compilação:** 
- Pre-requisitos: Ter configurado o Java e Maven na IDE de sua preferencia. 
> 1. Exemplos Eclipse: https://giuliana-bezerra.medium.com/criando-um-projeto-java-maven-no-eclipse-cf7326d4db37 
> 2. Exemplos Intellij: https://www.treinaweb.com.br/blog/introducao-ao-maven-aprenda-como-criar-e-gerenciar-projetos-java

1. Primeiramente clonar o projeto e adicionar a uma IDE de sua escolhar.
2. Configurar a JDK. 
3. Configurar o MAVEN.
2. Acessar a pasta _/Banco_ e pegar o dump do Banco de Dados e subir em um banco Postgres.
3. Alterar o arquivo application.properties como nome do banco de dados em que o dump foi subido, assim como a senha e o user para acesso ao banco de dados. 
4. Realizar o comando _MVN CLEAN INSTALL_
5. Iniciar a aplicação na classe **ChegaRapidexApplication** que será buildado normalmente o projeto.

## **Para Execução:** 

1. Acessar o https://www.postman.com/ ou baixar o aplicativo de Desktop.
2. Realizar o cadastro caso não estiver uma conta ou realizar o login.
3. Criar uma collections, adicionando uma requisição a mesma. 
4. Realizar os comando REST desejado juntamente com o caminhos que deseja. 
* Ex: http://localhost:8082/request -> Para acessar a tabela Pedido
* http://{server/ip}:{porta configurada no application.properties}/{Requisição REST}.

## **Requisições REST**

1. /request -> Pedido
2. /requestStatus -> Status do pedido
3. /sender -> Remetente
4. /recipient -> Destinatario
5. /address -> Endereco
6. /product -> Produto

## Operações CRUD
* POST -> Criar
* PUT -> Alterar 
* DELETE -> Deletar (Para deletar um único valor, passar o Id como parametro da chamada)
* GET -> Consultar (Para consultar um único valor, passar o Id como parametro da chamada)
 1. http://localhost:8082/request/{id} --> Apenas um registro.
 2. http://localhost:8082/request/ --> Todos os registros.
