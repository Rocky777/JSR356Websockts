<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Getting Started with JSR 356 - Annotated Endpoint</title>

    </head>
    <body>
        <h1>Getting Started with JSR 356 - Annotated Endpoint</h1>

        <div style="text-align: center;">
            <form action=""> 
                <h2>Text Data</h2>
                <input onclick="sayHello();" value="Say Hello" type="button"> 
                <input id="myField" value="WebSocket" type="text"><br>
            </form>
            
        </div>
        <div id="output"></div>
        <script language="javascript" type="text/javascript" src="websocket.js">
        </script>
    </body>
</html>
