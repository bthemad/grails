public class HelloWorld {
    private String name;

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.setName("Alex");
        System.out.println(hw.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(name) {
        this.name = name;
    }
}