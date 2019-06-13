vim命令：
a i o:a光标后面写入，i光标前面，o(open in a line below )下一行
A I O:A这行末尾，I这行最前面，O上一行
增删改查：
清空文件:首先执行 gg 这里是跳至文件首行 再执行：dG 这样就清空了整个文件
x:删除一个字符
dw:删除一个单词
dt字符:(delete to 什么)删除光标到字符之间的内容 
u(undo取消):回退上一次操作
dd:删除游标所在的一整行(常用)
数字+命令多次执行命令（）
ndd:n为数字。删除光标所在的向下n行，例如20dd则是删除光标所在的向下20行
d1G:删除光标所在到第一行的所有数据
dG:删除光标所在到最后一行的所有数据
r(replace),c(change),s(substitute)
r:r+替换的字符，直接修改光标位置的字符
s:删除当前光标字符并进入insert模式
/或者？前向或者反向搜索
/word\c大小写不敏感查找

:s（substitute）命令用来查找和替换字符串。语法如下：
:{作用范围}s/{目标}/{替换}/{替换标志}
作用范围 (g)所有的出现都会被替换
:s/word/word/g #当前行
:%s/word/word/g #全文
:2,5s/word/word/g #2到5行
:.,+2s/word/word/g #当前行到下两行

快速移动：
hjkl左下上有移动
w下一个单词的开头，e下一个单词的结尾 b返回上次的wore的过程
行间搜索：f{char}同一行快速移动到char上，还可以使用；和，继续搜索该行下一个/上一个
0：移动到行首，$移动到行尾
gg:移动到文件的开头，G:移动到文件的结尾
ctrl+u(upword):上翻页 ctrl+f(forward):下翻页，zz:屏幕置为中间

多个窗口分屏:vs(vertical split) :sp(split)
设置行号:number set

进入可视visual模式：v V(进入会选中正行)ctrl+V方快选择
:进入后可以使用d删除，使用y复制，最后p粘贴

插入模式快捷键:
ctrl+h删除上一个字符，ctrl+w删除上一个单词，ctrl+u删除当前行
(ctrl+h,ctrl+w,ctrl+u同样使用与终端下，终端下还有如：ctrl+a移动到开头，ctrl+e移动到结尾，ctrl+b往前移，ctrl+f往后移)
Ctrl+c或ctrl+[代替Esc

gi可以快速跳转到最后一次编辑的地方进入插入模式


多文件操作
:e ls.text #打开ls.text文件
:ls 列出当前所有buffer
:b n跳转到第n个缓冲区
:vs lsa.text 
ctrl+w+w 或者ctrl+w+(hjkl)
