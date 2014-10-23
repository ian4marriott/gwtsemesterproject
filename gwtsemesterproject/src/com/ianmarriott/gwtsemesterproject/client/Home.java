package com.ianmarriott.gwtsemesterproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.ianmarriott.gwtsemesterproject.client.presenters.PostPreviewPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.PostPreviewPresenter.Display;
import com.ianmarriott.gwtsemesterproject.client.presenters.Presenter;
import com.ianmarriott.gwtsemesterproject.client.views.PostPreviewView;
import com.ianmarriott.gwtsemesterproject.shared.Post;

public class Home implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Post post = new Post("Title", "Subtitle", "Ian Marriott", "10/21/2014");
		Display view = new PostPreviewView();
		Presenter postpreview = new PostPreviewPresenter(post, view);
		postpreview.go(RootPanel.get());

	}

}
