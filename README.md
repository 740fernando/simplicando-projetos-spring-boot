<h1> Abstraia a complexidade de configuração com o Spring Boot </h1>

<h3> Objetivo do curso </h3>

Aplicar e entender conceitos do Spring Framework e Spring Boot, ao final ficará mais claro como funciona a injeção de dependência e a inversão de controle do Spring, como geramos o projeto utilizando o Spring Initializr e também entenderemos sobre o Spring Boot Test e a biblioteca Swagger.

<h3> Percurso </h3>

- Introdução e Apresentação do Curso

- Spring Framework

- Spring Boot

- Principais Dependências e Bibliotecas

- Spring Boot Test

- Conclusão


<h1> Inversão de Controle (IoC) </h1>


<h3> Beans </h3>

- Um bean se trata de um objeto que é instanciado, montado e gerenciado por um container do Spring através de Inversão de Controle (IoC) e Injeção de Dependências (DI).


![image](https://user-images.githubusercontent.com/32016610/155897612-e09143ac-efe9-4416-b998-9f4e98ddfadb.png)

<h3> Ciclo de vida de um Bean </h3>

![image](https://user-images.githubusercontent.com/32016610/155897626-84a3771f-e5f1-4051-9f82-37cf22175c45.png)


<h3> Configurando Beans </h3>

- É possível configurar um Bean de duas formas por arquivos XML ou através de anotações.

- Em XML seria preciso definir a tag <bean> dentro de uma tag principal <beans> passando o path da classe assim o Spring saberá quais classes gerenciar a criação de instâncias e a injeção de dependências.

  <h3> BeanFactory ou ApplicationContext? </h3>
  
 - BeanFactory fornece um mecanismo de configuração avançada capaz de gerenciar objetos de qualquer natureza. 

 - ApplicationContext se baseia na BeanFactory (é uma subinterface) e adiciona outras funcionalidades, como integração mais fácil com os recursos AOP do Spring, manipulação de recursos de mensagem (para uso na internacionalização), propagação de eventos e contextos específicos da camada de aplicativo, como o WebApplicationContext para uso em aplicativos da web.
  
  
 <h3> Inversão de Controle </h3>
  
  - Inversão de Controle (ou IoC - Inversion of Control) é um processo onde se inverte o fluxo de comando de um programa. 
  - É uma ideia desacoplar ou remover dependências do objeto e fornecer controle para outra camada. Este objeto delega a tarefa de construir dependências para um contêiner IoC.

  ![image](https://user-images.githubusercontent.com/32016610/155897699-89c00ba3-14f2-49c6-a26a-ac2d5f26d01a.png)
  
  
  <h1> Injeção de Dependência (DI) </h1>
  
  - A Injeção de Dependência (ou DI - Dependency Injection) define quais classes serão instanciadas e onde serão injetadas quando for necessário.
  - Existem três formas de aplicar o DI, por injeção de construtor, setter e interface.
  - O Spring Framework aplica a IoC quando necessário também utilizando o DI.
  
  ![image](https://user-images.githubusercontent.com/32016610/155897752-aa90f4fe-c663-42b4-a9f8-2b75adbca62e.png)











