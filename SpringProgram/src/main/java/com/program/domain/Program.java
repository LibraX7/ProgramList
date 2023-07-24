package com.program.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
/**
 * 使用lombok简化开发
 */
public class Program {
    private Integer id;
    private String type;
    private Integer num;
    private String view;
    private String name;
    private String actorlist;
}
