package sample.guice.subpackage;

import com.google.inject.Inject;
import sample.guice.subpackage.test.ITester;
import sample.guice.subpackage.test.Test;

import java.util.stream.Stream;

public class SampleExecutor {

    private final SampleFactory _factory;

    @Inject
    public SampleExecutor(final SampleFactory factory){
        this._factory = factory;
    }

    public void execute(){
        Stream.of(Test.values()).map(this._factory::getTester).forEach(ITester::test);
    }
}
