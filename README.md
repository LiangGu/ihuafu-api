## 该demo修改包名即可快速构建出属于您自己的微服务

### 启动前提

启动nacos redis mysql等基础服务

### 快速启动

1. 推荐mysql 5.7版本

2. 修改`application-local.yml`中的数据库连接配置连接到您的数据库。

3. 打开`TridentApplication`运行main方法即可启动

4. IDEA本地启动VM参数：-Dspring.profiles.active=local
   
5. swagger地址：http://localhost:8080/swagger-ui/index.html

6. 使用@DS("slave")进行多数据源切换，如不需要多数据源，请删除多数据源的配置

