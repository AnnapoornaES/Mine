package PasteCompanyIng;

public class ToothPasteSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Invoking main in Toothpaste Runner");
		
		String name="MaxFresh";
		String brand="Colgate";
		String company="Colgate-Palmolive Company";
		String[] ingredients= {"Salt", "Lavanga", "Pudina satva", "Garlic", "Karpura"};
		
		String cname="Colgate";
		String ceo="Noel R.wallac";
		String originCountry="United States";
		
		ToothPaste toothpaste=new ToothPaste(name, brand, company, ingredients);
		toothpaste.printInfo();
		Company company1=new Company(cname, ceo, originCountry);
		company1.printInfo();

	}

}
