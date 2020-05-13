
# Installation: 
- 1.Java should be installed,to check it execute "javac -v" in terminal.
- 2.You should make sure that Java is written in the paths (if os Windows). 
- 3.You should make sure that in Project bytecode version (Settings -> Build,Execution,Deployment -> Compiler -> Java Compiler) is the current version. 
- 4.Apache Maven should be installed, to check it execute "mvn -v" in cmd or IntellijIDEA. 
- 5.You should make sure that Maven is written in the paths (if os Windows). 
- 6.Your should make sure that the git is installed,to check it execute "git--version" in cmd or IntellijIDEA.
# RunTests:
- 1.Use command  in terminal IDE "mvn package -Druntest=testng -Dbrowser=CHROME", where -D is parameter.
- 2.If you want to run test in another browser,create parameter -Dbrowser for FIREFOX or Opera.
