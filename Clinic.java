import java.util.ArrayList;

/**
 * Created by ������������� on 29.03.2018.
 * ����� ��������� �������
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */
public class Clinic {

    /*
    * ������ ��������
    */
    private final Client[] clients;

    /*
   * �����������.
   * @param size ������ ������� ���-�� ��������
   */
    public Clinic(final int size) {
        this.clients = new Client[size];
    }


    /*
    * �������� �������.
    * @param position �������
    * @param client ������
    */
    public void addClient(final int position,final Client client){
        this.clients[position] = client;
    }


    /*
    * ����� �� ����� �������
    * @param name ��� �������
    */
    public ArrayList<Pet> findClientsByPetName(final String name){
        ArrayList<Pet> result = new ArrayList<>();
        for (int i = 0; i < clients.length - 1; i++) {
            Pet pet = clients[i].getPet();
            if (pet.getName().equals(name)){
                result.add(pet);
            }
        }
        return result;
    }

    /*
    * ����� �� ����� �������
    * @param name ��� �������
    */
    public Client findClientByName(final String name){
        Client client = new Client();
        for (int i = 0; i < clients.length - 1; i++) {
            if (clients[i].getName().equals(name)){
                client = clients[i];
            }
        }
        return client;
    }

    /*
    * �������� ������� �� �����
    * @param name ��� �������
    */
    public void removeClient(final String name){
        for (int i = 0; i < clients.length - 1; i++) {
            if (clients[i].getName().equals(name)){
                clients[i] = null;
            }
        }
    }

}

