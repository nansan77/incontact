package ru.netology.domain;

public class LikesInfo {
    private int count; //количество лайков
    private boolean can_Like; //возможность лайкнуть
    private int realizedLike; //поставил ли лайк текущий пользователь (1 - да, 0 - нет)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCan_Like() {
        return can_Like;
    }

    public void setCan_Like(boolean can_Like) {
        this.can_Like = can_Like;
    }

    public int getRealizedLike() {
        return realizedLike;
    }

    public void setRealizedLike(int realizedLike) {
        this.realizedLike = realizedLike;
    }
}
