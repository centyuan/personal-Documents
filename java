javac HelloWorld.java
java HelloWorld

https://blog.csdn.net/qq_35326718/article/details/79443911
JVM ：英文名称（Java Virtual Machine），就是我们耳熟能详的 Java 虚拟机。它只认识 xxx.class 这种类型的文件，它能够将 class 文件中的字节码指令进行识别并调用操作系统向上的 API 完成动作。所以说，jvm 是 Java 能够跨平台的核心，具体的下文会详细说明。

JRE ：英文名称（Java Runtime Environment），我们叫它：Java 运行时环境。它主要包含两个部分，jvm 的标准实现和 Java 的一些基本类库。它相对于 jvm 来说，多出来的是一部分的 Java 类库。

JDK ：英文名称（Java Development Kit），Java 开发工具包。jdk 是整个 Java 开发的核心，它集成了 jre 和一些好用的小工具。例如：javac.exe，java.exe，jar.exe 等。
jre和jdk都需要jvm的支持，jvm是运行和编译java程序的核心。

1Java 是大小写敏感的
2类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass
3方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
4源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）
5主方法入口：所有的 Java 程序由 public static void main(String []args) 方法开始执行。
6变量:
局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
ps:访问修饰符不能用于局部变量,局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用

成员变量(实例变量)：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
ps:实例变量在对象创建的时候创建，在对象被销毁的时候销毁；

类变量(静态变量)：类变量也声明在类中，方法体之外，但必须声明为static类型。
ps:类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

7构造方法：
每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。
在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

8创建对象：
对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步：
声明：声明一个对象，包括对象名称和对象类型。
实例化：使用关键字new来创建一个对象。
初始化：使用new创建对象时，会调用构造方法初始化对象。

9源文件声明规则：
一个源文件中只能有一个public类,可以有多个非public类
源文件的名称应该和public类的类名保持一致
如果一个类定义在某个包中，那么package语句应该在源文件的首行
如果源文件包含import语句，那么应该放在package语句和类定义之间
import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明

10import语句：
在Java中，如果给出一个完整的限定名，包括包名、类名，那么Java编译器就可以很容易地定位到源代码或者类。Import语句就是用来提供一个合理的路径，使得编译器可以找到某个类。
import java.io.*; //将会命令编译器载入java_installation/java/io路径下的所有类
11java常量:
常量在程序运行时是不能被修改的。
在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：
final double PI = 3.1415927;

12java修饰符：
分为访问修饰符和非访问修饰符，修饰符用来定义类，方法或变量
1.Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限：
public : 对所有类可见。使用对象：类、接口、变量、方法
protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）


13声明数组变量:
dataType[] arrayRefVar;   // 首选的方法
或
dataType arrayRefVar[];  // 效果相同，但不是首选方法
创建数组
arrayRefVar = new dataType[arraySize];
数组变量的声明，和创建数组可以用一条语句完成，如下所示：
dataType[] arrayRefVar = new dataType[arraySize];


