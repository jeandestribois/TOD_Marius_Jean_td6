CC = javac
exec = Main

all: build run

build:
	$(CC) -d bin -sourcepath src src/*.java

run:
	java -cp bin $(exec)

clean:
	rm bin/*.class

edit:
	atom src/*.java 
