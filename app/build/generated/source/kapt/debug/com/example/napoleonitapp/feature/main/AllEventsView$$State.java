package com.example.napoleonitapp.feature.main;

import com.example.napoleonitapp.data.Event;
import java.lang.Override;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SingleStateStrategy;

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
	public void openEventDetails(Event arg0) {
		OpenEventDetailsCommand openEventDetailsCommand = new OpenEventDetailsCommand(arg0);
		this.viewCommands.beforeApply(openEventDetailsCommand);

		if (hasNotView()) {
			return;
		}

		for (AllEventsView view : this.views) {
			view.openEventDetails(arg0);
		}

		this.viewCommands.afterApply(openEventDetailsCommand);
	}

	public class SetEventsCommand extends ViewCommand<AllEventsView> {
		public final List<Event> arg0;

		SetEventsCommand(List<Event> arg0) {
			super("setEvents", SingleStateStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.setEvents(arg0);
		}
	}

	public class OpenEventDetailsCommand extends ViewCommand<AllEventsView> {
		public final Event arg0;

		OpenEventDetailsCommand(Event arg0) {
			super("openEventDetails", OneExecutionStateStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(AllEventsView mvpView) {
			mvpView.openEventDetails(arg0);
		}
	}
}
