# datasource
多数据源示例：
mapper接口，如果两个库的表一模一样包括表名一模一样，就需要改名区分，放入不同的xml文件中
xml文件可以不用改名，但是namespace一定要区分

demo示例就是使用两个不同的库，但是完全一样的表，因此修改了mapper接口


之前一个版本，因为不同的库，同样的表名，同样的表结构，修改了mapper接口
现修改了原来的问题，在不修改逆向工程的情况下，针对于不同库做处理
不同库-----》同样的表名-----》同样的mapper接口和同样的xml-----》在mapper接口处添加注解区分，防止自动注入的时候报错
如果是不同的库===》不同的表名==》不同的mapper   可以不用添加注解加以区分了