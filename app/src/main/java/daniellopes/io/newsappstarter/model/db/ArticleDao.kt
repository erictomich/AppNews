package daniellopes.io.newsappstarter.model.db

import androidx.room.*
import daniellopes.io.newsappstarter.model.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateInsert(article: Article)

    @Query("SELECT * FROM articles")
    fun getAll(): List<Article>

    @Delete
    fun delete(article: Article)
}