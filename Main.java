public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        IPhone iPhone = new IPhone();

        basicPhone.makeCall("123456789");
        basicPhone.sendSMS("123456789", "Hello, this is a basic phone.");

        samsung.makeCall("987654321");
        samsung.sendSMS("987654321", "Hello, this is a Samsung phone.");

        iPhone.makeCall("456789123");
        iPhone.sendSMS("456789123", "Hello, this is an iPhone.");

        samsung.browseWeb("https://www.example.com");
        samsung.takePicture();

        iPhone.browseWeb("https://www.example.com");
        iPhone.takePicture();
    }
}
