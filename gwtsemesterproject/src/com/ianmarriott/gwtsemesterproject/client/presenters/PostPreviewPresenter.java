package com.ianmarriott.gwtsemesterproject.client.presenters;

import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.ianmarriott.gwtsemesterproject.shared.Post;


public class PostPreviewPresenter implements Presenter {
	Post post;
	Display view;
	
	public interface Display {
		public Widget asWidget();
		public void setTitle(String title);
		public void setSubtitle(String subtitle);
		public void setDate(String postDate);
		public void setAuthor(String author);
		public void setPresenter(PostPreviewPresenter presenter);
	}
	
	public PostPreviewPresenter(Post post, Display view) {
		this.post = post;
		this.view = view;
		bind();
		view.setTitle(post.getTitle());
		view.setSubtitle(post.getSubtitle());
		view.setAuthor(post.getAuthor());
		view.setDate(post.getDate() );
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
