<%@ page import="java.util.*"%>

    <html>  
    <head>  
    <script type="text/javascript" src="jquery-1.2.6.min.js"></script>  
    <title>Being Java Guys | Hello World</title>  
    </head>  
    <body>  
      
        <center>  
            <h2>Being Java Guys | Hello World</h2>  
            <h4>${message}</h4>  
        </center>  
        
         <h2> -----Being Java Guys | Hello World</h2>  
         Enter Your Name: <input type="text" id="name" value="${user.name}">
            <h4>  <a href="newMessage.htm?m=${user.name}">Click Here</a></h4>
                <h5>${msg}</h5>
                <h5>${user.name}</h5>  
                
    </body>  
    </html>  