package com.ianmarriott.gwtsemesterproject.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.client.presenters.NavbarPresenter;

public class NavbarView extends Composite  implements NavbarPresenter.Display {
	private NavbarPresenter presenter;
	private static NavbarViewUiBinder uiBinder = GWT.create(NavbarViewUiBinder.class);

	interface NavbarViewUiBinder extends UiBinder<Widget, NavbarView> {
	}

	public NavbarView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(NavbarPresenter presenter) {
		this.presenter = presenter;
	}
}

