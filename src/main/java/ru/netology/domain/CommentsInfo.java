package ru.netology.domain;

public class CommentsInfo {

    private int count; //число комментов
    private String next_commentsInfo; // следующий комментарий
    private String past_CommentsInfo; //показать прошлый комментарий
    private boolean can_Comment; //может ли пользователь откомментировать запись
    private boolean like_Comment; //может ли пользователь лайкнуть комментарий

    private boolean can_OpenComments; //может ли пользователь открыть все комментарии
    private boolean can_CloseComments; //может ли пользователь закрыть комментарии к записи
    private boolean can_GroupsComment; //могут ли сообщества комментировать запись

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext_commentsInfo() {
        return next_commentsInfo;
    }

    public void setNext_commentsInfo(String next_commentsInfo) {
        this.next_commentsInfo = next_commentsInfo;
    }

    public String getPast_CommentsInfo() {
        return past_CommentsInfo;
    }

    public void setPast_CommentsInfo(String past_CommentsInfo) {
        this.past_CommentsInfo = past_CommentsInfo;
    }

    public boolean isCan_Comment() {
        return can_Comment;
    }

    public void setCan_Comment(boolean can_Comment) {
        this.can_Comment = can_Comment;
    }

    public boolean isLike_Comment() {
        return like_Comment;
    }

    public void setLike_Comment(boolean like_Comment) {
        this.like_Comment = like_Comment;
    }

    public boolean isCan_OpenComments() {
        return can_OpenComments;
    }

    public void setCan_OpenComments(boolean can_OpenComments) {
        this.can_OpenComments = can_OpenComments;
    }

    public boolean isCan_CloseComments() {
        return can_CloseComments;
    }

    public void setCan_CloseComments(boolean can_CloseComments) {
        this.can_CloseComments = can_CloseComments;
    }

    public boolean isCan_GroupsComment() {
        return can_GroupsComment;
    }

    public void setCan_GroupsComment(boolean can_GroupsComment) {
        this.can_GroupsComment = can_GroupsComment;
    }
}
