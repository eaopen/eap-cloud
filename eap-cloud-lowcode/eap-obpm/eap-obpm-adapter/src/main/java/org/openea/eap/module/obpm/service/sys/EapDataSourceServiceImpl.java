package org.openea.eap.module.obpm.service.sys;

import org.openbpm.sys.api.model.ISysDataSource;
import org.openbpm.sys.api.service.ISysDataSourceService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
@ConditionalOnProperty(prefix = "eap.obpm", name = "eap-adapter", havingValue = "true")
public class EapDataSourceServiceImpl implements ISysDataSourceService {
    @Override
    public ISysDataSource getByKey(String key) {
        return null;
    }

    @Override
    public DataSource getDataSourceByKey(String key) {
        return null;
    }

    @Override
    public JdbcTemplate getJdbcTemplateByKey(String key) {
        return null;
    }
}
