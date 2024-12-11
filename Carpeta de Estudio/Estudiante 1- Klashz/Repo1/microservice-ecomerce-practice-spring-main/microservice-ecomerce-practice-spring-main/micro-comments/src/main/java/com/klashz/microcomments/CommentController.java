package com.klashz.microcomments;

import com.klashz.microcomments.client.UserClient;
import com.klashz.microcomments.dto.CommentDtoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserClient userClient;


    @PostMapping("/create")
    public void createComment(@RequestBody CommentEntity comment) {
        LocalDateTime NOW = LocalDateTime.now();
        comment.setLocalDateTime(NOW);
        commentRepository.save(comment);
    }
    @GetMapping("all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<CommentDtoUser> getAllComments() {
        List<CommentDtoUser> commentDtoUsers = commentRepository.findAll()
                .stream()
                .map( commentEntity -> {
                    CommentDtoUser commentDtoUser = new CommentDtoUser();
                    commentDtoUser.setId(commentEntity.getId());
                    commentDtoUser.setUser(userClient.findById(commentEntity.getIdOwner()).get());
                    commentDtoUser.setMessage(commentEntity.getMessage());
                    commentDtoUser.setLocalDateTime(commentEntity.getLocalDateTime());
                    return commentDtoUser;
                }).toList();
        return commentDtoUsers;
    }

    @GetMapping("/p/{idProduct}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<CommentDtoUser> getCommentsByIdProduct(@PathVariable Long idProduct) {
        return commentRepository.findCommentEntityByIdProduct(idProduct).stream()
                .map(commentEntity -> {
                    CommentDtoUser commentDtoUser = new CommentDtoUser();
                    commentDtoUser.setId(commentEntity.getId());
                    commentDtoUser.setUser(userClient.findById(commentEntity.getIdOwner()).get());
                    commentDtoUser.setMessage(commentEntity.getMessage());
                    commentDtoUser.setLocalDateTime(commentEntity.getLocalDateTime());
                    return commentDtoUser;
                }).toList();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CommentEntity> updateComment(@PathVariable Long id, @RequestBody CommentEntity comment) {
        Optional<CommentEntity> commentEntity = commentRepository.findById(id);
        if (commentEntity.isPresent()) {
            CommentEntity newDatacommentEntity = commentEntity.get();
            LocalDateTime NOW = LocalDateTime.now();
            newDatacommentEntity.setLocalDateTime(NOW);
            newDatacommentEntity.setMessage(comment.getMessage());
            newDatacommentEntity.setIdProduct(comment.getIdProduct());
            newDatacommentEntity.setIdOwner(comment.getIdOwner());
            commentRepository.save(newDatacommentEntity);
            return ResponseEntity.ok(newDatacommentEntity);
        }
        return ResponseEntity.notFound().build();
    }
    @PatchMapping("/patch/{id}/owner/{idOwner}")
    public ResponseEntity<CommentEntity> patchComment(@PathVariable Long id,@PathVariable Long idOwner) {
        Optional<CommentEntity> commentEntity = commentRepository.findById(id);
        if (commentEntity.isPresent()) {
            CommentEntity newDatacommentEntity = commentEntity.get();
            newDatacommentEntity.setIdOwner(idOwner);
            commentRepository.save(newDatacommentEntity);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getComment(@PathVariable long id) {
        Optional<CommentEntity> comment = commentRepository.findById(id);
        return comment.map(commentEntity -> {
            CommentDtoUser commentDtoUser = new CommentDtoUser();
            commentDtoUser.setId(commentEntity.getId());
            commentDtoUser.setUser(userClient.findById(commentEntity.getIdOwner()).get());
            commentDtoUser.setMessage(commentEntity.getMessage());
            commentDtoUser.setLocalDateTime(commentEntity.getLocalDateTime());
            return ResponseEntity.ok(commentDtoUser);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteComment(@PathVariable long id) {
        commentRepository.deleteById(id);
    }
}
