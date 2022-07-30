[![](https://img.shields.io/maven-central/v/io.github.mohamadojail/Java-tryParse-maven-plugin?style=for-the-badge&logo=apachemaven)](https://search.maven.org/artifact/io.github.mohamadojail/Java-tryParse-maven-plugin)
 ![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
 ![](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)
 [![](https://img.shields.io/badge/My%20website-ojail.online-blue?style=for-the-badge)](https://ojail.online/)
 [![](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ojail/)

## Java tryParse

> **version:** 1.0.1

### _Ref Class:
you can create a variable using this class and setting the type to either **Integer** or **Double**.
to get the value of the variable use the get method ``out.getValue()``
the class also has a built in ``toString()`` method.

### _Parser Class:
this class has two public methods:
- ``tryParseInt( String incomingData, _RefObj out )``.
- ``tryParseDouble( String incomingData, _RefObj out )``.

as expected from simulating the C# method ``.tryParse()`` the methods would try to parse the incoming data to the desired data type and set the value to the _Ref object provided in the method parameters.
> in case of failure the value of _Ref object will be set to null.
 
### Injecting dependency:
```xml
<dependency>
    <groupId>io.github.mohamadojail</groupId>
    <artifactId>Java-tryParse-maven-plugin</artifactId>
    <version>1.0.0</version>
  </dependency>
```
### Suggested usage:

```java
	String incomingData = "101";
	_Ref<Integer> out = new _Ref<>();
	boolean check = _Parser.tryParseInt(incomingData, out);
```
loop check example:
```java
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an Integer");

	_Ref<Integer> out = new _Ref<>();
	boolean check = _Parser.tryParseInt(scanner.nextLine(), out);

	while (!check){
		System.out.println("invalid input try again");
		check = _Parser.tryParseInt(scanner.nextLine(), out);
	}

System.out.println("Success! you entered a valid Integer: " + out.getValue());
```