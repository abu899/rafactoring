package com.refactoring.study.section1.after;

/**
 * Recrod
 * 파라미터로 넘어오는 것들로 생성자를 만들어줌
 * Getter 역할의 메서드를 만들어줌
 * Hashcode, equals, ToString 자동 생성
 */
public record StudyReview(String reviewer, String review) {
}
