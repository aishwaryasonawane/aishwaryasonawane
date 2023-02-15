package EncapsulationPack;

public class EmployeeMain
{
	public static void main(String args[])
	{
		EmployeeEx e1=new EmployeeEx ();
		e1.setEmp_id(101);
		e1.setName("Aishwarya");
		e1.setSal(25000);
		System.out.println(e1.getEmp_id());
		System.out.println(e1.getSal());
		System.out.println(e1.getName());
	}

}
