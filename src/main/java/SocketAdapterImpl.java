public class SocketAdapterImpl extends Socket implements SocketAdapter {
    public Volt get120Volt() {
        return getVolt();
    }

    public Volt get3Volt() {
        return convert(getVolt(), 40);
    }

    public Volt get12Volt() {
        return convert(getVolt(), 10);
    }


    /**
     this method is main goal of this design and now this is just a sample code
     in real world we could use this for convert array to List or something like this.
     */
    public Volt convert(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
