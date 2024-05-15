# cajuzinho

<p align="center"> 
  <a href="https://www.caju.com.br/" target="_blank">
    <img width="80%" src="https://rhpravoce.com.br/wp-content/uploads/2023/10/caju1.png" style="border-radius: 10px;"/>
  </a> 
</p>

<h4 align="center" >🚀 🟧 Cajuzinho 🟥 🚀</h4>

<h4 align="center">
  Foodcard with CQRS &amp; Event Sourcing | Powered by AxonIQ
</h4>

<p align="center">
  |&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#project">Overview</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#techs">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#app">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#routes">Routes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#run-project">Run</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
  <a style="color: #8a4af3;" href="#author">Author</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

#

<h1 align="center">
  
  <a href="https://github.com/Samuel-Ricardo">
    <img src="https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=GITHUB"/>
  </a>

  <a herf="https://www.instagram.com/samuel_ricardo.ex/">
    <img src='https://img.shields.io/static/v1?label=&message=Samuel.ex&color=black&style=for-the-badge&logo=instagram'/> 
  </a>

  <a herf='https://www.linkedin.com/in/samuel-ricardo/'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=LinkedIn'/> 
  </a>

</h1>

<br>

<p id="project"/>

<h2> | 🛰️ About:  </h2>

<p>
  This project is a small implementations of Caju Benefits. To keep a good scope i implemented only the Foodcard funtionality using CQRS and Event Sourcing with AxonIQ and Spring Framework by building a hybrid web service that uses Kotlin and Java.
</p>

<h2 id="techs">
| 🏗️ - Technologies and Concepts Studied:
</h2>

> <a href='https://www.axoniq.io/'> <img width="40px" src="https://lp.axoniq.io/hs-fs/hubfs/Logo%20AxonIQ.png?width=190&height=40&name=Logo%20AxonIQ.png" /> </a>

<br>

- Java
- Kotlin
- Spring Framework
- AxonIQ
- CQRS
- Event Sourcing
- PostgreSQL
- H2 Database
- Error Handler

> Among Others...
> <br>

#

<h2 id="app">
  💻 | Application:
</h2>

<p align="center">
<img width="80%" style="border-radius: 10%;" src="https://assets-global.website-files.com/620135165cdb9f1d60b5d1e3/6585e9f61420f5f2e1a0711a_homeoffice.jpg"/>
</p>

<br>

<p>
  This project is inspired by Caju Benefits with focus on Foodcard that you can create and use to select your products and buy, all this is asynchronus and 100% based on Events that are stored to bring data auditability. All this was made with Comand Query Responsability Segregation Architeture.
</p>

</br>


![image](https://github.com/Samuel-Ricardo/cajuzinho/assets/63983021/441ce52f-7a84-47fe-b6be-5bc138078f9e)


<p>

As you can see, i map the Aggregate, commands and the respective events that they generate. And basically the creation of a Foodcard, selection and deselection of products in list, you can confirm to realize the purchase.

</p>

<p>
  I use the Axon Server to handle this events, but you can replace this Kafka or RabbitMQ as example.
</p>

<br>

<h2 id="run-project"> 
   👨‍💻 | How to use
</h2>

<br>

### Open your Git Terminal and clone this repository

```git
  $ git clone "git@github.com:Samuel-Ricardo/cajuzinho.git"
```

### Make Pull

```git
  $ git pull "git@github.com:Samuel-Ricardo/cajuzinho.git"
```

<br>

You just need to install [IntelliJ IDE](https://www.jetbrains.com/), Java and download maven dependencies with IntelliJ, after this you can run the project.

<br>

#

<h2 id="author">
  :octocat: | Author:  
</h2>

> <a target="_blank" href="https://www.linkedin.com/in/samuel-ricardo/"> <img width="350px" src="https://github.com/Samuel-Ricardo/bolao-da-copa/blob/main/readme_files/IMG_20220904_220148_188.jpg?raw=true"/> <br> <p> <b> - Samuel Ricardo</b> </p></a>

<h1>
  <a herf='https://github.com/Samuel-Ricardo'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=GITHUB'> 
  </a>
  
  <a herf='https://www.instagram.com/samuel_ricardo.ex/'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel.ex&color=black&style=for-the-badge&logo=instagram'> 
  </a>
  
  <a herf='https://twitter.com/SamuelR84144340'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=twitter'> 
  </a>
  
   <a herf='https://www.linkedin.com/in/samuel-ricardo/'>
    <img src='https://img.shields.io/static/v1?label=&message=Samuel%20Ricardo&color=black&style=for-the-badge&logo=LinkedIn'> 
  </a>
</h1>

<br>
