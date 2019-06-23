Ctrl+c  结束
Ctrl+d	键盘输入结束或退出终端
Ctrl+s	暂停当前程序，暂停后按下任意键恢复运行
Ctrl+z	将当前程序放到后台运行，恢复到前台为命令fg
Ctrl+a	将光标移至输入行头，相当于Home键
Ctrl+e	将光标移至输入行末，相当于End键
Ctrl+k	删除从光标所在位置到行末
Alt+Backspace	向前删除一个单词
Shift+PgUp	将终端显示向上滚动
Shift+PgDn	将终端显示向下滚动

Shell 常用通配符：

字符	含义
*	匹配 0 或多个字符
?	匹配任意一个字符
[list]	匹配 list 中的任意单一字符
[^list]	匹配 除list 中的任意单一字符以外的字符
[c1-c2]	匹配 c1-c2 中的任意单一字符 如：[0-9] [a-z]
{string1,string2,...}	匹配 string1 或 string2 (或更多)其一字符串
{c1..c2}	匹配 c1-c2 中全部字符 如{1..10}
