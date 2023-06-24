package tw.idv.petpet.web.forum.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.idv.petpet.web.forum.entity.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Integer>{

//	ArticleComment findByArticleId(Integer articleId);

	List<ArticleComment> findByArticleId(Integer articleId);
	
	
}
