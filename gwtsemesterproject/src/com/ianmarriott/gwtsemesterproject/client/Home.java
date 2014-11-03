package com.ianmarriott.gwtsemesterproject.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.ianmarriott.gwtsemesterproject.client.presenters.FooterPresenter;

import com.ianmarriott.gwtsemesterproject.client.presenters.HeaderPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.NavbarPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.ContentPresenter;
import com.ianmarriott.gwtsemesterproject.client.presenters.Presenter;
import com.ianmarriott.gwtsemesterproject.client.views.FooterView;
import com.ianmarriott.gwtsemesterproject.client.views.NavbarView;
import com.ianmarriott.gwtsemesterproject.client.views.HeaderView;
import com.ianmarriott.gwtsemesterproject.client.views.ContentView;
import com.ianmarriott.gwtsemesterproject.shared.Post;

public class Home implements EntryPoint {

	@Override
	public void onModuleLoad() {
		//Add Navbar
		Presenter navbar = new NavbarPresenter( new NavbarView() );
		
		//Add Header
		Presenter header = new HeaderPresenter( new HeaderView() );
		
		//Add Content
		List<Post> posts = new ArrayList<Post>();
		posts.add(new Post("Title", "Subtitle", "Ian Marriott", "10/21/2014"));
		posts.add(new Post("Title", "Subtitle", "Ian Marriott", "10/21/2014"));
		Presenter content = new ContentPresenter(posts, new ContentView() );

		
		//Add Footer
		Presenter footer = new FooterPresenter(new FooterView());

		navbar.go(RootPanel.get());
		header.go(RootPanel.get());
		content.go(RootPanel.get());
		footer.go(RootPanel.get());

	}

}
