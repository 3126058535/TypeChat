package cn.henu.typechatbackend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("db_message")
public class Message extends BaseEntity{
    private String id;
    private String sessionId;
    private String senderId;   ///发送者id
    private String receiverId; //接收者id
    private String sendTime;  //发送时间
    private String content;  //发送内容
    private String messageType;  //消息类型
    private Integer isWithdrawn;  //是否撤回
}
