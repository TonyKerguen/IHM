javac -d bin --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls src/*.java

java -cp bin --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls <Nom de la class à executer>

javadoc -d doc --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls. -charset utf8 -noqualifier all src/*.java
