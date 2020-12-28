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
	public void setEvents(List<Event> events) {
		SetEventsCommand setEventsCommand = new SetEventsCommand(events);
		this.viewCommands.beforeApply(setEventsCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.setEvents(events);
		}

		this.viewCommands.afterApply(setEventsCommand);
	}

	@Override
	public void openDetailEvent(Event event) {
		OpenDetailEventCommand openDetailEventCommand = new OpenDetailEventCommand(event);
		this.viewCommands.beforeApply(openDetailEventCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.openDetailEvent(event);
		}

		this.viewCommands.afterApply(openDetailEventCommand);
	}

	@Override
	public void showLoading(boolean isShow) {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand(isShow);
		this.viewCommands.beforeApply(showLoadingCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.showLoading(isShow);
		}

		this.viewCommands.afterApply(showLoadingCommand);
	}

	@Override
	public void setFindDialog(SettingsEvent settingsEvent) {
		SetFindDialogCommand setFindDialogCommand = new SetFindDialogCommand(settingsEvent);
		this.viewCommands.beforeApply(setFindDialogCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.setFindDialog(settingsEvent);
		}

		this.viewCommands.afterApply(setFindDialogCommand);
	}

	public class SetEventsCommand extends ViewCommand<AllEventsView> {
		public final List<Event> events;

		SetEventsCommand(List<Event> events) {
			super("setEvents", AddToEndSingleStrategy.class);

			this.events = events;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.setEvents(events);
		}
	}

	public class OpenDetailEventCommand extends ViewCommand<AllEventsView> {
		public final Event event;

		OpenDetailEventCommand(Event event) {
			super("openDetailEvent", OneExecutionStateStrategy.class);

			this.event = event;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.openDetailEvent(event);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<AllEventsView> {
		public final boolean isShow;

		ShowLoadingCommand(boolean isShow) {
			super("showLoading", AddToEndSingleStrategy.class);

			this.isShow = isShow;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.showLoading(isShow);
		}
	}

	public class SetFindDialogCommand extends ViewCommand<AllEventsView> {
		public final SettingsEvent settingsEvent;

		SetFindDialogCommand(SettingsEvent settingsEvent) {
			super("setFindDialog", OneExecutionStateStrategy.class);

			this.settingsEvent = settingsEvent;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.setFindDialog(settingsEvent);
		}
	}
}
