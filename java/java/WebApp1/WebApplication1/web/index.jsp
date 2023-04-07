<html>
    <head>
        <title>Jsp page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%! int fact (int n){ 
        if(n==0) 
        return 1;
        else 
        return n*fact(n-1);
    }%>
    </head>
    <body>
        <%
            for(int i=0; i<=10; i++) {
                out.println("Helo World");
            }
            
        %>
        <p><% out.println("Factorial = ");%><%=fact(5) %></p>
        
    </body>
</html>
