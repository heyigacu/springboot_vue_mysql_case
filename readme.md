

# 1.introduction to construct a web
## 1.1 type
database 
webserver

## 1.2 function
frontend: UI design  
bakcend: process database (add delete update query), calculate (real-time, job system)  
database: database  

## 1.3 framework
frontend: vue react jquery (html css javascript)  
bakcend: springboot flask django (java python)  
database: mysql redis (sql)

# 2. springboot+vue+mysql case
## 2.1 mysql
```
sudo apt install mysql-server
systemctl status mysql
systemctl stop mysql
systemctl restart mysql
```

```
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Hy275412@';
mysql -u root -p Hy275412@ -h 127.0.0.1
create database kokumi;
use kokumi;

CREATE TABLE molecule (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'primary key ID',
    smiles VARCHAR(300) NOT NULL UNIQUE COMMENT 'smiles',
    type VARCHAR(30) COMMENT 'molecule type',
    sequence VARCHAR(30) COMMENT 'peptide sequence',
    reference VARCHAR(100) COMMENT 'reference',
    create_time DATETIME NOT NULL COMMENT 'create time'
) COMMENT = 'molecule';

INSERT INTO molecule (smiles, type, sequence, reference, create_time)
VALUES ('CC(=O)OC1=CC=CC=C1C(=O)O', 'peptide', 'AAGGTT', 'Ref001', NOW());

SELECT * FROM molecule;
```

drop kokumi 删除

## 2.2 frontend
nodejs: fronend packages manager

### 2.2.1 create vue scaffold
v2/v3（推荐）
```
npm install -g @vue/cli
vue create frontend
```

v3
```
npm install -g create-vue 
create-vue
```

v2
```
npm install -g vue-cli
vue init frontend
```
start
```
cd frontend
npm install axios element-plus vue-router
npm run serve
```

## 2.2.2 vue 
属性绑定
```
v-bind : 绑定变量
v-if
v-show
v-html
v-on @ 事件绑定
```
组建传参
```
props
```

路由
```
router
```

## 2.2.3 第三方UI库
elementplus

## 2.3 backend
idea jetbrains

## 2.3.1 启动
```
maven后端包管理器
lombok
mysql driver
mybatis
spring web
```
勾选上

## 2.3.2 连接数据库
```
spring:
  datasource:
    username: root
    password: Hy275412@
    url: jdbc:mysql://127.0.0.1:3306/kokumi

mybatis:
  configuration:
    map-underscore-to-camel-case: true
```
## 2.3.3 后端代码
```
mapper：sql语句处理数据库
controller：前端接口交互
service：处理逻辑
pojo：实体类
```
