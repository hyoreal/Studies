package chatting.hyojin.chat.controller;

import chatting.hyojin.chat.dto.ChatRoom;
import chatting.hyojin.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat") // RESTful API
public class ChatController {
    private final ChatService chatService;

    @PostMapping
    public ChatRoom createRoom(@RequestParam String name) {
        return chatService.createRoom(name);
    }

    @GetMapping
    public List<ChatRoom> findAllChatRoom() {
        return chatService.findAllRoom();
    }
}
