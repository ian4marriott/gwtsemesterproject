package com.ianmarriott.gwtsemesterproject.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.taskdefs.Javadoc.Html;

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

public class About implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// Add Navbar
		Presenter navbar = new NavbarPresenter(new NavbarView());

		// Add Header
		Presenter header = new HeaderPresenter(new HeaderView());

		// Add Content
		String html = "<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe nostrum ullam eveniet pariatur voluptates odit, fuga atque ea nobis sit soluta odio, adipisci quas excepturi maxime quae totam ducimus consectetur</p>"
				+ "<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius praesentium recusandae illo eaque architecto error, repellendus iusto reprehenderit, doloribus, minus sunt. Numquam at quae voluptatum in officia voluptas voluptatibus, minus!</p>"
				+ "<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum molestiae debitis nobis, quod sapiente qui voluptatum, placeat magni repudiandae accusantium fugit quas labore non rerum possimus, corrupti enim modi! Et.</p>";
		ContentPresenter content = new ContentPresenter(html, new ContentView());

		// Add Footer
		Presenter footer = new FooterPresenter(new FooterView());

		navbar.go(RootPanel.get());
		header.go(RootPanel.get());
		content.go(RootPanel.get());
		footer.go(RootPanel.get());

	}

}
