/*TODO: Add a default configuration for dev environment*/

dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = "igdefault"
    dialect = org.hibernate.dialect.MySQL5InnoDBDialect
    properties {
        minEvictableIdleTimeMillis = 1800000
        timeBetweenEvictionRunsMillis = 1800000
        numTestsPerEvictionRun = 3
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = true
        validationQuery = "SELECT 1"
    }

    url = "jdbc:mysql://127.0.0.1:3306/springSecurityDemo?autoReconnect=true"
    dbCreate = "create-drop"
    logSql = true
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}