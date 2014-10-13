
public class Persoana 
{
	private String Name, Surname, Email, Phone;
	
	Persoana(String Name, String Surname, String Email, String Phone)
	{
		this.Name = Name;
		this.Surname = Surname;
		this.Email = Email;
		this.Phone = Phone;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public String getSurName()
	{
		return this.Surname;
	}
	
	public String getEmail()
	{
		return this.Email;
	}
	
	public String getPhone()
	{
		return this.Phone;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setSurname(String Surname)
	{
		this.Surname = Surname;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public void setPhone(String Phone)
	{
		this.Phone = Phone;
	}
}
