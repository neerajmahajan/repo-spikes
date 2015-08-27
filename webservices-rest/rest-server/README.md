# Simple example of Rest Service using Jersey


## To run this application use below command -

    * run - mvn tomcat:run -Dmaven.tomcat.port=8080
    
##	It will start server with rest service running on below url -

	(GET)link - http://localhost:8080/rest-server/rest/vishal

	 * This service is a example of secured service. So it will first authenticate user before giving the result.To test this service use rest-client module where its client is implemented.
	 
	 * or If authentication is not required you need to comment filter mapping which is defined in web.xml and hit the below url in browser -
	  http://localhost:8080/rest-server/rest/vishal
	 
##	To download sources for dependency jars
	mvn dependency:sources