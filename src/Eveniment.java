
public class Eveniment 
{
	private String[] Denumire, Locatie;
	private int Zi, Luna, An;
	
	public void setDenumire(String[] Denumire)
	{
		this.Denumire = Denumire;
	}
	
	public String[] getDenumire()
	{
		return this.Denumire;
	}
	
	public void setLocatie(String[] Locatie)
	{
		this.Locatie = Locatie;
	}
	
	public String[] getLocatie()
	{
		return this.Locatie;
	}
	
	public int setData(int zi, int luna, int an)
	{
		if (zi>31||zi<1)
		{
			System.out.println("Data invalida (zi)");
			return 0;
		}
		if (luna>12||luna<1)
		{
			System.out.println("Data invalida (luna)");
			return 0;
		}
		this.Zi = zi;
		this.Luna = luna;
		this.An = an;
		return 1;
	}
	
	public int[] getData()
	{
		int[] Data = {0, 0, 0};
		Data[0] = this.Zi;
		Data[1] = this.Luna;
		Data[2] = this.An;
		return Data;
	}
		
}
