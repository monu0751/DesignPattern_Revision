package DesignPattern.Singleton;

public class Database {
    private static Database instance = null;
    private Database() {

    }

    public static Database getDatabaseInstance(){
        if(instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance = new Database();
                }
            }
        }

        return instance;
    }

}
