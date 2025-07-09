package SingleTon;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static DBConnection instance;
    private static final Lock lock = new ReentrantLock(); // Create a static Lock

    private DBConnection() {
        // private constructor
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new DBConnection();
            }
            lock.unlock();
        }
        return instance;
    }
}
