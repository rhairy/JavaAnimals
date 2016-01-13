prgsrc=src/test/Test.java
classpath=src/main
target=target

all:
	javac -classpath $(classpath) -d $(target) $(prgsrc)
clean:
	find $(target) -name '*.class' -delete
