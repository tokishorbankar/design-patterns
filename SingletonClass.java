
/**
* Singleton 
*/
import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable  {
	
	private static volatile SingletonClass _Instance;

	//private constructor.
    private SingletonClass(){
	
	 //Prevent form the reflection api.
        if (_Instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
	}

	/**
	* 
	*/
	public static SingletonClass getInstance(){
	
	//if there is no instance available... create new one
		if (_Instance == null){ 
             synchronized (SingletonClass.class) {   //Check for the second time.
              //if there is no instance available... create new one
              if (_Instance == null) _Instance = new SingletonClass();
            }
        }
	return _Instance;
	}



	/* Restrict serialize and deserialize of object */
	@Override
    protected SingletonClass readResolve() {
        return getInstance();
    }

	/* Restrict cloning of object */ 
	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("Clone not suuproted");
	}
}  

