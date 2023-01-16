package dependency_injection.legacy;

public class Vehicle {
    private final Engine engine = new Engine();
    private static final String KEY = "KEY";

    public void start(String key) {
        if (KEY.equals(key)) {
            engine.start();
        } else {
            System.out.println("Sorry,  check your key");
        }
    }
}
