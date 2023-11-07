package dz10;
/*добавить в проект Phone свой класс NameException,
исправим метод receiveCall получаем имя от пользователя и получаем исключение, если длина имени меньше 4 символов.
 */


public class Main {
    public static void main(String[] args) throws NameException {
        Informable informable;
        informable = new Phone() {
            @Override
            public void receiveCall() throws NameException {

            }
        };
        informable.infoD();
        SamsungPhone samsungPhone = new SamsungPhone("999-999-999", "Sumsung", 100.123, "Sasha");
        XiaomiPhone xiaomiPhone = new XiaomiPhone("888-888-888", "Xiaomi", 192, "Yolka");
        ApplePhone applePhone = new ApplePhone("777-777-777", "Apple", 200.16, "Misha");
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone.info();
        samsungPhone.receiveCall();
        xiaomiPhone.receiveCall();
        applePhone.receiveCall();
    }
}
