
Para Instalar o Spring Boot
Ver a Instalação do Java JDK
$ java -version
java version "22.0.2" 2024-07-16
Java(TM) SE Runtime Environment (build 22.0.2+9-70)
Java HotSpot(TM) 64-Bit Server VM (build 22.0.2+9-70, mixed mode, sharing)

Instalar o Maven
Necessário para construir e gerenciar projetos Spring Boot. 

sudo apt update
sudo apt install maven

Ver a instalação do Maven 
mvn -version
$ mvn -version
Apache Maven 3.8.7
Maven home: /usr/share/maven
Java version: 22.0.2, vendor: Oracle Corporation, runtime: /usr/lib/jvm/jdk-22.0.2-oracle-x64
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "6.5.0-44-generic", arch: "amd64", family: "unix"


Para criar um projeto Spring Boot de duas maneiras:
Com o Spring Initializr na web ou com a CLI Spring.

1)
Usando o Spring Initializr

Acesse Spring Initializr.
Configure o Projeto:

Project: Maven Project
Language: Java
Spring Boot: 3.x (ou a versão mais recente)
Project Metadata:
Group: com.exemplo
Artifact: meu-projeto
Name: MeuProjeto
Package Name: com.exemplo.meuprojeto
Dependencies: Adicione as dependências que você precisar (por exemplo, Spring Web)
Gere o Projeto:

Clique em "Generate" para baixar um arquivo .zip com o projeto.

Extraia o Arquivo e Navegue até o Diretório do Projeto:
unzip meu-projeto.zip
cd meu-projeto


2) Usando o Spring CLI
Para usar a CLI Spring:

Instale o SDKMAN! (se ainda não estiver instalado):

curl -s "https://get.sdkman.io" | bash

Após a instalação, configurar seu ambiente para usar o SDKMAN!. 

# Adicione a linha abaixo ao seu arquivo de configuração do shell
source "$HOME/.sdkman/bin/sdkman-init.sh"

Se você estiver usando bash, edite o arquivo .bashrc:
nano ~/.bashrc

Recarregue o Shell
source ~/.bashrc

Depois de ter o SDKMAN! instalado, instalar o Spring Boot CLI (Command Line Interface):

sdk install springboot

Para ver a instalação do Spring Boot
spring --version
Spring CLI v3.3.1





Crie um Novo Projeto:

spring init --dependencies=web meu-projeto
cd meu-projeto

3. Compile e Execute o Projeto
Navegue até o diretório do projeto e use o Maven para compilar e executar o projeto:

mvn clean install
mvn spring-boot:run

4. Verifique o Projeto
Após iniciar o aplicativo, ele deve estar rodando em http://localhost:8080 por padrão. Abra seu navegador e acesse http://localhost:8080 para verificar se o projeto está funcionando.

Fontes:
https://github.com/falvojr/santander-dev-week-2023 (FORK)

https://www.youtube.com/watch?v=2qbf4Duqncw

https://customer.acecloudhosting.com/index.php/knowledgebase/210/How-to-Install-Spring-boot-on-Ubuntu-20.04.html?language=german

