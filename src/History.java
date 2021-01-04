import java.util.Arrays;

public class History {
    private Client[] clients;
    History(){
        clients=new Client[0];
    }
    public void add(Client client){
        clients= Arrays.copyOf(clients, clients.length+1);
        clients[clients.length-1]=client;

    }
    public Client find(String name){
        for (int i=0;i<clients.length;i++){
            if(clients[i].getName().equals(name)) return clients[i];
        }
        Client client=new Client(0,0,"NO MATCH");
        return client;
    }
    public int lents(){
        return clients.length;
    }

}
