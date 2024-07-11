# Aiamg

Java 3D graphics from scratch using a natural model of the perspective projection (which leads to complicated formulas for computing cuts).


## Java compile
Change directory to "<Aiamg_ParentDirectory>".
Enter the command  
  javac Aiamg/\*.java -cp "<Aiamg_ParentDirectory>"; javac Aiamg/Tests/\*.java -cp "<Aiamg_ParentDirectory>"; javac Aiamg/Utils/\*.java -cp "<Aiamg_ParentDirectory>"


## Run java tests
Change directory to "<Aiamg_ParentDirectory>".
Enter the command  
  java Aiamg.Tests.SceneTest


## JAR executeable "Aiamg.jar"
Change directory to "<Aiamg_ParentDirectory>".
Enter the command  
  jar cvmf Aiamg/META-INF/MANIFEST.MF Aiamg/Aiamg.jar Aiamg/\*.class Aiamg/Tests/\*.class Aiamg/Utils/\*.class

Advise:
* The manifest file "Aiamg/META-INF/MANIFEST.MF" should be UTF8 encoded.
* The last entry in the manifest file "Aiamg/META-INF/MANIFEST.MF" should end with a new line.

In order to execute the jar file, change directory to "<Aiamg_Directory>" and enter the command  
  java -jar Aiamg.jar
