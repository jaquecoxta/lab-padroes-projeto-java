package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        // Teste Singleton
        testSingleton();

        // Teste Strategy
        testStrategy();

        // Teste Facade
        testFacade();
    }

    private static void testSingleton() {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Instância Singleton Lazy: " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Instância Singleton Eager: " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Instância Singleton Lazy Holder: " + lazyHolder);
    }

    private static void testStrategy() {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        for (int i = 0; i < 6; i++) {
            robo.mover();
        }
    }

    private static void testFacade() {
        Facade facade = new Facade();
        facade.migrarCliente("Jaqueline", "14801788");
    }
}
