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

	@Override
	public void goToLink(String arg0) {
		GoToLinkCommand goToLinkCommand = new GoToLinkCommand(arg0);
		this.viewCommands.beforeApply(goToLinkCommand);

		if (hasNotView()) {
			return;
		}

		for (EventDetailsView view : this.views) {
			view.goToLink(arg0);
		}

		this.viewCommands.afterApply(goToLinkCommand);
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

	public class GoToLinkCommand extends ViewCommand<EventDetailsView> {
		public final String arg0;

		GoToLinkCommand(String arg0) {
			super("goToLink", OneExecutionStateStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(EventDetailsView mvpView) {
			mvpView.goToLink(arg0);
		}
	}
}
