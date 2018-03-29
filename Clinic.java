import java.util.ArrayList;

/**
 * Created by Администратор on 29.03.2018.
 * Класс описывает клинику
 * @author Gurfinkel Mikhail
 * @since 28.03.2018
 */
public class Clinic {

    /*
    * Список клиентов
    */
    private final Client[] clients;

    /*
   * Конструктор.
   * @param size Размер массива кол-ва клиентов
   */
    public Clinic(final int size) {
        this.clients = new Client[size];
    }


    /*
    * Добавить клиента.
    * @param position позиция
    * @param client клиент
    */
    public void addClient(final int position,final Client client){
        this.clients[position] = client;
    }


    /*
    * Поиск по имени питомца
    * @param name имя питомца
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
    * Поиск по имени клиента
    * @param name имя клиента
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
    * Удаление клиента по имени
    * @param name имя клиента
    */
    public void removeClient(final String name){
        for (int i = 0; i < clients.length - 1; i++) {
            if (clients[i].getName().equals(name)){
                clients[i] = null;
            }
        }
    }

}

