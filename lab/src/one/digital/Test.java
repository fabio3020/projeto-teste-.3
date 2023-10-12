package one.digital;

import one.digital.facade.Facade;
import one.digital.sigleton.SingletonEager;
import one.digital.sigleton.SingletonLazy;
import one.digital.sigleton.SingletonLazyHolder;
import one.digital.strategy.ComportamentoAgressivo;
import one.digital.strategy.ComportamentoDefensivo;
import one.digital.strategy.ComportamentoNormal;
import one.digital.strategy.Robo;

public class Test {
          
	public static void main(String[]args) {
		
		//Teste relacionado ao desing Pattern Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		//Strategy
		
	ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
	ComportamentoNormal normal = new ComportamentoNormal();
	ComportamentoAgressivo agressivo =new ComportamentoAgressivo();
	
	Robo robo = new Robo();
	robo.setComportamento(normal);
	robo.mover();
	robo.mover();
	robo.setComportamento(defensivo);                  
	robo.mover();
	robo.mover();
	robo.setComportamento(agressivo);                  
	robo.mover();
	robo.mover();
		
	// Facade
	
	Facade facade = new Facade();
	facade.migrarCliente("Fabio","65072130");
	
	
	}
}
