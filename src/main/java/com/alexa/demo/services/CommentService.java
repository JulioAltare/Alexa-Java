package com.alexa.demo.services;

import com.alexa.demo.models.Comment;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

  public List<Comment> addExampleComments(){
      Comment comment1 = new Comment();
      Comment comment2 = new Comment();
      comment1.setCreator("Pedro");
      comment1.setContent("Esto es un comentario hecho de ejemplo");
      comment2.setCreator("Amparo");
      comment2.setContent("Esto es un comentario hecho como ejemplo.");
      return Arrays.asList(
          comment1,comment2
      );
  }


}
