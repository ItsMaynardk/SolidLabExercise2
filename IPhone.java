class IPhone implements CallCapable, SMSCapable, WebBrowsingCapable, CameraCapable {
    @Override
    public void makeCall(String number) {
    }

    @Override
    public void sendSMS(String number, String message) {
    }

    @Override
    public void browseWeb(String url) {
    }

    @Override
    public void takePicture() {
    }
}