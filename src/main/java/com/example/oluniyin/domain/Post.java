package com.example.oluniyin.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -58390506078017532L;

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String title;

	@Column(columnDefinition = "TEXT")
	private String body;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	public Date postedOn;

	@Column(columnDefinition = "TEXT")
	private String teaser;

	private String slug;

	@ManyToOne
	@JoinColumn(name = "author_id")

	@JsonBackReference
	private Author author;

	@SuppressWarnings("unused")
	private Post() {

	}

	public Post(String title) {
		this.setTitle(title);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPosteOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", posteOn=" + postedOn + ", teaser=" + teaser
				+ ", slug=" + slug + ", author=" + author + "]";
	}

}
