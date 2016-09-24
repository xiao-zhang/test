import java.net.*;

public class TestNet{
	public static void main(String []args){
		try{
			InetAddress address = InetAddress.getByName("www.baidu.com");
			System.out.println(address);
		}catch(UnknownHostException ex){
			System.out.println("Could not find www.baidu.com");
		}
	}	

}