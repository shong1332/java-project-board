package com.boardproject.boardproject.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article articleId; // 게시글 아이디
    private String content; // 내용

    private LocalDateTime createBy; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
