package com.example.napoleonitapp.feature.allEvents.presenter;

import com.example.napoleonitapp.data.dataClass.Event;
import com.example.napoleonitapp.data.dataClass.SettingsEvent;
import java.lang.Override;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

public class AllEventsView$$State extends MvpViewState<AllEventsView> implements AllEventsView {
	@Override
	public void setEvents(List<Event> arg0) {
		SetEventsCommand setEventsCommand = new SetEventsCommand(arg0);
		this.viewCommands.beforeApply(setEventsCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.setEvents(arg0);
		}

		this.viewCommands.afterApply(setEventsCommand);
	}

	@Override
	public void openDetailEvent(Event arg0) {
		OpenDetailEventCommand openDetailEventCommand = new OpenDetailEventCommand(arg0);
		this.viewCommands.beforeApply(openDetailEventCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.openDetailEvent(arg0);
		}

		this.viewCommands.afterApply(openDetailEventCommand);
	}

	@Override
	public void showLoading(boolean arg0) {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand(arg0);
		this.viewCommands.beforeApply(showLoadingCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.showLoading(arg0);
		}

		this.viewCommands.afterApply(showLoadingCommand);
	}

	@Override
	public void setFindDialog(SettingsEvent arg0) {
		SetFindDialogCommand setFindDialogCommand = new SetFindDialogCommand(arg0);
		this.viewCommands.beforeApply(setFindDialogCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.setFindDialog(arg0);
		}

		this.viewCommands.afterApply(setFindDialogCommand);
	}

	public class SetEventsCommand extends ViewCommand<AllEventsView> {
		public final List<Event> arg0;

		SetEventsCommand(List<Event> arg0) {
			super("setEvents", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.setEvents(arg0);
		}
	}

	public class OpenDetailEventCommand extends ViewCommand<AllEventsView> {
		public final Event arg0;

		OpenDetailEventCommand(Event arg0) {
			super("openDetailEvent", OneExecutionStateStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.openDetailEvent(arg0);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<AllEventsView> {
		public final boolean arg0;

		ShowLoadingCommand(boolean arg0) {
			super("showLoading", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.showLoading(arg0);
		}
	}

	public class SetFindDialogCommand extends ViewCommand<AllEventsView> {
		public final SettingsEvent arg0;

		SetFindDialogCommand(SettingsEvent arg0) {
			super("setFindDialog", OneExecutionStateStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.setFindDialog(arg0);
		}
	}
}
