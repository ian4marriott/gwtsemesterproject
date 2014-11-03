package com.ianmarriott.gwtsemesterproject.client.views;

import org.apache.tools.ant.taskdefs.Javadoc.Html;
import org.gwtbootstrap3.client.ui.Column;
import org.gwtbootstrap3.client.ui.html.Hr;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.client.presenters.ContentPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.PostPreviewPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.PostPreviewPresenter.Display;
import com.ianmarriott.gwtsemesterproject.client.presenters.Presenter;
import com.ianmarriott.gwtsemesterproject.shared.Post;

public class ContentView extends Composite implements ContentPresenter.Display {
	private ContentPresenter presenter;
	private static ContentViewUiBinder uiBinder = GWT.create(ContentViewUiBinder.class);
	
	interface ContentViewUiBinder extends UiBinder<Widget, ContentView> {
	}

	public ContentView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Column content;


	@Override
	public void setPresenter(ContentPresenter presenter) {
		this.presenter=presenter;
		
	}

	@Override
	public void addPostPreview(Post post) {
		Display view = new PostPreviewView();
		Presenter postpreview = new PostPreviewPresenter(post, view);
	    postpreview.go(content);
	    content.add(new Hr());
	}

	@Override
	public void addHtml(String html) {
		HTMLPanel htmlpanel  = new HTMLPanel(html);
	    content.add(htmlpanel.asWidget());
		
	}

	
}