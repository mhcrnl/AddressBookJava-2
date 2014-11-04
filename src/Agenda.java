import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Agenda 
{
    private Proprietar user;
    private Persoana[] contacts;
    private int NrContacte = 0;
    private Activitate[] tasks;
    private Eveniment[] events;
    private String act, eve, per, pro;
    
    public Agenda loadFromFile ()
    {
        try 
        {
            DataInputStream fisier;
            fisier = new DataInputStream(new FileInputStream("Agenda.dat"));
            pro = fisier.readUTF();
            per = fisier.readUTF();
            act = fisier.readUTF();
            eve = fisier.readUTF();
            fisier.close();
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        
        try 
        {
            DataInputStream fisier;
            fisier = new DataInputStream(new FileInputStream(pro));
            user.setUsername(fisier.readUTF());
            user.setParola(fisier.readUTF());
            user.setNume(fisier.readUTF());
            user.setPrenume(fisier.readUTF());
            user.setTelefon(fisier.readUTF());
            user.setEmail(fisier.readUTF());
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        
        try 
        {
            DataInputStream fisier;
            fisier = new DataInputStream(new FileInputStream(per));
            while (fisier.) //gotta figure this out
            {
                contacts[NrContacte].setNume(fisier.readUTF());
                contacts[NrContacte].setPrenume(fisier.readUTF());
                contacts[NrContacte].setTelefon(fisier.readUTF());
                contacts[NrContacte].setEmail(fisier.readUTF());
                NrContacte++;
            }
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        //Activitati
        try 
        {
            DataInputStream fisier;
            fisier = new DataInputStream(new FileInputStream(act));
            user.setUsername(fisier.readUTF());
            user.setParola(fisier.readUTF());
            user.setNume(fisier.readUTF());
            user.setPrenume(fisier.readUTF());
            user.setTelefon(fisier.readUTF());
            user.setEmail(fisier.readUTF());
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        //Eveniment
        try 
        {
            DataInputStream fisier;
            fisier = new DataInputStream(new FileInputStream(eve));
            user.setUsername(fisier.readUTF());
            user.setParola(fisier.readUTF());
            user.setNume(fisier.readUTF());
            user.setPrenume(fisier.readUTF());
            user.setTelefon(fisier.readUTF());
            user.setEmail(fisier.readUTF());
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        return this;        
    }

    public Proprietar getUser() {
        return user;
    }

    public void setUser(Proprietar user) {
        this.user = user;
    }

    public Persoana[] getContacts() {
        return contacts;
    }

    public void setContacts(Persoana[] contacts) {
        this.contacts = contacts;
    }

    public Activitate[] getTasks() {
        return tasks;
    }

    public void setTasks(Activitate[] tasks) {
        this.tasks = tasks;
    }

    public Eveniment[] getEvents() {
        return events;
    }

    public void setEvents(Eveniment[] events) {
        this.events = events;
    }

}
