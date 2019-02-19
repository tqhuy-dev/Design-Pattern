package singleton;
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StorageSingleton storage = StorageSingleton.getInstance();
        System.out.print(storage.getTitle());
    }
    
}
