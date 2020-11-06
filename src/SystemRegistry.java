// A computer has many system files and registries,
// but there is only one system registry file.
class SystemRegistry {

    // The unique instance of the singleton object
    private static SystemRegistry _instance;

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private SystemRegistry() {
        ; // Do nothing
    }

    // Synchronized initialization in singletons works by locking the getInstance method
    // from additional threads requesting access to the method while a single thread
    // is already executing the getInstance method.
    // This approach provides a thread-safe implementation of the singleton pattern,
    // and prevents that multiple instances of the singleton are created which would break the pattern.
    // It is considered however, to be resource-intensive and unnecessary overhead,
    // as the method will be locked on every access request even after the creation
    // of the unique instance of the singleton, ultimately leading to a slow performance.
    public static synchronized SystemRegistry getInstance() { // Providing the singleton with a synchronized initialization
        // If the singleton has not been instantiated before create the unique instance
        if (_instance == null) {
            _instance = new SystemRegistry();
        }
        // Return the singleton static instance
        return _instance;
    }

    // Other useful methods of the system registry singleton
    void writeEntry() {}

    void deleteEntry() {}

    void backupRegistry() {}
}