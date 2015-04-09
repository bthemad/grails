class HelloWorld {
    String name

    String sayHello() {
        return "Hello ${name}"
    }
}

def hw = new HelloWorld()
hw.name = 'Alex'
println hw.sayHello()
