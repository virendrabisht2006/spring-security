# spring-security
project to demonstrate spring security using spring boot and spring starter security module

1- CRUD operation for book repository, using extensively HTTP method
2- Javax Validation and custom validation
3- common error handler/ universal error handling
4- spring integration test using mock mvc
5- h2 database for in memory store, spring data jpa
6- spring security using basic authentication
7- disabling spring security for test, defining order for duplicate bean in case of test config

Spring boot security references
https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/

Spring boot security
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-security

invoke http method using curl.
--GET
> curl -v -X GET localhost:8080/books -h "Content_type:application/json"
--POST
> curl -v -X POST localhost:8080/books -h "Content_type:application/json" -d "json-string"

