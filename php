1:global 关键字用于函数内访问全局变量。
在函数内调用函数外定义的全局变量，我们需要在函数中的变量前加上 global 关键字
2:PHP 将所有全局变量存储在一个名为 $GLOBALS[index] 的数组中。 index 保存变量的名称。
这个数组可以在函数内部访问，也可以直接用来更新全局变量。
3:Static 作用域
当一个函数完成时，它的所有变量通常都会被删除。然而，有时候您希望某个局部变量不要被删除。
要做到这一点，请在您第一次声明变量时使用 static 关键字：
4:var_dump() 函数返回变量的数据类型和值
5:定义常量 区分大小写的常量名(常量在定义后，默认是全局变量)
define("GREETING", "欢迎访问 Runoob.com");
6:time():时间戳 
date('Y-m-d H:i:s',time()):格式化时间戳
7:
in_array($name,$arr) ? 'true':'false'  //三元表达上

Laravel -- PHP
5.1 5.2      5.5.9+
4.2            5.4+
4.1            5.3.7+ 

composer设置镜像
#阿里云的composer镜像源
composer config -g repo.packagist composer https://mirrors.aliyun.com/composer/
#腾讯云的composer镜像源
composer config -g repo.packagist composer https://mirrors.cloud.tencent.com/composer/

laravel下载安装
1:通过Laravel安装器
composer global require "laravel/installer"
laravel new blog
2:composer安装
composer create-project --prefer-dist laravel/laravel blog

laravel:
 app  项目主要业务逻辑
 bootstrap  引导
 config 配置文件
 database 
 public 入口文件目录
 resources 前端资源包括视图
 routes 路由
 storage 项目临时文件存储目录
 tests 单元测试
 vendor composer安装依赖目录

数据库操作:
DB facade
查询构造器(使用PDO参数绑定，保护应用程序免于SQL注入因此传入的参数不需要额外转义特是字符) 
Eloquent ORM
blade模板中生成url
url():通过路由的名称生成url
action():通过指定控制器及方法名生成url
route():通过路由的别名生成url