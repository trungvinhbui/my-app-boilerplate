package uk.co.vinhbpt.myappboilerplate.ui.main;

import java.util.List;

import uk.co.vinhbpt.myappboilerplate.data.model.Ribot;
import uk.co.vinhbpt.myappboilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
