package com.goldenstudios.topic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topic {

	private String id;
	private String name;
	private String description;

	public Topic() {
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
