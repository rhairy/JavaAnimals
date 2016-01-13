prgsrc=src/main/com/rhairy/animals/Cat.java
classpath=src/main
target=target

all:
	javac -classpath $(classpath) -d $(target) $(prgsrc)
clean:
	find $(target) -name '*.class' -delete
