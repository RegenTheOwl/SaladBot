package sql.repository;

import sql.Session;
import sql.mapper.BotMapper;

public class BotRepository {
    public String getToken(String token, Session session) {
        return getMapper(session).getToken(token);
    }

    private BotMapper getMapper(Session session) {
        return session.getMapper(BotMapper.class);
    }
}
