package com.tenco.web_socket_step.polling;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface PollingChatRepository extends JpaRepository<PollingChat,Long> {

}
