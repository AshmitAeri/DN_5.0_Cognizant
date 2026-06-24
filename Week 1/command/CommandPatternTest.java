package command;

// Test class to demonstrate the Command Pattern
public class CommandPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Command Pattern Example ===\n");

        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        // Create commands
        Command livingRoomOn = new LightOnCommand(livingRoomLight);
        Command livingRoomOff = new LightOffCommand(livingRoomLight);
        Command kitchenOn = new LightOnCommand(kitchenLight);
        Command kitchenOff = new LightOffCommand(kitchenLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Turn on living room light
        System.out.println("--- Living Room ---");
        remote.setCommand(livingRoomOn);
        remote.pressButton();

        // Turn off living room light
        remote.setCommand(livingRoomOff);
        remote.pressButton();

        System.out.println();

        // Turn on kitchen light
        System.out.println("--- Kitchen ---");
        remote.setCommand(kitchenOn);
        remote.pressButton();

        // Turn off kitchen light
        remote.setCommand(kitchenOff);
        remote.pressButton();
    }
}
