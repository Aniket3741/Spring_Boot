package ServiceInterface;

	public class ServiceImpl1 implements ServiceInterface{
	    static String serviceName = "default service value ";

	    public String getServiceName() {
	        return serviceName;
	    }

	@Override
	public void displayMessage()
	    {
	        System.out.println("This is implementation 1");
	    }
	
}
