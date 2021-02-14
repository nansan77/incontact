package ru.netology.domain;

public class RepostsInfo {
    private int count;//количество репостов
    private boolean can_Repost; //возможность  репостнуть запись

    private int realizedRepost; //сделал ли репост текущий пользователь (1 - да, 0 - нет)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCan_Repost() {
        return can_Repost;
    }

    public void setCan_Repost(boolean can_Repost) {
        this.can_Repost = can_Repost;
    }

    public int getRealizedRepost() {
        return realizedRepost;
    }

    public void setRealizedRepost(int realizedRepost) {
        this.realizedRepost = realizedRepost;
    }
}
