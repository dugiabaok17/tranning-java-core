package assignment02.Exercise2.com.vti.entity.exercise6;

import java.util.Scanner;

import assignment02.Exercise2.com.vti.utils.ScannerUtils;

public class News implements INews {
	private Scanner sc;
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;

	public News() {
		sc = new Scanner(System.in);
	}

	@Override
	public void display() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("content: "+content);
		System.out.println("publishDate: "+publishDate);
		
		System.out.println("--------------------");
	}
	

	public News(String title, String publishDate, String author, String content) {
		
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
	}

	@Override
	public float caculate(int[] arr) {
		float total = 0;
		for (int i : arr) {
			total+=i;
		}
		return total/3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

}
