package com.example.napoleonitapp.feature.allEvents.presenter;

import java.lang.Override;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

public class AllEventsPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new AllEventsView$$State();
	}
}
