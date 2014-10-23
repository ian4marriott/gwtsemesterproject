package com.ianmarriott.gwtsemesterproject.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.client.presenters.PostPreviewPresenter;


public class PostPreviewView extends Composite implements PostPreviewPresenter.Display {
	private PostPreviewPresenter presenter;
	private static PostPreviewUiBinder uiBinder = GWT.create(PostPreviewUiBinder.class);
	
	interface PostPreviewUiBinder extends UiBinder<Widget, PostPreviewView> {
	}

	public PostPreviewView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField HeadingElement title;
	@UiField HeadingElement subtitle;
	@UiField AnchorElement author;
	@UiField SpanElement date;
	
	
	@Override
	public void setTitle(String title) {
		this.title.setInnerText(title);
	}

	@Override
	public void setSubtitle(String subtitle) {
		this.subtitle.setInnerText(subtitle);
	}

	@Override
	public void setDate(String date) {
		this.date.setInnerText(date);
	}

	@Override
	public void setAuthor(String author) {
		this.author.setInnerText(author);
	}

	@Override
	public void setPresenter(PostPreviewPresenter presenter) {
		this.presenter=presenter;
	}


}