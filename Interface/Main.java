interface Features
{
    void dialing();
    void messaging();
}
class Phone implements Features
{
    public void dialing()
    {
        System.out.println("Call connected");
    }
    public void messaging()
    {
        System.out.println("Hi,How are you");
    }
}
public class Main
{
	public static void main(String[] args) {
		Phone obj = new Phone();
		obj.dialing();
		obj.messaging();
	}
}
