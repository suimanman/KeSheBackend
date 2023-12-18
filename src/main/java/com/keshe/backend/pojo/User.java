package com.keshe.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @TableId("id")
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String role;
    private String email;
    private String phone;
    private String address;
    private Date createTime;
}
