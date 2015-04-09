class HelloWorld {
    String name

    String sayHello() {
        return "Hello " + name
    }
}

public class HelloWorldApp {
    static main(args) {
        def hw = new HelloWorld()
        hw.name = "Alex"
        println hw.sayHello()
    }
}