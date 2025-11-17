import java.util.ArrayList;

// Base Abstract Class: SmartDevice
abstract class SmartDevice {
    private String deviceName;
    private String roomLocation;
    private boolean isOn;
    private static boolean mainPower = true;

    // Constructor overloading
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.roomLocation = "Unknown";
        this.isOn = false;
    }

    public SmartDevice(String deviceName, String roomLocation) {
        this.deviceName = deviceName;
        this.roomLocation = roomLocation;
        this.isOn = false;
    }

    // Encapsulated getters and setters
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean on) {
        this.isOn = on;
    }

    public static boolean isMainPowerOn() {
        return mainPower;
    }

    public static void setMainPower(boolean powerStatus) {
        mainPower = powerStatus;
    }

    // Abstract methods
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();
    public abstract String getDeviceType();

    // Common method to check if action is allowed
    protected boolean canPerformAction() {
        if (!mainPower) {
            System.out.println("Cannot perform action: Main power is OFF");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (Location: %s) - %s",
                getDeviceType(), deviceName, roomLocation, getStatus());
    }
}

// Light Class (Subclass)
class Light extends SmartDevice {
    private int brightness;
    private String color;

    public Light(String deviceName) {
        super(deviceName);
        this.brightness = 0;
        this.color = "White";
    }

    public Light(String deviceName, String roomLocation) {
        super(deviceName, roomLocation);
        this.brightness = 0;
        this.color = "White";
    }

    @Override
    public void turnOn() {
        if (!canPerformAction()) return;

        setOn(true);
        this.brightness = 100;
        System.out.println(getDeviceName() + " light turned ON with 100% brightness");
    }

    @Override
    public void turnOff() {
        if (!canPerformAction()) return;

        setOn(false);
        this.brightness = 0;
        System.out.println(getDeviceName() + " light turned OFF");
    }

    @Override
    public String getStatus() {
        if (isOn()) {
            return String.format("ON - Brightness: %d%%, Color: %s", brightness, color);
        } else {
            return "OFF";
        }
    }

    @Override
    public String getDeviceType() {
        return "Light";
    }

    // Device-specific methods
    public void setBrightness(int brightness) {
        if (!canPerformAction()) return;

        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness must be between 0-100%");
            return;
        }
        this.brightness = brightness;
        if (brightness > 0) {
            setOn(true);
        } else {
            setOn(false);
        }
        System.out.println(getDeviceName() + " brightness set to " + brightness + "%");
    }

    public void setColor(String color) {
        if (!canPerformAction()) return;

        this.color = color;
        System.out.println(getDeviceName() + " color changed to " + color);
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }
}

// Thermostat Class (Subclass)
class Thermostat extends SmartDevice {
    private double currentTemperature;
    private double targetTemperature;
    private String mode;

    public Thermostat(String deviceName) {
        super(deviceName);
        this.currentTemperature = 22.0;
        this.targetTemperature = 22.0;
        this.mode = "AUTO";
    }

    public Thermostat(String deviceName, String roomLocation) {
        super(deviceName, roomLocation);
        this.currentTemperature = 22.0;
        this.targetTemperature = 22.0;
        this.mode = "AUTO";
    }

    @Override
    public void turnOn() {
        if (!canPerformAction()) return;

        setOn(true);
        System.out.println(getDeviceName() + " thermostat activated. HVAC system running.");
    }

    @Override
    public void turnOff() {
        if (!canPerformAction()) return;

        setOn(false);
        System.out.println(getDeviceName() + " thermostat deactivated. HVAC system stopped.");
    }

    @Override
    public String getStatus() {
        if (isOn()) {
            return String.format("ACTIVE - Current: %.1f°C, Target: %.1f°C, Mode: %s",
                    currentTemperature, targetTemperature, mode);
        } else {
            return "INACTIVE - HVAC system off";
        }
    }

    @Override
    public String getDeviceType() {
        return "Thermostat";
    }

    // Method overloading for setTemperature
    public void setTemperature(double targetTemperature) {
        if (!canPerformAction()) return;

        this.targetTemperature = targetTemperature;
        setOn(true);
        System.out.println(getDeviceName() + " target temperature set to " + targetTemperature + "°C");
    }

    public void setTemperature(double targetTemperature, int timerMinutes) {
        if (!canPerformAction()) return;

        this.targetTemperature = targetTemperature;
        setOn(true);
        System.out.println(getDeviceName() + " target temperature set to " + targetTemperature +
                "°C for " + timerMinutes + " minutes");
    }

    public void setMode(String mode) {
        if (!canPerformAction()) return;

        if (mode.equals("HEAT") || mode.equals("COOL") || mode.equals("AUTO")) {
            this.mode = mode;
            setOn(true);
            System.out.println(getDeviceName() + " mode set to " + mode);
        } else {
            System.out.println("Invalid mode. Use HEAT, COOL, or AUTO");
        }
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public String getMode() {
        return mode;
    }

    public void updateCurrentTemperature(double newTemperature) {
        this.currentTemperature = newTemperature;
    }
}

// SmartLock Class (Subclass)
class SmartLock extends SmartDevice {
    private boolean isLocked;
    private int failedAttempts;
    private static final int MAX_FAILED_ATTEMPTS = 3;

    public SmartLock(String deviceName) {
        super(deviceName);
        this.isLocked = true;
        this.failedAttempts = 0;
    }

    public SmartLock(String deviceName, String roomLocation) {
        super(deviceName, roomLocation);
        this.isLocked = true;
        this.failedAttempts = 0;
    }

    @Override
    public void turnOn() {
        lock();
    }

    @Override
    public void turnOff() {
        unlock();
    }

    @Override
    public String getStatus() {
        return isLocked ? "LOCKED" : "UNLOCKED";
    }

    @Override
    public String getDeviceType() {
        return "SmartLock";
    }

    // Device-specific methods
    public void lock() {
        if (!canPerformAction()) return;

        if (isLocked) {
            System.out.println(getDeviceName() + " is already locked");
            return;
        }

        isLocked = true;
        failedAttempts = 0;
        setOn(true);
        System.out.println(getDeviceName() + " locked successfully");
    }

    public void unlock() {
        if (!canPerformAction()) return;

        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            System.out.println(getDeviceName() + " temporarily disabled due to too many failed attempts");
            return;
        }

        if (!isLocked) {
            System.out.println(getDeviceName() + " is already unlocked");
            return;
        }

        if (authenticate()) {
            isLocked = false;
            failedAttempts = 0;
            setOn(false);
            System.out.println(getDeviceName() + " unlocked successfully");
        } else {
            failedAttempts++;
            System.out.println("Authentication failed. Attempts: " + failedAttempts + "/" + MAX_FAILED_ATTEMPTS);
        }
    }

    private boolean authenticate() {
        return true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void resetFailedAttempts() {
        this.failedAttempts = 0;
        System.out.println(getDeviceName() + " failed attempts counter reset");
    }
}

// HomeController Class
class HomeController {
    private ArrayList<SmartDevice> devices;
    private String controllerName;

    public HomeController(String controllerName) {
        this.controllerName = controllerName;
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Added " + device.getDeviceType() + ": " + device.getDeviceName());
    }

    public void removeDevice(String deviceName) {
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getDeviceName().equalsIgnoreCase(deviceName)) {
                SmartDevice removed = devices.remove(i);
                System.out.println("Removed " + removed.getDeviceType() + ": " + removed.getDeviceName());
                return;
            }
        }
        System.out.println("Device '" + deviceName + "' not found");
    }

    public SmartDevice findDevice(String deviceName) {
        for (SmartDevice device : devices) {
            if (device.getDeviceName().equalsIgnoreCase(deviceName)) {
                return device;
            }
        }
        return null;
    }

    public void controlDevice(String deviceName, String action) {
        SmartDevice device = findDevice(deviceName);
        if (device == null) {
            System.out.println("Device '" + deviceName + "' not found");
            return;
        }

        if (action.equalsIgnoreCase("on")) {
            device.turnOn();
        } else if (action.equalsIgnoreCase("off")) {
            device.turnOff();
        } else if (action.equalsIgnoreCase("status")) {
            System.out.println(device.toString());
        } else {
            System.out.println("Unknown action: " + action);
        }
    }

    public void setThermostatTemperature(String deviceName, double temperature) {
        SmartDevice device = findDevice(deviceName);
        if (device instanceof Thermostat) {
            ((Thermostat) device).setTemperature(temperature);
        } else {
            System.out.println("Device '" + deviceName + "' is not a thermostat");
        }
    }

    public void setLightBrightness(String deviceName, int brightness) {
        SmartDevice device = findDevice(deviceName);
        if (device instanceof Light) {
            ((Light) device).setBrightness(brightness);
        } else {
            System.out.println("Device '" + deviceName + "' is not a light");
        }
    }

    public void controlLock(String deviceName, String action) {
        SmartDevice device = findDevice(deviceName);
        if (device instanceof SmartLock) {
            if (action.equalsIgnoreCase("lock")) {
                ((SmartLock) device).lock();
            } else if (action.equalsIgnoreCase("unlock")) {
                ((SmartLock) device).unlock();
            } else {
                System.out.println("Unknown lock action: " + action);
            }
        } else {
            System.out.println("Device '" + deviceName + "' is not a smart lock");
        }
    }

    // Scene modes using loops
    public void activateGoodNightMode() {
        System.out.println("=== ACTIVATING GOOD NIGHT MODE ===");
        int devicesControlled = 0;

        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOff();
                devicesControlled++;
            } else if (device instanceof SmartLock) {
                ((SmartLock) device).lock();
                devicesControlled++;
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(20.0);
                devicesControlled++;
            }
        }
        System.out.println("Good Night mode activated for " + devicesControlled + " devices");
    }

    public void activateAwayMode() {
        System.out.println("=== ACTIVATING AWAY MODE ===");
        int devicesControlled = 0;

        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOff();
                devicesControlled++;
            } else if (device instanceof SmartLock) {
                ((SmartLock) device).lock();
                devicesControlled++;
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(18.0);
                devicesControlled++;
            }
        }
        System.out.println("Away mode activated for " + devicesControlled + " devices");
    }

    public void activateWelcomeHomeMode() {
        System.out.println("=== ACTIVATING WELCOME HOME MODE ===");
        int devicesControlled = 0;

        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOn();
                devicesControlled++;
            } else if (device instanceof SmartLock) {
                ((SmartLock) device).unlock();
                devicesControlled++;
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(22.0);
                devicesControlled++;
            }
        }
        System.out.println("Welcome Home mode activated for " + devicesControlled + " devices");
    }

    public void displayAllDevices() {
        System.out.println("\n=== ALL DEVICES IN " + controllerName.toUpperCase() + " ===");
        if (devices.isEmpty()) {
            System.out.println("No devices connected");
            return;
        }

        for (int i = 0; i < devices.size(); i++) {
            System.out.println((i + 1) + ". " + devices.get(i).toString());
        }
    }

    public void displayDeviceSummary() {
        int lights = 0, thermostats = 0, locks = 0;

        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                lights++;
            } else if (device instanceof Thermostat) {
                thermostats++;
            } else if (device instanceof SmartLock) {
                locks++;
            }
        }

        System.out.println("\n=== DEVICE SUMMARY ===");
        System.out.println("Lights: " + lights);
        System.out.println("Thermostats: " + thermostats);
        System.out.println("Smart Locks: " + locks);
        System.out.println("Total Devices: " + devices.size());
    }

    public ArrayList<SmartDevice> getDevices() {
        return new ArrayList<>(devices);
    }

    public String getControllerName() {
        return controllerName;
    }
}

// Main Class to Test the System
public class SmartHomeAutomationSystem {
    public static void main(String[] args) {
        // Create home controller
        HomeController myHome = new HomeController("My Smart Home");

        // Create devices using different constructors
        Light livingRoomLight = new Light("Main Light", "Living Room");
        Light bedroomLight = new Light("Bedside Lamp", "Bedroom");
        Light kitchenLight = new Light("Kitchen Light");

        Thermostat livingRoomThermo = new Thermostat("Living Room Thermostat", "Living Room");
        Thermostat bedroomThermo = new Thermostat("Bedroom Thermostat");

        SmartLock frontDoorLock = new SmartLock("Front Door", "Entrance");
        SmartLock backDoorLock = new SmartLock("Back Door");

        // Add devices to controller
        myHome.addDevice(livingRoomLight);
        myHome.addDevice(bedroomLight);
        myHome.addDevice(kitchenLight);
        myHome.addDevice(livingRoomThermo);
        myHome.addDevice(bedroomThermo);
        myHome.addDevice(frontDoorLock);
        myHome.addDevice(backDoorLock);

        System.out.println("\n" + "=".repeat(50));

        // Display all devices
        myHome.displayAllDevices();
        myHome.displayDeviceSummary();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING INDIVIDUAL DEVICE CONTROL");
        System.out.println("=".repeat(50));

        // Test individual device control
        myHome.controlDevice("Main Light", "on");
        myHome.setLightBrightness("Main Light", 75);
        myHome.controlDevice("Main Light", "status");

        myHome.setThermostatTemperature("Living Room Thermostat", 23.5);
        myHome.controlDevice("Living Room Thermostat", "status");

        myHome.controlLock("Front Door", "unlock");
        myHome.controlDevice("Front Door", "status");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING SCENE MODES");
        System.out.println("=".repeat(50));

        // Test scene modes
        myHome.activateGoodNightMode();
        System.out.println();
        myHome.activateWelcomeHomeMode();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING POWER CONTROL");
        System.out.println("=".repeat(50));

        // Test main power control (prerequisite checking)
        SmartDevice.setMainPower(false);
        System.out.println("Main power turned OFF");

        myHome.controlDevice("Main Light", "on");
        myHome.controlLock("Front Door", "unlock");

        SmartDevice.setMainPower(true);
        System.out.println("Main power turned BACK ON");

        myHome.controlDevice("Main Light", "on");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("FINAL STATUS");
        System.out.println("=".repeat(50));

        // Final status
        myHome.displayAllDevices();

        // Test method overloading in Thermostat
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING METHOD OVERLOADING");
        System.out.println("=".repeat(50));

        myHome.setThermostatTemperature("Bedroom Thermostat", 21.0);
        Thermostat thermo = (Thermostat) myHome.findDevice("Bedroom Thermostat");
        if (thermo != null) {
            thermo.setTemperature(19.0, 60); // Overloaded method with timer
        }
    }
}