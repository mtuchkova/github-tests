
Installation: 

# Installation: 
- 1.Java should be installed,to check it execute "javac -v" in cmd or IntellijIDEA.
- 2.You should make sure that Java is written in the paths (if os Windows). 
- 3.You should make sure that in Project bytecode version (Settings -> Build,Execution,Deployment -> Compiler -> Java Compiler) is the current version. 
- 4.Apache Maven should be installed, to check it execute "mvn -v" in cmd or IntellijIDEA. 
- 5.You should make sure that Maven is written in the paths (if os Windows). 
- 6.Your should make sure that the git is installed,to check it execute "git--version" in cmd or IntellijIDEA.
# RunTests:
- 1.Your should make sure that maven-surefire-plugin add to pom.xml the to pom.xml (use mvn documentation)
- 2.Create testng.xml and write suites, classes and tests in which you will run tests
- 3.Create a parameter in testng.xml (е.х  <parameter name="browser" value="${browser}"/>)
- 4.Write a way  in surefire-plugin in pom.xml (example, src/test/resources/select_browser.xml)
- 5.Add dependencies for browser driver to pom.xml (ex. chrome driver)
- 6.Create enum class -write browsers which you will use
- 7.Create setUp class with switch-case structure with browsers which you will use to run tests
- 8.Use command  in terminal IDE "mvn package -D{{filename}}=testng -Dbrowser=CHROME", where -D is parameter
