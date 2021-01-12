dir /s /b *.java > sources.txt
javac @sources.txt
java hu.elte.javagyak.gyak7.CarMain cars.txt

pause