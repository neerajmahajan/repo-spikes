# Jersey + Spring + Hibernate integration example
mvn dependency:sources
 
    * create database using script /rest-server-dao/src/main/resources/db/schema.ddl
    * run - mvn tomcat:run -Dmaven.tomcat.port=8081
    

##	Below are few services of type GET and PUT

(GET)link - http://localhost:8081/rest-server-dao/rest/pin/102

	 *	It will give the list of places matching pin code from database
	 
(GET)link - http://localhost:8081/rest-server-dao/rest/pin/login/102

	 * This service is a example of secured service. So it will first authenticate user before giving the result 

(GET)link - http://localhost:8081/rest-server-dao/rest/user/uname/vishal
	
	 *	It will fetch the user from database matching user name and give its detail
	 
(PUT)link - http://localhost:8081/rest-server-dao/rest/user/save

	* This service get a user from client and save it to database.