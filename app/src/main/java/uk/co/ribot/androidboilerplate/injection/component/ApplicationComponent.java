package uk.co.vinhbpt.myappboilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.vinhbpt.myappboilerplate.data.DataManager;
import uk.co.vinhbpt.myappboilerplate.data.SyncService;
import uk.co.vinhbpt.myappboilerplate.data.local.DatabaseHelper;
import uk.co.vinhbpt.myappboilerplate.data.local.PreferencesHelper;
import uk.co.vinhbpt.myappboilerplate.data.remote.RibotsService;
import uk.co.vinhbpt.myappboilerplate.injection.ApplicationContext;
import uk.co.vinhbpt.myappboilerplate.injection.module.ApplicationModule;
import uk.co.vinhbpt.myappboilerplate.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
