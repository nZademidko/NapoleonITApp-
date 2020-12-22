package com.example.napoleonitapp.feature.detailEvents;

import com.example.napoleonitapp.data.dataClass.Event;
import java.lang.Override;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;

public class EventDetailsView$$State extends MvpViewState<EventDetailsView> implements EventDetailsView {
	@Override
	public void setEvent(Event event) {
		SetEventCommand setEventCommand = new SetEventCommand(event);
		this.viewCommands.beforeApply(setEventCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.setEvent(event);
		}

		this.viewCommands.afterApply(setEventCommand);
	}

	@Override
	public void setIsInElected(boolean isInElected) {
		SetIsInElectedCommand setIsInElectedCommand = new SetIsInElectedCommand(isInElected);
		this.viewCommands.beforeApply(setIsInElectedCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.setIsInElected(isInElected);
		}

		this.viewCommands.afterApply(setIsInElectedCommand);
	}

	public class SetEventCommand extends ViewCommand<EventDetailsView> {
		public final Event event;

		SetEventCommand(Event event) {
			super("setEvent", AddToEndSingleStrategy.class);

			this.event = event;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.setEvent(event);
		}
	}

	public class SetIsInElectedCommand extends ViewCommand<EventDetailsView> {
		public final boolean isInElected;

		SetIsInElectedCommand(boolean isInElected) {
			super("setIsInElected", AddToEndSingleStrategy.class);

			this.isInElected = isInElected;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.setIsInElected(isInElected);
		}
	}
}
