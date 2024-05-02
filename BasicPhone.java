class BasicPhone implements SmartPhone {
    @Override
    public void makeCall(String number) {
    }

    @Override
    public void sendSMS(String number, String message) {
    }

    @Override
    public void browseWeb(String url) {
        throw new UnsupportedOperationException("BasicPhone cannot browse the web.");
    }

    @Override
    public void takePicture() {
        throw new UnsupportedOperationException("BasicPhone cannot take pictures.");
    }
}