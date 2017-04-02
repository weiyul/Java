1. Go to the Servers view, Select the application, right-click abd sekect the Remove option. 
2. Right-click on the project in Project Explorer and select Export|WAR file. Select the destination for the WAR file.
3. To deploy the WAR file to Tomcat, copy it to the <tomcat_home>/webapps folder.
4. Start the server if it is not already running. If Tomcat is already running, you don't need to restart it.
5. Tomcat monitors the webapps folder, and any WAR file copied to it is automatically deployed. You can verify this by opening the URL of your application in the browser, 
http://localhost:8080/LoginSampleWebApp/Login
