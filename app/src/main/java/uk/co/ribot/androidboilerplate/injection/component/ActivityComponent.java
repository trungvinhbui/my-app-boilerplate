package uk.co.vinhbpt.myappboilerplate.injection.component;

import dagger.Subcomponent;
import uk.co.vinhbpt.myappboilerplate.injection.PerActivity;
import uk.co.vinhbpt.myappboilerplate.injection.module.ActivityModule;
import uk.co.vinhbpt.myappboilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
