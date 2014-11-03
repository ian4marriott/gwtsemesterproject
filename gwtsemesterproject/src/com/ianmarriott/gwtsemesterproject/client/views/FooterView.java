package com.ianmarriott.gwtsemesterproject.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.client.presenters.FooterPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.HeaderPresenter;

public class FooterView extends Composite implements FooterPresenter.Display {
	private FooterPresenter presenter;

	private static FooterViewUiBinder uiBinder = GWT
			.create(FooterViewUiBinder.class);

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}

	public FooterView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(FooterPresenter presenter) {
		this.presenter =presenter;
	}

}
