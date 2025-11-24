// SmartHomeLighting.java
import java.util.function.Consumer;

public class SmartHomeLighting {
    // functional interface for a light action
    @FunctionalInterface
    interface LightAction {
        void perform(String zone);
    }

    public static void main(String[] args) {
        // Different triggers implemented as lambdas
        LightAction motionTrigger = (zone) -> System.out.println("Motion detected in " + zone + " -> lights ON at 100%");
        LightAction nightTime = (zone) -> System.out.println("Night time in " + zone + " -> lights ON at 30% (soft)");
        LightAction voiceCommand = (zone) -> System.out.println("Voice command for " + zone + " -> toggle lights");

        // Example usage
        motionTrigger.perform("Living Room");
        nightTime.perform("Bedroom");
        voiceCommand.perform("Kitchen");

        // You can also pass lambdas dynamically
        performAction("Balcony", (z) -> System.out.println("Sunset schedule for " + z + " -> warm color, 50%"));
    }

    static void performAction(String zone, LightAction action) {
        action.perform(zone);
    }
}
