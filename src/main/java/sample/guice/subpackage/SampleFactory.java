package sample.guice.subpackage;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Injector;
import sample.guice.subpackage.test.ITester;
import sample.guice.subpackage.test.Test;
import sample.guice.subpackage.test.impl.Sample1Tester;
import sample.guice.subpackage.test.impl.Sample2Tester;
import sample.guice.subpackage.test.impl.Sample3Tester;

public class SampleFactory {

    private final Injector _injector;

    @Inject
    public SampleFactory(Injector injector) {
        this._injector = injector;
    }

    ITester getTester(Test test) {

        Injector injector = this._injector.createChildInjector(new AbstractModule() {
            @Override
            protected void configure() {
//                bind(Hello.class).toInstance(new Hello("SubWorld"));
            }
        });

        switch (test) {
            case SAMPLE1:
                return injector.getInstance(Sample1Tester.class);
            case SAMPLE2:
                return injector.getInstance(Sample2Tester.class);
            case SAMPLE3:
                return injector.getInstance(Sample3Tester.class);
            default:
                throw new IllegalArgumentException();
        }
    }
}
