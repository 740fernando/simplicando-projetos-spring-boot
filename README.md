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
