package com.study.mvc20220927heeseung.dto;

import lombok.*;

/*
@EqualsAndHashCode
@Setter
@Getter
@ToString
위 4개와 @Data 어노테이션은 같다.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestReqDto {
    private String strData;
    private String name;
    private int number;
}
