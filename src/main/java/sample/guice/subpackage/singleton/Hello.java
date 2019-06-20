package sample.guice.subpackage.singleton;

import javax.inject.Singleton;

@Singleton
public class Hello {

    private final String _name;

    public Hello(String name){
        System.out.println("constructor is Hello");
        this._name = name;
    }

    public void message(){
        System.out.println(String.format("Hello %s", this._name));
    }
}
