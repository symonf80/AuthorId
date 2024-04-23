package dto

data class CommentsWithAuthors(
    val comment: Author,
    val author: Comment
)