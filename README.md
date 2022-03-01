 <h1> Spring Boot </h1>

  - O Spring Boot é uma extensão do Spring, que utiliza do Spring Framework para iniciar uma aplicação de forma simples e rápida, sem se preocupar com configurações complexas como, por exemplo, o Tomcat.

<h3> Componentes base do Spring Boot: </h3>

- Spring Boot Starter;
- Spring Boot Auto-Configuration;
- Spring Boot Actuator;

<h3> Como o Spring Boot Funciona?</h3>


- Em resumo o Spring Boot é como um template pré-configurado para desenvolvimento e execução de aplicações baseadas no Spring.
- Onde, temos uma arquitetura baseada no Spring Core, que traz os componentes-base do Spring, como o mecanismo de DI/IoC, a Spring Expression Language (SpEL) e alguns módulos-base do Spring AOP (módulo para implementação de programação orientada a aspectos no Spring).
- O Spring Boot permite adicionar a estrutura-base o que é chamado de módulo.
- Um módulo é na verdade uma biblioteca ou ferramenta do ecossistema Spring que pode ser adicionada a uma aplicação Spring convencional.

  ![image](https://user-images.githubusercontent.com/32016610/155903241-a210b3f6-ca93-4e89-891a-11ed1c418d2e.png)

<h3>Dependências base do Spring Boot</h3>

![image](https://user-images.githubusercontent.com/32016610/155903281-2e251f07-5dcd-4a35-a519-3201ec2f52fd.png)

<h3>Motivação do Spring Boot</h3>

  - Resumidamente o Spring Boot veio para facilitar a vida do desenvolvedor java e melhorar a produtividade do desenvolvimento de softwares. 
  - O Spring Boot facilita todo esse processo, fazendo com que o desenvolvedor se concentre mais na parte realmente importante que envolve as regras do negócio e código.


    <h1> Spring Initializr </h1>

  - O Spring Initializr fornece uma API extensível para gerar projetos baseados em JVM (Java Virtual Machine) é onde podemos criar um projeto Spring Boot de forma rápida e fácil, através do site: https://start.spring.io/

  ![image](https://user-images.githubusercontent.com/32016610/155903388-730b24c0-323d-4ead-a93c-4e5730fb8602.png)

   <h1> Auto-configuration </h1>

  <h3>@SpringBootApplication</h3>

- O Auto-configuration ou configuração automática do Spring Boot configura automaticamente a aplicação Spring com base nas dependências jar que adicionamos ao projeto.

- Para habilitar o recurso existe a anotação @EnableAutoConfiguration, mas essa não é usada porque está contida no @SpringBootApplication. A anotação @SpringBootApplication é a combinação de três anotações.

  ![image](https://user-images.githubusercontent.com/32016610/155903475-838b1a91-4459-4e06-bf0c-7631f5a68e72.png)

  ![image](https://user-images.githubusercontent.com/32016610/155903488-fb91a682-fdff-41f1-936e-fda22c18ce3e.png)

  ![image](https://user-images.githubusercontent.com/32016610/155903497-851507f2-0655-459f-81ae-e4bacdf06550.png)
  
<h1> Principais Dependências e Bibliotecas </h1>

<h3> Objetivos </h3>

- Swagger
- Feign

<h1> Swagger </h1>

- Swagger é um projeto open source com diversas ferramentas utilizadas para desenvolver APIs com a especificação OpenAPI Specification (OAS), uma especificação para descrever, produzir, consumir e visualizar serviços de uma API REST. 
- Com o OAS você poderá descrever recursos, URIs, modelo de dados, métodos HTTP aceitos e códigos de resposta.
- Tudo isso facilita a vida dos desenvolvedores de diversas linguagens de programação na criação, testes, consumo e documentação de APIs REST.

<h3> Dependências </h3>

![image](https://user-images.githubusercontent.com/32016610/156046038-85ecfed4-3ac6-4069-bd23-2447f1009b71.png)


<h1> Feign </h1>

- O Feign é um cliente de serviço web declarativo (cliente HTTP) desenvolvido pela Netflix e um dos mais populares do Spring Cloud Component. 
- Com ele é possível criar clientes API HTTP no java de forma mais simples para chamar/consumir os serviços REST, utilizando anotações.
- Para usar o Feign, precisamos adicionar a dependência spring-cloud-starter-openfeign no arquivo pom.xml.

    <h1> Spring Boot Test </h1>

- O Spring Boot facilita o desenvolvimento de testes de unidade e integração com o Spring Boot Test, um recurso bastante utilizado no desenvolvimento de aplicações java para testar comportamentos do código e regras do negócio.

- Para utilizarmos precisamos usar spring-boot-starter-test , que importa os módulos de teste Spring Boot, bem como JUnit Jupiter, AssertJ, Hamcrest e várias outras bibliotecas úteis.

<h3> Importância do Teste </h3>

- Em desenvolvimento de software, os erros podem aparecer em qualquer etapa do ciclo de vida do projeto. Com isso, o teste de software se torna essencial e não pode ser visto como uma atividade opcional, pois oferece os métodos e ferramentas necessárias para garantir a qualidade de qualquer desenvolvimento.


 <h1> Testes Unitários </h1>
 
 - Os testes unitários é a base da pirâmide de testes onde são realizados o maior número de testes ou deveria para garantir a fidelidade do código e regras do negócio.

![image](https://user-images.githubusercontent.com/32016610/156205584-09aa12f6-39e6-47c0-8ff5-02f47e4b52b8.png)

<h1> Explorando o @SpringBootTest </h1>

- A anotação @SpringBootTest é utilizada em uma classe de teste e diz ao Spring Boot para procurar uma classe de configuração principal, por exemplo, o @SpringBootApplication, e usá-la para iniciar um contexto de aplicativo Spring.

![image](https://user-images.githubusercontent.com/32016610/156205834-3764cd82-513e-4c2c-b25f-931db809e940.png)







