package DI_06_Spring;

public class MySQLArticleDao implements ArticleDao {
  @Override
  public void insert(Article article) {
    System.out.println("MySQL INSERT 구문 실행");
  }
}
