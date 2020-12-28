package com.example.napoleonitapp.feature.detailEvents.presenter;

import com.example.napoleonitapp.data.dataClass.Event;
import java.lang.Override;
import java.lang.String;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

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

	@Override
	public void goToLink(String url) {
		GoToLinkCommand goToLinkCommand = new GoToLinkCommand(url);
		this.viewCommands.beforeApply(goToLinkCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.goToLink(url);
		}

		this.viewCommands.afterApply(goToLinkCommand);
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

	public class GoToLinkCommand extends ViewCommand<EventDetailsView> {
		public final String url;

		GoToLinkCommand(String url) {
			super("goToLink", OneExecutionStateStrategy.class);

			this.url = url;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.goToLink(url);
		}
	}
}
