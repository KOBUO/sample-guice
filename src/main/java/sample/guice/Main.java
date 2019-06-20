package sample.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import sample.guice.subpackage.SampleExecutor;
import sample.guice.subpackage.singleton.Hello;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                this.bind(Hello.class).toInstance(new Hello("World"));
            }
        });
        injector.getInstance(SampleExecutor.class).execute();
        System.exit(0);
    }
}
