package one.digital.sigleton;

/**
 * Singleton "apressado" .
 * 
 * @author fabio.nogueira
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
			
		}
	}

