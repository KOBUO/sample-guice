package sample.guice.subpackage.test.impl;

import com.google.inject.Inject;
import sample.guice.subpackage.singleton.Hello;
import sample.guice.subpackage.test.ITester;

public class Sample1Tester implements ITester {

    private final Hello _hello;

    @Inject
    public Sample1Tester(Hello hello){
        this._hello = hello;
    }

    @Override
    public void test() {
        this._hello.message();
    }
}
