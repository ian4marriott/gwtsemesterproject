package com.ianmarriott.gwtsemesterproject.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.client.presenters.HeaderPresenter;

public class HeaderView extends Composite implements HeaderPresenter.Display {
	private HeaderPresenter presenter;

	private static HeaderViewUiBinder uiBinder = GWT.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}

	public HeaderView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(HeaderPresenter presenter) {
		this.presenter=presenter;
	}

}
