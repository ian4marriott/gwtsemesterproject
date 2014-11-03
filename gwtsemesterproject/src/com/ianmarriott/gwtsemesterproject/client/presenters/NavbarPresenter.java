package com.ianmarriott.gwtsemesterproject.client.presenters;


import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;


public class NavbarPresenter implements Presenter {
	Display view;
	
	public interface Display {
		public Widget asWidget();
		public void setPresenter(NavbarPresenter presenter);
	}
	
	public NavbarPresenter(Display view) {
		this.view = view;
		bind();
	}
	
	@Override
	public void bind() {
		view.setPresenter(this);
	}

	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());
	}
	
	

}
