#### Help / Resources
- [HELP.md](HELP.md)
- https://spring.io/guides/#gettingStarted
- https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#using
- https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#features
- https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#howto

## This is my first project in spring boot

### Things I learnt:
- initializing spring-boot project
- File Distributions
- Defining endpoints

### Experimented:
- Tried to return String with HTML syntaxes, it worked :white_check_mark:

### Todo:
- [ ] Learn about what each component does
- [ ] Annotations that were used and attributes


### The @RestController and @RequestMapping Annotations
(Reference: https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#getting-started.first-application.code.mvc-annotations )
- This is known as a stereotype annotation. It provides hints for people reading the code and for Spring that the class plays a specific role.
- In this case, our class is a web *@Controller*, so Spring considers it when handling incoming web requests.
- The @RequestMapping annotation provides “routing” information. It tells Spring that any HTTP request with the / path should be mapped to the home method.
- The @RestController annotation tells Spring to render the resulting string directly back to the caller.
- The @RestController and @RequestMapping annotations are Spring MVC annotations (they are not specific to Spring Boot). See the MVC section in the Spring Reference Documentation for more details.

- Controller: https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html

### The @SpringBootApplication Annotation
(Reference: https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#getting-started.first-application.code.spring-boot-application)

- The second class-level annotation is @SpringBootApplication. This annotation is known as a meta-annotation, it combines @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan.

- the annotation we’re most interested in here is @EnableAutoConfiguration. @EnableAutoConfiguration tells Spring Boot to “guess” how you want to configure Spring, based on the jar dependencies that you have added. Since spring-boot-starter-web added Tomcat and Spring MVC, the auto-configuration assumes that you are developing a web application and sets up Spring accordingly.

- Auto-configuration is designed to work well with “Starters”, but the two concepts are not directly tied. You are free to pick and choose jar dependencies outside of the starters. Spring Boot still does its best to auto-configure your application.






### Gradle
[<img src="image.png" alt="drawing" width="16" height="16"/>Documentation](https://docs.gradle.org/current/userguide/userguide.html)

- **Gradle**: A build automation tool is used to automate the creation of applications. The building process includes compiling, linking, and packaging the code. The process becomes more consistent with the help of build automation tools.
- **Why is gradle used?**:
  - The tool focuses on maintainability, usability, extendibility, performance, and flexibility.
- **How Does Gradle Build Work?**
  - Gradle builds are used to define a project and its tasks.
  - A task represents the work that a Gradle build has to perform, e.g., compiling the source code of the program.
  - You can execute multiple tasks at a time under one build file. These tasks can be dynamically created and extended at runtime.
- **Gradle Core Concepts:**
  - Projects:
    - A project represents a thing that is to be done, like deploying applications to staging environments. A Gradle project requires a set of tasks to execute.
  - Tasks:
    - A task refers to a piece of work performed by a build. It might be something as simple as compiling classes, creating JAR files, making Javadoc, or publishing some archives.

  - Build Scripts:
    - A build script is known as build.gradle and is located in the root directory of the project. Every Gradle build comprises one or more projects. 

##### ---- The End ----