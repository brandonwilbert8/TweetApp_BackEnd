package com.tweetapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;


@Document("tweet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tweet {
	@Id
	private Integer tweetId;
	@Max(value = 144)
	@NotBlank(message = "tweet Cannot be Blank.please enter tweet ")
	@Pattern(regexp = "^[a-zA-Z0-9]")
	private String tweet;
	private String username;
	private Like like;
	private List<Reply> replies;
	private String tag;
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date createTweetDate;
}