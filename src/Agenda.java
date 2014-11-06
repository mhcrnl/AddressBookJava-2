import java.io.*;

public class Agenda
{
    private Proprietar user;
    private Persoana[] contacts;
    private Activitate[] tasks;
    private Eveniment[] events;

    public Agenda loadFromFile ()
    {
        String[] l = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./paths.txt"));
            String line;
            int nr = 0;

            try {
                while (( line = br.readLine() ) != null)
                {
                    l[nr] = line; // Proprietar, Persoane, Activitati, Evenimente 
                }
            } catch (IOException e) 
                {
                System.out.println("Could not read from the config file!");
                System.exit(2);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Config file does not exists.");
            System.exit(1);
        }
        
        try //Proprietar
        {
            BufferedReader br;
            br = new BufferedReader(new FileReader(l[0]));
            
            try
            {
                this.user.setUsername(br.readLine());
                this.user.setParola(br.readLine());
                this.user.setNume(br.readLine());
                this.user.setPrenume(br.readLine());
                this.user.setTelefon(br.readLine());
                this.user.setEmail(br.readLine());
            } catch (IOException e) 
                {
                System.out.println("Could not read from the config file!");
                System.exit(2);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Config file does not exists.");
            System.exit(1);
            
        }
        
        try //Persoane
        {
            BufferedReader br;
            br = new BufferedReader(new FileReader(l[1]));
            String line;
            try
            {
                int i = 0, nr = 0;
                while ((line = br.readLine()) != null)
                {
                    i = i%4;
                    if (i == 0)
                        contacts[nr].setNume(line);
                    if (i == 1)
                        contacts[nr].setPrenume(line);
                    if (i == 2)
                        contacts[nr].setTelefon(line);
                    else
                        contacts[nr].setEmail(line);
                    i++;
                    nr++;
                }
            } catch (IOException e) 
                {
                System.out.println("Could not read from the config file!");
                System.exit(2);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Config file does not exists.");
            System.exit(1);
            
        }
        
        try //Activitati (!)
        {
            BufferedReader br;
            br = new BufferedReader(new FileReader(l[2]));
            String line;
            try
            {
                int i = 0, nr = 0;
                while ((line = br.readLine()) != null)
                {
                    i = i%7;
                    if (i == 0)
                        tasks[nr].setDenumire(line);
                    if (i == 1)
                        tasks[nr].setLocatie(line);
                    if (i == 2)
                        tasks[nr].setData(0, 0, 0); ///gotta figure out
                    else
                        tasks[nr].setRepetitie(line); ///gotta figure out
                    i++;
                    nr++;
                }
            } catch (IOException e) 
                {
                System.out.println("Could not read from the config file!");
                System.exit(2);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Config file does not exists.");
            System.exit(1);
            
        }
        
        try //Evenimente (!)
        {
            BufferedReader br;
            br = new BufferedReader(new FileReader(l[3]));
            String line;
            try
            {
                int i = 0, nr = 0;
                while ((line = br.readLine()) != null)
                {
                    i = i%4;
                    if (i == 0)
                        contacts[nr].setNume(line);
                    if (i == 1)
                        contacts[nr].setPrenume(line);
                    if (i == 2)
                        contacts[nr].setTelefon(line);
                    else
                        contacts[nr].setEmail(line);
                    i++;
                    nr++;
                }
            } catch (IOException e) 
                {
                System.out.println("Could not read from the config file!");
                System.exit(2);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Config file does not exists.");
            System.exit(1);
            
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
