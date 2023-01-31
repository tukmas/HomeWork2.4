public class driverC extends driver{
    public driverC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С" +getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории С" +getName() + " закончил движение");
    }

    @Override
    public void refuelTheСar() {
        System.out.println("Водитель категории С" +getName() + " нзаправляет автомобиль");
    }
}
