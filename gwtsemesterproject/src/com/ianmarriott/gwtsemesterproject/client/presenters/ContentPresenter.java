package com.ianmarriott.gwtsemesterproject.client.presenters;

import java.util.List;


import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.shared.Post;


public class ContentPresenter implements Presenter {
	List<Post> posts;
	Display view;
	
	public interface Display {
		public Widget asWidget();
		public void addPostPreview(Post post);
		public void addHtml(String html);
		public void setPresenter(ContentPresenter presenter);
	}
	
	public ContentPresenter(List<Post> posts, Display view) {
		this.posts = posts;
		this.view = view;
		bind();
		for(Post post: posts) {
			this.view.addPostPreview(post);
		}
		
	}
	
	public ContentPresenter(String html, Display view) {
		this.posts = posts;
		this.view = view;
		bind();
		this.view.addHtml(html);
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
