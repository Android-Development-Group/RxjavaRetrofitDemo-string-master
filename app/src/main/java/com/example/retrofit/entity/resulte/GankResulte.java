package com.example.retrofit.entity.resulte;

import java.util.List;

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Email      : jusenr@163.com
 * Company    : 葡萄科技
 * Author     : Jusenr
 * Date       : 2017/4/12 10:40.
 */
public class GankResulte {

    private MiniBean mini;
    private PlusBean plus;

    public MiniBean getMini() {
        return mini;
    }

    public void setMini(MiniBean mini) {
        this.mini = mini;
    }

    public PlusBean getPlus() {
        return plus;
    }

    public void setPlus(PlusBean plus) {
        this.plus = plus;
    }

    public class MiniBean {
        private int total;
        private List<ContentBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ContentBean> getList() {
            return list;
        }

        public void setList(List<ContentBean> list) {
            this.list = list;
        }
    }

    public class PlusBean {
        private int total;
        private List<ContentBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ContentBean> getList() {
            return list;
        }

        public void setList(List<ContentBean> list) {
            this.list = list;
        }
    }

    public class ContentBean {
        private long commentDate;// 1485949110,
        private long commentId;// 41530503,
        private String content;// "小小可惜，甄子丹已经过了最能打的年纪，倘若在杀破狼时期的话，甄子丹一定发挥的更好！",
        private String headImg;// "//img32.mtime.cn/up/2016/04/21/164216.20185739_128X128.jpg",
        private String locationName;// "温哥华",
        private String nickname;// "百家影评",
        private int praiseCount;// 1,
        private int replyCount;// 0

        public long getCommentDate() {
            return commentDate;
        }

        public void setCommentDate(long commentDate) {
            this.commentDate = commentDate;
        }

        public long getCommentId() {
            return commentId;
        }

        public void setCommentId(long commentId) {
            this.commentId = commentId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public String getLocationName() {
            return locationName;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getPraiseCount() {
            return praiseCount;
        }

        public void setPraiseCount(int praiseCount) {
            this.praiseCount = praiseCount;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        @Override
        public String toString() {
            return "ContentBean{" +
                    "commentDate=" + commentDate +
                    ", commentId=" + commentId +
                    ", content='" + content + '\'' +
                    ", headImg='" + headImg + '\'' +
                    ", locationName='" + locationName + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", praiseCount=" + praiseCount +
                    ", replyCount=" + replyCount +
                    '}';
        }
    }
}
