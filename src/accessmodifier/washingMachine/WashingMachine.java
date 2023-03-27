package accessmodifier.washingMachine;

public class WashingMachine {
    private int temperature;
    private int spining;

    public void modeForSensitiveClothes(){
        temperature = 30;
        spining = 800;
    }

    public void modeForTowelsAndBedLinen(){
        temperature = 90;
        spining = 1200;
    }

    @Override
    public String   toString() {
        return "ACCESS_MODIFIER.washingMachine.WashingMachine{" +
                "temperature=" + temperature +
                ", spining=" + spining +
                '}';
    }
}