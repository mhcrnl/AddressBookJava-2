
public class Activitate extends Eveniment
{
	private int repeta_la;
	private String unit_timp;
	private int adaugare;
	
	public int getAdaugare() {
		return adaugare;
	}

	public void setAdaugare(int adaugare) {
		this.adaugare = adaugare;
	}

	public void setRepetitie(int x)
	{
		this.repeta_la = x;
	}
	
	public int getRepetitie()
	{
		return this.repeta_la;
	}
	
	public void setUnit(String u)
	{
		this.setAdaugare(0);
		if (("zile").toLowerCase().contains(u.toLowerCase()))
		{
			this.unit_timp = "zi(le)";
			this.setAdaugare(this.getAdaugare() + this.repeta_la);
		}
		else
			if (("saptamanasaptamani").toLowerCase().contains(u.toLowerCase()))
			{
				this.unit_timp = "sapmamana(saptamani)";
				this.setAdaugare(this.getAdaugare() + this.repeta_la * 7);
			}
			else
				if(("ani").toLowerCase().contains(u.toLowerCase()))
				{
					this.unit_timp = "ani";
					this.setAdaugare(this.getAdaugare() + this.repeta_la * 365);
				}
				else
					System.out.println("Unitate de timp invalida");
	}
	
	public String getUnit()
	{
		return this.unit_timp;
	}
}
