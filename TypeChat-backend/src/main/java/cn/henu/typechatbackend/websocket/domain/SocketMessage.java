package cn.henu.typechatbackend.websocket.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocketMessage <T>{
    private String type;
    private T data;
}
