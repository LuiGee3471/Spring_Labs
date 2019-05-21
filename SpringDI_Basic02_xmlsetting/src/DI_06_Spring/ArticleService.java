package DI_06_Spring;

public class ArticleService {
  private ArticleDao articleDao;

  public ArticleService(ArticleDao articleDao) {
    this.articleDao = articleDao;
    System.out.println("ArticleService 생성자 함수 호출");
  }
  // 각각 서비스
  // 글쓰기 서비스
  public void write(Article article) {
    articleDao.insert(article);
  }
  // 글 목록보기 서비스
  // 수정하기 서비스
}
