# How to test this project

1. Start nexus server (see compose file in the wiki of this repo)
2. Start jenkins server (see compose file in the wiki of this repo)
3. Configure maven </br>
         Manage Jenkins --> Global Tool Configuration --> Maven Installation

        Name: maven_3_6_1 </br>
        check install automatically </br>
        Version 3.6.1
  
4. Configure settings.xml file inside .m2 folder in jenkins server. (You can see settings.xml file in the wiki of this repo)
5. Create a pipeline 
6. Build it
