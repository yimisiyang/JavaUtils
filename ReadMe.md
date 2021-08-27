## 2021-08-27

### 1.getTimeDelta（测试方法）

DataFormat类中的format方法，parse方法

**format方法**

使用DateFormat类中的方法format，把日期格式转化为文本
使用步骤：
1.创建SimpleDateFormat对象，构造方法中传递指定的模式
2.调用SimpleDateFormat对象中的方法format，按照构造方法中的指定模式，吧Fate日期转化为符合模式的字符串（文本）

**parse方法**

使用DateFormat类中的parse方法，吧文本转换为日期
使用步骤：
1.创建SimpleDateFormat对象，构造方法中传递指定的模式
2.调用SimpleDateFormat对象中的方法parse，吧符合构造方法中模式的字符串，解析为Date日期
注意：
public Date parse(String source) throws ParseException
parse方法声明了一个异常叫ParseException
如果字符串和构造方法的模式不一样，那么程序就会出下异常
调出一个抛出了异常的方法，就必须得处理这个异常，要么throws继续抛出这个异常 要么try catch自己处理。