package uk.co.vinhbpt.myappboilerplate.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.vinhbpt.myappboilerplate.injection.component.ApplicationComponent;
import uk.co.vinhbpt.myappboilerplate.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
