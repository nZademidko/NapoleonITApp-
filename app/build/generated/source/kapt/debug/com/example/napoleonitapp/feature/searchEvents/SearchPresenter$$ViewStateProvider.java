package com.example.napoleonitapp.feature.searchEvents;

import java.lang.Override;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

public class SearchPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new SearchView$$State();
	}
}
