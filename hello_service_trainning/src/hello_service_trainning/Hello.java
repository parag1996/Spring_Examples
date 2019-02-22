package hello_service_trainning;

public class Hello {

	void get()
	{
		System.out.println("Github");
	}
	public static void main(String args[])
	{
		HelloStudent hello=new HelloStudent();
		hello.print();
		
		System.out.println("Hello Spring Boot");
	}
}
