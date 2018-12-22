public class Client {

    public static void main(String[] args) {
        SocketAdapter adapter = new SocketAdapterImpl();
        System.out.println(adapter.get3Volt().getVolts());
    }

}
