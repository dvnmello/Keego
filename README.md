# Descrição do teste

## Automação com BDD utilizando Selenium

## Projeto

##### Histórias de Usuário

**Funcionalidade:** Cadastrar na página

Como um visitante

Eu quero acessar a página

Para realizar novo Cadastro

**<u>Cenário 1: Realizar cadastro no site</u>**  

**Dado** Que eu acesso a pagina de cadastro
**E** verifico os campos
**Quando** eu preencho os dados solicitados
**E** concordo com os termos de privacidade
**E** clico em 'Register'
**Então** o cadastro é realizado

########

**Funcionalidade**: Logar na página

Como um visitante

Eu quero acessar a página

Para realizar Login do usuário cadastrado

**<u>Cenário 2: Realizar login no site</u>**   

**Dado** Que eu acesso a pagina inicial
**E** clico no icone de menu de usuario
**Quando** eu preencho os dados de login
**E** clico em 'Sign In'
**Então** o login é realizado
**E** a pagina é verificada

------

##### Critérios de Aceite

- Não deve ser permitido o cadastro de um usuário já cadastrado

- Deverá ser possível cadastrar novo usuário fornecendo somente campos obrigatórios

- Deverá ser possível cadastrar novo usuário fornecendo todos os campos.

------

## Ferramentas utilizadas 🛠️

- [Eclipse](https://www.eclipse.org)
- [Cucumber](https://cucumber.io)
- [JUnit](https://junit.org/junit5/)
- [Selenium](https://www.selenium.dev)

## Requisitos

- [Java](https://www.java.com/pt-BR/)
- [Eclipse](https://www.eclipse.org)

## 🔖 Relatório

O relatório pode ser acompanhado pelas pastas keego\target\Destination\index.html e keego\src\test\resources\htmlReporter.html 

[index.html](https://github.com/dvnmello/Keego/tree/main/target/Destination/index.html.jpg)

[htmlReporter.html](https://github.com/dvnmello/Keego/tree/main/src/test/resources/htmlReporter.jpg )

[Screenshots](https://github.com/dvnmello/Keego/tree/main/src/test/resources)

As Screenshots estão na pasta keego\src\test\resources

O ChromeDriver está na pasta keego\src\test\resources

