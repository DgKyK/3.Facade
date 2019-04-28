package House;

public class SmartHouse {
    private LivingRoom livingRoom = new LivingRoom();
    private Kitchen kitchen = new Kitchen();
    private BedRoom bedRoom = new BedRoom();
    private ClimateControl conditioner = new ClimateControl();
    private Signalization protect = new Signalization();

    public void ownerCame() {
        System.out.println("Hi BOSS");
        protect.signalizationOff();
        kitchen.startCooking();
        bedRoom.makeBad();
        conditioner.setOptimalTemperature();
        livingRoom.TvOn();
    }

    public void ownerLeft() {
        System.out.println("GOODBYE BOSS");
        protect.signalizationOn();
        kitchen.startCleaning();
        conditioner.climateControlOff();
        livingRoom.TvOff();
    }
}
