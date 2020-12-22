package com.example.napoleonitapp.feature.searchEvents;

import java.lang.Override;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.SkipStrategy;

public class SearchView$$State extends MvpViewState<SearchView> implements SearchView {
	@Override
	public void showCountFromError() {
		ShowCountFromErrorCommand showCountFromErrorCommand = new ShowCountFromErrorCommand();
		this.viewCommands.beforeApply(showCountFromErrorCommand);

		if (hasNotView()) {
			return;
		}

		for (SearchView view : this.views) {
			view.showCountFromError();
		}

		this.viewCommands.afterApply(showCountFromErrorCommand);
	}

	@Override
	public void showCountToError() {
		ShowCountToErrorCommand showCountToErrorCommand = new ShowCountToErrorCommand();
		this.viewCommands.beforeApply(showCountToErrorCommand);

		if (hasNotView()) {
			return;
		}

		for (SearchView view : this.views) {
			view.showCountToError();
		}

		this.viewCommands.afterApply(showCountToErrorCommand);
	}

	@Override
	public void backToMainFragment(RbTYPE rbTYPE) {
		BackToMainFragmentCommand backToMainFragmentCommand = new BackToMainFragmentCommand(rbTYPE);
		this.viewCommands.beforeApply(backToMainFragmentCommand);

		if (hasNotView()) {
			return;
		}

		for (SearchView view : this.views) {
			view.backToMainFragment(rbTYPE);
		}

		this.viewCommands.afterApply(backToMainFragmentCommand);
	}

	public class ShowCountFromErrorCommand extends ViewCommand<SearchView> {
		ShowCountFromErrorCommand() {
			super("showCountFromError", SkipStrategy.class);
		}

		@Override
		public void apply(SearchView mvpView) {
			mvpView.showCountFromError();
		}
	}

	public class ShowCountToErrorCommand extends ViewCommand<SearchView> {
		ShowCountToErrorCommand() {
			super("showCountToError", SkipStrategy.class);
		}

		@Override
		public void apply(SearchView mvpView) {
			mvpView.showCountToError();
		}
	}

	public class BackToMainFragmentCommand extends ViewCommand<SearchView> {
		public final RbTYPE rbTYPE;

		BackToMainFragmentCommand(RbTYPE rbTYPE) {
			super("backToMainFragment", SkipStrategy.class);

			this.rbTYPE = rbTYPE;
		}

		@Override
		public void apply(SearchView mvpView) {
			mvpView.backToMainFragment(rbTYPE);
		}
	}
}
