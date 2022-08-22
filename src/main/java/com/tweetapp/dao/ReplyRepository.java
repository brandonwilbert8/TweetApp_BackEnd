package com.tweetapp.dao;

import com.tweetapp.entities.Reply;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReplyRepository extends MongoRepository<Reply,Integer> {

}
