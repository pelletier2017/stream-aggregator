# Known issues and solutions

### Application issues
1. Running application fails to start because port is already in use
    ```
    Web server failed to start. Port 8080 was already in use.
    
    Action:
    
    Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.
    ```
   The fix is to stop the process that is running on port 8080. The following steps work on windows 10.
   1. Confirm the app is running on port 8080 by going to this URL in a browser which should either show some web page or a "Whitelabel Error Page". http://localhost:8080/
   1. Open cmd and run it as Administrator
       - type "CMD" into the search bar then right clicking the application and "Run as administrator"
       - If you get the error "The requested operation requires elevation." it was not ran in administrator mode.
   1. Use netstat to find which process is using the port. `netstat -aon | find /i "8080"`
       - the port is in the last column of the output
   1. Kill the process using that port with the command `taskkill /PID <portNumber> /F`
   1. Confirm the app is no longer up at http://localhost:8080/ after a few seconds and it show now say "This site can’t be reached"

1. When running the application with `./gradlew clean bootRun`, the process wont be killable in git bash with ctrl+C. 
Closing the window leaves behind a process that must be killed manually.
    - Open another terminal of git bash and run the command `./gradlew --stop` to stop both gradle and tomcat.
    - It is an option to only run the application in your IDE (ex Intellij IDEA).
    This github issue mentions that the underlying reason for this issue is Tomcat runs in its own process. 
    https://github.com/spring-projects/spring-boot/issues/773

### Related tooling issues

1. Git Bash terminal says Error: Could not fork child process: There are no available terminals (-1)"

Stack overflow question matching the error. https://stackoverflow.com/questions/45799650/git-bash-error-could-not-fork-child-process-there-are-no-available-terminals
One solution is to open Task Manager, end the process "sh.exe", and re-open Git Bash.
