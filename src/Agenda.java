import java.io.*;

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
        try {
            BufferedReader br = new BufferedReader(new FileReader("./paths.txt"));
            String line;

            try {
                while (( line = br.readLine() ) != null){
                    System.out.println("This fucker, right here " + line);
                }
            } catch (IOException e) {
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
