// Singleton Pattern: ensures one instance and gives global access to it.

public class Service {
    // This class demonstrate the singleton desgin pattern
    // Volatile keyword ensures that multiple threads accessing thie value get the
    // updated record
    // https://naveen-metta.medium.com/understanding-transient-and-volatile-variables-in-java-2af7bc534bde#:~:text=The%20volatile%20keyword%20in%20Java,to%20thread%2Dspecific%20local%20copies.
    private static volatile Service instance = null;

    private Service() {
    }

    // Even though we have ensured there's one instance but multiple threads can
    // access it at same time causing trouble.
    // So we have to add syncronized to make sure each thread waits for it turn. But
    // synchronized is an expensive operation so should not make the whole
    // function syncronized. We only care about first time when object is created.
    public static Service getInstance() {
        // Here we can see if we never call getInstance, instance is not created. This
        // is called lazy instantiation.
        // Just make this synchronized 
        if (instance == null) {
            synchronized (Service.class) {
                if (instance == null) {
                    return new Service();
                }
            }
        }
        return instance;
    }

}