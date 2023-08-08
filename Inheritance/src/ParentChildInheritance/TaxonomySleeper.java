package ParentChildInheritance;

public class TaxonomySleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking all heirarchy");
		TaxonomicSystem taxo=new TaxonomicSystem();
		taxo.taxo();
		
		TaxonomicSystem spe=new Species();
		spe.spy();
		
		

	}

}
