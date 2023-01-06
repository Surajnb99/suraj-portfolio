class Account 
{
	private string acc_hol_name;
	private double balance;
	Account(String acname,double bal)
    {
		this.acc.hol_name=acname;
		this.balance=bal;
    }
	public void withdrowl(double money)
	{
		if(this.balance >= money)
		{
			this.balance=this.balance-money;
			System.out.println("Withdrowl is sucessfull and balance amount="+balance);
		}
		else
		{
			throw new Insufficientfund();
		}
		public void getAttibute()
		{
			System.out.println("Account Hoilder name="+acc_hol_name);
			System.out.println("Balance="+balance)
		}
	}
}
