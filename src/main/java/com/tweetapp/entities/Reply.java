package com.tweetapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("reply")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String replyTweetId;
    private String tweetId;
    @Max(value = 144)
    @NotBlank(message = "reply tweet Cannot be Blank. please enter tweet")
    @Pattern(regexp = "^[a-zA-Z0-9]")
    private String replyTweet;
    private String username;
    private Like like;
    private List<Reply> replies;
    @Max(value = 50)
    private String tag;
    private String postedReplyDate;
    private String postedReplyTime;
}
