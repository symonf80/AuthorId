package dto

data class PostWithAuthorAndComment (
    val postAuthor: PostWithAuthor,
    val commentsAuthor: List<CommentsWithAuthors>
)

