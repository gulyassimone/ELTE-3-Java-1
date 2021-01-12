dir /s /b *.java > sources.txt
javac @sources.txt
java PlanetMain 82.5

pause