package com.example.napoleonitapp.feature.allEvents;

import com.example.napoleonitapp.data.dataClass.Event;
import java.lang.Override;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SingleStateStrategy;

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

	public class SetEventsCommand extends ViewCommand<AllEventsView> {
		public final List<Event> events;

		SetEventsCommand(List<Event> events) {
			super("setEvents", SingleStateStrategy.class);

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
}
