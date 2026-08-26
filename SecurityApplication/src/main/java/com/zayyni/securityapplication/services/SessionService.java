package com.zayyni.securityapplication.services;

import com.zayyni.securityapplication.entities.Session;
import com.zayyni.securityapplication.entities.User;
import com.zayyni.securityapplication.repositories.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;

    public void generateNewSession(User user,String refreshToken) {
        List<Session> userSessions = sessionRepository.findByUser(user);
        int SESSION_LIMIT = 2;
        if (userSessions.size() == SESSION_LIMIT) {
            userSessions.sort(Comparator.comparing(Session::getLastUsedAt));

            Session leastRecentlyUsedSession = userSessions.get(0);
            sessionRepository.delete(leastRecentlyUsedSession);
        }
        Session newSession = Session.builder()
                .user(user)
                .refreshToken(refreshToken)
                .build();
        sessionRepository.save(newSession);
    }

    public void validateSession(String refreshToken) {
        Session session = sessionRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new SessionAuthenticationException("Session not found for refresh token: " + refreshToken));

        session.setLastUsedAt(LocalDateTime.now());
        sessionRepository.save(session);

    }
}
