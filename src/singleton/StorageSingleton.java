package singleton;

/**
 *
 * @author DELL
 */
public class StorageSingleton {
    private static StorageSingleton instance = new StorageSingleton();
    
    private StorageSingleton(){}
    
    public static StorageSingleton getInstance(){
        return instance;
    }
    
    public String title = "Hello World";
    
    public String getTitle(){
        return this.title;
    }
}
