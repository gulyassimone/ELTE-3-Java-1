dir /s /b *.java > sources.txt
javac @sources.txt
java main.PersonTest

pause