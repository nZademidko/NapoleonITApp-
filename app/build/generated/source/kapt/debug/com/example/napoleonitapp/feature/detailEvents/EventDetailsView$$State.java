package com.example.napoleonitapp.feature.detailEvents;

import com.example.napoleonitapp.data.dataClass.Event;
import java.lang.Override;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;

public class EventDetailsView$$State extends MvpViewState<EventDetailsView> implements EventDetailsView {
	@Override
	public void setEvent(Event arg0) {
		SetEventCommand setEventCommand = new SetEventCommand(arg0);
		this.viewCommands.beforeApply(setEventCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.setEvent(arg0);
		}

		this.viewCommands.afterApply(setEventCommand);
	}

	@Override
	public void setIsInElected(boolean arg0) {
		SetIsInElectedCommand setIsInElectedCommand = new SetIsInElectedCommand(arg0);
		this.viewCommands.beforeApply(setIsInElectedCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.setIsInElected(arg0);
		}

		this.viewCommands.afterApply(setIsInElectedCommand);
	}

	public class SetEventCommand extends ViewCommand<EventDetailsView> {
		public final Event arg0;

		SetEventCommand(Event arg0) {
			super("setEvent", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.setEvent(arg0);
		}
	}

	public class SetIsInElectedCommand extends ViewCommand<EventDetailsView> {
		public final boolean arg0;

		SetIsInElectedCommand(boolean arg0) {
			super("setIsInElected", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.setIsInElected(arg0);
		}
	}
}
