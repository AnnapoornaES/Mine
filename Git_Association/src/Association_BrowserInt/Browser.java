package Association_BrowserInt;

public class Browser {
	public String type;
	public Internet internet;
	public void internetExplorer() {
		System.out.println("Invoking provideInfo in internetExplorer");
		if(this.internet!=null)
		{
			this.internet.provideInfo();
		}
		else
		{
			System.out.println("internet is Null, Hence Not operate provideInfo() Method");
		}
	}
	
	public void paytm() {
		System.out.println("Invoking pay in paytm");
		if(this.internet!=null)
		{
			this.internet.pay();
		}
		else
		{
			System.out.println("internet is Null, Hence Not operate pay() Method");
		}
	}
}
